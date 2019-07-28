package typings.reduxDashBootstrap.dtsInterfacesInterfacesMod.interfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouterProps extends js.Object {
  var onError: js.UndefOr[js.Function1[/* error */ js.Any, _]] = js.undefined
  var onUpdate: js.UndefOr[js.Function0[_]] = js.undefined
}

object RouterProps {
  @scala.inline
  def apply(onError: /* error */ js.Any => _ = null, onUpdate: () => _ = null): RouterProps = {
    val __obj = js.Dynamic.literal()
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction0(onUpdate))
    __obj.asInstanceOf[RouterProps]
  }
}

