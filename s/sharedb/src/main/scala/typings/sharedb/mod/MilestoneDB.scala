package typings.sharedb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sharedb", "MilestoneDB")
@js.native
abstract class MilestoneDB () extends StObject {
  
  def close(): Unit = js.native
  def close(callback: BasicCallback): Unit = js.native
  
  def getMilestoneSnapshot(collection: String, id: String, version: Double): Unit = js.native
  def getMilestoneSnapshot(collection: String, id: String, version: Double, callback: BasicCallback): Unit = js.native
  
  def getMilestoneSnapshotAtOrAfterTime(collection: String, id: String, timestamp: Double): Unit = js.native
  def getMilestoneSnapshotAtOrAfterTime(collection: String, id: String, timestamp: Double, callback: BasicCallback): Unit = js.native
  
  def getMilestoneSnapshotAtOrBeforeTime(collection: String, id: String, timestamp: Double): Unit = js.native
  def getMilestoneSnapshotAtOrBeforeTime(collection: String, id: String, timestamp: Double, callback: BasicCallback): Unit = js.native
  
  def saveMilestoneSnapshot(collection: String, snapshot: Snapshot): Unit = js.native
  def saveMilestoneSnapshot(collection: String, snapshot: Snapshot, callback: BasicCallback): Unit = js.native
}
