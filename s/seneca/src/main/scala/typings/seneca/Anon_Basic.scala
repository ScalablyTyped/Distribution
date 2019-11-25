package typings.seneca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Basic extends js.Object {
  var basic: js.UndefOr[Boolean] = js.undefined
  var `mem-store`: js.UndefOr[Boolean] = js.undefined
  var transport: js.UndefOr[Boolean] = js.undefined
  var web: js.UndefOr[Boolean] = js.undefined
}

object Anon_Basic {
  @scala.inline
  def apply(
    basic: js.UndefOr[Boolean] = js.undefined,
    `mem-store`: js.UndefOr[Boolean] = js.undefined,
    transport: js.UndefOr[Boolean] = js.undefined,
    web: js.UndefOr[Boolean] = js.undefined
  ): Anon_Basic = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(basic)) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    if (!js.isUndefined(`mem-store`)) __obj.updateDynamic("mem-store")(`mem-store`.asInstanceOf[js.Any])
    if (!js.isUndefined(transport)) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (!js.isUndefined(web)) __obj.updateDynamic("web")(web.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Basic]
  }
}

