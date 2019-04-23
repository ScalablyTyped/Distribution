package typings
package sipDotJsLib.libPublishContextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sip.js/lib/PublishContext", "PublishContext")
@js.native
class PublishContext protected ()
  extends sipDotJsLib.libClientContextMod.ClientContext {
  def this(ua: sipDotJsLib.libUAMod.UA, target: java.lang.String, event: java.lang.String) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: sipDotJsLib.libURIMod.URI, event: java.lang.String) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: java.lang.String, event: java.lang.String, options: js.Any) = this()
  def this(ua: sipDotJsLib.libUAMod.UA, target: sipDotJsLib.libURIMod.URI, event: java.lang.String, options: js.Any) = this()
  var event: js.Any = js.native
  var options: js.Any = js.native
  var pubRequestBody: js.Any = js.native
  var pubRequestEtag: js.Any = js.native
  var pubRequestExpires: js.Any = js.native
  var publishRefreshTimer: js.Any = js.native
  var refreshRequest: js.Any = js.native
  var sendPublishRequest: js.Any = js.native
  var target: js.Any = js.native
  /**
    * Close
    */
  def close(): scala.Unit = js.native
  /**
    * Publish
    * @param {string} Event body to publish, optional
    */
  def publish(body: java.lang.String): scala.Unit = js.native
  /**
    * Unpublish
    */
  def unpublish(): scala.Unit = js.native
}

