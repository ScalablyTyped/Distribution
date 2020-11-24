package typings.reactNativeMaps.mod

import typings.reactNative.mod.ImageRequireSource
import typings.reactNative.mod.ImageURISource
import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapOverlayProps extends ViewProps {
  
  var bounds: js.Tuple2[Coordinate, Coordinate] = js.native
  
  var image: js.UndefOr[ImageURISource | ImageRequireSource] = js.native
}
object MapOverlayProps {
  
  @scala.inline
  def apply(bounds: js.Tuple2[Coordinate, Coordinate]): MapOverlayProps = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOverlayProps]
  }
  
  @scala.inline
  implicit class MapOverlayPropsOps[Self <: MapOverlayProps] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: js.Tuple2[Coordinate, Coordinate]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: ImageURISource | ImageRequireSource): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
  }
}
