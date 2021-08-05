package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism extends StObject {
  
  /**
    * The number of in-application streams to create.
    */
  var count: js.UndefOr[Input[Double]] = js.undefined
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism {
  
  inline def apply(): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism](x: Self) {
    
    inline def setCount(value: Input[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
