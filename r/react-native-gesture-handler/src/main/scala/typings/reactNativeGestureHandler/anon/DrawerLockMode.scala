package typings.reactNativeGestureHandler.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawerLockMode extends StObject {
  
  var drawerLockMode: String
  
  var drawerPosition: String
  
  var drawerType: String
  
  var drawerWidth: Double
  
  var edgeWidth: Double
  
  var enableTrackpadTwoFingerGesture: Boolean
  
  var minSwipeDistance: Double
  
  var overlayColor: String
  
  var useNativeAnimations: Boolean
}
object DrawerLockMode {
  
  inline def apply(
    drawerLockMode: String,
    drawerPosition: String,
    drawerType: String,
    drawerWidth: Double,
    edgeWidth: Double,
    enableTrackpadTwoFingerGesture: Boolean,
    minSwipeDistance: Double,
    overlayColor: String,
    useNativeAnimations: Boolean
  ): DrawerLockMode = {
    val __obj = js.Dynamic.literal(drawerLockMode = drawerLockMode.asInstanceOf[js.Any], drawerPosition = drawerPosition.asInstanceOf[js.Any], drawerType = drawerType.asInstanceOf[js.Any], drawerWidth = drawerWidth.asInstanceOf[js.Any], edgeWidth = edgeWidth.asInstanceOf[js.Any], enableTrackpadTwoFingerGesture = enableTrackpadTwoFingerGesture.asInstanceOf[js.Any], minSwipeDistance = minSwipeDistance.asInstanceOf[js.Any], overlayColor = overlayColor.asInstanceOf[js.Any], useNativeAnimations = useNativeAnimations.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerLockMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DrawerLockMode] (val x: Self) extends AnyVal {
    
    inline def setDrawerLockMode(value: String): Self = StObject.set(x, "drawerLockMode", value.asInstanceOf[js.Any])
    
    inline def setDrawerPosition(value: String): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
    
    inline def setDrawerType(value: String): Self = StObject.set(x, "drawerType", value.asInstanceOf[js.Any])
    
    inline def setDrawerWidth(value: Double): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
    
    inline def setEdgeWidth(value: Double): Self = StObject.set(x, "edgeWidth", value.asInstanceOf[js.Any])
    
    inline def setEnableTrackpadTwoFingerGesture(value: Boolean): Self = StObject.set(x, "enableTrackpadTwoFingerGesture", value.asInstanceOf[js.Any])
    
    inline def setMinSwipeDistance(value: Double): Self = StObject.set(x, "minSwipeDistance", value.asInstanceOf[js.Any])
    
    inline def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
    
    inline def setUseNativeAnimations(value: Boolean): Self = StObject.set(x, "useNativeAnimations", value.asInstanceOf[js.Any])
  }
}
