package typings.redom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HTMLElementOfRedomQuery[Q /* <: typings.redom.mod.RedomQuery */] = typings.redom.mod.HTMLElementOfStringLiteral[Q] | Q
  type HTMLElementOfStringLiteral[Q /* <: java.lang.String */] = typings.std.HTMLElement | typings.std.SVGElement | typings.std.HTMLStyleElement | typings.std.HTMLTableHeaderCellElement | typings.std.HTMLTableSectionElement | typings.std.HTMLTableCellElement | typings.std.HTMLTableRowElement | typings.std.HTMLTableElement | typings.std.HTMLHeadingElement | typings.std.HTMLButtonElement | typings.std.HTMLOptionElement | typings.std.HTMLSelectElement | typings.std.HTMLTextAreaElement | typings.std.HTMLLabelElement | typings.std.HTMLInputElement | typings.std.HTMLFormElement | typings.std.HTMLOListElement | typings.std.HTMLLIElement | typings.std.HTMLUListElement | typings.std.HTMLIFrameElement | typings.std.HTMLImageElement | typings.std.HTMLBRElement | typings.std.HTMLHRElement | typings.std.HTMLParagraphElement | typings.std.HTMLPreElement | typings.std.HTMLSpanElement | typings.std.HTMLAnchorElement | typings.std.HTMLDivElement
  type RedomElement = typings.std.Node | typings.redom.mod.RedomComponent
  type RedomMiddleware = js.Function1[/* el */ typings.std.HTMLElement, scala.Unit]
  type RedomQuery = java.lang.String | typings.redom.mod.RedomElement
  type RedomQueryArgument = typings.redom.mod.RedomQueryArgumentValue | js.Array[typings.redom.mod.RedomQueryArgumentValue]
  type RedomQueryArgumentValue = typings.redom.mod.RedomElement | java.lang.String | scala.Double | org.scalablytyped.runtime.StringDictionary[js.Any] | typings.redom.mod.RedomMiddleware
  type RouterDictionary = org.scalablytyped.runtime.StringDictionary[typings.redom.mod.RedomComponentConstructor]
}
