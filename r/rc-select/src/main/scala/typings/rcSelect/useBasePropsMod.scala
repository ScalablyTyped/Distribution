package typings.rcSelect

import typings.rcSelect.baseSelectMod.BaseSelectProps
import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useBasePropsMod {
  
  @JSImport("rc-select/lib/hooks/useBaseProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): BaseSelectContextProps = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[BaseSelectContextProps]
  
  @JSImport("rc-select/lib/hooks/useBaseProps", "BaseSelectContext")
  @js.native
  val BaseSelectContext: Context[BaseSelectContextProps] = js.native
  
  @js.native
  trait BaseSelectContextProps
    extends StObject
       with BaseSelectProps {
    
    var multiple: Boolean = js.native
    
    def toggleOpen(): Unit = js.native
    def toggleOpen(open: Boolean): Unit = js.native
    
    var triggerOpen: Boolean = js.native
  }
}
