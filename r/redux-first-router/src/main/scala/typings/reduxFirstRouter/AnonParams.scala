package typings.reduxFirstRouter

import typings.reduxFirstRouter.mod.Nullable
import typings.reduxFirstRouter.mod.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParams extends js.Object {
  var params: Nullable[Params]
  var path: Nullable[String]
}

object AnonParams {
  @scala.inline
  def apply(params: Nullable[Params] = null, path: Nullable[String] = null): AnonParams = {
    val __obj = js.Dynamic.literal()
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParams]
  }
}

