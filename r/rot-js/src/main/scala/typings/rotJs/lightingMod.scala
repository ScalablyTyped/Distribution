package typings.rotJs

import typings.rotJs.anon.PartialOptionsEmissionThreshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lightingMod {
  
  @JSImport("rot-js/lib/lighting", JSImport.Default)
  @js.native
  class default protected () extends Lighting {
    def this(reflectivityCallback: ReflectivityCallback) = this()
    def this(reflectivityCallback: ReflectivityCallback, options: PartialOptionsEmissionThreshold) = this()
  }
  
  type LightColor = js.Tuple3[Double, Double, Double]
  
  @js.native
  trait Lighting extends StObject {
    
    /**
      * Prepare a list of emitters for next pass
      */
    var _computeEmitters: js.Any = js.native
    
    /**
      * Compute one iteration from all emitting cells
      * @param emittingCells These emit light
      * @param litCells Add projected light to these
      * @param doneCells These already emitted, forbid them from further calculations
      */
    var _emitLight: js.Any = js.native
    
    /**
      * Compute one iteration from one cell
      */
    var _emitLightFromCell: js.Any = js.native
    
    var _fov: js.Any = js.native
    
    var _fovCache: js.Any = js.native
    
    var _lights: js.Any = js.native
    
    var _options: js.Any = js.native
    
    var _reflectivityCache: js.Any = js.native
    
    var _reflectivityCallback: js.Any = js.native
    
    /**
      * Compute FOV ("form factor") for a potential light source at [x,y]
      */
    var _updateFOV: js.Any = js.native
    
    /**
      * Remove all light sources
      */
    def clearLights(): Unit = js.native
    
    /**
      * Compute the lighting
      */
    def compute(lightingCallback: LightingCallback): this.type = js.native
    
    /**
      * Reset the pre-computed topology values. Call whenever the underlying map changes its light-passability.
      */
    def reset(): this.type = js.native
    
    /**
      * Set the used Field-Of-View algo
      */
    def setFOV(fov: typings.rotJs.fovFovMod.default): this.type = js.native
    
    /**
      * Set (or remove) a light source
      */
    def setLight(x: Double, y: Double): this.type = js.native
    def setLight(x: Double, y: Double, color: String): this.type = js.native
    def setLight(x: Double, y: Double, color: LightColor): this.type = js.native
    
    /**
      * Adjust options at runtime
      */
    def setOptions(options: PartialOptionsEmissionThreshold): this.type = js.native
  }
  
  /** Will be called for every lit cell */
  type LightingCallback = js.Function3[/* x */ Double, /* y */ Double, /* color */ LightColor, Unit]
  
  @js.native
  trait Options extends StObject {
    
    /** Cells with emissivity > threshold will be treated as light source in the next pass. Default = 100 */
    var emissionThreshold: Double = js.native
    
    /** Number of passes. 1 equals to simple FOV of all light sources, >1 means a *highly simplified* radiosity-like algorithm. Default = 1 */
    var passes: Double = js.native
    
    /** Max light range, default = 10 */
    var range: Double = js.native
  }
  object Options {
    
    @scala.inline
    def apply(emissionThreshold: Double, passes: Double, range: Double): Options = {
      val __obj = js.Dynamic.literal(emissionThreshold = emissionThreshold.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmissionThreshold(value: Double): Self = StObject.set(x, "emissionThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPasses(value: Double): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  /** Callback to retrieve cell reflectivity (0..1) */
  type ReflectivityCallback = js.Function2[/* x */ Double, /* y */ Double, Double]
}
