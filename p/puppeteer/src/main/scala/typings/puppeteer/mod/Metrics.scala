package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metrics extends StObject {
  
  var Documents: js.UndefOr[Double] = js.undefined
  
  var Frames: js.UndefOr[Double] = js.undefined
  
  var JSEventListeners: js.UndefOr[Double] = js.undefined
  
  var JSHeapTotalSize: js.UndefOr[Double] = js.undefined
  
  var JSHeapUsedSize: js.UndefOr[Double] = js.undefined
  
  var LayoutCount: js.UndefOr[Double] = js.undefined
  
  var LayoutDuration: js.UndefOr[Double] = js.undefined
  
  var Nodes: js.UndefOr[Double] = js.undefined
  
  var RecalcStyleCount: js.UndefOr[Double] = js.undefined
  
  var RecalcStyleDuration: js.UndefOr[Double] = js.undefined
  
  var ScriptDuration: js.UndefOr[Double] = js.undefined
  
  var TaskDuration: js.UndefOr[Double] = js.undefined
  
  var Timestamp: js.UndefOr[Double] = js.undefined
}
object Metrics {
  
  inline def apply(): Metrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metrics]
  }
  
  extension [Self <: Metrics](x: Self) {
    
    inline def setDocuments(value: Double): Self = StObject.set(x, "Documents", value.asInstanceOf[js.Any])
    
    inline def setDocumentsUndefined: Self = StObject.set(x, "Documents", js.undefined)
    
    inline def setFrames(value: Double): Self = StObject.set(x, "Frames", value.asInstanceOf[js.Any])
    
    inline def setFramesUndefined: Self = StObject.set(x, "Frames", js.undefined)
    
    inline def setJSEventListeners(value: Double): Self = StObject.set(x, "JSEventListeners", value.asInstanceOf[js.Any])
    
    inline def setJSEventListenersUndefined: Self = StObject.set(x, "JSEventListeners", js.undefined)
    
    inline def setJSHeapTotalSize(value: Double): Self = StObject.set(x, "JSHeapTotalSize", value.asInstanceOf[js.Any])
    
    inline def setJSHeapTotalSizeUndefined: Self = StObject.set(x, "JSHeapTotalSize", js.undefined)
    
    inline def setJSHeapUsedSize(value: Double): Self = StObject.set(x, "JSHeapUsedSize", value.asInstanceOf[js.Any])
    
    inline def setJSHeapUsedSizeUndefined: Self = StObject.set(x, "JSHeapUsedSize", js.undefined)
    
    inline def setLayoutCount(value: Double): Self = StObject.set(x, "LayoutCount", value.asInstanceOf[js.Any])
    
    inline def setLayoutCountUndefined: Self = StObject.set(x, "LayoutCount", js.undefined)
    
    inline def setLayoutDuration(value: Double): Self = StObject.set(x, "LayoutDuration", value.asInstanceOf[js.Any])
    
    inline def setLayoutDurationUndefined: Self = StObject.set(x, "LayoutDuration", js.undefined)
    
    inline def setNodes(value: Double): Self = StObject.set(x, "Nodes", value.asInstanceOf[js.Any])
    
    inline def setNodesUndefined: Self = StObject.set(x, "Nodes", js.undefined)
    
    inline def setRecalcStyleCount(value: Double): Self = StObject.set(x, "RecalcStyleCount", value.asInstanceOf[js.Any])
    
    inline def setRecalcStyleCountUndefined: Self = StObject.set(x, "RecalcStyleCount", js.undefined)
    
    inline def setRecalcStyleDuration(value: Double): Self = StObject.set(x, "RecalcStyleDuration", value.asInstanceOf[js.Any])
    
    inline def setRecalcStyleDurationUndefined: Self = StObject.set(x, "RecalcStyleDuration", js.undefined)
    
    inline def setScriptDuration(value: Double): Self = StObject.set(x, "ScriptDuration", value.asInstanceOf[js.Any])
    
    inline def setScriptDurationUndefined: Self = StObject.set(x, "ScriptDuration", js.undefined)
    
    inline def setTaskDuration(value: Double): Self = StObject.set(x, "TaskDuration", value.asInstanceOf[js.Any])
    
    inline def setTaskDurationUndefined: Self = StObject.set(x, "TaskDuration", js.undefined)
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
  }
}
