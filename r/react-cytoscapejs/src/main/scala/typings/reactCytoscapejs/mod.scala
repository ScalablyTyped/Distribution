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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-cytoscapejs", JSImport.Default)
  @js.native
  class default ()
    extends Component[CytoscapeComponentProps, js.Object, js.Any]
  object default {
    
    @JSImport("react-cytoscapejs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def normalizeElements(data: js.Array[ElementDefinition]): js.Array[ElementDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeElements")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[ElementDefinition]]
    /* static member */
    inline def normalizeElements(data: Edges): js.Array[ElementDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeElements")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[ElementDefinition]]
  }
  
  type CytoscapeComponent = Component[CytoscapeComponentProps, js.Object, js.Any]
  
  trait CytoscapeComponentProps extends StObject {
    
    var autoungrabify: js.UndefOr[Boolean] = js.undefined
    
    var autounselectify: js.UndefOr[Boolean] = js.undefined
    
    var boxSelectionEnabled: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var cy: js.UndefOr[js.Function1[/* cy */ Core, Unit]] = js.undefined
    
    var elements: js.Array[ElementDefinition]
    
    var id: js.UndefOr[String] = js.undefined
    
    var layout: js.UndefOr[LayoutOptions] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var minZoom: js.UndefOr[Double] = js.undefined
    
    var pan: js.UndefOr[Position] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var stylesheet: js.UndefOr[Stylesheet | js.Array[Stylesheet] | String] = js.undefined
    
    var userZoomingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var wheelSensitivity: js.UndefOr[Double] = js.undefined
    
    var zoom: js.UndefOr[Double] = js.undefined
    
    var zoomingEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object CytoscapeComponentProps {
    
    inline def apply(elements: js.Array[ElementDefinition]): CytoscapeComponentProps = {
      val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
      __obj.asInstanceOf[CytoscapeComponentProps]
    }
    
    extension [Self <: CytoscapeComponentProps](x: Self) {
      
      inline def setAutoungrabify(value: Boolean): Self = StObject.set(x, "autoungrabify", value.asInstanceOf[js.Any])
      
      inline def setAutoungrabifyUndefined: Self = StObject.set(x, "autoungrabify", js.undefined)
      
      inline def setAutounselectify(value: Boolean): Self = StObject.set(x, "autounselectify", value.asInstanceOf[js.Any])
      
      inline def setAutounselectifyUndefined: Self = StObject.set(x, "autounselectify", js.undefined)
      
      inline def setBoxSelectionEnabled(value: Boolean): Self = StObject.set(x, "boxSelectionEnabled", value.asInstanceOf[js.Any])
      
      inline def setBoxSelectionEnabledUndefined: Self = StObject.set(x, "boxSelectionEnabled", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCy(value: /* cy */ Core => Unit): Self = StObject.set(x, "cy", js.Any.fromFunction1(value))
      
      inline def setCyUndefined: Self = StObject.set(x, "cy", js.undefined)
      
      inline def setElements(value: js.Array[ElementDefinition]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: ElementDefinition*): Self = StObject.set(x, "elements", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLayout(value: LayoutOptions): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setPan(value: Position): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStylesheet(value: Stylesheet | js.Array[Stylesheet] | String): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
      
      inline def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
      
      inline def setStylesheetVarargs(value: Stylesheet*): Self = StObject.set(x, "stylesheet", js.Array(value :_*))
      
      inline def setUserZoomingEnabled(value: Boolean): Self = StObject.set(x, "userZoomingEnabled", value.asInstanceOf[js.Any])
      
      inline def setUserZoomingEnabledUndefined: Self = StObject.set(x, "userZoomingEnabled", js.undefined)
      
      inline def setWheelSensitivity(value: Double): Self = StObject.set(x, "wheelSensitivity", value.asInstanceOf[js.Any])
      
      inline def setWheelSensitivityUndefined: Self = StObject.set(x, "wheelSensitivity", js.undefined)
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
      
      inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
      
      inline def setZoomingEnabled(value: Boolean): Self = StObject.set(x, "zoomingEnabled", value.asInstanceOf[js.Any])
      
      inline def setZoomingEnabledUndefined: Self = StObject.set(x, "zoomingEnabled", js.undefined)
    }
  }
}
