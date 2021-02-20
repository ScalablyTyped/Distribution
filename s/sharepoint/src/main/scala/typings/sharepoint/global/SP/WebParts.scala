package typings.sharepoint.global.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebParts {
  
  @JSGlobal("SP.WebParts.LimitedWebPartManager")
  @js.native
  class LimitedWebPartManager ()
    extends typings.sharepoint.SP.WebParts.LimitedWebPartManager
  
  @JSGlobal("SP.WebParts.PersonalizationScope")
  @js.native
  object PersonalizationScope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.sharepoint.SP.WebParts.PersonalizationScope with Double] = js.native
    
    /* 1 */ val shared: typings.sharepoint.SP.WebParts.PersonalizationScope.shared with Double = js.native
    
    /* 0 */ val user: typings.sharepoint.SP.WebParts.PersonalizationScope.user with Double = js.native
  }
  
  @JSGlobal("SP.WebParts.TileData")
  @js.native
  class TileData ()
    extends typings.sharepoint.SP.WebParts.TileData
  
  @JSGlobal("SP.WebParts.WebPart")
  @js.native
  class WebPart ()
    extends typings.sharepoint.SP.WebParts.WebPart
  
  @JSGlobal("SP.WebParts.WebPartDefinition")
  @js.native
  class WebPartDefinition ()
    extends typings.sharepoint.SP.WebParts.WebPartDefinition
}
