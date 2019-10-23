package typings.reactDashHelmet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashHelmetMod {
  import typings.react.HTMLBodyElement
  import typings.react.HTMLHtmlElement
  import typings.react.HTMLLinkElement
  import typings.react.HTMLMetaElement
  import typings.react.reactMod.DetailedHTMLProps
  import typings.react.reactMod.HTMLAttributes
  import typings.react.reactMod.HtmlHTMLAttributes
  import typings.react.reactMod.LinkHTMLAttributes
  import typings.react.reactMod.MetaHTMLAttributes

  type BodyProps = DetailedHTMLProps[HTMLAttributes[HTMLBodyElement], HTMLBodyElement]
  type HtmlProps = DetailedHTMLProps[HtmlHTMLAttributes[HTMLHtmlElement], HTMLHtmlElement]
  type LinkProps = DetailedHTMLProps[LinkHTMLAttributes[HTMLLinkElement], HTMLLinkElement]
  type MetaProps = DetailedHTMLProps[MetaHTMLAttributes[HTMLMetaElement], HTMLMetaElement]
}
