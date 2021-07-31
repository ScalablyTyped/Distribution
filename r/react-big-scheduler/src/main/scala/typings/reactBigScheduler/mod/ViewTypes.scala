package typings.reactBigScheduler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ViewTypes extends StObject
@JSImport("react-big-scheduler", "ViewTypes")
@js.native
object ViewTypes extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ViewTypes & Double] = js.native
  
  @js.native
  sealed trait Custom
    extends StObject
       with ViewTypes
  /* 5 */ val Custom: typings.reactBigScheduler.mod.ViewTypes.Custom & Double = js.native
  
  @js.native
  sealed trait Custom1
    extends StObject
       with ViewTypes
  /* 6 */ val Custom1: typings.reactBigScheduler.mod.ViewTypes.Custom1 & Double = js.native
  
  @js.native
  sealed trait Custom2
    extends StObject
       with ViewTypes
  /* 7 */ val Custom2: typings.reactBigScheduler.mod.ViewTypes.Custom2 & Double = js.native
  
  @js.native
  sealed trait Day
    extends StObject
       with ViewTypes
  /* 0 */ val Day: typings.reactBigScheduler.mod.ViewTypes.Day & Double = js.native
  
  @js.native
  sealed trait Month
    extends StObject
       with ViewTypes
  /* 2 */ val Month: typings.reactBigScheduler.mod.ViewTypes.Month & Double = js.native
  
  @js.native
  sealed trait Quarter
    extends StObject
       with ViewTypes
  /* 3 */ val Quarter: typings.reactBigScheduler.mod.ViewTypes.Quarter & Double = js.native
  
  @js.native
  sealed trait Week
    extends StObject
       with ViewTypes
  /* 1 */ val Week: typings.reactBigScheduler.mod.ViewTypes.Week & Double = js.native
  
  @js.native
  sealed trait Year
    extends StObject
       with ViewTypes
  /* 4 */ val Year: typings.reactBigScheduler.mod.ViewTypes.Year & Double = js.native
}
