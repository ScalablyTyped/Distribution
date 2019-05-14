package typings
package reactDashFilepondLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fetch extends js.Object {
  var fetch: js.UndefOr[
    java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl | reactDashFilepondLib.reactDashFilepondMod.FetchServerConfigFunction
  ] = js.undefined
  var load: js.UndefOr[
    java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl | reactDashFilepondLib.reactDashFilepondMod.LoadServerConfigFunction
  ] = js.undefined
  var process: js.UndefOr[
    java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl | reactDashFilepondLib.reactDashFilepondMod.ProcessServerConfigFunction
  ] = js.undefined
  var restore: js.UndefOr[
    java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl | reactDashFilepondLib.reactDashFilepondMod.RestoreServerConfigFunction
  ] = js.undefined
  var revert: js.UndefOr[
    java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl | reactDashFilepondLib.reactDashFilepondMod.RevertServerConfigFunction
  ] = js.undefined
}

object Anon_Fetch {
  @scala.inline
  def apply(
    fetch: java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl | reactDashFilepondLib.reactDashFilepondMod.FetchServerConfigFunction = null,
    load: java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl | reactDashFilepondLib.reactDashFilepondMod.LoadServerConfigFunction = null,
    process: java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl | reactDashFilepondLib.reactDashFilepondMod.ProcessServerConfigFunction = null,
    restore: java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl | reactDashFilepondLib.reactDashFilepondMod.RestoreServerConfigFunction = null,
    revert: java.lang.String | reactDashFilepondLib.reactDashFilepondMod.ServerUrl | reactDashFilepondLib.reactDashFilepondMod.RevertServerConfigFunction = null
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

