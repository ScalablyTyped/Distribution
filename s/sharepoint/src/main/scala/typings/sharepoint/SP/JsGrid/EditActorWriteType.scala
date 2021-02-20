package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditActorWriteType extends StObject
@JSGlobal("SP.JsGrid.EditActorWriteType")
@js.native
object EditActorWriteType extends StObject {
  
  @js.native
  sealed trait Both extends EditActorWriteType
  
  // 2,
  @js.native
  sealed trait DataOnly extends EditActorWriteType
  
  // 3,
  @js.native
  sealed trait Either extends EditActorWriteType
  
  // 1,
  @js.native
  sealed trait LocalizedOnly extends EditActorWriteType
}
