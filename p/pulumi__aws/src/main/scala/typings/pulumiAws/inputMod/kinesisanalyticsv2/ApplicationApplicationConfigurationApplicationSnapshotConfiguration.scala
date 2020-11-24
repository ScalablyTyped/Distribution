package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationApplicationSnapshotConfiguration extends js.Object {
  
  /**
    * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var snapshotsEnabled: Input[Boolean] = js.native
}
object ApplicationApplicationConfigurationApplicationSnapshotConfiguration {
  
  @scala.inline
  def apply(snapshotsEnabled: Input[Boolean]): ApplicationApplicationConfigurationApplicationSnapshotConfiguration = {
    val __obj = js.Dynamic.literal(snapshotsEnabled = snapshotsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationApplicationSnapshotConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationApplicationSnapshotConfigurationOps[Self <: ApplicationApplicationConfigurationApplicationSnapshotConfiguration] (val x: Self) extends AnyVal {
    
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
    def setSnapshotsEnabled(value: Input[Boolean]): Self = this.set("snapshotsEnabled", value.asInstanceOf[js.Any])
  }
}
