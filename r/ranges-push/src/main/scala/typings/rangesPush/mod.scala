package typings.rangesPush

import typings.rangesPush.anon.PartialOpts
import typings.rangesPush.rangesPushNumbers.`1`
import typings.rangesPush.rangesPushNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ranges-push", "Ranges")
  @js.native
  open class Ranges () extends StObject {
    def this(originalOpts: PartialOpts) = this()
    
    def add(): Unit = js.native
    def add(originalFrom: js.Array[Range]): Unit = js.native
    def add(originalFrom: Double): Unit = js.native
    def add(originalFrom: Double, originalTo: Double): Unit = js.native
    def add(originalFrom: Double, originalTo: Double, addVal: String): Unit = js.native
    def add(originalFrom: Double, originalTo: Unit, addVal: String): Unit = js.native
    def add(originalFrom: Range): Unit = js.native
    
    def current(): Null | js.Array[Range] = js.native
    
    def last(): Range | Null = js.native
    
    var opts: Opts = js.native
    
    def push(): Unit = js.native
    def push(originalFrom: js.Array[Range]): Unit = js.native
    def push(originalFrom: Double): Unit = js.native
    def push(originalFrom: Double, originalTo: Double): Unit = js.native
    def push(originalFrom: Double, originalTo: Double, addVal: String): Unit = js.native
    def push(originalFrom: Double, originalTo: Unit, addVal: String): Unit = js.native
    def push(originalFrom: Range): Unit = js.native
    
    var ranges: js.Array[Range] = js.native
    
    def replace(givenRanges: js.Array[Range]): Unit = js.native
    
    def wipe(): Unit = js.native
  }
  
  @JSImport("ranges-push", "defaults")
  @js.native
  val defaults: Opts = js.native
  
  @JSImport("ranges-push", "version")
  @js.native
  val version: String = js.native
  
  trait Opts extends StObject {
    
    var limitLinebreaksCount: Double
    
    var limitToBeAddedWhitespace: Boolean
    
    var mergeType: js.UndefOr[
        `1` | `2` | typings.rangesPush.rangesPushStrings.`1` | typings.rangesPush.rangesPushStrings.`2`
      ] = js.undefined
  }
  object Opts {
    
    inline def apply(limitLinebreaksCount: Double, limitToBeAddedWhitespace: Boolean): Opts = {
      val __obj = js.Dynamic.literal(limitLinebreaksCount = limitLinebreaksCount.asInstanceOf[js.Any], limitToBeAddedWhitespace = limitToBeAddedWhitespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opts]
    }
    
    extension [Self <: Opts](x: Self) {
      
      inline def setLimitLinebreaksCount(value: Double): Self = StObject.set(x, "limitLinebreaksCount", value.asInstanceOf[js.Any])
      
      inline def setLimitToBeAddedWhitespace(value: Boolean): Self = StObject.set(x, "limitToBeAddedWhitespace", value.asInstanceOf[js.Any])
      
      inline def setMergeType(
        value: `1` | `2` | typings.rangesPush.rangesPushStrings.`1` | typings.rangesPush.rangesPushStrings.`2`
      ): Self = StObject.set(x, "mergeType", value.asInstanceOf[js.Any])
      
      inline def setMergeTypeUndefined: Self = StObject.set(x, "mergeType", js.undefined)
    }
  }
  
  type Range = (js.Tuple2[/* from */ Double, /* to */ Double]) | (js.Tuple3[/* from */ Double, /* to */ Double, /* whatToInsert */ js.UndefOr[String | Null]])
}
