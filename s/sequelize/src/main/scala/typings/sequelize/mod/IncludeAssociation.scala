package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Association Object for Include Options
  */
trait IncludeAssociation extends StObject {
  
  var identifier: String
  
  var source: Model[Any, Any, Any]
  
  var target: Model[Any, Any, Any]
}
object IncludeAssociation {
  
  inline def apply(identifier: String, source: Model[Any, Any, Any], target: Model[Any, Any, Any]): IncludeAssociation = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeAssociation]
  }
  
  extension [Self <: IncludeAssociation](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Model[Any, Any, Any]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Model[Any, Any, Any]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
