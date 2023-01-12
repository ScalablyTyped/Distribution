package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputAttributes extends StObject {
  
  var atime: js.UndefOr[Double | js.Date] = js.undefined
  
  var gid: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[Double | String] = js.undefined
  
  var mtime: js.UndefOr[Double | js.Date] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var uid: js.UndefOr[Double] = js.undefined
}
object InputAttributes {
  
  inline def apply(): InputAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputAttributes] (val x: Self) extends AnyVal {
    
    inline def setAtime(value: Double | js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
    
    inline def setAtimeUndefined: Self = StObject.set(x, "atime", js.undefined)
    
    inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
    
    inline def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setMtime(value: Double | js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    inline def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
