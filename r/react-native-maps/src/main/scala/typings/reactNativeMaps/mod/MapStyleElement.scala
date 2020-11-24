package typings.reactNativeMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapStyleElement extends js.Object {
  
  var elementType: js.UndefOr[String] = js.native
  
  var featureType: js.UndefOr[String] = js.native
  
  var stylers: js.Array[js.Object] = js.native
}
object MapStyleElement {
  
  @scala.inline
  def apply(stylers: js.Array[js.Object]): MapStyleElement = {
    val __obj = js.Dynamic.literal(stylers = stylers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapStyleElement]
  }
  
  @scala.inline
  implicit class MapStyleElementOps[Self <: MapStyleElement] (val x: Self) extends AnyVal {
    
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
    def setStylersVarargs(value: js.Object*): Self = this.set("stylers", js.Array(value :_*))
    
    @scala.inline
    def setStylers(value: js.Array[js.Object]): Self = this.set("stylers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementType(value: String): Self = this.set("elementType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementType: Self = this.set("elementType", js.undefined)
    
    @scala.inline
    def setFeatureType(value: String): Self = this.set("featureType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureType: Self = this.set("featureType", js.undefined)
  }
}
