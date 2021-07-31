package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CheckOutType extends StObject
@JSGlobal("SP.CheckOutType")
@js.native
object CheckOutType extends StObject {
  
  @js.native
  sealed trait none
    extends StObject
       with CheckOutType
  
  @js.native
  sealed trait offline
    extends StObject
       with CheckOutType
  
  @js.native
  sealed trait online
    extends StObject
       with CheckOutType
}
