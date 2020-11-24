package typings.reactCytoscapejs.mod

import typings.cytoscape.mod.Core
import typings.cytoscape.mod.ElementDefinition
import typings.cytoscape.mod.LayoutOptions
import typings.cytoscape.mod.Position
import typings.cytoscape.mod.Stylesheet
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CytoscapeComponentProps extends js.Object {
  
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
  implicit class CytoscapeComponentPropsOps[Self <: CytoscapeComponentProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setElementsVarargs(value: ElementDefinition*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[ElementDefinition]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoungrabify(value: Boolean): Self = this.set("autoungrabify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoungrabify: Self = this.set("autoungrabify", js.undefined)
    
    @scala.inline
    def setAutounselectify(value: Boolean): Self = this.set("autounselectify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutounselectify: Self = this.set("autounselectify", js.undefined)
    
    @scala.inline
    def setBoxSelectionEnabled(value: Boolean): Self = this.set("boxSelectionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoxSelectionEnabled: Self = this.set("boxSelectionEnabled", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setCy(value: /* cy */ Core => Unit): Self = this.set("cy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCy: Self = this.set("cy", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLayout(value: LayoutOptions): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setPan(value: Position): Self = this.set("pan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePan: Self = this.set("pan", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setStylesheetVarargs(value: Stylesheet*): Self = this.set("stylesheet", js.Array(value :_*))
    
    @scala.inline
    def setStylesheet(value: Stylesheet | js.Array[Stylesheet] | String): Self = this.set("stylesheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStylesheet: Self = this.set("stylesheet", js.undefined)
    
    @scala.inline
    def setUserZoomingEnabled(value: Boolean): Self = this.set("userZoomingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserZoomingEnabled: Self = this.set("userZoomingEnabled", js.undefined)
    
    @scala.inline
    def setWheelSensitivity(value: Double): Self = this.set("wheelSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheelSensitivity: Self = this.set("wheelSensitivity", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    
    @scala.inline
    def setZoomingEnabled(value: Boolean): Self = this.set("zoomingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomingEnabled: Self = this.set("zoomingEnabled", js.undefined)
  }
}
