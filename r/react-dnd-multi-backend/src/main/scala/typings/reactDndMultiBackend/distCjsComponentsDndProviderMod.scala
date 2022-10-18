package typings.reactDndMultiBackend

import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsComponentsDndProviderMod {
  
  @JSImport("react-dnd-multi-backend/dist/cjs/components/DndProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DndProvider(hasPortalProps: DndProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DndProvider")(hasPortalProps.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("react-dnd-multi-backend/dist/cjs/components/DndProvider", "PreviewPortalContext")
  @js.native
  val PreviewPortalContext: Context[typings.std.Element | Null] = js.native
  
  trait DndProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var context: js.UndefOr[Any] = js.undefined
    
    var debugMode: js.UndefOr[Boolean] = js.undefined
    
    var options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiBackendOptions */ Any
    
    var portal: js.UndefOr[typings.std.Element] = js.undefined
  }
  object DndProviderProps {
    
    inline def apply(
      options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiBackendOptions */ Any
    ): DndProviderProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[DndProviderProps]
    }
    
    extension [Self <: DndProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setDebugMode(value: Boolean): Self = StObject.set(x, "debugMode", value.asInstanceOf[js.Any])
      
      inline def setDebugModeUndefined: Self = StObject.set(x, "debugMode", js.undefined)
      
      inline def setOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MultiBackendOptions */ Any
      ): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPortal(value: typings.std.Element): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
      
      inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    }
  }
}
