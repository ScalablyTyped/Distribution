package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetArtistAlbumsOptions
  extends StObject
     with PaginationCountryOptions {
  
  var include_groups: js.UndefOr[String] = js.undefined
}
object GetArtistAlbumsOptions {
  
  inline def apply(): GetArtistAlbumsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetArtistAlbumsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetArtistAlbumsOptions] (val x: Self) extends AnyVal {
    
    inline def setInclude_groups(value: String): Self = StObject.set(x, "include_groups", value.asInstanceOf[js.Any])
    
    inline def setInclude_groupsUndefined: Self = StObject.set(x, "include_groups", js.undefined)
  }
}
