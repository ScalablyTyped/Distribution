package typings.reactBootstrapTableNext.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data[T /* <: js.Object */] extends StObject {
  
  var data: js.Array[T] = js.native
}
object Data {
  
  @scala.inline
  def apply[T /* <: js.Object */](data: js.Array[T]): Data[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data[_], T /* <: js.Object */] (val x: Self with Data[T]) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: T*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
