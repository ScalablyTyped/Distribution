package typings.rotJs

import typings.rotJs.anon.PartialOptionsEmissionThreshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLightingMod {
  
  @JSImport("rot-js/lib/lighting", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Lighting {
    def this(reflectivityCallback: ReflectivityCallback) = this()
    def this(reflectivityCallback: ReflectivityCallback, options: PartialOptionsEmissionThreshold) = this()
  }
  
  type LightColor = js.Tuple3[Double, Double, Double]
  
  @js.native
  trait Lighting extends StObject {
    
    /**
      * Prepare a list of emitters for next pass
      */
    /* private */ var _computeEmitters: Any = js.native
    
    /**
      * Compute one iteration from all emitting cells
      * @param emittingCells These emit light
      * @param litCells Add projected light to these
      * @param doneCells These already emitted, forbid them from further calculations
      */
    /* private */ var _emitLight: Any = js.native
    
    /**
      * Compute one iteration from one cell
      */
    /* private */ var _emitLightFromCell: Any = js.native
    
    /* private */ var _fov: Any = js.native
    
    /* private */ var _fovCache: Any = js.native
    
    /* private */ var _lights: Any = js.native
    
    /* private */ var _options: Any = js.native
    
    /* private */ var _reflectivityCache: Any = js.native
    
    /* private */ var _reflectivityCallback: Any = js.native
    
    /**
      * Compute FOV ("form factor") for a potential light source at [x,y]
      */
    /* private */ var _updateFOV: Any = js.native
    
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
    def setFOV(fov: typings.rotJs.libFovFovMod.default): this.type = js.native
    
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
  
  trait Options extends StObject {
    
    /** Cells with emissivity > threshold will be treated as light source in the next pass. Default = 100 */
    var emissionThreshold: Double
    
    /** Number of passes. 1 equals to simple FOV of all light sources, >1 means a *highly simplified* radiosity-like algorithm. Default = 1 */
    var passes: Double
    
    /** Max light range, default = 10 */
    var range: Double
  }
  object Options {
    
    inline def apply(emissionThreshold: Double, passes: Double, range: Double): Options = {
      val __obj = js.Dynamic.literal(emissionThreshold = emissionThreshold.asInstanceOf[js.Any], passes = passes.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setEmissionThreshold(value: Double): Self = StObject.set(x, "emissionThreshold", value.asInstanceOf[js.Any])
      
      inline def setPasses(value: Double): Self = StObject.set(x, "passes", value.asInstanceOf[js.Any])
      
      inline def setRange(value: Double): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    }
  }
  
  /** Callback to retrieve cell reflectivity (0..1) */
  type ReflectivityCallback = js.Function2[/* x */ Double, /* y */ Double, Double]
}
