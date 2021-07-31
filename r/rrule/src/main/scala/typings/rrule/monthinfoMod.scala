package typings.rrule

import typings.rrule.typesMod.ParsedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object monthinfoMod {
  
  @JSImport("rrule/dist/esm/src/iterinfo/monthinfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def rebuildMonth(
    year: Double,
    month: Double,
    yearlen: Double,
    mrange: js.Array[Double],
    wdaymask: js.Array[Double],
    options: ParsedOptions
  ): MonthInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("rebuildMonth")(year.asInstanceOf[js.Any], month.asInstanceOf[js.Any], yearlen.asInstanceOf[js.Any], mrange.asInstanceOf[js.Any], wdaymask.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MonthInfo]
  
  trait MonthInfo extends StObject {
    
    var lastmonth: Double
    
    var lastyear: Double
    
    var nwdaymask: js.Array[Double]
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
