package typings.pusherJs

import typings.pusherJs.transportMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportsTableMod {
  
  trait TransportsTable extends StObject {
    
    var sockjs: js.UndefOr[default] = js.undefined
    
    var ws: default
    
    var xdr_polling: js.UndefOr[default] = js.undefined
    
    var xdr_streaming: js.UndefOr[default] = js.undefined
    
    var xhr_polling: default
    
    var xhr_streaming: default
  }
  object TransportsTable {
    
    inline def apply(ws: default, xhr_polling: default, xhr_streaming: default): TransportsTable = {
      val __obj = js.Dynamic.literal(ws = ws.asInstanceOf[js.Any], xhr_polling = xhr_polling.asInstanceOf[js.Any], xhr_streaming = xhr_streaming.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportsTable]
    }
    
    extension [Self <: TransportsTable](x: Self) {
      
      inline def setSockjs(value: default): Self = StObject.set(x, "sockjs", value.asInstanceOf[js.Any])
      
      inline def setSockjsUndefined: Self = StObject.set(x, "sockjs", js.undefined)
      
      inline def setWs(value: default): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
      
      inline def setXdr_polling(value: default): Self = StObject.set(x, "xdr_polling", value.asInstanceOf[js.Any])
      
      inline def setXdr_pollingUndefined: Self = StObject.set(x, "xdr_polling", js.undefined)
      
      inline def setXdr_streaming(value: default): Self = StObject.set(x, "xdr_streaming", value.asInstanceOf[js.Any])
      
      inline def setXdr_streamingUndefined: Self = StObject.set(x, "xdr_streaming", js.undefined)
      
      inline def setXhr_polling(value: default): Self = StObject.set(x, "xhr_polling", value.asInstanceOf[js.Any])
      
      inline def setXhr_streaming(value: default): Self = StObject.set(x, "xhr_streaming", value.asInstanceOf[js.Any])
    }
  }
}
