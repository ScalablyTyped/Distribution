package typings.spotifyWebApiNode.mod

import typings.spotifyWebApiNode.spotifyWebApiNodeStrings.audio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchOptions extends PaginationMarketOptions {
  
  var include_external: js.UndefOr[audio] = js.native
}
object SearchOptions {
  
  @scala.inline
  def apply(): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions]
  }
  
  @scala.inline
  implicit class SearchOptionsMutableBuilder[Self <: SearchOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInclude_external(value: audio): Self = StObject.set(x, "include_external", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_externalUndefined: Self = StObject.set(x, "include_external", js.undefined)
  }
}
