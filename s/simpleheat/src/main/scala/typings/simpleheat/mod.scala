package typings.simpleheat

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.Shortcut
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("simpleheat", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Instance {
    def this(canvas: HTMLCanvasElement) = this()
  }
  @JSImport("simpleheat", JSImport.Namespace)
  @js.native
  val ^ : Static = js.native
  
  @js.native
  trait Instance extends StObject {
    
    /**
      * Add a data point
      *
      * @param point Array of 2D coordinates and intensity value (defaulted to 1)
      */
    def add(point: js.Tuple2[Double, Double]): this.type = js.native
    def add(point: js.Tuple3[Double, Double, Double]): this.type = js.native
    
    /**
      * Clear canvas data
      */
    def clear(): this.type = js.native
    
    /**
      * Set heatmap data points
      *
      * @param points Array of data points containing 2D coordinates and intensity value (defaulted to 1)
      * @example [[0, 0, 1.0], [1, 0, 2.0], [1, 1, 0.5], ...]
      */
    def data(points: js.Array[(js.Tuple2[Double, Double]) | (js.Tuple3[Double, Double, Double])]): this.type = js.native
    
    /**
      * Draw the heatmap
      *
      * @param minOpacity Optional param to set the opacity of the heatmap (defaulted to 0.05)
      */
    def draw(): this.type = js.native
    def draw(minOpacity: Double): this.type = js.native
    
    /**
      * Set gradient colors as {<stop>: '<color>'}
      * Thresholds are between 0.0 and 1.0.
      *
      * @param gradient Thresholds with associated colors to generate the gradient
      * @example {
      *            0.4: 'blue',
      *            0.6: 'cyan',
      *            0.7: 'lime',
      *            0.8: 'yellow',
      *            1.0: 'red'
      *          }
      */
    def gradient(gradient: NumberDictionary[String]): this.type = js.native
    
    /**
      * Set max data value
      *
      * @param maxValue Maximum data value (defaulted to 1)
      */
    def max(maxValue: Double): this.type = js.native
    
    /**
      * Set point radius and optional blur radius
      *
      * @param radius Radius (defaulted to 25)
      * @param blur Optional blur radius (defaulted to 15)
      */
    def radius(r: Double): this.type = js.native
    def radius(r: Double, blur: Double): this.type = js.native
    
    /**
      * Update drawing, in case canvas size changed
      */
    def resize(): this.type = js.native
  }
  
  @js.native
  trait Static
    extends StObject
       with Instantiable1[/* canvas */ HTMLCanvasElement, Instance] {
    
    def apply(canvas: HTMLCanvasElement): Instance = js.native
  }
  
  type _To = Static
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Static = ^
}
