package typings
package reactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddEventListener extends js.Object {
  /**
    * eventName is expected to be `change`(deprecated) or `connectionChange`
    */
  def addEventListener(eventName: java.lang.String, listener: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit
  def fetch(): js.Promise[scala.Boolean]
  /**
    * eventName is expected to be `change`(deprecated) or `connectionChange`
    */
  def removeEventListener(eventName: java.lang.String, listener: js.Function1[/* result */ scala.Boolean, scala.Unit]): scala.Unit
}

