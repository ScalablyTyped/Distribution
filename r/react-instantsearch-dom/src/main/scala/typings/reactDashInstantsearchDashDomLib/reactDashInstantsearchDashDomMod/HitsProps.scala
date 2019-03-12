package typings
package reactDashInstantsearchDashDomLib.reactDashInstantsearchDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HitsProps[T] extends js.Object {
  var hitComponent: js.UndefOr[
    reactLib.reactMod.ReactNs.ComponentType[reactDashInstantsearchDashDomLib.Anon_Hit[T]]
  ] = js.undefined
}

object HitsProps {
  @scala.inline
  def apply[T](
    hitComponent: reactLib.reactMod.ReactNs.ComponentType[reactDashInstantsearchDashDomLib.Anon_Hit[T]] = null
  ): HitsProps[T] = {
    val __obj = js.Dynamic.literal()
    if (hitComponent != null) __obj.updateDynamic("hitComponent")(hitComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitsProps[T]]
  }
}

