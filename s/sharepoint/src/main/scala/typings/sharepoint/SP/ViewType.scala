package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewType extends StObject
@JSGlobal("SP.ViewType")
@js.native
object ViewType extends StObject {
  
  @js.native
  sealed trait calendar
    extends StObject
       with ViewType
  
  @js.native
  sealed trait chart
    extends StObject
       with ViewType
  
  @js.native
  sealed trait gantt
    extends StObject
       with ViewType
  
  @js.native
  sealed trait grid
    extends StObject
       with ViewType
  
  @js.native
  sealed trait html
    extends StObject
       with ViewType
  
  @js.native
  sealed trait none
    extends StObject
       with ViewType
  
  @js.native
  sealed trait recurrence
    extends StObject
       with ViewType
}
