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

object Anon_AddEventListener {
  @scala.inline
  def apply(
    addEventListener: js.Function2[java.lang.String, js.Function1[/* result */ scala.Boolean, scala.Unit], scala.Unit],
    fetch: js.Function0[js.Promise[scala.Boolean]],
    removeEventListener: js.Function2[java.lang.String, js.Function1[/* result */ scala.Boolean, scala.Unit], scala.Unit]
  ): Anon_AddEventListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("fetch")(fetch)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.asInstanceOf[Anon_AddEventListener]
  }
}

