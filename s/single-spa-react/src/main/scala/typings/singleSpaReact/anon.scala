package typings.singleSpaReact

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined {[ T in single-spa-react.single-spa-react.LegacyRenderType ]:? any} */
  trait TinLegacyRenderTypeany extends StObject {
    
    var hydrate: js.UndefOr[Any] = js.undefined
    
    var render: js.UndefOr[Any] = js.undefined
  }
  object TinLegacyRenderTypeany {
    
    inline def apply(): TinLegacyRenderTypeany = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TinLegacyRenderTypeany]
    }
    
    extension [Self <: TinLegacyRenderTypeany](x: Self) {
      
      inline def setHydrate(value: Any): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
      
      inline def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
      
      inline def setRender(value: Any): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  /* Inlined {[ T in single-spa-react.single-spa-react.RenderType ]:? any} */
  trait TinRenderTypeany extends StObject {
    
    var createRoot: js.UndefOr[Any] = js.undefined
    
    var hydrate: js.UndefOr[Any] = js.undefined
    
    var hydrateRoot: js.UndefOr[Any] = js.undefined
    
    var render: js.UndefOr[Any] = js.undefined
  }
  object TinRenderTypeany {
    
    inline def apply(): TinRenderTypeany = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TinRenderTypeany]
    }
    
    extension [Self <: TinRenderTypeany](x: Self) {
      
      inline def setCreateRoot(value: Any): Self = StObject.set(x, "createRoot", value.asInstanceOf[js.Any])
      
      inline def setCreateRootUndefined: Self = StObject.set(x, "createRoot", js.undefined)
      
      inline def setHydrate(value: Any): Self = StObject.set(x, "hydrate", value.asInstanceOf[js.Any])
      
      inline def setHydrateRoot(value: Any): Self = StObject.set(x, "hydrateRoot", value.asInstanceOf[js.Any])
      
      inline def setHydrateRootUndefined: Self = StObject.set(x, "hydrateRoot", js.undefined)
      
      inline def setHydrateUndefined: Self = StObject.set(x, "hydrate", js.undefined)
      
      inline def setRender(value: Any): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
}
