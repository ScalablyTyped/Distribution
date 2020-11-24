package typings.reactFns.geoPositionGeoPositionMod

import typings.reactFns.anon.Latitude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoPositionProps extends js.Object {
  
  var coords: js.UndefOr[Latitude] = js.native
  
  var error: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositionError */ js.Any
  ] = js.native
  
  var isLoading: Boolean = js.native
}
object GeoPositionProps {
  
  @scala.inline
  def apply(isLoading: Boolean): GeoPositionProps = {
    val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoPositionProps]
  }
  
  @scala.inline
  implicit class GeoPositionPropsOps[Self <: GeoPositionProps] (val x: Self) extends AnyVal {
    
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
    def setIsLoading(value: Boolean): Self = this.set("isLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoords(value: Latitude): Self = this.set("coords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoords: Self = this.set("coords", js.undefined)
    
    @scala.inline
    def setError(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PositionError */ js.Any
    ): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
