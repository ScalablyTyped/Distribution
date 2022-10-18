package typings.reactAsync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait StatusTypes extends StObject
@JSImport("react-async", "StatusTypes")
@js.native
object StatusTypes extends StObject {
  
  @js.native
  sealed trait fulfilled
    extends StObject
       with StatusTypes
  
  @js.native
  sealed trait initial
    extends StObject
       with StatusTypes
  
  @js.native
  sealed trait pending
    extends StObject
       with StatusTypes
  
  @js.native
  sealed trait rejected
    extends StObject
       with StatusTypes
}
