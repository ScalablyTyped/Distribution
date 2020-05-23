package typings.reactToastNotifications.mod

import typings.react.mod.ReactNode
import typings.reactToastNotifications.anon.Toast
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastProviderProps extends js.Object {
  var autoDismiss: js.UndefOr[Boolean | Double] = js.undefined
  var autoDismissTimeout: js.UndefOr[Double] = js.undefined
  var children: ReactNode
  var components: js.UndefOr[Toast] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var transitionDuration: js.UndefOr[Double] = js.undefined
}

object ToastProviderProps {
  @scala.inline
  def apply(
    autoDismiss: Boolean | Double = null,
    autoDismissTimeout: js.UndefOr[Double] = js.undefined,
    children: ReactNode = null,
    components: Toast = null,
    placement: Placement = null,
    transitionDuration: js.UndefOr[Double] = js.undefined
  ): ToastProviderProps = {
    val __obj = js.Dynamic.literal()
    if (autoDismiss != null) __obj.updateDynamic("autoDismiss")(autoDismiss.asInstanceOf[js.Any])
    if (!js.isUndefined(autoDismissTimeout)) __obj.updateDynamic("autoDismissTimeout")(autoDismissTimeout.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (placement != null) __obj.updateDynamic("placement")(placement.asInstanceOf[js.Any])
    if (!js.isUndefined(transitionDuration)) __obj.updateDynamic("transitionDuration")(transitionDuration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastProviderProps]
  }
}

