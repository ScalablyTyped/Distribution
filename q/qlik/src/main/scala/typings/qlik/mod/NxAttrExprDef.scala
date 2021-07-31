package typings.qlik.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxAttrExprDef extends StObject {
  
  var qExpression: String
  
  var qLibraryId: String
}
object NxAttrExprDef {
  
  @scala.inline
  def apply(qExpression: String, qLibraryId: String): NxAttrExprDef = {
    val __obj = js.Dynamic.literal(qExpression = qExpression.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttrExprDef]
  }
  
  @scala.inline
  implicit class NxAttrExprDefMutableBuilder[Self <: NxAttrExprDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQExpression(value: String): Self = StObject.set(x, "qExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLibraryId(value: String): Self = StObject.set(x, "qLibraryId", value.asInstanceOf[js.Any])
  }
}
