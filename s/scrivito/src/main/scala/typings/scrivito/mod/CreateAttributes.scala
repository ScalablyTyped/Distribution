package typings.scrivito.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Obj definitions
  */
trait CreateAttributes extends StObject {
  
  var attributes: js.Any
}
object CreateAttributes {
  
  @scala.inline
  def apply(attributes: js.Any): CreateAttributes = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAttributes]
  }
  
  @scala.inline
  implicit class CreateAttributesMutableBuilder[Self <: CreateAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: js.Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
  }
}
