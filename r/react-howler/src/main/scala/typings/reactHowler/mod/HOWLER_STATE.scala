package typings.reactHowler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HOWLER_STATE extends js.Object
@JSImport("react-howler", "HOWLER_STATE")
@js.native
object HOWLER_STATE extends js.Object {
  
  @js.native
  sealed trait LOADED extends HOWLER_STATE
  
  @js.native
  sealed trait LOADING extends HOWLER_STATE
  
  @js.native
  sealed trait UNLOADED extends HOWLER_STATE
}
