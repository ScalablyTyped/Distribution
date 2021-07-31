package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FieldUserSelectionMode extends StObject
@JSGlobal("SP.FieldUserSelectionMode")
@js.native
object FieldUserSelectionMode extends StObject {
  
  @js.native
  sealed trait peopleAndGroups
    extends StObject
       with FieldUserSelectionMode
  
  @js.native
  sealed trait peopleOnly
    extends StObject
       with FieldUserSelectionMode
}
