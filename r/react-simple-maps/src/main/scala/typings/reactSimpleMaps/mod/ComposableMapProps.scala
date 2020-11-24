package typings.reactSimpleMaps.mod

import typings.d3Geo.mod.GeoProjection_
import typings.react.mod.SVGAttributes
import typings.std.SVGSVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComposableMapProps extends SVGAttributes[SVGSVGElement] {
  
  /**
    * @default 600
    */
  @JSName("height")
  var height_ComposableMapProps: js.UndefOr[Double] = js.native
  
  /**
    * @default "geoEqualEarth"
    */
  var projection: js.UndefOr[String | ProjectionFunction] = js.native
  
  /**
    * @default {}
    */
  var projectionConfig: js.UndefOr[ProjectionConfig] = js.native
  
  /**
    * @default 800
    */
  @JSName("width")
  var width_ComposableMapProps: js.UndefOr[Double] = js.native
}
object ComposableMapProps {
  
  @scala.inline
  def apply(): ComposableMapProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposableMapProps]
  }
  
  @scala.inline
  implicit class ComposableMapPropsOps[Self <: ComposableMapProps] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setProjectionFunction3(value: (/* width */ Double, /* height */ Double, /* config */ ProjectionConfig) => GeoProjection_): Self = this.set("projection", js.Any.fromFunction3(value))
    
    @scala.inline
    def setProjection(value: String | ProjectionFunction): Self = this.set("projection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjection: Self = this.set("projection", js.undefined)
    
    @scala.inline
    def setProjectionConfig(value: ProjectionConfig): Self = this.set("projectionConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectionConfig: Self = this.set("projectionConfig", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
