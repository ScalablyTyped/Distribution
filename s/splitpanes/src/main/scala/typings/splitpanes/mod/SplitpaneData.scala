package typings.splitpanes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SplitpaneData extends StObject {
  
  var container: ContainerType
  
  var panes: js.Array[Pane]
  
  var ready: Boolean
  
  var splitterTaps: SplitterTapsType
  
  var touch: TouchType
}
object SplitpaneData {
  
  inline def apply(
    container: ContainerType,
    panes: js.Array[Pane],
    ready: Boolean,
    splitterTaps: SplitterTapsType,
    touch: TouchType
  ): SplitpaneData = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], panes = panes.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], splitterTaps = splitterTaps.asInstanceOf[js.Any], touch = touch.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitpaneData]
  }
  
  extension [Self <: SplitpaneData](x: Self) {
    
    inline def setContainer(value: ContainerType): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setPanes(value: js.Array[Pane]): Self = StObject.set(x, "panes", value.asInstanceOf[js.Any])
    
    inline def setPanesVarargs(value: Pane*): Self = StObject.set(x, "panes", js.Array(value*))
    
    inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setSplitterTaps(value: SplitterTapsType): Self = StObject.set(x, "splitterTaps", value.asInstanceOf[js.Any])
    
    inline def setTouch(value: TouchType): Self = StObject.set(x, "touch", value.asInstanceOf[js.Any])
  }
}
