package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfiguration extends StObject {
  
  /**
    * The code location and type parameters for the application.
    */
  var applicationCodeConfiguration: ApplicationApplicationConfigurationApplicationCodeConfiguration
  
  /**
    * Describes whether snapshots are enabled for a Flink-based application.
    */
  var applicationSnapshotConfiguration: ApplicationApplicationConfigurationApplicationSnapshotConfiguration
  
  /**
    * Describes execution properties for a Flink-based application.
    */
  var environmentProperties: js.UndefOr[ApplicationApplicationConfigurationEnvironmentProperties] = js.undefined
  
  /**
    * The configuration of a Flink-based application.
    */
  var flinkApplicationConfiguration: ApplicationApplicationConfigurationFlinkApplicationConfiguration
  
  /**
    * The configuration of a SQL-based application.
    */
  var sqlApplicationConfiguration: js.UndefOr[ApplicationApplicationConfigurationSqlApplicationConfiguration] = js.undefined
  
  /**
    * The VPC configuration of a Flink-based application.
    */
  var vpcConfiguration: js.UndefOr[ApplicationApplicationConfigurationVpcConfiguration] = js.undefined
}
object ApplicationApplicationConfiguration {
  
  @scala.inline
  def apply(
    applicationCodeConfiguration: ApplicationApplicationConfigurationApplicationCodeConfiguration,
    applicationSnapshotConfiguration: ApplicationApplicationConfigurationApplicationSnapshotConfiguration,
    flinkApplicationConfiguration: ApplicationApplicationConfigurationFlinkApplicationConfiguration
  ): ApplicationApplicationConfiguration = {
    val __obj = js.Dynamic.literal(applicationCodeConfiguration = applicationCodeConfiguration.asInstanceOf[js.Any], applicationSnapshotConfiguration = applicationSnapshotConfiguration.asInstanceOf[js.Any], flinkApplicationConfiguration = flinkApplicationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationMutableBuilder[Self <: ApplicationApplicationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationCodeConfiguration(value: ApplicationApplicationConfigurationApplicationCodeConfiguration): Self = StObject.set(x, "applicationCodeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationSnapshotConfiguration(value: ApplicationApplicationConfigurationApplicationSnapshotConfiguration): Self = StObject.set(x, "applicationSnapshotConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentProperties(value: ApplicationApplicationConfigurationEnvironmentProperties): Self = StObject.set(x, "environmentProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentPropertiesUndefined: Self = StObject.set(x, "environmentProperties", js.undefined)
    
    @scala.inline
    def setFlinkApplicationConfiguration(value: ApplicationApplicationConfigurationFlinkApplicationConfiguration): Self = StObject.set(x, "flinkApplicationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlApplicationConfiguration(value: ApplicationApplicationConfigurationSqlApplicationConfiguration): Self = StObject.set(x, "sqlApplicationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSqlApplicationConfigurationUndefined: Self = StObject.set(x, "sqlApplicationConfiguration", js.undefined)
    
    @scala.inline
    def setVpcConfiguration(value: ApplicationApplicationConfigurationVpcConfiguration): Self = StObject.set(x, "vpcConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigurationUndefined: Self = StObject.set(x, "vpcConfiguration", js.undefined)
  }
}
