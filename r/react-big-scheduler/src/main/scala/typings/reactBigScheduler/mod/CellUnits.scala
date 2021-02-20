package typings.reactBigScheduler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CellUnits extends StObject
@JSImport("react-big-scheduler", "CellUnits")
@js.native
object CellUnits extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CellUnits with Double] = js.native
  
  @js.native
  sealed trait Day extends CellUnits
  /* 0 */ val Day: typings.reactBigScheduler.mod.CellUnits.Day with Double = js.native
  
  @js.native
  sealed trait Hour extends CellUnits
  /* 1 */ val Hour: typings.reactBigScheduler.mod.CellUnits.Hour with Double = js.native
}
