package typings.redom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object redomMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.HTMLAnchorElement
  import typings.std.HTMLBRElement
  import typings.std.HTMLButtonElement
  import typings.std.HTMLDivElement
  import typings.std.HTMLElement
  import typings.std.HTMLFormElement
  import typings.std.HTMLHRElement
  import typings.std.HTMLHeadingElement
  import typings.std.HTMLIFrameElement
  import typings.std.HTMLImageElement
  import typings.std.HTMLInputElement
  import typings.std.HTMLLIElement
  import typings.std.HTMLLabelElement
  import typings.std.HTMLOListElement
  import typings.std.HTMLOptionElement
  import typings.std.HTMLParagraphElement
  import typings.std.HTMLPreElement
  import typings.std.HTMLSelectElement
  import typings.std.HTMLSpanElement
  import typings.std.HTMLStyleElement
  import typings.std.HTMLTableCellElement
  import typings.std.HTMLTableElement
  import typings.std.HTMLTableHeaderCellElement
  import typings.std.HTMLTableRowElement
  import typings.std.HTMLTableSectionElement
  import typings.std.HTMLTextAreaElement
  import typings.std.HTMLUListElement
  import typings.std.Node
  import typings.std.SVGElement

  type HTMLElementOfRedomQuery[Q /* <: RedomQuery */] = HTMLElementOfStringLiteral[Q] | Q
  type HTMLElementOfStringLiteral[Q /* <: String */] = HTMLElement | SVGElement | HTMLStyleElement | HTMLTableHeaderCellElement | HTMLTableSectionElement | HTMLTableCellElement | HTMLTableRowElement | HTMLTableElement | HTMLHeadingElement | HTMLButtonElement | HTMLOptionElement | HTMLSelectElement | HTMLTextAreaElement | HTMLLabelElement | HTMLInputElement | HTMLFormElement | HTMLOListElement | HTMLLIElement | HTMLUListElement | HTMLIFrameElement | HTMLImageElement | HTMLBRElement | HTMLHRElement | HTMLParagraphElement | HTMLPreElement | HTMLSpanElement | HTMLAnchorElement | HTMLDivElement
  type RedomElement = Node | RedomComponent
  type RedomMiddleware = js.Function1[/* el */ HTMLElement, Unit]
  type RedomQuery = String | RedomElement
  type RedomQueryArgument = RedomQueryArgumentValue | js.Array[RedomQueryArgumentValue]
  type RedomQueryArgumentValue = RedomElement | String | Double | StringDictionary[js.Any] | RedomMiddleware
  type RouterDictionary = StringDictionary[RedomComponentConstructor]
}
