package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetArtistAlbumsOptions extends PaginationCountryOptions {
  
  var include_groups: js.UndefOr[String] = js.native
}
object GetArtistAlbumsOptions {
  
  @scala.inline
  def apply(): GetArtistAlbumsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetArtistAlbumsOptions]
  }
  
  @scala.inline
  implicit class GetArtistAlbumsOptionsMutableBuilder[Self <: GetArtistAlbumsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInclude_groups(value: String): Self = StObject.set(x, "include_groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_groupsUndefined: Self = StObject.set(x, "include_groups", js.undefined)
  }
}
