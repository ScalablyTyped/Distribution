package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RelayProfiler extends js.Object {
  def attachAggregateHandler(name: String, handler: js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]): Unit
  def attachProfileHandler(
    name: String,
    handler: js.Function2[/* name */ String, /* state */ js.UndefOr[js.Any], js.Function0[Unit]]
  ): Unit
}

object RelayProfiler {
  @scala.inline
  def apply(
    attachAggregateHandler: (String, js.Function2[/* name */ String, /* callback */ js.Function0[Unit], Unit]) => Unit,
    attachProfileHandler: (String, js.Function2[/* name */ String, /* state */ js.UndefOr[js.Any], js.Function0[Unit]]) => Unit
  ): RelayProfiler = {
    val __obj = js.Dynamic.literal(attachAggregateHandler = js.Any.fromFunction2(attachAggregateHandler), attachProfileHandler = js.Any.fromFunction2(attachProfileHandler))
  
    __obj.asInstanceOf[RelayProfiler]
  }
}

