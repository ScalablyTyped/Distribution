package typings.ssf

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ssf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def format(fmt: String, `val`: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(fmt: String, `val`: Any, opts: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(fmt: Double, `val`: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def format(fmt: Double, `val`: Any, opts: Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("format")(fmt.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getTable(): SSFTable = ^.asInstanceOf[js.Dynamic].applyDynamic("get_table")().asInstanceOf[SSFTable]
  
  inline def isDate(fmt: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_date")(fmt.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def load(fmt: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(fmt.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def load(fmt: String, idx: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(fmt.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def loadTable(tbl: SSFTable): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("load_table")(tbl.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def parseDateCode(v: Double): SSFDate = ^.asInstanceOf[js.Dynamic].applyDynamic("parse_date_code")(v.asInstanceOf[js.Any]).asInstanceOf[SSFDate]
  inline def parseDateCode(v: Double, opts: Any): SSFDate = (^.asInstanceOf[js.Dynamic].applyDynamic("parse_date_code")(v.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[SSFDate]
  
  @JSImport("ssf", "version")
  @js.native
  val version: String = js.native
  
  trait SSFDate extends StObject {
    
    /** number of whole days since relevant epoch, 0 <= D */
    var D: Double
    
    /** integral number of hours since midnight, 0 <= H < 24 */
    var H: Double
    
    /** integral number of minutes since the last hour, 0 <= M < 60 */
    var M: Double
    
    /** integral number of seconds since the last minute, 0 <= S < 60 */
    var S: Double
    
    /** number of seconds since midnight, 0 <= T < 86400 */
    var T: Double
    
    /** integral day portion, subject to gregorian YMD constraints */
    var d: Double
    
    /** integral month portion, 1 <= m <= 12 */
    var m: Double
    
    /** integral day of week (0=Sunday .. 6=Saturday) 0 <= q <= 6 */
    var q: Double
    
    /** sub-second part of time, 0 <= u < 1 */
    var u: Double
    
    /** integral year portion, epoch_year <= y */
    var y: Double
  }
  object SSFDate {
    
    inline def apply(
      D: Double,
      H: Double,
      M: Double,
      S: Double,
      T: Double,
      d: Double,
      m: Double,
      q: Double,
      u: Double,
      y: Double
    ): SSFDate = {
      val __obj = js.Dynamic.literal(D = D.asInstanceOf[js.Any], H = H.asInstanceOf[js.Any], M = M.asInstanceOf[js.Any], S = S.asInstanceOf[js.Any], T = T.asInstanceOf[js.Any], d = d.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], q = q.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[SSFDate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SSFDate] (val x: Self) extends AnyVal {
      
      inline def setD(value: Double): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      inline def setH(value: Double): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
      
      inline def setM(value: Double): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      inline def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setS(value: Double): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
      
      inline def setT(value: Double): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
      
      inline def setU(value: Double): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type SSFTable = StringDictionary[String] & NumberDictionary[String]
}
