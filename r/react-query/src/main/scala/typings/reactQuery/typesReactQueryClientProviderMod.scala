package typings.reactQuery

import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactQuery.typesCoreMod.QueryClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReactQueryClientProviderMod {
  
  @JSImport("react-query/types/react/QueryClientProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def QueryClientProvider(param0: QueryClientProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("QueryClientProvider")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useQueryClient(): QueryClient = ^.asInstanceOf[js.Dynamic].applyDynamic("useQueryClient")().asInstanceOf[QueryClient]
  
  trait QueryClientProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var client: QueryClient
    
    var contextSharing: js.UndefOr[Boolean] = js.undefined
  }
  object QueryClientProviderProps {
    
    inline def apply(client: QueryClient): QueryClientProviderProps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryClientProviderProps]
    }
    
    extension [Self <: QueryClientProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClient(value: QueryClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setContextSharing(value: Boolean): Self = StObject.set(x, "contextSharing", value.asInstanceOf[js.Any])
      
      inline def setContextSharingUndefined: Self = StObject.set(x, "contextSharing", js.undefined)
    }
  }
  
  object global {
    
    trait Window extends StObject {
      
      var ReactQueryClientContext: js.UndefOr[Context[js.UndefOr[QueryClient]]] = js.undefined
    }
    object Window {
      
      inline def apply(): Window = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setReactQueryClientContext(value: Context[js.UndefOr[QueryClient]]): Self = StObject.set(x, "ReactQueryClientContext", value.asInstanceOf[js.Any])
        
        inline def setReactQueryClientContextUndefined: Self = StObject.set(x, "ReactQueryClientContext", js.undefined)
      }
    }
  }
}
