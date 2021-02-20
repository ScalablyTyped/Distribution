package typings.rotJs

import typings.rotJs.anon.PartialOptions
import typings.rotJs.rotJsNumbers.`4`
import typings.rotJs.rotJsNumbers.`6`
import typings.rotJs.rotJsNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathPathMod {
  
  @JSImport("rot-js/lib/path/path", JSImport.Default)
  @js.native
  abstract class default protected () extends Path {
    def this(toX: Double, toY: Double, passableCallback: PassableCallback) = this()
    def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: PartialOptions) = this()
  }
  
  type ComputeCallback = js.Function2[/* x */ Double, /* y */ Double, js.Any]
  
  @js.native
  trait Options extends StObject {
    
    var topology: `4` | `6` | `8` = js.native
  }
  object Options {
    
    @scala.inline
    def apply(topology: `4` | `6` | `8`): Options = {
      val __obj = js.Dynamic.literal(topology = topology.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTopology(value: `4` | `6` | `8`): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
    }
  }
  
  type PassableCallback = js.Function2[/* x */ Double, /* y */ Double, Boolean]
  
  @js.native
  trait Path extends StObject {
    
    var _dirs: js.Array[js.Array[Double]] = js.native
    
    def _getNeighbors(cx: Double, cy: Double): js.Array[js.Array[Double]] = js.native
    
    var _options: Options = js.native
    
    def _passableCallback(x: Double, y: Double): Boolean = js.native
    @JSName("_passableCallback")
    var _passableCallback_Original: PassableCallback = js.native
    
    var _toX: Double = js.native
    
    var _toY: Double = js.native
    
    /**
      * Compute a path from a given point
      * @param {int} fromX
      * @param {int} fromY
      * @param {function} callback Will be called for every path item with arguments "x" and "y"
      */
    def compute(fromX: Double, fromY: Double, callback: ComputeCallback): Unit = js.native
  }
}
