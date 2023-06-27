package typings.quantize

import typings.quantize.quantizeBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(pixels: js.Array[RgbPixel], colorCount: Double): ColorMap | `false` = (^.asInstanceOf[js.Dynamic].apply(pixels.asInstanceOf[js.Any], colorCount.asInstanceOf[js.Any])).asInstanceOf[ColorMap | `false`]
  
  @JSImport("quantize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ColorMap extends StObject {
    
    /**
      * Maps the pixel from source image to the closest palette color
      */
    def map(pixel: RgbPixel): RgbPixel
    
    def nearest(pixel: RgbPixel): RgbPixel
    
    /**
      * Returns the palette as an array of RgbPixel
      * @returns RgbPixel[][]
      */
    def palette(): js.Array[RgbPixel]
    
    def push(vbox: VBox): Unit
    
    /**
      * Returns the size of the palette
      */
    def size(): Double
    
    var vboxes: PriorityQueue
  }
  object ColorMap {
    
    inline def apply(
      map: RgbPixel => RgbPixel,
      nearest: RgbPixel => RgbPixel,
      palette: () => js.Array[RgbPixel],
      push: VBox => Unit,
      size: () => Double,
      vboxes: PriorityQueue
    ): ColorMap = {
      val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map), nearest = js.Any.fromFunction1(nearest), palette = js.Any.fromFunction0(palette), push = js.Any.fromFunction1(push), size = js.Any.fromFunction0(size), vboxes = vboxes.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorMap] (val x: Self) extends AnyVal {
      
      inline def setMap(value: RgbPixel => RgbPixel): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setNearest(value: RgbPixel => RgbPixel): Self = StObject.set(x, "nearest", js.Any.fromFunction1(value))
      
      inline def setPalette(value: () => js.Array[RgbPixel]): Self = StObject.set(x, "palette", js.Any.fromFunction0(value))
      
      inline def setPush(value: VBox => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
      
      inline def setSize(value: () => Double): Self = StObject.set(x, "size", js.Any.fromFunction0(value))
      
      inline def setVboxes(value: PriorityQueue): Self = StObject.set(x, "vboxes", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColorObject extends StObject {
    
    var color: RgbPixel
    
    var vbox: VBox
  }
  object ColorObject {
    
    inline def apply(color: RgbPixel, vbox: VBox): ColorObject = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], vbox = vbox.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorObject] (val x: Self) extends AnyVal {
      
      inline def setColor(value: RgbPixel): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setVbox(value: VBox): Self = StObject.set(x, "vbox", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PriorityQueue extends StObject {
    
    def debug(): js.Array[ColorObject] = js.native
    
    def map[U](callback: js.Function2[/* item */ ColorObject, /* index */ Double, U]): js.Array[U] = js.native
    
    def peek(): ColorObject = js.native
    def peek(index: Double): ColorObject = js.native
    
    def pop(): ColorObject = js.native
    
    def push(item: ColorObject): Unit = js.native
    
    def size(): Double = js.native
  }
  
  type RgbPixel = js.Tuple3[Double, Double, Double]
  
  @js.native
  trait VBox extends StObject {
    
    def avg(): RgbPixel = js.native
    def avg(recalculate: Boolean): RgbPixel = js.native
    
    var b1: Double = js.native
    
    var b2: Double = js.native
    
    def contains(pixel: RgbPixel): Boolean = js.native
    
    def copy(): VBox = js.native
    
    def count(): Double = js.native
    
    var g1: Double = js.native
    
    var g2: Double = js.native
    
    var histo: js.Array[Double] = js.native
    
    var r1: Double = js.native
    
    var r2: Double = js.native
    
    def volume(): Double = js.native
    def volume(recalculate: Boolean): Double = js.native
  }
}
