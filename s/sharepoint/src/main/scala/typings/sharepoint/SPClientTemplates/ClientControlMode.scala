package typings.sharepoint.SPClientTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ClientControlMode extends StObject
@JSGlobal("SPClientTemplates.ClientControlMode")
@js.native
object ClientControlMode extends StObject {
  
  @js.native
  sealed trait DisplayForm
    extends StObject
       with ClientControlMode
  
  @js.native
  sealed trait EditForm
    extends StObject
       with ClientControlMode
  
  @js.native
  sealed trait Invalid
    extends StObject
       with ClientControlMode
  
  @js.native
  sealed trait NewForm
    extends StObject
       with ClientControlMode
  
  @js.native
  sealed trait View
    extends StObject
       with ClientControlMode
}
