package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidString extends StObject {
  
  var valid: String
}
object ValidString {
  
  @scala.inline
  def apply(valid: String): ValidString = {
    val __obj = js.Dynamic.literal(valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidString]
  }
  
  @scala.inline
  implicit class ValidStringMutableBuilder[Self <: ValidString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setValid(value: String): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
