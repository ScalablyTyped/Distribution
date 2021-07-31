package typings.reactLeaflet

import typings.leaflet.mod.Layer
import typings.leaflet.mod.Path
import typings.leaflet.mod.Popup_
import typings.leaflet.mod.Tooltip_
import typings.reactLeaflet.mod.AddLayerHandler
import typings.reactLeaflet.mod.RemoveLayerHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddBaseLayer extends StObject {
    
    var addBaseLayer: AddLayerHandler
    
    var addOverlay: AddLayerHandler
    
    var removeLayer: RemoveLayerHandler
    
    var removeLayerControl: RemoveLayerHandler
  }
  object AddBaseLayer {
    
    @scala.inline
    def apply(
      addBaseLayer: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit,
      addOverlay: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit,
      removeLayer: /* layer */ Layer => Unit,
      removeLayerControl: /* layer */ Layer => Unit
    ): AddBaseLayer = {
      val __obj = js.Dynamic.literal(addBaseLayer = js.Any.fromFunction3(addBaseLayer), addOverlay = js.Any.fromFunction3(addOverlay), removeLayer = js.Any.fromFunction1(removeLayer), removeLayerControl = js.Any.fromFunction1(removeLayerControl))
      __obj.asInstanceOf[AddBaseLayer]
    }
    
    @scala.inline
    implicit class AddBaseLayerMutableBuilder[Self <: AddBaseLayer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddBaseLayer(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "addBaseLayer", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAddOverlay(value: (/* layer */ Layer, /* name */ String, /* checked */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "addOverlay", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRemoveLayer(value: /* layer */ Layer => Unit): Self = StObject.set(x, "removeLayer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveLayerControl(value: /* layer */ Layer => Unit): Self = StObject.set(x, "removeLayerControl", js.Any.fromFunction1(value))
    }
  }
  
  trait ClassName extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[String] = js.undefined
  }
  object ClassName {
    
    @scala.inline
    def apply(): ClassName = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClassName]
    }
    
    @scala.inline
    implicit class ClassNameMutableBuilder[Self <: ClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait Popup[E /* <: Popup_ */] extends StObject {
    
    var popup: E
  }
  object Popup {
    
    @scala.inline
    def apply[E /* <: Popup_ */](popup: E): Popup[E] = {
      val __obj = js.Dynamic.literal(popup = popup.asInstanceOf[js.Any])
      __obj.asInstanceOf[Popup[E]]
    }
    
    @scala.inline
    implicit class PopupMutableBuilder[Self <: Popup[?], E /* <: Popup_ */] (val x: Self & Popup[E]) extends AnyVal {
      
      @scala.inline
      def setPopup(value: E): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopupContainer[E /* <: Path */] extends StObject {
    
    var popupContainer: E
  }
  object PopupContainer {
    
    @scala.inline
    def apply[E /* <: Path */](popupContainer: E): PopupContainer[E] = {
      val __obj = js.Dynamic.literal(popupContainer = popupContainer.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupContainer[E]]
    }
    
    @scala.inline
    implicit class PopupContainerMutableBuilder[Self <: PopupContainer[?], E /* <: Path */] (val x: Self & PopupContainer[E]) extends AnyVal {
      
      @scala.inline
      def setPopupContainer(value: E): Self = StObject.set(x, "popupContainer", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tooltip[E /* <: Tooltip_ */] extends StObject {
    
    var tooltip: E
  }
  object Tooltip {
    
    @scala.inline
    def apply[E /* <: Tooltip_ */](tooltip: E): Tooltip[E] = {
      val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tooltip[E]]
    }
    
    @scala.inline
    implicit class TooltipMutableBuilder[Self <: Tooltip[?], E /* <: Tooltip_ */] (val x: Self & Tooltip[E]) extends AnyVal {
      
      @scala.inline
      def setTooltip(value: E): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
}
