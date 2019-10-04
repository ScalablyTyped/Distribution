package typings.reactDashRelay

import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error[TOperation /* <: OperationType */] extends js.Object {
  var error: Error | Null
  var props: (/* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any) | Null
  var retry: js.Function0[Unit] | Null
}

object Anon_Error {
  @scala.inline
  def apply[TOperation /* <: OperationType */](
    error: Error = null,
    props: /* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any = null,
    retry: () => Unit = null
  ): Anon_Error[TOperation] = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (props != null) __obj.updateDynamic("props")(props)
    if (retry != null) __obj.updateDynamic("retry")(js.Any.fromFunction0(retry))
    __obj.asInstanceOf[Anon_Error[TOperation]]
  }
}

