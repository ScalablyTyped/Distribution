package typings.rrule

import typings.rrule.typesMod.ParsedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monthinfoMod {
  
  @JSImport("rrule/dist/esm/src/iterinfo/monthinfo", "rebuildMonth")
  @js.native
  def rebuildMonth(
    year: Double,
    month: Double,
    yearlen: Double,
    mrange: js.Array[Double],
    wdaymask: js.Array[Double],
    options: ParsedOptions
  ): MonthInfo = js.native
  
  @js.native
  trait MonthInfo extends StObject {
    
    var lastmonth: Double = js.native
    
    var lastyear: Double = js.native
    
    var nwdaymask: js.Array[Double] = js.native
  }
  object MonthInfo {
    
    @scala.inline
    def apply(lastmonth: Double, lastyear: Double, nwdaymask: js.Array[Double]): MonthInfo = {
      val __obj = js.Dynamic.literal(lastmonth = lastmonth.asInstanceOf[js.Any], lastyear = lastyear.asInstanceOf[js.Any], nwdaymask = nwdaymask.asInstanceOf[js.Any])
      __obj.asInstanceOf[MonthInfo]
    }
    
    @scala.inline
    implicit class MonthInfoMutableBuilder[Self <: MonthInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastmonth(value: Double): Self = StObject.set(x, "lastmonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastyear(value: Double): Self = StObject.set(x, "lastyear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNwdaymask(value: js.Array[Double]): Self = StObject.set(x, "nwdaymask", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNwdaymaskVarargs(value: Double*): Self = StObject.set(x, "nwdaymask", js.Array(value :_*))
    }
  }
}
