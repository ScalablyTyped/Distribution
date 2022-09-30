package typings.rotJs

import typings.rotJs.anon.PartialOptions
import typings.rotJs.rotJsInts.`4`
import typings.rotJs.rotJsInts.`6`
import typings.rotJs.rotJsInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathPathMod {
  
  @JSImport("rot-js/lib/path/path", JSImport.Default)
  @js.native
  abstract class default protected ()
    extends StObject
       with Path {
    def this(toX: Double, toY: Double, passableCallback: PassableCallback) = this()
    def this(toX: Double, toY: Double, passableCallback: PassableCallback, options: PartialOptions) = this()
    
    /* CompleteClass */
    var _dirs: js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def _getNeighbors(cx: Double, cy: Double): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    var _options: Options = js.native
    
    /* CompleteClass */
    override def _passableCallback(x: Double, y: Double): Boolean = js.native
    /* CompleteClass */
    @JSName("_passableCallback")
    var _passableCallback_Original: PassableCallback = js.native
    
    /* CompleteClass */
    var _toX: Double = js.native
    
    /* CompleteClass */
    var _toY: Double = js.native
    
    /**
      * Compute a path from a given point
      * @param {int} fromX
      * @param {int} fromY
      * @param {function} callback Will be called for every path item with arguments "x" and "y"
      */
    /* CompleteClass */
    override def compute(fromX: Double, fromY: Double, callback: ComputeCallback): Unit = js.native
  }
  
  type ComputeCallback = js.Function2[/* x */ Double, /* y */ Double, Any]
  
  trait Options extends StObject {
    
    var topology: `4` | `6` | `8`
  }
  object Options {
    
    inline def apply(topology: `4` | `6` | `8`): Options = {
      val __obj = js.Dynamic.literal(topology = topology.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setTopology(value: `4` | `6` | `8`): Self = StObject.set(x, "topology", value.asInstanceOf[js.Any])
    }
  }
  
  type PassableCallback = js.Function2[/* x */ Double, /* y */ Double, Boolean]
  
  trait Path extends StObject {
    
    var _dirs: js.Array[js.Array[Double]]
    
    def _getNeighbors(cx: Double, cy: Double): js.Array[js.Array[Double]]
    
    var _options: Options
    
    def _passableCallback(x: Double, y: Double): Boolean
    @JSName("_passableCallback")
    var _passableCallback_Original: PassableCallback
    
    var _toX: Double
    
    var _toY: Double
    
    /**
      * Compute a path from a given point
      * @param {int} fromX
      * @param {int} fromY
      * @param {function} callback Will be called for every path item with arguments "x" and "y"
      */
    def compute(fromX: Double, fromY: Double, callback: ComputeCallback): Unit
  }
  object Path {
    
    inline def apply(
      _dirs: js.Array[js.Array[Double]],
      _getNeighbors: (Double, Double) => js.Array[js.Array[Double]],
      _options: Options,
      _passableCallback: (/* x */ Double, /* y */ Double) => Boolean,
      _toX: Double,
      _toY: Double,
      compute: (Double, Double, ComputeCallback) => Unit
    ): Path = {
      val __obj = js.Dynamic.literal(_dirs = _dirs.asInstanceOf[js.Any], _getNeighbors = js.Any.fromFunction2(_getNeighbors), _options = _options.asInstanceOf[js.Any], _passableCallback = js.Any.fromFunction2(_passableCallback), _toX = _toX.asInstanceOf[js.Any], _toY = _toY.asInstanceOf[js.Any], compute = js.Any.fromFunction3(compute))
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setCompute(value: (Double, Double, ComputeCallback) => Unit): Self = StObject.set(x, "compute", js.Any.fromFunction3(value))
      
      inline def set_dirs(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "_dirs", value.asInstanceOf[js.Any])
      
      inline def set_dirsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "_dirs", js.Array(value*))
      
      inline def set_getNeighbors(value: (Double, Double) => js.Array[js.Array[Double]]): Self = StObject.set(x, "_getNeighbors", js.Any.fromFunction2(value))
      
      inline def set_options(value: Options): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
      
      inline def set_passableCallback(value: (/* x */ Double, /* y */ Double) => Boolean): Self = StObject.set(x, "_passableCallback", js.Any.fromFunction2(value))
      
      inline def set_toX(value: Double): Self = StObject.set(x, "_toX", value.asInstanceOf[js.Any])
      
      inline def set_toY(value: Double): Self = StObject.set(x, "_toY", value.asInstanceOf[js.Any])
    }
  }
}
