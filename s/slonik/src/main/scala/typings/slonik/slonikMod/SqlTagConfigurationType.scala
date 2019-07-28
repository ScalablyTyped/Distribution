package typings.slonik.slonikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlTagConfigurationType extends js.Object {
  var normalizeIdentifier: js.UndefOr[IdentifierNormalizerType] = js.undefined
}

object SqlTagConfigurationType {
  @scala.inline
  def apply(normalizeIdentifier: IdentifierNormalizerType = null): SqlTagConfigurationType = {
    val __obj = js.Dynamic.literal()
    if (normalizeIdentifier != null) __obj.updateDynamic("normalizeIdentifier")(normalizeIdentifier)
    __obj.asInstanceOf[SqlTagConfigurationType]
  }
}

