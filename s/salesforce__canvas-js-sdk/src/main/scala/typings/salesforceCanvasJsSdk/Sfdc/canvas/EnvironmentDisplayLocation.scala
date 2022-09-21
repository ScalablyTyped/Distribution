package typings.salesforceCanvasJsSdk.Sfdc.canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnvironmentDisplayLocation extends StObject
@JSGlobal("Sfdc.canvas.EnvironmentDisplayLocation")
@js.native
object EnvironmentDisplayLocation extends StObject {
  
  @js.native
  sealed trait CHATTER
    extends StObject
       with EnvironmentDisplayLocation
  
  @js.native
  sealed trait CHATTER_FEED
    extends StObject
       with EnvironmentDisplayLocation
  
  @js.native
  sealed trait MOBILE_NAV
    extends StObject
       with EnvironmentDisplayLocation
  
  @js.native
  sealed trait NONE
    extends StObject
       with EnvironmentDisplayLocation
  
  @js.native
  sealed trait OPEN_CTI
    extends StObject
       with EnvironmentDisplayLocation
  
  @js.native
  sealed trait PAGE_LAYOUT
    extends StObject
       with EnvironmentDisplayLocation
  
  @js.native
  sealed trait PUBLISHER
    extends StObject
       with EnvironmentDisplayLocation
  
  @js.native
  sealed trait SERVICE_DESK
    extends StObject
       with EnvironmentDisplayLocation
  
  @js.native
  sealed trait VISUAL_FORCE
    extends StObject
       with EnvironmentDisplayLocation
}
