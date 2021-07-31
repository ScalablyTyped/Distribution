package typings.ssh2Streams.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputAttributes extends StObject {
  
  var atime: js.UndefOr[Double | Date] = js.undefined
  
  var gid: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[Double | String] = js.undefined
  
  var mtime: js.UndefOr[Double | Date] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var uid: js.UndefOr[Double] = js.undefined
}
object InputAttributes {
  
  @scala.inline
  def apply(): InputAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputAttributes]
  }
  
  @scala.inline
  implicit class InputAttributesMutableBuilder[Self <: InputAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtime(value: Double | Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtimeUndefined: Self = StObject.set(x, "atime", js.undefined)
    
    @scala.inline
    def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGidUndefined: Self = StObject.set(x, "gid", js.undefined)
    
    @scala.inline
    def setMode(value: Double | String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setMtime(value: Double | Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtimeUndefined: Self = StObject.set(x, "mtime", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
  }
}
