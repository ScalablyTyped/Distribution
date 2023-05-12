package typings.quadstore.distCjsTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadingState extends StObject {
  
  var keyOffset: Double
  
  var lengthsOffset: Double
}
object ReadingState {
  
  inline def apply(keyOffset: Double, lengthsOffset: Double): ReadingState = {
    val __obj = js.Dynamic.literal(keyOffset = keyOffset.asInstanceOf[js.Any], lengthsOffset = lengthsOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadingState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadingState] (val x: Self) extends AnyVal {
    
    inline def setKeyOffset(value: Double): Self = StObject.set(x, "keyOffset", value.asInstanceOf[js.Any])
    
    inline def setLengthsOffset(value: Double): Self = StObject.set(x, "lengthsOffset", value.asInstanceOf[js.Any])
  }
}
