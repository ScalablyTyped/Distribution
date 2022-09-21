package typings.salesforceCanvasJsSdk.Sfdc.canvas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationAuthType extends StObject
@JSGlobal("Sfdc.canvas.ApplicationAuthType")
@js.native
object ApplicationAuthType extends StObject {
  
  @js.native
  sealed trait OAUTH
    extends StObject
       with ApplicationAuthType
  
  @js.native
  sealed trait SIGNED_REQUEST
    extends StObject
       with ApplicationAuthType
}
