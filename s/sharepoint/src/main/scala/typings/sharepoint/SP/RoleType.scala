package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RoleType extends StObject
@JSGlobal("SP.RoleType")
@js.native
object RoleType extends StObject {
  
  @js.native
  sealed trait administrator
    extends StObject
       with RoleType
  
  @js.native
  sealed trait contributor
    extends StObject
       with RoleType
  
  @js.native
  sealed trait editor
    extends StObject
       with RoleType
  
  @js.native
  sealed trait guest
    extends StObject
       with RoleType
  
  @js.native
  sealed trait none
    extends StObject
       with RoleType
  
  @js.native
  sealed trait reader
    extends StObject
       with RoleType
  
  @js.native
  sealed trait webDesigner
    extends StObject
       with RoleType
}
