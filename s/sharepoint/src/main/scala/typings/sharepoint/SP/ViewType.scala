package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewType extends StObject
@JSGlobal("SP.ViewType")
@js.native
object ViewType extends StObject {
  
  @js.native
  sealed trait calendar extends ViewType
  
  @js.native
  sealed trait chart extends ViewType
  
  @js.native
  sealed trait gantt extends ViewType
  
  @js.native
  sealed trait grid extends ViewType
  
  @js.native
  sealed trait html extends ViewType
  
  @js.native
  sealed trait none extends ViewType
  
  @js.native
  sealed trait recurrence extends ViewType
}
