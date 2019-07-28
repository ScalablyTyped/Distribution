package typings.sanitizeDashHtml.sanitizeDashHtmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sanitize-html", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaults: IDefaults = js.native
  def apply(dirty: String): String = js.native
  def apply(dirty: String, options: IOptions): String = js.native
  def simpleTransform(tagName: String, attribs: Attributes): Transformer = js.native
  def simpleTransform(tagName: String, attribs: Attributes, merge: Boolean): Transformer = js.native
}

