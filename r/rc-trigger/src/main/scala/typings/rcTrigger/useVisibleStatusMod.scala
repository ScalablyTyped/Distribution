package typings.rcTrigger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useVisibleStatusMod {
  
  @JSImport("rc-trigger/es/Popup/useVisibleStatus", JSImport.Default)
  @js.native
  def default(visible: Boolean, doMeasure: Func): js.Tuple2[PopupStatus, js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], Unit]] = js.native
  
  type Func = js.Function0[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - scala.Null
    - typings.rcTrigger.rcTriggerStrings.measure
    - typings.rcTrigger.rcTriggerStrings.align
    - typings.rcTrigger.rcTriggerStrings.aligned
    - typings.rcTrigger.rcTriggerStrings.motion
    - typings.rcTrigger.rcTriggerStrings.stable
  */
  type PopupStatus = _PopupStatus | Null
  
  trait _PopupStatus extends StObject
}
