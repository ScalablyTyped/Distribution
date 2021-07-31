package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxListobjectExpressionDef extends StObject {
  
  var qExpr: String
  
  var qLibraryId: String
}
object NxListobjectExpressionDef {
  
  @scala.inline
  def apply(qExpr: String, qLibraryId: String): NxListobjectExpressionDef = {
    val __obj = js.Dynamic.literal(qExpr = qExpr.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxListobjectExpressionDef]
  }
  
  @scala.inline
  implicit class NxListobjectExpressionDefMutableBuilder[Self <: NxListobjectExpressionDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQExpr(value: String): Self = StObject.set(x, "qExpr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLibraryId(value: String): Self = StObject.set(x, "qLibraryId", value.asInstanceOf[js.Any])
  }
}
