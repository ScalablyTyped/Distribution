package typings.serverless.pluginsAwsProviderAwsProviderMod

import typings.serverless.serverlessStrings.LATEST
import typings.serverless.serverlessStrings.TRIM_HORIZON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Msk extends StObject {
  
  var arn: String
  
  var batchSize: js.UndefOr[Double] = js.undefined
  
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  var startingPosition: js.UndefOr[LATEST | TRIM_HORIZON] = js.undefined
  
  var topic: String
}
object Msk {
  
  inline def apply(arn: String, topic: String): Msk = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Msk]
  }
  
  extension [Self <: Msk](x: Self) {
    
    inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setStartingPosition(value: LATEST | TRIM_HORIZON): Self = StObject.set(x, "startingPosition", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionUndefined: Self = StObject.set(x, "startingPosition", js.undefined)
    
    inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
  }
}
