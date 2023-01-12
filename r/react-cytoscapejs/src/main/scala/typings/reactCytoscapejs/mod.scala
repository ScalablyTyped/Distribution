package typings.reactCytoscapejs

import typings.cytoscape.mod.Core
import typings.cytoscape.mod.ElementDefinition
import typings.cytoscape.mod.LayoutOptions
import typings.cytoscape.mod.Position
import typings.cytoscape.mod.Stylesheet
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.reactCytoscapejs.anon.Edges
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-cytoscapejs", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CytoscapeComponentProps, js.Object, Any]
  object default {
    
    @JSImport("react-cytoscapejs", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def normalizeElements(data: js.Array[ElementDefinition]): js.Array[ElementDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeElements")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[ElementDefinition]]
    /* static member */
    inline def normalizeElements(data: Edges): js.Array[ElementDefinition] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeElements")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[ElementDefinition]]
  }
  
  type CytoscapeComponent = Component[CytoscapeComponentProps, js.Object, Any]
  
  trait CytoscapeComponentProps extends StObject {
    
    var autolock: js.UndefOr[Boolean] = js.undefined
    
    var autoungrabify: js.UndefOr[Boolean] = js.undefined
    
    var autounselectify: js.UndefOr[Boolean] = js.undefined
    
    var boxSelectionEnabled: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var cy: js.UndefOr[js.Function1[/* cy */ Core, Unit]] = js.undefined
    
    var diff: js.UndefOr[
        js.Function2[/* objA */ Record[String, Any], /* objB */ Record[String, Any], Boolean]
      ] = js.undefined
    
    var elements: js.Array[ElementDefinition]
    
    var forEach: js.UndefOr[
        js.Function2[
          /* list */ js.Array[Any], 
          /* iterator */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit], 
          Unit
        ]
      ] = js.undefined
    
    var get: js.UndefOr[js.Function2[/* obj */ Record[String, Any], /* key */ String, Any]] = js.undefined
    
    var headless: js.UndefOr[Boolean] = js.undefined
    
    var hideEdgesOnViewport: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var layout: js.UndefOr[LayoutOptions] = js.undefined
    
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    var minZoom: js.UndefOr[Double] = js.undefined
    
    var motionBlur: js.UndefOr[Boolean] = js.undefined
    
    var motionBlurOpacity: js.UndefOr[Double] = js.undefined
    
    var pan: js.UndefOr[Position] = js.undefined
    
    var panningEnabled: js.UndefOr[Boolean] = js.undefined
    
    var pixelRatio: js.UndefOr[Double | String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var styleEnabled: js.UndefOr[Boolean] = js.undefined
    
    var stylesheet: js.UndefOr[Stylesheet | js.Array[Stylesheet] | String] = js.undefined
    
    var textureOnViewport: js.UndefOr[Boolean] = js.undefined
    
    var toJson: js.UndefOr[js.Function1[/* obj */ Record[String, Any], Any]] = js.undefined
    
    var userPanningEnabled: js.UndefOr[Boolean] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CytoscapeComponentProps] (val x: Self) extends AnyVal {
      
      inline def setAutolock(value: Boolean): Self = StObject.set(x, "autolock", value.asInstanceOf[js.Any])
      
      inline def setAutolockUndefined: Self = StObject.set(x, "autolock", js.undefined)
      
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
      
      inline def setDiff(value: (/* objA */ Record[String, Any], /* objB */ Record[String, Any]) => Boolean): Self = StObject.set(x, "diff", js.Any.fromFunction2(value))
      
      inline def setDiffUndefined: Self = StObject.set(x, "diff", js.undefined)
      
      inline def setElements(value: js.Array[ElementDefinition]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: ElementDefinition*): Self = StObject.set(x, "elements", js.Array(value*))
      
      inline def setForEach(
        value: (/* list */ js.Array[Any], /* iterator */ js.Function3[/* value */ Any, /* index */ Double, /* array */ js.Array[Any], Unit]) => Unit
      ): Self = StObject.set(x, "forEach", js.Any.fromFunction2(value))
      
      inline def setForEachUndefined: Self = StObject.set(x, "forEach", js.undefined)
      
      inline def setGet(value: (/* obj */ Record[String, Any], /* key */ String) => Any): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
      
      inline def setHeadless(value: Boolean): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      inline def setHideEdgesOnViewport(value: Boolean): Self = StObject.set(x, "hideEdgesOnViewport", value.asInstanceOf[js.Any])
      
      inline def setHideEdgesOnViewportUndefined: Self = StObject.set(x, "hideEdgesOnViewport", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLayout(value: LayoutOptions): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinZoom(value: Double): Self = StObject.set(x, "minZoom", value.asInstanceOf[js.Any])
      
      inline def setMinZoomUndefined: Self = StObject.set(x, "minZoom", js.undefined)
      
      inline def setMotionBlur(value: Boolean): Self = StObject.set(x, "motionBlur", value.asInstanceOf[js.Any])
      
      inline def setMotionBlurOpacity(value: Double): Self = StObject.set(x, "motionBlurOpacity", value.asInstanceOf[js.Any])
      
      inline def setMotionBlurOpacityUndefined: Self = StObject.set(x, "motionBlurOpacity", js.undefined)
      
      inline def setMotionBlurUndefined: Self = StObject.set(x, "motionBlur", js.undefined)
      
      inline def setPan(value: Position): Self = StObject.set(x, "pan", value.asInstanceOf[js.Any])
      
      inline def setPanUndefined: Self = StObject.set(x, "pan", js.undefined)
      
      inline def setPanningEnabled(value: Boolean): Self = StObject.set(x, "panningEnabled", value.asInstanceOf[js.Any])
      
      inline def setPanningEnabledUndefined: Self = StObject.set(x, "panningEnabled", js.undefined)
      
      inline def setPixelRatio(value: Double | String): Self = StObject.set(x, "pixelRatio", value.asInstanceOf[js.Any])
      
      inline def setPixelRatioUndefined: Self = StObject.set(x, "pixelRatio", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleEnabled(value: Boolean): Self = StObject.set(x, "styleEnabled", value.asInstanceOf[js.Any])
      
      inline def setStyleEnabledUndefined: Self = StObject.set(x, "styleEnabled", js.undefined)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStylesheet(value: Stylesheet | js.Array[Stylesheet] | String): Self = StObject.set(x, "stylesheet", value.asInstanceOf[js.Any])
      
      inline def setStylesheetUndefined: Self = StObject.set(x, "stylesheet", js.undefined)
      
      inline def setStylesheetVarargs(value: Stylesheet*): Self = StObject.set(x, "stylesheet", js.Array(value*))
      
      inline def setTextureOnViewport(value: Boolean): Self = StObject.set(x, "textureOnViewport", value.asInstanceOf[js.Any])
      
      inline def setTextureOnViewportUndefined: Self = StObject.set(x, "textureOnViewport", js.undefined)
      
      inline def setToJson(value: /* obj */ Record[String, Any] => Any): Self = StObject.set(x, "toJson", js.Any.fromFunction1(value))
      
      inline def setToJsonUndefined: Self = StObject.set(x, "toJson", js.undefined)
      
      inline def setUserPanningEnabled(value: Boolean): Self = StObject.set(x, "userPanningEnabled", value.asInstanceOf[js.Any])
      
      inline def setUserPanningEnabledUndefined: Self = StObject.set(x, "userPanningEnabled", js.undefined)
      
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
