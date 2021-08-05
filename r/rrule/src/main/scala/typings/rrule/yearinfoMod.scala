package typings.rrule

import typings.rrule.rruleNumbers.`365`
import typings.rrule.rruleNumbers.`366`
import typings.rrule.typesMod.ParsedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object yearinfoMod {
  
  @JSImport("rrule/dist/esm/src/iterinfo/yearinfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rebuildYear(year: Double, options: ParsedOptions): YearInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("rebuildYear")(year.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[YearInfo]
  
  trait YearInfo extends StObject {
    
    var mdaymask: js.Array[Double]
    
    var mmask: js.Array[Double]
    
    var mrange: js.Array[Double]
    
    var nextyearlen: `365` | `366`
    
    var nmdaymask: js.Array[Double]
    
    var wdaymask: js.Array[Double]
    
    var wnomask: js.Array[Double] | Null
    
    var yearlen: `365` | `366`
    
    var yearordinal: Double
    
    var yearweekday: Double
  }
  object YearInfo {
    
    inline def apply(
      mdaymask: js.Array[Double],
      mmask: js.Array[Double],
      mrange: js.Array[Double],
      nextyearlen: `365` | `366`,
      nmdaymask: js.Array[Double],
      wdaymask: js.Array[Double],
      yearlen: `365` | `366`,
      yearordinal: Double,
      yearweekday: Double
    ): YearInfo = {
      val __obj = js.Dynamic.literal(mdaymask = mdaymask.asInstanceOf[js.Any], mmask = mmask.asInstanceOf[js.Any], mrange = mrange.asInstanceOf[js.Any], nextyearlen = nextyearlen.asInstanceOf[js.Any], nmdaymask = nmdaymask.asInstanceOf[js.Any], wdaymask = wdaymask.asInstanceOf[js.Any], yearlen = yearlen.asInstanceOf[js.Any], yearordinal = yearordinal.asInstanceOf[js.Any], yearweekday = yearweekday.asInstanceOf[js.Any], wnomask = null)
      __obj.asInstanceOf[YearInfo]
    }
    
    extension [Self <: YearInfo](x: Self) {
      
      inline def setMdaymask(value: js.Array[Double]): Self = StObject.set(x, "mdaymask", value.asInstanceOf[js.Any])
      
      inline def setMdaymaskVarargs(value: Double*): Self = StObject.set(x, "mdaymask", js.Array(value :_*))
      
      inline def setMmask(value: js.Array[Double]): Self = StObject.set(x, "mmask", value.asInstanceOf[js.Any])
      
      inline def setMmaskVarargs(value: Double*): Self = StObject.set(x, "mmask", js.Array(value :_*))
      
      inline def setMrange(value: js.Array[Double]): Self = StObject.set(x, "mrange", value.asInstanceOf[js.Any])
      
      inline def setMrangeVarargs(value: Double*): Self = StObject.set(x, "mrange", js.Array(value :_*))
      
      inline def setNextyearlen(value: `365` | `366`): Self = StObject.set(x, "nextyearlen", value.asInstanceOf[js.Any])
      
      inline def setNmdaymask(value: js.Array[Double]): Self = StObject.set(x, "nmdaymask", value.asInstanceOf[js.Any])
      
      inline def setNmdaymaskVarargs(value: Double*): Self = StObject.set(x, "nmdaymask", js.Array(value :_*))
      
      inline def setWdaymask(value: js.Array[Double]): Self = StObject.set(x, "wdaymask", value.asInstanceOf[js.Any])
      
      inline def setWdaymaskVarargs(value: Double*): Self = StObject.set(x, "wdaymask", js.Array(value :_*))
      
      inline def setWnomask(value: js.Array[Double]): Self = StObject.set(x, "wnomask", value.asInstanceOf[js.Any])
      
      inline def setWnomaskNull: Self = StObject.set(x, "wnomask", null)
      
      inline def setWnomaskVarargs(value: Double*): Self = StObject.set(x, "wnomask", js.Array(value :_*))
      
      inline def setYearlen(value: `365` | `366`): Self = StObject.set(x, "yearlen", value.asInstanceOf[js.Any])
      
      inline def setYearordinal(value: Double): Self = StObject.set(x, "yearordinal", value.asInstanceOf[js.Any])
      
      inline def setYearweekday(value: Double): Self = StObject.set(x, "yearweekday", value.asInstanceOf[js.Any])
    }
  }
}
