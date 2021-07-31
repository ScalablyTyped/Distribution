package typings.sharepoint.SP.JsGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EditActorReadType extends StObject
@JSGlobal("SP.JsGrid.EditActorReadType")
@js.native
object EditActorReadType extends StObject {
  
  @js.native
  sealed trait Both
    extends StObject
       with EditActorReadType
  
  // 2,
  @js.native
  sealed trait DataOnly
    extends StObject
       with EditActorReadType
  
  // 1,
  @js.native
  sealed trait LocalizedOnly
    extends StObject
       with EditActorReadType
}
