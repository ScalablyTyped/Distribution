package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Association Object for Include Options
  */
trait IncludeAssociation extends StObject {
  
  var identifier: String
  
  var source: Model[js.Any, js.Any, js.Any]
  
  var target: Model[js.Any, js.Any, js.Any]
}
object IncludeAssociation {
  
  @scala.inline
  def apply(identifier: String, source: Model[js.Any, js.Any, js.Any], target: Model[js.Any, js.Any, js.Any]): IncludeAssociation = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeAssociation]
  }
  
  @scala.inline
  implicit class IncludeAssociationMutableBuilder[Self <: IncludeAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Model[js.Any, js.Any, js.Any]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Model[js.Any, js.Any, js.Any]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
