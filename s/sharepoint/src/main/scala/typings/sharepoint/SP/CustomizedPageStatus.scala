package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CustomizedPageStatus extends StObject
@JSGlobal("SP.CustomizedPageStatus")
@js.native
object CustomizedPageStatus extends StObject {
  
  @js.native
  sealed trait customized
    extends StObject
       with CustomizedPageStatus
  
  @js.native
  sealed trait none
    extends StObject
       with CustomizedPageStatus
  
  @js.native
  sealed trait uncustomized
    extends StObject
       with CustomizedPageStatus
}
