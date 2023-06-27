package typings.sentryReplay.typesTypesReplayFrameMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyboardEventFrameData
  extends StObject
     with BaseDomFrameData {
  
  var altKey: Boolean
  
  var ctrlKey: Boolean
  
  var key: String
  
  var metaKey: Boolean
  
  var shiftKey: Boolean
}
object KeyboardEventFrameData {
  
  inline def apply(altKey: Boolean, ctrlKey: Boolean, key: String, metaKey: Boolean, shiftKey: Boolean): KeyboardEventFrameData = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyboardEventFrameData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KeyboardEventFrameData] (val x: Self) extends AnyVal {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
  }
}
