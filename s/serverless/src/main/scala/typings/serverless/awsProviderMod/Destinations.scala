package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Destinations extends StObject {
  
  var onFailure: js.UndefOr[String] = js.undefined
  
  var onSuccess: js.UndefOr[String] = js.undefined
}
object Destinations {
  
  inline def apply(): Destinations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destinations]
  }
  
  extension [Self <: Destinations](x: Self) {
    
    inline def setOnFailure(value: String): Self = StObject.set(x, "onFailure", value.asInstanceOf[js.Any])
    
    inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    inline def setOnSuccess(value: String): Self = StObject.set(x, "onSuccess", value.asInstanceOf[js.Any])
    
    inline def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
