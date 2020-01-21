package typings.reduxPersistTransformFilter

import typings.reduxPersist.typesMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist-transform-filter", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default[State, Raw](reducerName: String): Transform[State, Raw, _, _] = js.native
  def default[State, Raw](reducerName: String, inboundPaths: js.Array[String]): Transform[State, Raw, _, _] = js.native
  def default[State, Raw](reducerName: String, inboundPaths: js.Array[String], outboundPaths: js.Array[String]): Transform[State, Raw, _, _] = js.native
}

