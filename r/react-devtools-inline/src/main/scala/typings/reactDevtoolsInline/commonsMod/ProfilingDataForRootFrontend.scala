package typings.reactDevtoolsInline.commonsMod

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfilingDataForRootFrontend extends StObject {
  
  /**
    * Timing, duration, and other metadata about each commit.
    */
  var commitData: js.Array[CommitDataFrontend]
  
  /**
    * Display name of the nearest descendant component (ideally a function or class component).
    * This value is used by the root selector UI.
    */
  var displayName: String
  
  /**
    * Map of fiber id to (initial) tree base duration when Profiling session was started.
    * This info can be used along with commitOperations to reconstruct the tree for any commit.
    */
  var initialTreeBaseDurations: Map[Double, Double]
  
  /**
    * List of tree mutation that occur during profiling.
    * These mutations can be used along with initial snapshots to reconstruct the tree for any commit.
    */
  var operations: js.Array[js.Array[Double]]
  
  /** Identifies the root this profiler data corresponds to. */
  var rootID: Double
  
  /**
    * Map of fiber id to node when the Profiling session was started.
    * This info can be used along with commitOperations to reconstruct the tree for any commit.
    */
  var snapshots: Map[Double, SnapshotNode]
}
object ProfilingDataForRootFrontend {
  
  inline def apply(
    commitData: js.Array[CommitDataFrontend],
    displayName: String,
    initialTreeBaseDurations: Map[Double, Double],
    operations: js.Array[js.Array[Double]],
    rootID: Double,
    snapshots: Map[Double, SnapshotNode]
  ): ProfilingDataForRootFrontend = {
    val __obj = js.Dynamic.literal(commitData = commitData.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], initialTreeBaseDurations = initialTreeBaseDurations.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], rootID = rootID.asInstanceOf[js.Any], snapshots = snapshots.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilingDataForRootFrontend]
  }
  
  extension [Self <: ProfilingDataForRootFrontend](x: Self) {
    
    inline def setCommitData(value: js.Array[CommitDataFrontend]): Self = StObject.set(x, "commitData", value.asInstanceOf[js.Any])
    
    inline def setCommitDataVarargs(value: CommitDataFrontend*): Self = StObject.set(x, "commitData", js.Array(value*))
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setInitialTreeBaseDurations(value: Map[Double, Double]): Self = StObject.set(x, "initialTreeBaseDurations", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "operations", js.Array(value*))
    
    inline def setRootID(value: Double): Self = StObject.set(x, "rootID", value.asInstanceOf[js.Any])
    
    inline def setSnapshots(value: Map[Double, SnapshotNode]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
  }
}
