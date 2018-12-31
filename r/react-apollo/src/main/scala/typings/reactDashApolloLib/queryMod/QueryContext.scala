package typings
package reactDashApolloLib.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryContext extends js.Object {
  var client: js.UndefOr[apolloDashClientLib.apolloDashClientMod.default[js.Object]] = js.undefined
  var operations: js.UndefOr[
    lodashLib.lodashMod.Global.Map[java.lang.String, reactDashApolloLib.Anon_Variables]
  ] = js.undefined
  var renderPromises: js.UndefOr[reactDashApolloLib.getDataFromTreeMod.RenderPromises] = js.undefined
}

