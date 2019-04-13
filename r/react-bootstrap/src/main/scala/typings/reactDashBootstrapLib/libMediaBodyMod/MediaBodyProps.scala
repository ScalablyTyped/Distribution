package typings
package reactDashBootstrapLib.libMediaBodyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaBodyProps
  extends reactLib.reactMod.ClassAttributes[MediaBody] {
  var componentClass: js.UndefOr[reactLib.reactMod.ReactType[_]] = js.undefined
}

object MediaBodyProps {
  @scala.inline
  def apply(
    componentClass: reactLib.reactMod.ReactType[_] = null,
    key: reactLib.reactMod.Key = null,
    ref: reactLib.reactMod.LegacyRef[MediaBody] = null
  ): MediaBodyProps = {
    val __obj = js.Dynamic.literal()
    if (componentClass != null) __obj.updateDynamic("componentClass")(componentClass.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaBodyProps]
  }
}

