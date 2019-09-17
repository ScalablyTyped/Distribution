package typings.sanitizeDashHtml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sanitizeDashHtmlMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.sanitizeDashHtml.Anon_Multiple

  type AllowedAttribute = String | Anon_Multiple
  type Attributes = StringDictionary[String]
  type Transformer = js.Function2[/* tagName */ String, /* attribs */ Attributes, Tag]
}
