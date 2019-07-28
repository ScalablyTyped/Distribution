package typings.rest.interceptorDefaultRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var entity: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var mixin: js.UndefOr[js.Any] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object Config {
  @scala.inline
  def apply(
    entity: js.Any = null,
    headers: js.Any = null,
    method: String = null,
    mixin: js.Any = null,
    params: js.Any = null,
    path: String = null
  ): Config = {
    val __obj = js.Dynamic.literal()
    if (entity != null) __obj.updateDynamic("entity")(entity)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (mixin != null) __obj.updateDynamic("mixin")(mixin)
    if (params != null) __obj.updateDynamic("params")(params)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Config]
  }
}

