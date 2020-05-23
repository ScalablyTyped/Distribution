package typings.reduxSubscriber

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-subscriber", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val subscribe: Subscribe_ = js.native
  def default(store: js.Any): Subscribe_ = js.native
  type Subscribe_ = js.Function2[/* key */ String, /* cb */ js.Function1[/* state */ js.Any, Unit], Unsubscribe]
  type Unsubscribe = js.Function0[Unit]
}

