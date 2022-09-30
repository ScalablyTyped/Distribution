package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimelineDataExport extends StObject {
  
  var batchUIDToMeasuresKeyValueArray: js.Array[js.Tuple2[BatchUID, js.Array[ReactMeasure]]]
  
  var componentMeasures: js.Array[ReactComponentMeasure]
  
  var duration: Double
  
  var flamechart: Flamechart
  
  var internalModuleSourceToRanges: js.Array[js.Tuple2[String, js.Array[js.Tuple2[ErrorStackFrame, ErrorStackFrame]]]]
  
  var laneToLabelKeyValueArray: js.Array[js.Tuple2[ReactLane, String]]
  
  var laneToReactMeasureKeyValueArray: js.Array[js.Tuple2[ReactLane, js.Array[ReactMeasure]]]
  
  var nativeEvents: js.Array[NativeEvent]
  
  var networkMeasures: js.Array[NetworkMeasure]
  
  var otherUserTimingMarks: js.Array[UserTimingMark]
  
  var reactVersion: String | Null
  
  var schedulingEvents: js.Array[SchedulingEvent]
  
  var snapshotHeight: Double
  
  var snapshots: js.Array[Snapshot]
  
  var startTime: Double
  
  var suspenseEvents: js.Array[SuspenseEvent]
  
  var thrownErrors: js.Array[ThrownError]
}
object TimelineDataExport {
  
