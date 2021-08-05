package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationApplicationSnapshotConfiguration extends StObject {
  
  /**
    * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var snapshotsEnabled: Input[Boolean]
}
object ApplicationApplicationConfigurationApplicationSnapshotConfiguration {
  
  inline def apply(snapshotsEnabled: Input[Boolean]): ApplicationApplicationConfigurationApplicationSnapshotConfiguration = {
    val __obj = js.Dynamic.literal(snapshotsEnabled = snapshotsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationApplicationSnapshotConfiguration]
  }
  
  extension [Self <: ApplicationApplicationConfigurationApplicationSnapshotConfiguration](x: Self) {
    
    inline def setSnapshotsEnabled(value: Input[Boolean]): Self = StObject.set(x, "snapshotsEnabled", value.asInstanceOf[js.Any])
  }
}
