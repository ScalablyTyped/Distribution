package typings.rollup.mod

import typings.rollup.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupLogProps extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var frame: js.UndefOr[String] = js.undefined
  
  var hook: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var loc: js.UndefOr[Column] = js.undefined
  
  var message: String
  
  var name: js.UndefOr[String] = js.undefined
  
  var plugin: js.UndefOr[String] = js.undefined
  
  var pluginCode: js.UndefOr[String] = js.undefined
  
  var pos: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object RollupLogProps {
  
  inline def apply(message: String): RollupLogProps = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupLogProps]
  }
  
  extension [Self <: RollupLogProps](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setHook(value: String): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    inline def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLoc(value: Column): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setPluginCode(value: String): Self = StObject.set(x, "pluginCode", value.asInstanceOf[js.Any])
    
    inline def setPluginCodeUndefined: Self = StObject.set(x, "pluginCode", js.undefined)
    
    inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    
    inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
