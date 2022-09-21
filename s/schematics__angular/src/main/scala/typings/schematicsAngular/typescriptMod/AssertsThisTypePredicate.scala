package typings.schematicsAngular.typescriptMod

import typings.schematicsAngular.typescriptMod.TypePredicateKind.AssertsThis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertsThisTypePredicate
  extends StObject
     with TypePredicateBase
     with TypePredicate {
  
  @JSName("kind")
  var kind_AssertsThisTypePredicate: AssertsThis
  
  var parameterIndex: Unit
  
  var parameterName: Unit
}
object AssertsThisTypePredicate {
  
  inline def apply(kind: AssertsThis, parameterIndex: Unit, parameterName: Unit): AssertsThisTypePredicate = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], parameterIndex = parameterIndex.asInstanceOf[js.Any], parameterName = parameterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertsThisTypePredicate]
  }
  
  extension [Self <: AssertsThisTypePredicate](x: Self) {
    
    inline def setKind(value: AssertsThis): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setParameterIndex(value: Unit): Self = StObject.set(x, "parameterIndex", value.asInstanceOf[js.Any])
    
    inline def setParameterName(value: Unit): Self = StObject.set(x, "parameterName", value.asInstanceOf[js.Any])
  }
}
