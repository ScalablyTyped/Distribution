package typings.rotJs

import typings.rotJs.anon.PartialOptions
import typings.rotJs.rotJsNumbers.`4`
import typings.rotJs.rotJsNumbers.`6`
import typings.rotJs.rotJsNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fovFovMod {
  
  @JSImport("rot-js/lib/fov/fov", JSImport.Default)
  @js.native
  abstract class default protected () extends FOV {
    /**
      * @class Abstract FOV algorithm
      * @param {function} lightPassesCallback Does the light pass through x,y?
      * @param {object} [options]
      * @param {int} [options.topology=8] 4/6/8
      */
    def this(lightPassesCallback: LightPassesCallback) = this()
    def this(lightPassesCallback: LightPassesCallback, options: PartialOptions) = this()
  }
  
  @js.native
  trait FOV extends StObject {
    
    /**
      * Return all neighbors in a concentric ring
      * @param {int} cx center-x
      * @param {int} cy center-y
      * @param {int} r range
      */
    def _getCircle(cx: Double, cy: Double, r: Double): js.Array[js.Array[Double]] = js.native
    
    def _lightPasses(x: Double, y: Double): Boolean = js.native
    @JSName("_lightPasses")
    var _lightPasses_Original: LightPassesCallback = js.native
    
    var _options: Options = js.native
    
    /**
      * Compute visibility for a 360-degree circle
      * @param {int} x
      * @param {int} y
      * @param {int} R Maximum visibility radius
      * @param {function} callback
      */
    def compute(x: Double, y: Double, R: Double, callback: VisibilityCallback): Unit = js.native
  }
  
  type LightPassesCallback = js.Function2[/* x */ Double, /* y */ Double, Boolean]
  
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
  
  type VisibilityCallback = js.Function4[/* x */ Double, /* y */ Double, /* r */ Double, /* visibility */ Double, Unit]
}
