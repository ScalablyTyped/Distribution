package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfiguration extends StObject {
  
  /**
    * The code location and type parameters for the application.
    */
  var applicationCodeConfiguration: Input[ApplicationApplicationConfigurationApplicationCodeConfiguration]
  
  /**
    * Describes whether snapshots are enabled for a Flink-based application.
    */
  var applicationSnapshotConfiguration: js.UndefOr[Input[ApplicationApplicationConfigurationApplicationSnapshotConfiguration]] = js.undefined
  
  /**
    * Describes execution properties for a Flink-based application.
    */
  var environmentProperties: js.UndefOr[Input[ApplicationApplicationConfigurationEnvironmentProperties]] = js.undefined
  
  /**
    * The configuration of a Flink-based application.
    */
  var flinkApplicationConfiguration: js.UndefOr[Input[ApplicationApplicationConfigurationFlinkApplicationConfiguration]] = js.undefined
  
  /**
    * The configuration of a SQL-based application.
    */
  var sqlApplicationConfiguration: js.UndefOr[Input[ApplicationApplicationConfigurationSqlApplicationConfiguration]] = js.undefined
  
  /**
    * The VPC configuration of a Flink-based application.
    */
  var vpcConfiguration: js.UndefOr[Input[ApplicationApplicationConfigurationVpcConfiguration]] = js.undefined
}
object ApplicationApplicationConfiguration {
  
  inline def apply(
    applicationCodeConfiguration: Input[ApplicationApplicationConfigurationApplicationCodeConfiguration]
  ): ApplicationApplicationConfiguration = {
    val __obj = js.Dynamic.literal(applicationCodeConfiguration = applicationCodeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfiguration]
  }
  
  extension [Self <: ApplicationApplicationConfiguration](x: Self) {
    
    inline def setApplicationCodeConfiguration(value: Input[ApplicationApplicationConfigurationApplicationCodeConfiguration]): Self = StObject.set(x, "applicationCodeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setApplicationSnapshotConfiguration(value: Input[ApplicationApplicationConfigurationApplicationSnapshotConfiguration]): Self = StObject.set(x, "applicationSnapshotConfiguration", value.asInstanceOf[js.Any])
    
    inline def setApplicationSnapshotConfigurationUndefined: Self = StObject.set(x, "applicationSnapshotConfiguration", js.undefined)
    
    inline def setEnvironmentProperties(value: Input[ApplicationApplicationConfigurationEnvironmentProperties]): Self = StObject.set(x, "environmentProperties", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentPropertiesUndefined: Self = StObject.set(x, "environmentProperties", js.undefined)
    
    inline def setFlinkApplicationConfiguration(value: Input[ApplicationApplicationConfigurationFlinkApplicationConfiguration]): Self = StObject.set(x, "flinkApplicationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFlinkApplicationConfigurationUndefined: Self = StObject.set(x, "flinkApplicationConfiguration", js.undefined)
    
    inline def setSqlApplicationConfiguration(value: Input[ApplicationApplicationConfigurationSqlApplicationConfiguration]): Self = StObject.set(x, "sqlApplicationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSqlApplicationConfigurationUndefined: Self = StObject.set(x, "sqlApplicationConfiguration", js.undefined)
    
    inline def setVpcConfiguration(value: Input[ApplicationApplicationConfigurationVpcConfiguration]): Self = StObject.set(x, "vpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "vpcConfiguration", js.undefined)
  }
}
