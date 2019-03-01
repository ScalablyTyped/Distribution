package typings
package reduxDashBootstrapLib.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterProps extends js.Object {
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.undefined
  var onUpdate: js.UndefOr[js.Function0[_]] = js.undefined
}

object RouterProps {
  @scala.inline
  def apply(onError: js.Function1[/* error */ js.Any, _] = null, onUpdate: js.Function0[_] = null): RouterProps = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(onError)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    __obj.asInstanceOf[RouterProps]
  }
}

