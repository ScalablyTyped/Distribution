package typings.sharepoint.SP.Taxonomy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeItemType extends StObject
@JSGlobal("SP.Taxonomy.ChangeItemType")
@js.native
object ChangeItemType extends StObject {
  
  @js.native
  sealed trait group
    extends StObject
       with ChangeItemType
  
  @js.native
  sealed trait site
    extends StObject
       with ChangeItemType
  
  @js.native
  sealed trait term
    extends StObject
       with ChangeItemType
  
  @js.native
  sealed trait termSet
    extends StObject
       with ChangeItemType
  
  @js.native
  sealed trait termStore
    extends StObject
       with ChangeItemType
  
  @js.native
  sealed trait unknown
    extends StObject
       with ChangeItemType
}
