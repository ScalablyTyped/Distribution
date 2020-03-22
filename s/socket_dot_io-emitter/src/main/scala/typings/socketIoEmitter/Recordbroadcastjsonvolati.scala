package typings.socketIoEmitter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<'broadcast' | 'json' | 'volatile', boolean | undefined> */
trait Recordbroadcastjsonvolati extends js.Object {
  var broadcast: js.UndefOr[Boolean] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var volatile: js.UndefOr[Boolean] = js.undefined
}

object Recordbroadcastjsonvolati {
  @scala.inline
  def apply(
    broadcast: js.UndefOr[Boolean] = js.undefined,
    json: js.UndefOr[Boolean] = js.undefined,
    volatile: js.UndefOr[Boolean] = js.undefined
  ): Recordbroadcastjsonvolati = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(broadcast)) __obj.updateDynamic("broadcast")(broadcast.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (!js.isUndefined(volatile)) __obj.updateDynamic("volatile")(volatile.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recordbroadcastjsonvolati]
  }
}

