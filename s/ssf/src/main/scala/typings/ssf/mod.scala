package typings.ssf

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ssf", "format")
  @js.native
  def format(fmt: String, `val`: js.Any): String = js.native
  @JSImport("ssf", "format")
  @js.native
  def format(fmt: String, `val`: js.Any, opts: js.Any): String = js.native
  @JSImport("ssf", "format")
  @js.native
  def format(fmt: Double, `val`: js.Any): String = js.native
  @JSImport("ssf", "format")
  @js.native
  def format(fmt: Double, `val`: js.Any, opts: js.Any): String = js.native
  
  @JSImport("ssf", "get_table")
  @js.native
  def getTable(): SSFTable = js.native
  
  @JSImport("ssf", "is_date")
  @js.native
  def isDate(fmt: String): Boolean = js.native
  
  @JSImport("ssf", "load")
  @js.native
  def load(fmt: String): Double = js.native
  @JSImport("ssf", "load")
  @js.native
  def load(fmt: String, idx: Double): Double = js.native
  
  @JSImport("ssf", "load_table")
  @js.native
  def loadTable(tbl: SSFTable): Unit = js.native
  
  @JSImport("ssf", "parse_date_code")
  @js.native
  def parseDateCode(v: Double): SSFDate = js.native
  @JSImport("ssf", "parse_date_code")
  @js.native
  def parseDateCode(v: Double, opts: js.Any): SSFDate = js.native
  
  @JSImport("ssf", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait SSFDate extends StObject {
    
    /** number of whole days since relevant epoch, 0 <= D */
    var D: Double = js.native
    
    /** integral number of hours since midnight, 0 <= H < 24 */
    var H: Double = js.native
    
    /** integral number of minutes since the last hour, 0 <= M < 60 */
    var M: Double = js.native
    
    /** integral number of seconds since the last minute, 0 <= S < 60 */
    var S: Double = js.native
    
    /** number of seconds since midnight, 0 <= T < 86400 */
    var T: Double = js.native
    
    /** integral day portion, subject to gregorian YMD constraints */
    var d: Double = js.native
    
    /** integral month portion, 1 <= m <= 12 */
    var m: Double = js.native
    
    /** integral day of week (0=Sunday .. 6=Saturday) 0 <= q <= 6 */
    var q: Double = js.native
    
    /** sub-second part of time, 0 <= u < 1 */
    var u: Double = js.native
    
    /** integral year portion, epoch_year <= y */
    var y: Double = js.native
  }
  object SSFDate {
    
    @scala.inline
    def apply(
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
    implicit class SSFDateMutableBuilder[Self <: SSFDate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setD(value: Double): Self = StObject.set(x, "D", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "H", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setM(value: Double): Self = StObject.set(x, "M", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS(value: Double): Self = StObject.set(x, "S", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT(value: Double): Self = StObject.set(x, "T", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setU(value: Double): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type SSFTable = StringDictionary[String] with NumberDictionary[String]
}
