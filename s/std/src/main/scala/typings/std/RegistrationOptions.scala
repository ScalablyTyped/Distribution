package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegistrationOptions extends js.Object {
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[WorkerType] = js.undefined
  var updateViaCache: js.UndefOr[ServiceWorkerUpdateViaCache] = js.undefined
}

object RegistrationOptions {
  @scala.inline
  def apply(
    scope: java.lang.String = null,
    `type`: WorkerType = null,
    updateViaCache: ServiceWorkerUpdateViaCache = null
  ): RegistrationOptions = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (updateViaCache != null) __obj.updateDynamic("updateViaCache")(updateViaCache)
    __obj.asInstanceOf[RegistrationOptions]
  }
}

