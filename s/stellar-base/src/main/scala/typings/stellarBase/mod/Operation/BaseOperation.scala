package typings.stellarBase.mod.Operation

import typings.stellarBase.mod.OperationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseOperation[T /* <: OperationType */] extends StObject {
  
  var source: js.UndefOr[String] = js.native
  
  var `type`: T = js.native
}
object BaseOperation {
  
  @scala.inline
  def apply[T /* <: OperationType */](`type`: T): BaseOperation[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseOperation[T]]
  }
  
  @scala.inline
  implicit class BaseOperationMutableBuilder[Self <: BaseOperation[_], T /* <: OperationType */] (val x: Self with BaseOperation[T]) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
