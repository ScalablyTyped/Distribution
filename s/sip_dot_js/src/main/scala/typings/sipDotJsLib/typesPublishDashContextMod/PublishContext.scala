package typings
package sipDotJsLib.typesPublishDashContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/types/publish-context", "PublishContext")
@js.native
class PublishContext protected ()
  extends sipDotJsLib.typesClientDashContextMod.ClientContext {
  def this(ua: sipDotJsLib.typesUaMod.UA, target: java.lang.String, event: java.lang.String) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, target: sipDotJsLib.typesUriMod.URI, event: java.lang.String) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, target: java.lang.String, event: java.lang.String, options: js.Any) = this()
  def this(ua: sipDotJsLib.typesUaMod.UA, target: sipDotJsLib.typesUriMod.URI, event: java.lang.String, options: js.Any) = this()
  def close(): scala.Unit = js.native
  def publish(body: java.lang.String): scala.Unit = js.native
  def unpublish(): scala.Unit = js.native
}

