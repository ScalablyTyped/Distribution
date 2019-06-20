package typings
package reactDashRelayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error[TOperation /* <: relayDashRuntimeLib.relayDashRuntimeMod.OperationType */] extends js.Object {
  var error: stdLib.Error | scala.Null
  var props: (/* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any) | scala.Null
  var retry: js.Function0[scala.Unit] | scala.Null
}

object Anon_Error {
  @scala.inline
  def apply[TOperation /* <: relayDashRuntimeLib.relayDashRuntimeMod.OperationType */](
    error: stdLib.Error = null,
    props: /* import warning: ImportType.apply Failed type conversion: TOperation['response'] */ js.Any = null,
    retry: () => scala.Unit = null
  ): Anon_Error[TOperation] = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (props != null) __obj.updateDynamic("props")(props)
    if (retry != null) __obj.updateDynamic("retry")(js.Any.fromFunction0(retry))
    __obj.asInstanceOf[Anon_Error[TOperation]]
  }
}

