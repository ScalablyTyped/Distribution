package typings.reactNativeElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerHorizontal extends StObject {
  
  var containerHorizontal: Height
  
  var containerVertical: AlignItems
  
  var debugThumbTouchArea: Opacity
  
  var thumb: Position
  
  var touchArea: BackgroundColor
  
  var track: BorderRadius
  
  var trackHorizontal: HeightNumber
  
  var trackVertical: Flex
}
object ContainerHorizontal {
  
  inline def apply(
    containerHorizontal: Height,
    containerVertical: AlignItems,
    debugThumbTouchArea: Opacity,
    thumb: Position,
    touchArea: BackgroundColor,
    track: BorderRadius,
    trackHorizontal: HeightNumber,
    trackVertical: Flex
  ): ContainerHorizontal = {
    val __obj = js.Dynamic.literal(containerHorizontal = containerHorizontal.asInstanceOf[js.Any], containerVertical = containerVertical.asInstanceOf[js.Any], debugThumbTouchArea = debugThumbTouchArea.asInstanceOf[js.Any], thumb = thumb.asInstanceOf[js.Any], touchArea = touchArea.asInstanceOf[js.Any], track = track.asInstanceOf[js.Any], trackHorizontal = trackHorizontal.asInstanceOf[js.Any], trackVertical = trackVertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerHorizontal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerHorizontal] (val x: Self) extends AnyVal {
    
    inline def setContainerHorizontal(value: Height): Self = StObject.set(x, "containerHorizontal", value.asInstanceOf[js.Any])
    
    inline def setContainerVertical(value: AlignItems): Self = StObject.set(x, "containerVertical", value.asInstanceOf[js.Any])
    
    inline def setDebugThumbTouchArea(value: Opacity): Self = StObject.set(x, "debugThumbTouchArea", value.asInstanceOf[js.Any])
    
    inline def setThumb(value: Position): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
    
    inline def setTouchArea(value: BackgroundColor): Self = StObject.set(x, "touchArea", value.asInstanceOf[js.Any])
    
    inline def setTrack(value: BorderRadius): Self = StObject.set(x, "track", value.asInstanceOf[js.Any])
    
    inline def setTrackHorizontal(value: HeightNumber): Self = StObject.set(x, "trackHorizontal", value.asInstanceOf[js.Any])
    
    inline def setTrackVertical(value: Flex): Self = StObject.set(x, "trackVertical", value.asInstanceOf[js.Any])
  }
}
