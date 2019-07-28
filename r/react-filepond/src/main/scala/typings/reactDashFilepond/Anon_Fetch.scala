package typings.reactDashFilepond

import typings.reactDashFilepond.reactDashFilepondMod.FetchServerConfigFunction
import typings.reactDashFilepond.reactDashFilepondMod.LoadServerConfigFunction
import typings.reactDashFilepond.reactDashFilepondMod.ProcessServerConfigFunction
import typings.reactDashFilepond.reactDashFilepondMod.RestoreServerConfigFunction
import typings.reactDashFilepond.reactDashFilepondMod.RevertServerConfigFunction
import typings.reactDashFilepond.reactDashFilepondMod.ServerUrl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fetch extends js.Object {
  var fetch: js.UndefOr[String | ServerUrl | FetchServerConfigFunction] = js.undefined
  var load: js.UndefOr[String | ServerUrl | LoadServerConfigFunction] = js.undefined
  var process: js.UndefOr[String | ServerUrl | ProcessServerConfigFunction] = js.undefined
  var restore: js.UndefOr[String | ServerUrl | RestoreServerConfigFunction] = js.undefined
  var revert: js.UndefOr[String | ServerUrl | RevertServerConfigFunction] = js.undefined
}

object Anon_Fetch {
  @scala.inline
  def apply(
    fetch: String | ServerUrl | FetchServerConfigFunction = null,
    load: String | ServerUrl | LoadServerConfigFunction = null,
    process: String | ServerUrl | ProcessServerConfigFunction = null,
    restore: String | ServerUrl | RestoreServerConfigFunction = null,
    revert: String | ServerUrl | RevertServerConfigFunction = null
  ): Anon_Fetch = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (load != null) __obj.updateDynamic("load")(load.asInstanceOf[js.Any])
    if (process != null) __obj.updateDynamic("process")(process.asInstanceOf[js.Any])
    if (restore != null) __obj.updateDynamic("restore")(restore.asInstanceOf[js.Any])
    if (revert != null) __obj.updateDynamic("revert")(revert.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Fetch]
  }
}

