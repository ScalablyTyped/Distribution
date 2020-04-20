package typings.redisInfo.mod

import typings.redisInfo.mod.Flag.OFF
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PersistenceLoadingOffInfo extends js.Object {
  var loading: OFF
}

object PersistenceLoadingOffInfo {
  @scala.inline
  def apply(loading: OFF): PersistenceLoadingOffInfo = {
    val __obj = js.Dynamic.literal(loading = loading.asInstanceOf[js.Any])
    __obj.asInstanceOf[PersistenceLoadingOffInfo]
  }
}

