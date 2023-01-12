package typings.rollADie

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("roll-a-die", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    /**
      * Called when animation is finished.
      * @param values An array of the values from throw.
      */
    def callback(values: js.Array[Double]): Any
    
    /**
      * Time in milliseconds to delay before removing animations
      * @default 3000
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /** The element to render die animation on. */
    var element: HTMLElement
    
    /**
      * Roll the die without sound.
      * @default false
      */
    var noSound: js.UndefOr[Boolean] = js.undefined
    
    /** The number of dice to use. */
    var numberOfDice: Double
    
    /**
      * Values to show on die face.
      * When provided, it overrides library genrated values.
      */
    var values: js.UndefOr[js.Array[Double]] = js.undefined
  }
  object Options {
    
    inline def apply(callback: js.Array[Double] => Any, element: HTMLElement, numberOfDice: Double): Options = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), element = element.asInstanceOf[js.Any], numberOfDice = numberOfDice.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: js.Array[Double] => Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setNoSound(value: Boolean): Self = StObject.set(x, "noSound", value.asInstanceOf[js.Any])
      
      inline def setNoSoundUndefined: Self = StObject.set(x, "noSound", js.undefined)
      
      inline def setNumberOfDice(value: Double): Self = StObject.set(x, "numberOfDice", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
}
