package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionInfo extends js.Object {
  var effectiveType: EffectiveConnectionType
  var `type`: ConnectionType
}

object ConnectionInfo {
  @scala.inline
  def apply(effectiveType: EffectiveConnectionType, `type`: ConnectionType): ConnectionInfo = {
    val __obj = js.Dynamic.literal(effectiveType = effectiveType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ConnectionInfo]
  }
}

