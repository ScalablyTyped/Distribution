package typings.rcPicker

import typings.rcPicker.anon.Disabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esHooksUseRangeDisabledMod {
  
  @JSImport("rc-picker/es/hooks/useRangeDisabled", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](param0: Disabled[DateType], disabledStart: Boolean, disabledEnd: Boolean): js.Array[js.Function1[/* date */ DateType, Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any], disabledStart.asInstanceOf[js.Any], disabledEnd.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function1[/* date */ DateType, Boolean]]]
}
