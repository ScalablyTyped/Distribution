package typings.steelseries.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steelseries", "TrendState")
@js.native
open class TrendState protected () extends StObject {
  def this(state: String) = this()
  
  var state: String = js.native
}
object TrendState {
  
  @JSImport("steelseries", "TrendState.DOWN")
  @js.native
  val DOWN: TrendState = js.native
  
  @JSImport("steelseries", "TrendState.OFF")
  @js.native
  val OFF: TrendState = js.native
  
  @JSImport("steelseries", "TrendState.STEADY")
  @js.native
  val STEADY: TrendState = js.native
  
  @JSImport("steelseries", "TrendState.UP")
  @js.native
  val UP: TrendState = js.native
}
