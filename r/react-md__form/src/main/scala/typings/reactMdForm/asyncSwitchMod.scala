package typings.reactMdForm

import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.reactMdForm.switchMod.SwitchProps
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncSwitchMod {
  
  @JSImport("@react-md/form/types/toggle/AsyncSwitch", "AsyncSwitch")
  @js.native
  val AsyncSwitch: ForwardRefExoticComponent[AsyncSwitchProps & RefAttributes[HTMLInputElement]] = js.native
  
  trait AsyncSwitchProps
    extends StObject
       with SwitchProps {
    
    /**
      * Boolean if the switch is still loading. This will "disable" the switch and
      * add the circular progress indicator in the switch's ball until it is set
      * back to false.
      */
    var loading: Boolean
    
    /**
      * An optional class name to apply to the progress bar while the loading state
      * is enabled.
      */
    var progressClassName: js.UndefOr[String] = js.undefined
    
    /**
      * An optional style to apply to the progress bar while the loading state is
      * enabled.
      */
    var progressStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object AsyncSwitchProps {
    
    inline def apply(id: String, loading: Boolean): AsyncSwitchProps = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncSwitchProps]
    }
    
    extension [Self <: AsyncSwitchProps](x: Self) {
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setProgressClassName(value: String): Self = StObject.set(x, "progressClassName", value.asInstanceOf[js.Any])
      
      inline def setProgressClassNameUndefined: Self = StObject.set(x, "progressClassName", js.undefined)
      
      inline def setProgressStyle(value: CSSProperties): Self = StObject.set(x, "progressStyle", value.asInstanceOf[js.Any])
      
      inline def setProgressStyleUndefined: Self = StObject.set(x, "progressStyle", js.undefined)
    }
  }
}
