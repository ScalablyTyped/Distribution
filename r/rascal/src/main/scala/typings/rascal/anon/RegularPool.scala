package typings.rascal.anon

import typings.rascal.mod.ChannelPoolConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegularPool extends js.Object {
  var confirmPool: js.UndefOr[ChannelPoolConfig] = js.undefined
  var regularPool: js.UndefOr[ChannelPoolConfig] = js.undefined
}

object RegularPool {
  @scala.inline
  def apply(confirmPool: ChannelPoolConfig = null, regularPool: ChannelPoolConfig = null): RegularPool = {
    val __obj = js.Dynamic.literal()
    if (confirmPool != null) __obj.updateDynamic("confirmPool")(confirmPool.asInstanceOf[js.Any])
    if (regularPool != null) __obj.updateDynamic("regularPool")(regularPool.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegularPool]
  }
}

