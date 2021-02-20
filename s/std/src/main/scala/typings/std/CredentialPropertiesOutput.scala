package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CredentialPropertiesOutput extends StObject {
  
  var rk: js.UndefOr[scala.Boolean] = js.native
}
object CredentialPropertiesOutput {
  
  @scala.inline
  def apply(): CredentialPropertiesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialPropertiesOutput]
  }
  
  @scala.inline
  implicit class CredentialPropertiesOutputMutableBuilder[Self <: CredentialPropertiesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRk(value: scala.Boolean): Self = StObject.set(x, "rk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRkUndefined: Self = StObject.set(x, "rk", js.undefined)
  }
}
