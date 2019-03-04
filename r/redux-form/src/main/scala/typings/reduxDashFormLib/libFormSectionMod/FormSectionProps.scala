package typings
package reduxDashFormLib.libFormSectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormSectionProps[P] extends js.Object {
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[P]] = js.undefined
  var name: java.lang.String
}

object FormSectionProps {
  @scala.inline
  def apply[P](name: java.lang.String, component: reactLib.reactMod.ReactNs.ComponentType[P] = null): FormSectionProps[P] = {
    val __obj = js.Dynamic.literal(name = name)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormSectionProps[P]]
  }
}

