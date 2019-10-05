package typings.roads.roadsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("roads", "integrations")
@js.native
object integrations extends js.Object {
  /**
    * Integration to express
    * @param road The Road object that contains all routing information for this integration
    */
  def express(road: Road): js.Function0[_] = js.native
  /**
    * Integration to koa
    * @param road The Road object that contains all routing information for this integration
    */
  def koa(road: Road): js.Function0[_] = js.native
}

