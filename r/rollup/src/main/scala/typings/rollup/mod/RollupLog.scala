package typings.rollup.mod

import typings.rollup.anon.Column
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollupLog extends StObject {
  
  var binding: js.UndefOr[String] = js.undefined
  
  var cause: js.UndefOr[js.Error] = js.undefined
  
  var code: js.UndefOr[String] = js.undefined
  
  var exporter: js.UndefOr[String] = js.undefined
  
  var frame: js.UndefOr[String] = js.undefined
  
  var hook: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  
  var loc: js.UndefOr[Column] = js.undefined
  
  var message: String
  
  var names: js.UndefOr[js.Array[String]] = js.undefined
  
  var plugin: js.UndefOr[String] = js.undefined
  
  var pluginCode: js.UndefOr[String] = js.undefined
  
  var pos: js.UndefOr[Double] = js.undefined
  
  var reexporter: js.UndefOr[String] = js.undefined
  
  var stack: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object RollupLog {
  
  inline def apply(message: String): RollupLog = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollupLog]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollupLog] (val x: Self) extends AnyVal {
    
    inline def setBinding(value: String): Self = StObject.set(x, "binding", value.asInstanceOf[js.Any])
    
    inline def setBindingUndefined: Self = StObject.set(x, "binding", js.undefined)
    
    inline def setCause(value: js.Error): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setExporter(value: String): Self = StObject.set(x, "exporter", value.asInstanceOf[js.Any])
    
    inline def setExporterUndefined: Self = StObject.set(x, "exporter", js.undefined)
    
    inline def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setHook(value: String): Self = StObject.set(x, "hook", value.asInstanceOf[js.Any])
    
    inline def setHookUndefined: Self = StObject.set(x, "hook", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setLoc(value: Column): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setPlugin(value: String): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
    
    inline def setPluginCode(value: String): Self = StObject.set(x, "pluginCode", value.asInstanceOf[js.Any])
    
    inline def setPluginCodeUndefined: Self = StObject.set(x, "pluginCode", js.undefined)
    
    inline def setPluginUndefined: Self = StObject.set(x, "plugin", js.undefined)
    
    inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    
    inline def setPosUndefined: Self = StObject.set(x, "pos", js.undefined)
    
    inline def setReexporter(value: String): Self = StObject.set(x, "reexporter", value.asInstanceOf[js.Any])
    
    inline def setReexporterUndefined: Self = StObject.set(x, "reexporter", js.undefined)
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
