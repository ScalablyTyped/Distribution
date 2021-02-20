package typings.reactSketchapp.typesMod

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSArray[T] extends /* key */ NumberDictionary[T] {
  
  var length: Double = js.native
}
object MSArray {
  
  @scala.inline
  def apply[T](length: Double): MSArray[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSArray[T]]
  }
  
  @scala.inline
  implicit class MSArrayMutableBuilder[Self <: MSArray[_], T] (val x: Self with MSArray[T]) extends AnyVal {
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
  }
}
