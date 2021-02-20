package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Association Object for Include Options
  */
@js.native
trait IncludeAssociation extends StObject {
  
  var identifier: String = js.native
  
  var source: Model[_, _, _] = js.native
  
  var target: Model[_, _, _] = js.native
}
object IncludeAssociation {
  
  @scala.inline
  def apply(identifier: String, source: Model[_, _, _], target: Model[_, _, _]): IncludeAssociation = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeAssociation]
  }
  
  @scala.inline
  implicit class IncludeAssociationMutableBuilder[Self <: IncludeAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: Model[_, _, _]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Model[_, _, _]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
