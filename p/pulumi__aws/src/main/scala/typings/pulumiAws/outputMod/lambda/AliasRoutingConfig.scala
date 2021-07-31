package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AliasRoutingConfig extends StObject {
  
  /**
    * A map that defines the proportion of events that should be sent to different versions of a lambda function.
    */
  var additionalVersionWeights: js.UndefOr[StringDictionary[Double]] = js.undefined
}
object AliasRoutingConfig {
  
  @scala.inline
  def apply(): AliasRoutingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AliasRoutingConfig]
  }
  
  @scala.inline
  implicit class AliasRoutingConfigMutableBuilder[Self <: AliasRoutingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalVersionWeights(value: StringDictionary[Double]): Self = StObject.set(x, "additionalVersionWeights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalVersionWeightsUndefined: Self = StObject.set(x, "additionalVersionWeights", js.undefined)
  }
}
