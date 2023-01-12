package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NxListObjectExpressionDef...
  */
trait INxListObjectExpressionDef extends StObject {
  
  /**
    * Value of the expression
    */
  var qExpr: String
  
  /**
    * Refers to an expression stored in the library.
    */
  var qLibraryId: String
}
object INxListObjectExpressionDef {
  
  inline def apply(qExpr: String, qLibraryId: String): INxListObjectExpressionDef = {
    val __obj = js.Dynamic.literal(qExpr = qExpr.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxListObjectExpressionDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: INxListObjectExpressionDef] (val x: Self) extends AnyVal {
    
    inline def setQExpr(value: String): Self = StObject.set(x, "qExpr", value.asInstanceOf[js.Any])
    
    inline def setQLibraryId(value: String): Self = StObject.set(x, "qLibraryId", value.asInstanceOf[js.Any])
  }
}
