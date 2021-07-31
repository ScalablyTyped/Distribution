package typings.sendgrid.mod.SendGrid.Helpers.Mail

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Substitution extends StObject {
  
  var key: String
  
  var value: String
}
object Substitution {
  
  @scala.inline
  def apply(key: String, value: String): Substitution = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Substitution]
  }
  
  @scala.inline
  implicit class SubstitutionMutableBuilder[Self <: Substitution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
