package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CredentialPropertiesOutput extends StObject {
  
  /* standard dom */
  var rk: js.UndefOr[scala.Boolean] = js.undefined
}
object CredentialPropertiesOutput {
  
  inline def apply(): CredentialPropertiesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CredentialPropertiesOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CredentialPropertiesOutput] (val x: Self) extends AnyVal {
    
    inline def setRk(value: scala.Boolean): Self = StObject.set(x, "rk", value.asInstanceOf[js.Any])
    
    inline def setRkUndefined: Self = StObject.set(x, "rk", js.undefined)
  }
}
