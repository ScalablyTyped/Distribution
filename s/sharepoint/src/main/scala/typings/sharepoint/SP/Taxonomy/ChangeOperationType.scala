package typings.sharepoint.SP.Taxonomy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeOperationType extends StObject
@JSGlobal("SP.Taxonomy.ChangeOperationType")
@js.native
object ChangeOperationType extends StObject {
  
  @js.native
  sealed trait add
    extends StObject
       with ChangeOperationType
  
  @js.native
  sealed trait copy
    extends StObject
       with ChangeOperationType
  
  @js.native
  sealed trait deleteObject
    extends StObject
       with ChangeOperationType
  
  @js.native
  sealed trait edit
    extends StObject
       with ChangeOperationType
  
  @js.native
  sealed trait importObject
    extends StObject
       with ChangeOperationType
  
  @js.native
  sealed trait merge
    extends StObject
       with ChangeOperationType
  
  @js.native
  sealed trait move
    extends StObject
       with ChangeOperationType
  
  @js.native
  sealed trait pathChange
    extends StObject
       with ChangeOperationType
  
  @js.native
  sealed trait restore
    extends StObject
       with ChangeOperationType
  
  @js.native
  sealed trait unknown
    extends StObject
       with ChangeOperationType
}
