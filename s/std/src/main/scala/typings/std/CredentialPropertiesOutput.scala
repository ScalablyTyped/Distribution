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
  
  extension [Self <: CredentialPropertiesOutput](x: Self) {
    
    inline def setRk(value: scala.Boolean): Self = StObject.set(x, "rk", value.asInstanceOf[js.Any])
    
    inline def setRkUndefined: Self = StObject.set(x, "rk", js.undefined)
  }
}
