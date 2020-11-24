package typings.rcUtil

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rc-util/lib/hooks/useMemo", JSImport.Namespace)
@js.native
object useMemoMod extends js.Object {
  
  def default[Value, Condition](
    getValue: js.Function0[Value],
    condition: Condition,
    shouldUpdate: js.Function2[/* prev */ Condition, /* next */ Condition, Boolean]
  ): Value = js.native
}
