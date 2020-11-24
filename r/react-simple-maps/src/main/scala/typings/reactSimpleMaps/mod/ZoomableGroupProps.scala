package typings.reactSimpleMaps.mod

import typings.react.mod.SVGAttributes
import typings.std.SVGGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZoomableGroupProps extends SVGAttributes[SVGGElement] {
  
  /**
    * @default [0, 0]
    */
  var center: js.UndefOr[Point] = js.native
  
  /**
    * @default false
    */
  var disablePanning: js.UndefOr[Boolean] = js.native
  
  /**
    * @default false
    */
  var disableZooming: js.UndefOr[Boolean] = js.native
  
  /**
    * @default 5
    */
  var maxZoom: js.UndefOr[Double] = js.native
  
  /**
    * @default 1
    */
  var minZoom: js.UndefOr[Double] = js.native
  
  var onMoveEnd: js.UndefOr[js.Function2[/* event */ js.Any, /* position */ Position, Unit]] = js.native
  
  var onMoveStart: js.UndefOr[js.Function2[/* event */ js.Any, /* position */ Position, Unit]] = js.native
  
  var onZoomEnd: js.UndefOr[js.Function2[/* event */ js.Any, /* position */ Position, Unit]] = js.native
  
  var onZoomStart: js.UndefOr[js.Function2[/* event */ js.Any, /* position */ Position, Unit]] = js.native
  
  var translateExtent: js.UndefOr[js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]] = js.native
  
  /**
    * @default 1
    */
  var zoom: js.UndefOr[Double] = js.native
  
  /**
    * @default 0.025
    */
  var zoomSensitivity: js.UndefOr[Double] = js.native
}
object ZoomableGroupProps {
  
  @scala.inline
  def apply(): ZoomableGroupProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoomableGroupProps]
  }
  
  @scala.inline
  implicit class ZoomableGroupPropsOps[Self <: ZoomableGroupProps] (val x: Self) extends AnyVal {
    
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
    def setCenter(value: Point): Self = this.set("center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    
    @scala.inline
    def setDisablePanning(value: Boolean): Self = this.set("disablePanning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisablePanning: Self = this.set("disablePanning", js.undefined)
    
    @scala.inline
    def setDisableZooming(value: Boolean): Self = this.set("disableZooming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableZooming: Self = this.set("disableZooming", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinZoom(value: Double): Self = this.set("minZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinZoom: Self = this.set("minZoom", js.undefined)
    
    @scala.inline
    def setOnMoveEnd(value: (/* event */ js.Any, /* position */ Position) => Unit): Self = this.set("onMoveEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMoveEnd: Self = this.set("onMoveEnd", js.undefined)
    
    @scala.inline
    def setOnMoveStart(value: (/* event */ js.Any, /* position */ Position) => Unit): Self = this.set("onMoveStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnMoveStart: Self = this.set("onMoveStart", js.undefined)
    
    @scala.inline
    def setOnZoomEnd(value: (/* event */ js.Any, /* position */ Position) => Unit): Self = this.set("onZoomEnd", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnZoomEnd: Self = this.set("onZoomEnd", js.undefined)
    
    @scala.inline
    def setOnZoomStart(value: (/* event */ js.Any, /* position */ Position) => Unit): Self = this.set("onZoomStart", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnZoomStart: Self = this.set("onZoomStart", js.undefined)
    
    @scala.inline
    def setTranslateExtent(value: js.Tuple2[js.Tuple2[Double, Double], js.Tuple2[Double, Double]]): Self = this.set("translateExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTranslateExtent: Self = this.set("translateExtent", js.undefined)
    
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
    
    @scala.inline
    def setZoomSensitivity(value: Double): Self = this.set("zoomSensitivity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomSensitivity: Self = this.set("zoomSensitivity", js.undefined)
  }
}
