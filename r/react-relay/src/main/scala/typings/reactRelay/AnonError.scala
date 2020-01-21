package typings.reactRelay

import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError[TOperation /* <: OperationType */] extends js.Object {
  var error: Error | Null
  var props: (/* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any) | Null
  var retry: js.Function0[Unit] | Null
}

object AnonError {
  @scala.inline
  def apply[TOperation /* <: OperationType */](
    error: Error = null,
    props: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['response'] */ js.Any = null,
    retry: () => Unit = null
  ): AnonError[TOperation] = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (retry != null) __obj.updateDynamic("retry")(js.Any.fromFunction0(retry))
    __obj.asInstanceOf[AnonError[TOperation]]
  }
}

