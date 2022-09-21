package typings.rdflib.anon

import typings.rdflib.tfTypesMod.Term
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Setobject extends StObject {
  
  def set_object(obj: Any, callbackFunction: Any): Unit
  
  var statement: js.UndefOr[js.Array[Term]] = js.undefined
  
  var statementNT: js.UndefOr[String] = js.undefined
  
  var where: String
}
object Setobject {
  
  inline def apply(set_object: (Any, Any) => Unit, where: String): Setobject = {
    val __obj = js.Dynamic.literal(set_object = js.Any.fromFunction2(set_object), where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[Setobject]
  }
  
  extension [Self <: Setobject](x: Self) {
    
    inline def setSet_object(value: (Any, Any) => Unit): Self = StObject.set(x, "set_object", js.Any.fromFunction2(value))
    
    inline def setStatement(value: js.Array[Term]): Self = StObject.set(x, "statement", value.asInstanceOf[js.Any])
    
    inline def setStatementNT(value: String): Self = StObject.set(x, "statementNT", value.asInstanceOf[js.Any])
    
    inline def setStatementNTUndefined: Self = StObject.set(x, "statementNT", js.undefined)
    
    inline def setStatementUndefined: Self = StObject.set(x, "statement", js.undefined)
    
    inline def setStatementVarargs(value: Term*): Self = StObject.set(x, "statement", js.Array(value*))
    
    inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
  }
}
