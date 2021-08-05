package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Stream extends StObject {
  
  var arn: String | StringDictionary[js.Any]
  
  var batchSize: js.UndefOr[Double | String] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var startingPosition: js.UndefOr[Double | String] = js.undefined
}
object Stream {
  
  inline def apply(arn: String | StringDictionary[js.Any]): Stream = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stream]
  }
  
  extension [Self <: Stream](x: Self) {
    
    inline def setArn(value: String | StringDictionary[js.Any]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setBatchSize(value: Double | String): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setStartingPosition(value: Double | String): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionUndefined: Self = StObject.set(x, "startingPosition", js.undefined)
  }
}