  inline def apply(
    batchUIDToMeasuresKeyValueArray: js.Array[js.Tuple2[BatchUID, js.Array[ReactMeasure]]],
    componentMeasures: js.Array[ReactComponentMeasure],
    duration: Double,
    flamechart: Flamechart,
    internalModuleSourceToRanges: js.Array[js.Tuple2[String, js.Array[js.Tuple2[ErrorStackFrame, ErrorStackFrame]]]],
    laneToLabelKeyValueArray: js.Array[js.Tuple2[ReactLane, String]],
    laneToReactMeasureKeyValueArray: js.Array[js.Tuple2[ReactLane, js.Array[ReactMeasure]]],
    nativeEvents: js.Array[NativeEvent],
    networkMeasures: js.Array[NetworkMeasure],
    otherUserTimingMarks: js.Array[UserTimingMark],
    schedulingEvents: js.Array[SchedulingEvent],
    snapshotHeight: Double,
    snapshots: js.Array[Snapshot],
    startTime: Double,
    suspenseEvents: js.Array[SuspenseEvent],
    thrownErrors: js.Array[ThrownError]
  ): TimelineDataExport = {
    val __obj = js.Dynamic.literal(batchUIDToMeasuresKeyValueArray = batchUIDToMeasuresKeyValueArray.asInstanceOf[js.Any], componentMeasures = componentMeasures.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], flamechart = flamechart.asInstanceOf[js.Any], internalModuleSourceToRanges = internalModuleSourceToRanges.asInstanceOf[js.Any], laneToLabelKeyValueArray = laneToLabelKeyValueArray.asInstanceOf[js.Any], laneToReactMeasureKeyValueArray = laneToReactMeasureKeyValueArray.asInstanceOf[js.Any], nativeEvents = nativeEvents.asInstanceOf[js.Any], networkMeasures = networkMeasures.asInstanceOf[js.Any], otherUserTimingMarks = otherUserTimingMarks.asInstanceOf[js.Any], schedulingEvents = schedulingEvents.asInstanceOf[js.Any], snapshotHeight = snapshotHeight.asInstanceOf[js.Any], snapshots = snapshots.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], suspenseEvents = suspenseEvents.asInstanceOf[js.Any], thrownErrors = thrownErrors.asInstanceOf[js.Any], reactVersion = null)
    __obj.asInstanceOf[TimelineDataExport]
  }
  
  extension [Self <: TimelineDataExport](x: Self) {
    
    inline def setBatchUIDToMeasuresKeyValueArray(value: js.Array[js.Tuple2[BatchUID, js.Array[ReactMeasure]]]): Self = StObject.set(x, "batchUIDToMeasuresKeyValueArray", value.asInstanceOf[js.Any])
    
    inline def setBatchUIDToMeasuresKeyValueArrayVarargs(value: (js.Tuple2[BatchUID, js.Array[ReactMeasure]])*): Self = StObject.set(x, "batchUIDToMeasuresKeyValueArray", js.Array(value*))
    
    inline def setComponentMeasures(value: js.Array[ReactComponentMeasure]): Self = StObject.set(x, "componentMeasures", value.asInstanceOf[js.Any])
    
    inline def setComponentMeasuresVarargs(value: ReactComponentMeasure*): Self = StObject.set(x, "componentMeasures", js.Array(value*))
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setFlamechart(value: Flamechart): Self = StObject.set(x, "flamechart", value.asInstanceOf[js.Any])
    
    inline def setFlamechartVarargs(value: FlamechartStackLayer*): Self = StObject.set(x, "flamechart", js.Array(value*))
    
    inline def setInternalModuleSourceToRanges(value: js.Array[js.Tuple2[String, js.Array[js.Tuple2[ErrorStackFrame, ErrorStackFrame]]]]): Self = StObject.set(x, "internalModuleSourceToRanges", value.asInstanceOf[js.Any])
    
    inline def setInternalModuleSourceToRangesVarargs(value: (js.Tuple2[String, js.Array[js.Tuple2[ErrorStackFrame, ErrorStackFrame]]])*): Self = StObject.set(x, "internalModuleSourceToRanges", js.Array(value*))
    
    inline def setLaneToLabelKeyValueArray(value: js.Array[js.Tuple2[ReactLane, String]]): Self = StObject.set(x, "laneToLabelKeyValueArray", value.asInstanceOf[js.Any])
    
    inline def setLaneToLabelKeyValueArrayVarargs(value: (js.Tuple2[ReactLane, String])*): Self = StObject.set(x, "laneToLabelKeyValueArray", js.Array(value*))
    
    inline def setLaneToReactMeasureKeyValueArray(value: js.Array[js.Tuple2[ReactLane, js.Array[ReactMeasure]]]): Self = StObject.set(x, "laneToReactMeasureKeyValueArray", value.asInstanceOf[js.Any])
    
    inline def setLaneToReactMeasureKeyValueArrayVarargs(value: (js.Tuple2[ReactLane, js.Array[ReactMeasure]])*): Self = StObject.set(x, "laneToReactMeasureKeyValueArray", js.Array(value*))
    
    inline def setNativeEvents(value: js.Array[NativeEvent]): Self = StObject.set(x, "nativeEvents", value.asInstanceOf[js.Any])
    
    inline def setNativeEventsVarargs(value: NativeEvent*): Self = StObject.set(x, "nativeEvents", js.Array(value*))
    
    inline def setNetworkMeasures(value: js.Array[NetworkMeasure]): Self = StObject.set(x, "networkMeasures", value.asInstanceOf[js.Any])
    
    inline def setNetworkMeasuresVarargs(value: NetworkMeasure*): Self = StObject.set(x, "networkMeasures", js.Array(value*))
    
    inline def setOtherUserTimingMarks(value: js.Array[UserTimingMark]): Self = StObject.set(x, "otherUserTimingMarks", value.asInstanceOf[js.Any])
    
    inline def setOtherUserTimingMarksVarargs(value: UserTimingMark*): Self = StObject.set(x, "otherUserTimingMarks", js.Array(value*))
    
    inline def setReactVersion(value: String): Self = StObject.set(x, "reactVersion", value.asInstanceOf[js.Any])
    
    inline def setReactVersionNull: Self = StObject.set(x, "reactVersion", null)
    
    inline def setSchedulingEvents(value: js.Array[SchedulingEvent]): Self = StObject.set(x, "schedulingEvents", value.asInstanceOf[js.Any])
    
    inline def setSchedulingEventsVarargs(value: SchedulingEvent*): Self = StObject.set(x, "schedulingEvents", js.Array(value*))
    
    inline def setSnapshotHeight(value: Double): Self = StObject.set(x, "snapshotHeight", value.asInstanceOf[js.Any])
    
    inline def setSnapshots(value: js.Array[Snapshot]): Self = StObject.set(x, "snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "snapshots", js.Array(value*))
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setSuspenseEvents(value: js.Array[SuspenseEvent]): Self = StObject.set(x, "suspenseEvents", value.asInstanceOf[js.Any])
    
    inline def setSuspenseEventsVarargs(value: SuspenseEvent*): Self = StObject.set(x, "suspenseEvents", js.Array(value*))
    
    inline def setThrownErrors(value: js.Array[ThrownError]): Self = StObject.set(x, "thrownErrors", value.asInstanceOf[js.Any])
    
    inline def setThrownErrorsVarargs(value: ThrownError*): Self = StObject.set(x, "thrownErrors", js.Array(value*))
  }
}
