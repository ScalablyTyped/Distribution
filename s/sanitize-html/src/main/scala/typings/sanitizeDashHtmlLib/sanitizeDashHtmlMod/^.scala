package typings
package sanitizeDashHtmlLib.sanitizeDashHtmlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sanitize-html", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaults: sanitizeDashHtmlLib.sanitizeDashHtmlMod.sanitizeNs.IDefaults = js.native
  def apply(dirty: java.lang.String): java.lang.String = js.native
  def apply(dirty: java.lang.String, options: sanitizeDashHtmlLib.sanitizeDashHtmlMod.sanitizeNs.IOptions): java.lang.String = js.native
  def simpleTransform(tagName: java.lang.String, attribs: sanitizeDashHtmlLib.sanitizeDashHtmlMod.sanitizeNs.Attributes): sanitizeDashHtmlLib.sanitizeDashHtmlMod.sanitizeNs.Transformer = js.native
  def simpleTransform(
    tagName: java.lang.String,
    attribs: sanitizeDashHtmlLib.sanitizeDashHtmlMod.sanitizeNs.Attributes,
    merge: scala.Boolean
  ): sanitizeDashHtmlLib.sanitizeDashHtmlMod.sanitizeNs.Transformer = js.native
}

