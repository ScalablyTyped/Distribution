package typings.stencilCore.stencilPrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin extends StObject {
  
  var load: js.UndefOr[
    js.Function2[/* id */ String, /* context */ PluginCtx, js.Promise[String] | String]
  ] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var pluginType: js.UndefOr[String] = js.undefined
  
  var resolveId: js.UndefOr[
    js.Function3[
      /* importee */ String, 
      /* importer */ String, 
      /* context */ PluginCtx, 
      js.Promise[String] | String
    ]
  ] = js.undefined
  
  var transform: js.UndefOr[
    js.Function3[
      /* sourceText */ String, 
      /* id */ String, 
      /* context */ PluginCtx, 
      js.Promise[PluginTransformResults] | PluginTransformResults | String
    ]
  ] = js.undefined
}
object Plugin {
  
  inline def apply(): Plugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Plugin]
  }
  
  extension [Self <: Plugin](x: Self) {
    
    inline def setLoad(value: (/* id */ String, /* context */ PluginCtx) => js.Promise[String] | String): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
    
    inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPluginType(value: String): Self = StObject.set(x, "pluginType", value.asInstanceOf[js.Any])
    
    inline def setPluginTypeUndefined: Self = StObject.set(x, "pluginType", js.undefined)
    
    inline def setResolveId(
      value: (/* importee */ String, /* importer */ String, /* context */ PluginCtx) => js.Promise[String] | String
    ): Self = StObject.set(x, "resolveId", js.Any.fromFunction3(value))
    
    inline def setResolveIdUndefined: Self = StObject.set(x, "resolveId", js.undefined)
    
    inline def setTransform(
      value: (/* sourceText */ String, /* id */ String, /* context */ PluginCtx) => js.Promise[PluginTransformResults] | PluginTransformResults | String
    ): Self = StObject.set(x, "transform", js.Any.fromFunction3(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
