package typings.reactNativeChartsWrapper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarSpace extends StObject {
  
  var barSpace: Double
  
  var fromX: Double
  
  var groupSpace: Double
}
object BarSpace {
  
  inline def apply(barSpace: Double, fromX: Double, groupSpace: Double): BarSpace = {
    val __obj = js.Dynamic.literal(barSpace = barSpace.asInstanceOf[js.Any], fromX = fromX.asInstanceOf[js.Any], groupSpace = groupSpace.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarSpace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BarSpace] (val x: Self) extends AnyVal {
    
    inline def setBarSpace(value: Double): Self = StObject.set(x, "barSpace", value.asInstanceOf[js.Any])
    
    inline def setFromX(value: Double): Self = StObject.set(x, "fromX", value.asInstanceOf[js.Any])
    
    inline def setGroupSpace(value: Double): Self = StObject.set(x, "groupSpace", value.asInstanceOf[js.Any])
  }
}
