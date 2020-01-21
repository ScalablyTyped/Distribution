package typings.reactQuery.mod

import typings.reactQuery.AnonForce
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-query", "refetchQuery")
@js.native
object refetchQuery extends js.Object {
  def apply(queryKey: String): js.Promise[Unit] = js.native
  def apply(queryKey: String, force: AnonForce): js.Promise[Unit] = js.native
  def apply(queryKey: js.Tuple2[String, js.Object]): js.Promise[Unit] = js.native
  def apply(queryKey: js.Tuple2[String, js.Object], force: AnonForce): js.Promise[Unit] = js.native
}

