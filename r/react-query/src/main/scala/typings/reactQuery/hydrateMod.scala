package typings.reactQuery

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.reactQuery.hydrationMod.HydrateOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hydrateMod {
  
  @JSImport("react-query/types/react/Hydrate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Hydrate(hasChildrenOptionsState: HydrateProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Hydrate")(hasChildrenOptionsState.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def useHydrate(state: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useHydrate")(state.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def useHydrate(state: Any, options: HydrateOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useHydrate")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait HydrateProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var options: js.UndefOr[HydrateOptions] = js.undefined
    
    var state: js.UndefOr[Any] = js.undefined
  }
  object HydrateProps {
    
    inline def apply(): HydrateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HydrateProps]
    }
    
    extension [Self <: HydrateProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOptions(value: HydrateOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
}
