package typings.reduxDashPersistDashTransformDashFilter

import typings.reduxDashPersist.esTypesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist-transform-filter", JSImport.Namespace)
@js.native
object reduxDashPersistDashTransformDashFilterMod extends js.Object {
  def default[State, Raw](reducerName: String): Transform[State, Raw, _, _] = js.native
  def default[State, Raw](reducerName: String, inboundPaths: js.Array[String]): Transform[State, Raw, _, _] = js.native
  def default[State, Raw](reducerName: String, inboundPaths: js.Array[String], outboundPaths: js.Array[String]): Transform[State, Raw, _, _] = js.native
}

