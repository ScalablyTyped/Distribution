package typings.reactCytoscapejs

import typings.cytoscape.mod.Core
import typings.cytoscape.mod.ElementDefinition
import typings.cytoscape.mod.LayoutOptions
import typings.cytoscape.mod.Position
import typings.cytoscape.mod.Stylesheet
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactCytoscapejs.anon.Edges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-cytoscapejs", JSImport.Default)
  @js.native
  class default ()
    extends Component[CytoscapeComponentProps, js.Object, js.Any]
  object default {
    
    @JSImport("react-cytoscapejs", "default.normalizeElements")
    @js.native
    def normalizeElements(data: js.Array[ElementDefinition]): js.Array[ElementDefinition] = js.native
    /* static member */
    @JSImport("react-cytoscapejs", "default.normalizeElements")
    @js.native
    def normalizeElements(data: Edges): js.Array[ElementDefinition] = js.native
  }
  
  type CytoscapeComponent = Component[CytoscapeComponentProps, js.Object, js.Any]
  
  @js.native
  trait CytoscapeComponentProps extends StObject {
    
    var autoungrabify: js.UndefOr[Boolean] = js.native
    
    var autounselectify: js.UndefOr[Boolean] = js.native
    
    var boxSelectionEnabled: js.UndefOr[Boolean] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var cy: js.UndefOr[js.Function1[/* cy */ Core, Unit]] = js.native
    
    var elements: js.Array[ElementDefinition] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var layout: js.UndefOr[LayoutOptions] = js.native
    
    var maxZoom: js.UndefOr[Double] = js.native
    
    var minZoom: js.UndefOr[Double] = js.native
    
    var pan: js.UndefOr[Position] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var stylesheet: js.UndefOr[Stylesheet | js.Array[Stylesheet] | String] = js.native
    
    var userZoomingEnabled: js.UndefOr[Boolean] = js.native
    
    var wheelSensitivity: js.UndefOr[Double] = js.native
    
    var zoom: js.UndefOr[Double] = js.native
    
    var zoomingEnabled: js.UndefOr[Boolean] = js.native
  }
  object CytoscapeComponentProps {
    
    @scala.inline
    def apply(elements: js.Array[ElementDefinition]): CytoscapeComponentProps = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[CytoscapeComponentProps]
    }
    
    @scala.inline
    implicit class CytoscapeComponentPropsMutableBuilder[Self <: CytoscapeComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoungrabify(value: Boolean): Self = StObject.set(x, "autoungrabify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoungrabifyUndefined: Self = StObject.set(x, "autoungrabify", js.undefined)
      
      @scala.inline
      def setAutounselectify(value: Boolean): Self = StObject.set(x, "autounselectify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutounselectifyUndefined: Self = StObject.set(x, "autounselectify", js.undefined)
      
      @scala.inline
      def setBoxSelectionEnabled(value: Boolean): Self = StObject.set(x, "boxSelectionEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxSelectionEnabledUndefined: Self = StObject.set(x, "boxSelectionEnabled", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCy(value: /* cy */ Core => Unit): Self = StObject.set(x, "cy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      @scala.inline
      def setElements(value: js.Array[ElementDefinition]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsVarargs(value: ElementDefinition*): Self = StObject.set(x, "elements", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLayout(value: LayoutOptions): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      @scala.inline
      def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      @scala.inline
      def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      @scala.inline
      def setPan(value: Position): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setStylesheet(value: Stylesheet | js.Array[Stylesheet] | String): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
      
      @scala.inline
      def setStylesheetVarargs(value: Stylesheet*): Self = StObject.set(x, "stylesheet", js.Array(value :_*))
      
      @scala.inline
      def setUserZoomingEnabled(value: Boolean): Self = StObject.set(x, "userZoomingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserZoomingEnabledUndefined: Self = StObject.set(x, "userZoomingEnabled", js.undefined)
      
      @scala.inline
      def setWheelSensitivity(value: Double): Self = StObject.set(x, "wheelSensitivity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWheelSensitivityUndefined: Self = StObject.set(x, "wheelSensitivity", js.undefined)
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
      
      @scala.inline
      def setZoomingEnabled(value: Boolean): Self = StObject.set(x, "zoomingEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomingEnabledUndefined: Self = StObject.set(x, "zoomingEnabled", js.undefined)
    }
  }
}
