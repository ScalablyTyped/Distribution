package typings.reactQuery.mod

import typings.reactQuery.AnonShouldRefetch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-query", "setQueryData")
@js.native
object setQueryData extends js.Object {
  def apply(queryKey: String, data: js.Any): Unit | js.Promise[Unit] = js.native
  def apply(queryKey: String, data: js.Any, options: AnonShouldRefetch): Unit | js.Promise[Unit] = js.native
  def apply(queryKey: js.Tuple2[String, js.Object], data: js.Any): Unit | js.Promise[Unit] = js.native
  def apply(queryKey: js.Tuple2[String, js.Object], data: js.Any, options: AnonShouldRefetch): Unit | js.Promise[Unit] = js.native
}

