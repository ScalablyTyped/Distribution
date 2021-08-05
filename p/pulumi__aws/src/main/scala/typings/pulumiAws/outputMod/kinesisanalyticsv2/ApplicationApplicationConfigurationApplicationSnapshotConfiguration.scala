package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationApplicationSnapshotConfiguration extends StObject {
  
  /**
    * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var snapshotsEnabled: Boolean
}
object ApplicationApplicationConfigurationApplicationSnapshotConfiguration {
  
  inline def apply(snapshotsEnabled: Boolean): ApplicationApplicationConfigurationApplicationSnapshotConfiguration = {
    val __obj = js.Dynamic.literal(snapshotsEnabled = snapshotsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationApplicationSnapshotConfiguration]
  }
  
  extension [Self <: ApplicationApplicationConfigurationApplicationSnapshotConfiguration](x: Self) {
    
    inline def setSnapshotsEnabled(value: Boolean): Self = StObject.set(x, "snapshotsEnabled", value.asInstanceOf[js.Any])
  }
}
