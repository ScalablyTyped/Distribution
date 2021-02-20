package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxAttrExprDef...
  */
@js.native
trait INxAttrExprDef extends StObject {
  
  /**
    * Definition of the attribute expression.
    * Example: "Max(OrderID)"
    */
  var qExpression: String = js.native
  
  /**
    * Definition of the attribute expression stored in the library..
    * Example: "MyGenericMeasure"
    */
  var qLibraryId_ : String = js.native
}
object INxAttrExprDef {
  
  @scala.inline
  def apply(qExpression: String, qLibraryId_ : String): INxAttrExprDef = {
    val __obj = js.Dynamic.literal(qExpression = qExpression.asInstanceOf[js.Any], qLibraryId_ = qLibraryId_.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxAttrExprDef]
  }
  
  @scala.inline
  implicit class INxAttrExprDefMutableBuilder[Self <: INxAttrExprDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQExpression(value: String): Self = StObject.set(x, "qExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLibraryId_(value: String): Self = StObject.set(x, "qLibraryId_", value.asInstanceOf[js.Any])
  }
}
