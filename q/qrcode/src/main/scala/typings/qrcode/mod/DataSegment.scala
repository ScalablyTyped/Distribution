package typings.qrcode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSegment extends StObject {
  
  def getBitsLength(): Double
  
  def getLength(): Double
}
object DataSegment {
  
  inline def apply(getBitsLength: () => Double, getLength: () => Double): DataSegment = {
    val __obj = js.Dynamic.literal(getBitsLength = js.Any.fromFunction0(getBitsLength), getLength = js.Any.fromFunction0(getLength))
    __obj.asInstanceOf[DataSegment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSegment] (val x: Self) extends AnyVal {
    
    inline def setGetBitsLength(value: () => Double): Self = StObject.set(x, "getBitsLength", js.Any.fromFunction0(value))
    
    inline def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
  }
}
