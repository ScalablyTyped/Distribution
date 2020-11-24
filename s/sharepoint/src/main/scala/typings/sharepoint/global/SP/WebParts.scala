package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.WebParts")
@js.native
object WebParts extends js.Object {
  
  @js.native
  class LimitedWebPartManager ()
    extends typings.sharepoint.SP.WebParts.LimitedWebPartManager
  
  @js.native
  object PersonalizationScope extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.WebParts.PersonalizationScope with Double] = js.native
    
    /* 1 */ val shared: typings.sharepoint.SP.WebParts.PersonalizationScope.shared with Double = js.native
    
    /* 0 */ val user: typings.sharepoint.SP.WebParts.PersonalizationScope.user with Double = js.native
  }
  
  @js.native
  class TileData ()
    extends typings.sharepoint.SP.WebParts.TileData
  
  @js.native
  class WebPart ()
    extends typings.sharepoint.SP.WebParts.WebPart
  
  @js.native
  class WebPartDefinition ()
    extends typings.sharepoint.SP.WebParts.WebPartDefinition
}
