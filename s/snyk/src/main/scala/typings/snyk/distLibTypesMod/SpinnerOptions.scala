package typings.snyk.distLibTypesMod

import typings.node.processMod.global.NodeJS.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpinnerOptions extends StObject {
  
  var cleanup: js.UndefOr[Any] = js.undefined
  
  var delay: js.UndefOr[Any] = js.undefined
  
  var interval: js.UndefOr[Any] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var stream: js.UndefOr[WriteStream] = js.undefined
  
  var string: js.UndefOr[String] = js.undefined
  
  var tty: js.UndefOr[Any] = js.undefined
  
  var unref: js.UndefOr[Any] = js.undefined
}
object SpinnerOptions {
  
  inline def apply(): SpinnerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpinnerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SpinnerOptions] (val x: Self) extends AnyVal {
    
    inline def setCleanup(value: Any): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
    
    inline def setCleanupUndefined: Self = StObject.set(x, "cleanup", js.undefined)
    
    inline def setDelay(value: Any): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setInterval(value: Any): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setStream(value: WriteStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setTty(value: Any): Self = StObject.set(x, "tty", value.asInstanceOf[js.Any])
    
    inline def setTtyUndefined: Self = StObject.set(x, "tty", js.undefined)
    
    inline def setUnref(value: Any): Self = StObject.set(x, "unref", value.asInstanceOf[js.Any])
    
    inline def setUnrefUndefined: Self = StObject.set(x, "unref", js.undefined)
  }
}
