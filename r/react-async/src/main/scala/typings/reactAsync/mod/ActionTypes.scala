package typings.reactAsync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ActionTypes extends StObject
@JSImport("react-async", "ActionTypes")
@js.native
object ActionTypes extends StObject {
  
  @js.native
  sealed trait cancel
    extends StObject
       with ActionTypes
  
  @js.native
  sealed trait fulfill
    extends StObject
       with ActionTypes
  
  @js.native
  sealed trait reject
    extends StObject
       with ActionTypes
  
  @js.native
  sealed trait start
    extends StObject
       with ActionTypes
}
