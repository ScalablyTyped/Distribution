package typings.reactNativeMaps.anon

import typings.reactNativeMaps.libSharedTypesMod.LatLng
import typings.reactNativeMaps.reactNativeMapsStrings.`callout-press`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Point extends StObject {
  
  var action: `callout-press`
  
  /**
    * @platform Android
    */
  var coordinate: js.UndefOr[LatLng] = js.undefined
  
  /**
    * @platform iOS
    */
  var frame: js.UndefOr[typings.reactNativeMaps.libSharedTypesMod.Frame] = js.undefined
  
  /**
    * @platform iOS
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * @platform iOS
    */
  var point: js.UndefOr[typings.reactNativeMaps.libSharedTypesMod.Point] = js.undefined
  
  /**
    * @platform Android
    */
  var position: js.UndefOr[typings.reactNativeMaps.libSharedTypesMod.Point] = js.undefined
}
object Point {
  
  inline def apply(): Point = {
    val __obj = js.Dynamic.literal(action = "callout-press")
    __obj.asInstanceOf[Point]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Point] (val x: Self) extends AnyVal {
    
    inline def setAction(value: `callout-press`): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCoordinate(value: LatLng): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
    
    inline def setFrame(value: typings.reactNativeMaps.libSharedTypesMod.Frame): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPoint(value: typings.reactNativeMaps.libSharedTypesMod.Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    inline def setPosition(value: typings.reactNativeMaps.libSharedTypesMod.Point): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
