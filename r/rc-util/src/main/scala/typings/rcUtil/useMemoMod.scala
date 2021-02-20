package typings.rcUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMemoMod {
  
  @JSImport("rc-util/lib/hooks/useMemo", JSImport.Default)
  @js.native
  def default[Value, Condition](
    getValue: js.Function0[Value],
    condition: Condition,
    shouldUpdate: js.Function2[/* prev */ Condition, /* next */ Condition, Boolean]
  ): Value = js.native
}
