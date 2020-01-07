package typings.reactDashHelmet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashHelmetMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.DetailedHTMLProps
  import typings.react.reactMod.HTMLAttributes
  import typings.react.reactMod.HtmlHTMLAttributes
  import typings.react.reactMod.LinkHTMLAttributes
  import typings.react.reactMod.MetaHTMLAttributes
  import typings.std.HTMLBodyElement
  import typings.std.HTMLHtmlElement
  import typings.std.HTMLLinkElement
  import typings.std.HTMLMetaElement

  type BodyProps = (DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement]) with OtherElementAttributes
  type HtmlProps = (DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]) with OtherElementAttributes
  type LinkProps = DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement]
  type MetaProps = DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement]
  type OtherElementAttributes = StringDictionary[js.UndefOr[String | Double | Boolean | Null]]
}
