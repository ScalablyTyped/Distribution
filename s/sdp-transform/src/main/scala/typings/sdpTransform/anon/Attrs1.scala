package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attrs1 extends StObject {
  
  var attrs1: String
  
  var attrs2: js.UndefOr[String] = js.undefined
  
  var dir1: String
  
  var dir2: js.UndefOr[String] = js.undefined
  
  var pt: Double | String
}
object Attrs1 {
  
  inline def apply(attrs1: String, dir1: String, pt: Double | String): Attrs1 = {
    val __obj = js.Dynamic.literal(attrs1 = attrs1.asInstanceOf[js.Any], dir1 = dir1.asInstanceOf[js.Any], pt = pt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs1]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attrs1] (val x: Self) extends AnyVal {
    
    inline def setAttrs1(value: String): Self = StObject.set(x, "attrs1", value.asInstanceOf[js.Any])
    
    inline def setAttrs2(value: String): Self = StObject.set(x, "attrs2", value.asInstanceOf[js.Any])
    
    inline def setAttrs2Undefined: Self = StObject.set(x, "attrs2", js.undefined)
    
    inline def setDir1(value: String): Self = StObject.set(x, "dir1", value.asInstanceOf[js.Any])
    
    inline def setDir2(value: String): Self = StObject.set(x, "dir2", value.asInstanceOf[js.Any])
    
    inline def setDir2Undefined: Self = StObject.set(x, "dir2", js.undefined)
    
    inline def setPt(value: Double | String): Self = StObject.set(x, "pt", value.asInstanceOf[js.Any])
  }
}
