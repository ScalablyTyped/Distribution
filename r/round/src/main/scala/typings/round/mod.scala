package typings.round

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(value: Double): Double = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def apply(value: Double, multiple: Double): Double = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], multiple.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(value: Double, multiple: Double, direction: Direction): Double = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], multiple.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def apply(value: Double, multiple: Unit, direction: Direction): Double = (^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any], multiple.asInstanceOf[js.Any], direction.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("round", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Convenience method for rounding down.
    */
  inline def down(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("down")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def down(value: Double, multiple: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("down")(value.asInstanceOf[js.Any], multiple.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Convenience method for rounding up.
    */
  inline def up(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("up")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def up(value: Double, multiple: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("up")(value.asInstanceOf[js.Any], multiple.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /* Rewritten from type alias, can be one of: 
    - typings.round.roundStrings.up
    - typings.round.roundStrings.down
  */
  trait Direction extends StObject
  object Direction {
    
    inline def down: typings.round.roundStrings.down = "down".asInstanceOf[typings.round.roundStrings.down]
    
    inline def up: typings.round.roundStrings.up = "up".asInstanceOf[typings.round.roundStrings.up]
  }
}
