package typings
package reactDashBootstrapLib.libMediaBodyMod.MediaBodyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaBodyProps
  extends reactLib.reactMod.ReactNs.ClassAttributes[reactDashBootstrapLib.libMediaBodyMod.MediaBody] {
  var componentClass: js.UndefOr[reactLib.reactMod.ReactNs.ReactType[_]] = js.undefined
}

object MediaBodyProps {
  @scala.inline
  def apply(
    componentClass: reactLib.reactMod.ReactNs.ReactType[_] = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[reactDashBootstrapLib.libMediaBodyMod.MediaBody] = null
  ): MediaBodyProps = {
    val __obj = js.Dynamic.literal()
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBodyProps]
  }
}

