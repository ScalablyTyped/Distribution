package typings.reactJoyride

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Arialabel extends StObject {
    
    var `aria-label`: String
    
    var `data-action`: String
    
    def onClick(): Unit
    
    var role: String
    
    var title: String
  }
  object Arialabel {
    
    @scala.inline
    def apply(`aria-label`: String, `data-action`: String, onClick: () => Unit, role: String, title: String): Arialabel = {
      val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction0(onClick), role = role.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
      __obj.updateDynamic("data-action")(`data-action`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arialabel]
    }
    
    @scala.inline
    implicit class ArialabelMutableBuilder[Self <: Arialabel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-action`(value: String): Self = StObject.set(x, "data-action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ariamodal extends StObject {
    
    var `aria-modal`: Boolean
    
    def ref(): Unit
    
    var role: String
  }
  object Ariamodal {
    
    @scala.inline
    def apply(`aria-modal`: Boolean, ref: () => Unit, role: String): Ariamodal = {
      val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), role = role.asInstanceOf[js.Any])
      __obj.updateDynamic("aria-modal")(`aria-modal`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ariamodal]
    }
    
    @scala.inline
    implicit class AriamodalMutableBuilder[Self <: Ariamodal] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRef(value: () => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    }
  }
  
  trait ArrowColor extends StObject {
    
    var arrowColor: js.UndefOr[String] = js.undefined
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    var beaconSize: js.UndefOr[Double] = js.undefined
    
    var overlayColor: js.UndefOr[String] = js.undefined
    
    var primaryColor: js.UndefOr[String] = js.undefined
    
    var spotlightShadow: js.UndefOr[String] = js.undefined
    
    var textColor: js.UndefOr[String] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object ArrowColor {
    
    @scala.inline
    def apply(): ArrowColor = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowColor]
    }
    
    @scala.inline
    implicit class ArrowColorMutableBuilder[Self <: ArrowColor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowColor(value: String): Self = StObject.set(x, "arrowColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowColorUndefined: Self = StObject.set(x, "arrowColor", js.undefined)
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setBeaconSize(value: Double): Self = StObject.set(x, "beaconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeaconSizeUndefined: Self = StObject.set(x, "beaconSize", js.undefined)
      
      @scala.inline
      def setOverlayColor(value: String): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
      
      @scala.inline
      def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      @scala.inline
      def setSpotlightShadow(value: String): Self = StObject.set(x, "spotlightShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpotlightShadowUndefined: Self = StObject.set(x, "spotlightShadow", js.undefined)
      
      @scala.inline
      def setTextColor(value: String): Self = StObject.set(x, "textColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextColorUndefined: Self = StObject.set(x, "textColor", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
