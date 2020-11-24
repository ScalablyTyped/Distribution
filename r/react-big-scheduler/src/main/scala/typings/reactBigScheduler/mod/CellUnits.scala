package typings.reactBigScheduler.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CellUnits extends js.Object
@JSImport("react-big-scheduler", "CellUnits")
@js.native
object CellUnits extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellUnits with Double] = js.native
  
  @js.native
  sealed trait Day extends CellUnits
  /* 0 */ @js.native
  object Day extends TopLevel[Day with Double]
  
  @js.native
  sealed trait Hour extends CellUnits
  /* 1 */ @js.native
  object Hour extends TopLevel[Hour with Double]
}
