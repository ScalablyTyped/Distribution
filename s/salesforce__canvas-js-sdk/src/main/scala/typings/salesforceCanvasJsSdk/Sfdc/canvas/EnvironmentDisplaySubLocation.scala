package typings.salesforceCanvasJsSdk.Sfdc.canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnvironmentDisplaySubLocation extends StObject
@JSGlobal("Sfdc.canvas.EnvironmentDisplaySubLocation")
@js.native
object EnvironmentDisplaySubLocation extends StObject {
  
  @js.native
  sealed trait MOBILE_CARD_FULLVIEW
    extends StObject
       with EnvironmentDisplaySubLocation
  
  @js.native
  sealed trait MOBILE_CARD_PREVIEW
    extends StObject
       with EnvironmentDisplaySubLocation
  
  @js.native
  sealed trait RECORD_HOME_FULLVIEW
    extends StObject
       with EnvironmentDisplaySubLocation
  
  @js.native
  sealed trait RECORD_HOME_PREVIEW
    extends StObject
       with EnvironmentDisplaySubLocation
}
