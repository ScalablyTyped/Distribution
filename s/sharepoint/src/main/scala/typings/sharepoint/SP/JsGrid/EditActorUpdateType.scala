package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditActorUpdateType extends StObject
@JSGlobal("SP.JsGrid.EditActorUpdateType")
@js.native
object EditActorUpdateType extends StObject {
  
  @js.native
  sealed trait Committed extends EditActorUpdateType
  
  // 0,
  @js.native
  sealed trait Uncommitted extends EditActorUpdateType
}
