package typings
package sipDotJsLib.sipDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscription extends ClientContext {
  var dialog: java.lang.String = js.native
  var errorCodes: js.Array[scala.Double] = js.native
  var event: java.lang.String = js.native
  var id: java.lang.String = js.native
  var state: java.lang.String = js.native
  def close(): scala.Unit = js.native
  def subscribe(): Subscription = js.native
  def unsubscribe(): scala.Unit = js.native
}

