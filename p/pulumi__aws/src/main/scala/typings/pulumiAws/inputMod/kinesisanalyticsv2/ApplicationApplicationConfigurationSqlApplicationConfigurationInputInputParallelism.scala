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
  
  @scala.inline
  def apply(): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelismMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Input[Double]): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
