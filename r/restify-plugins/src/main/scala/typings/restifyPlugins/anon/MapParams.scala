package typings.restifyPlugins.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapParams extends js.Object {
  
  var mapParams: js.UndefOr[Boolean] = js.native
  
  var overrideParams: js.UndefOr[Boolean] = js.native
  
  var reviver: js.UndefOr[js.Any] = js.native
}
object MapParams {
  
  @scala.inline
  def apply(): MapParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MapParams]
  }
  
  @scala.inline
  implicit class MapParamsOps[Self <: MapParams] (val x: Self) extends AnyVal {
    
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
    def setMapParams(value: Boolean): Self = this.set("mapParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapParams: Self = this.set("mapParams", js.undefined)
    
    @scala.inline
    def setOverrideParams(value: Boolean): Self = this.set("overrideParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideParams: Self = this.set("overrideParams", js.undefined)
    
    @scala.inline
    def setReviver(value: js.Any): Self = this.set("reviver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReviver: Self = this.set("reviver", js.undefined)
  }
}
