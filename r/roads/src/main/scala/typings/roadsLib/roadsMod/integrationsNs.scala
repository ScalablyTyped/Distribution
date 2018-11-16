package typings
package roadsLib.roadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads", "integrations")
@js.native
object integrationsNs extends js.Object {
  /**
       * Integration to express
       * @param road The Road object that contains all routing information for this integration
       */
  def express(road: roadsLib.roadsMod.Road): js.Function0[_] = js.native
  /**
       * Integration to koa
       * @param road The Road object that contains all routing information for this integration
       */
  def koa(road: roadsLib.roadsMod.Road): js.Function0[_] = js.native
}

