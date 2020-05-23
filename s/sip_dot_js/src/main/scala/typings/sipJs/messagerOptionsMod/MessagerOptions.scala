package typings.sipJs.messagerOptionsMod

import typings.sipJs.anon.FromDisplayName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessagerOptions extends js.Object {
  /** Array of extra headers added to the MESSAGE. */
  var extraHeaders: js.UndefOr[js.Array[String]] = js.undefined
  /** @deprecated TODO: provide alternative. */
  var params: js.UndefOr[FromDisplayName] = js.undefined
}

object MessagerOptions {
  @scala.inline
  def apply(extraHeaders: js.Array[String] = null, params: FromDisplayName = null): MessagerOptions = {
    val __obj = js.Dynamic.literal()
    if (extraHeaders != null) __obj.updateDynamic("extraHeaders")(extraHeaders.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessagerOptions]
  }
}

