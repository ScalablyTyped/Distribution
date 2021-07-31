package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeType extends StObject
@JSGlobal("SP.ChangeType")
@js.native
object ChangeType extends StObject {
  
  @js.native
  sealed trait add
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait assignmentAdd
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait assignmentDelete
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait deleteObject
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait listContentTypeAdd
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait listContentTypeDelete
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait memberAdd
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait memberDelete
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait moveAway
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait moveInto
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait navigation
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait noChange
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait rename
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait restore
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait roleAdd
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait roleDelete
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait roleUpdate
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait scopeAdd
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait scopeDelete
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait systemUpdate
    extends StObject
       with ChangeType
  
  @js.native
  sealed trait update
    extends StObject
       with ChangeType
}
