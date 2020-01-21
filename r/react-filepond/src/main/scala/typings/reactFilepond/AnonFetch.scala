package typings.reactFilepond

import typings.reactFilepond.mod.FetchServerConfigFunction
import typings.reactFilepond.mod.LoadServerConfigFunction
import typings.reactFilepond.mod.ProcessServerConfigFunction
import typings.reactFilepond.mod.RestoreServerConfigFunction
import typings.reactFilepond.mod.RevertServerConfigFunction
import typings.reactFilepond.mod.ServerUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFetch extends js.Object {
  var fetch: js.UndefOr[String | ServerUrl | FetchServerConfigFunction] = js.undefined
  var load: js.UndefOr[String | ServerUrl | LoadServerConfigFunction] = js.undefined
  var process: js.UndefOr[String | ServerUrl | ProcessServerConfigFunction] = js.undefined
  var restore: js.UndefOr[String | ServerUrl | RestoreServerConfigFunction] = js.undefined
  var revert: js.UndefOr[String | ServerUrl | RevertServerConfigFunction] = js.undefined
}

object AnonFetch {
  @scala.inline
  def apply(
    fetch: String | ServerUrl | FetchServerConfigFunction = null,
    load: String | ServerUrl | LoadServerConfigFunction = null,
    process: String | ServerUrl | ProcessServerConfigFunction = null,
    restore: String | ServerUrl | RestoreServerConfigFunction = null,
    revert: String | ServerUrl | RevertServerConfigFunction = null
  ): AnonFetch = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (process != null) __obj.updateDynamic("process")(process.asInstanceOf[js.Any])
    if (restore != null) __obj.updateDynamic("restore")(restore.asInstanceOf[js.Any])
    if (revert != null) __obj.updateDynamic("revert")(revert.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFetch]
  }
}

