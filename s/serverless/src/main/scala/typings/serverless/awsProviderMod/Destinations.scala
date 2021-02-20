package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Destinations extends StObject {
  
  var onFailure: js.UndefOr[String] = js.native
  
  var onSuccess: js.UndefOr[String] = js.native
}
object Destinations {
  
  @scala.inline
  def apply(): Destinations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Destinations]
  }
  
  @scala.inline
  implicit class DestinationsMutableBuilder[Self <: Destinations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnFailure(value: String): Self = StObject.set(x, "onFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: String): Self = StObject.set(x, "onSuccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnSuccessUndefined: Self = StObject.set(x, "onSuccess", js.undefined)
  }
}
