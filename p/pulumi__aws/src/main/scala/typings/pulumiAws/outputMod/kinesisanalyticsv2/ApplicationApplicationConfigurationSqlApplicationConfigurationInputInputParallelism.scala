package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism extends StObject {
  
  /**
    * The number of in-application streams to create.
    */
  var count: Double
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism {
  
  inline def apply(count: Double): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism]
  }
  
  extension [Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
  }
}
