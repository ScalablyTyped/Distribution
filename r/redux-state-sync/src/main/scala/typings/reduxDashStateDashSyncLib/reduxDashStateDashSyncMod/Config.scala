package typings
package reduxDashStateDashSyncLib.reduxDashStateDashSyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var blacklist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var broadcastChannelOption: js.UndefOr[js.Object | scala.Null] = js.undefined
  var channel: js.UndefOr[java.lang.String] = js.undefined
  var predicate: js.UndefOr[
    js.Function1[/* type */ js.UndefOr[java.lang.String], scala.Boolean | scala.Null]
  ] = js.undefined
  var whitelist: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

