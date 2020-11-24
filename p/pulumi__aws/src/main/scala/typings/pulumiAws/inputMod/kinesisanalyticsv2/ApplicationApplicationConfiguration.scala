package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfiguration extends js.Object {
  
  /**
    * The code location and type parameters for the application.
    */
  var applicationCodeConfiguration: Input[ApplicationApplicationConfigurationApplicationCodeConfiguration] = js.native
  
  /**
    * Describes whether snapshots are enabled for a Flink-based application.
    */
  var applicationSnapshotConfiguration: js.UndefOr[Input[ApplicationApplicationConfigurationApplicationSnapshotConfiguration]] = js.native
  
  /**
    * Describes execution properties for a Flink-based application.
    */
  var environmentProperties: js.UndefOr[Input[ApplicationApplicationConfigurationEnvironmentProperties]] = js.native
  
  /**
    * The configuration of a Flink-based application.
    */
  var flinkApplicationConfiguration: js.UndefOr[Input[ApplicationApplicationConfigurationFlinkApplicationConfiguration]] = js.native
  
  /**
    * The configuration of a SQL-based application.
    */
  var sqlApplicationConfiguration: js.UndefOr[Input[ApplicationApplicationConfigurationSqlApplicationConfiguration]] = js.native
  
  /**
    * The VPC configuration of a Flink-based application.
    */
  var vpcConfiguration: js.UndefOr[Input[ApplicationApplicationConfigurationVpcConfiguration]] = js.native
}
object ApplicationApplicationConfiguration {
  
  @scala.inline
  def apply(
    applicationCodeConfiguration: Input[ApplicationApplicationConfigurationApplicationCodeConfiguration]
  ): ApplicationApplicationConfiguration = {
    val __obj = js.Dynamic.literal(applicationCodeConfiguration = applicationCodeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationOps[Self <: ApplicationApplicationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplicationCodeConfiguration(value: Input[ApplicationApplicationConfigurationApplicationCodeConfiguration]): Self = this.set("applicationCodeConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationSnapshotConfiguration(value: Input[ApplicationApplicationConfigurationApplicationSnapshotConfiguration]): Self = this.set("applicationSnapshotConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationSnapshotConfiguration: Self = this.set("applicationSnapshotConfiguration", js.undefined)
    
    @scala.inline
    def setEnvironmentProperties(value: Input[ApplicationApplicationConfigurationEnvironmentProperties]): Self = this.set("environmentProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentProperties: Self = this.set("environmentProperties", js.undefined)
    
    @scala.inline
    def setFlinkApplicationConfiguration(value: Input[ApplicationApplicationConfigurationFlinkApplicationConfiguration]): Self = this.set("flinkApplicationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlinkApplicationConfiguration: Self = this.set("flinkApplicationConfiguration", js.undefined)
    
    @scala.inline
    def setSqlApplicationConfiguration(value: Input[ApplicationApplicationConfigurationSqlApplicationConfiguration]): Self = this.set("sqlApplicationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSqlApplicationConfiguration: Self = this.set("sqlApplicationConfiguration", js.undefined)
    
    @scala.inline
    def setVpcConfiguration(value: Input[ApplicationApplicationConfigurationVpcConfiguration]): Self = this.set("vpcConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfiguration: Self = this.set("vpcConfiguration", js.undefined)
  }
}
