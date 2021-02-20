package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MSAssertion extends StObject {
  
  val id: java.lang.String = js.native
  
  val `type`: MSCredentialType = js.native
}
object MSAssertion {
  
  @scala.inline
  def apply(id: java.lang.String, `type`: MSCredentialType): MSAssertion = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSAssertion]
  }
  
  @scala.inline
  implicit class MSAssertionMutableBuilder[Self <: MSAssertion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: java.lang.String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MSCredentialType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
