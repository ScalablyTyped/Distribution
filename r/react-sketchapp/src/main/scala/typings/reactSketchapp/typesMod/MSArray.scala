package typings.reactSketchapp.typesMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MSArray[T]
  extends StObject
     with /* key */ NumberDictionary[T] {
  
  var length: Double
}
object MSArray {
  
  @scala.inline
  def apply[T](length: Double): MSArray[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSArray[T]]
  }
  
  @scala.inline
  implicit class MSArrayMutableBuilder[Self <: MSArray[?], T] (val x: Self & MSArray[T]) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
