package typings
package sanitizeDashHtmlLib.sanitizeDashHtmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sanitize-html", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaults: IDefaults = js.native
  def apply(dirty: java.lang.String): java.lang.String = js.native
  def apply(dirty: java.lang.String, options: IOptions): java.lang.String = js.native
  def simpleTransform(tagName: java.lang.String, attribs: Attributes): Transformer = js.native
  def simpleTransform(tagName: java.lang.String, attribs: Attributes, merge: scala.Boolean): Transformer = js.native
}

