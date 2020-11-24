package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoSearchExposed extends js.Object {
  
  var defaultRefinement: js.UndefOr[NESW] = js.native
}
object GeoSearchExposed {
  
  @scala.inline
  def apply(): GeoSearchExposed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoSearchExposed]
  }
  
  @scala.inline
  implicit class GeoSearchExposedOps[Self <: GeoSearchExposed] (val x: Self) extends AnyVal {
    
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
    def setDefaultRefinement(value: NESW): Self = this.set("defaultRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRefinement: Self = this.set("defaultRefinement", js.undefined)
  }
}
