package typings.rotJs

import typings.rotJs.anon.PartialOptions
import typings.rotJs.rotJsInts.`4`
import typings.rotJs.rotJsInts.`6`
import typings.rotJs.rotJsInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fovFovMod {
  
  @JSImport("rot-js/lib/fov/fov", JSImport.Default)
  @js.native
  abstract class default protected ()
    extends StObject
       with FOV {
    /**
      * @class Abstract FOV algorithm
      * @param {function} lightPassesCallback Does the light pass through x,y?
      * @param {object} [options]
      * @param {int} [options.topology=8] 4/6/8
      */
    def this(lightPassesCallback: LightPassesCallback) = this()
    def this(lightPassesCallback: LightPassesCallback, options: PartialOptions) = this()
    
    /**
      * Return all neighbors in a concentric ring
      * @param {int} cx center-x
      * @param {int} cy center-y
      * @param {int} r range
      */
    /* CompleteClass */
    override def _getCircle(cx: Double, cy: Double, r: Double): js.Array[js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def _lightPasses(x: Double, y: Double): Boolean = js.native
    /* CompleteClass */
    @JSName("_lightPasses")
    var _lightPasses_Original: LightPassesCallback = js.native
    
    /* CompleteClass */
    var _options: Options = js.native
    
    /**
      * Compute visibility for a 360-degree circle
      * @param {int} x
      * @param {int} y
      * @param {int} R Maximum visibility radius
      * @param {function} callback
      */
    /* CompleteClass */
    override def compute(x: Double, y: Double, R: Double, callback: VisibilityCallback): Unit = js.native
  }
  
  trait FOV extends StObject {
    
    /**
      * Return all neighbors in a concentric ring
      * @param {int} cx center-x
      * @param {int} cy center-y
      * @param {int} r range
      */
    def _getCircle(cx: Double, cy: Double, r: Double): js.Array[js.Array[Double]]
    
    def _lightPasses(x: Double, y: Double): Boolean
    @JSName("_lightPasses")
    var _lightPasses_Original: LightPassesCallback
    
    var _options: Options
    
    /**
      * Compute visibility for a 360-degree circle
      * @param {int} x
      * @param {int} y
      * @param {int} R Maximum visibility radius
      * @param {function} callback
      */
    def compute(x: Double, y: Double, R: Double, callback: VisibilityCallback): Unit
  }
  object FOV {
    
    inline def apply(
      _getCircle: (Double, Double, Double) => js.Array[js.Array[Double]],
      _lightPasses: (/* x */ Double, /* y */ Double) => Boolean,
      _options: Options,
      compute: (Double, Double, Double, VisibilityCallback) => Unit
    ): FOV = {
      val __obj = js.Dynamic.literal(_getCircle = js.Any.fromFunction3(_getCircle), _lightPasses = js.Any.fromFunction2(_lightPasses), _options = _options.asInstanceOf[js.Any], compute = js.Any.fromFunction4(compute))
      __obj.asInstanceOf[FOV]
    }
    
    extension [Self <: FOV](x: Self) {
      
      inline def setCompute(value: (Double, Double, Double, VisibilityCallback) => Unit): Self = StObject.set(x, "compute", js.Any.fromFunction4(value))
      
      inline def set_getCircle(value: (Double, Double, Double) => js.Array[js.Array[Double]]): Self = StObject.set(x, "_getCircle", js.Any.fromFunction3(value))
      
      inline def set_lightPasses(value: (/* x */ Double, /* y */ Double) => Boolean): Self = StObject.set(x, "_lightPasses", js.Any.fromFunction2(value))
      
      inline def set_options(value: Options): Self = StObject.set(x, "_options", value.asInstanceOf[js.Any])
    }
  }
  
  type LightPassesCallback = js.Function2[/* x */ Double, /* y */ Double, Boolean]
  
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
  
  type VisibilityCallback = js.Function4[/* x */ Double, /* y */ Double, /* r */ Double, /* visibility */ Double, Unit]
}
