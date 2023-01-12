package typings.redisClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverheadHashtableExpires extends StObject {
  
  var overheadHashtableExpires: Double
  
  var overheadHashtableMain: Double
}
object OverheadHashtableExpires {
  
  inline def apply(overheadHashtableExpires: Double, overheadHashtableMain: Double): OverheadHashtableExpires = {
    val __obj = js.Dynamic.literal(overheadHashtableExpires = overheadHashtableExpires.asInstanceOf[js.Any], overheadHashtableMain = overheadHashtableMain.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverheadHashtableExpires]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverheadHashtableExpires] (val x: Self) extends AnyVal {
    
    inline def setOverheadHashtableExpires(value: Double): Self = StObject.set(x, "overheadHashtableExpires", value.asInstanceOf[js.Any])
    
    inline def setOverheadHashtableMain(value: Double): Self = StObject.set(x, "overheadHashtableMain", value.asInstanceOf[js.Any])
  }
}
