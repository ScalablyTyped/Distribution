package typings.reactHelmetAsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type BodyProps = (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HTMLAttributes[typings.std.HTMLBodyElement], 
    typings.std.HTMLBodyElement
  ]) with typings.reactHelmetAsync.mod.OtherElementAttributes
  type HtmlProps = (typings.react.mod.DetailedHTMLProps[
    typings.react.mod.HtmlHTMLAttributes[typings.std.HTMLHtmlElement], 
    typings.std.HTMLHtmlElement
  ]) with typings.reactHelmetAsync.mod.OtherElementAttributes
  type LinkProps = typings.react.mod.DetailedHTMLProps[
    typings.react.mod.LinkHTMLAttributes[typings.std.HTMLLinkElement], 
    typings.std.HTMLLinkElement
  ]
  type MetaProps = typings.react.mod.DetailedHTMLProps[
    typings.react.mod.MetaHTMLAttributes[typings.std.HTMLMetaElement], 
    typings.std.HTMLMetaElement
  ]
  type OtherElementAttributes = org.scalablytyped.runtime.StringDictionary[js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null]]
}
