package typings.salesmanJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("salesman.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("salesman.js", "Point")
  @js.native
  open class Point protected () extends StObject {
    /**
      * Represents a point in two dimensions.
      * @param x abscissa
      * @param y ordinate
      */
    def this(x: Double, y: Double) = this()
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  
  inline def solve(points: js.Array[Point]): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("solve")(points.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def solve(points: js.Array[Point], temp_coeff: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("solve")(points.asInstanceOf[js.Any], temp_coeff.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def solve(
    points: js.Array[Point],
    temp_coeff: Double,
    callback: js.Function1[/* order */ js.Array[Double], Unit]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("solve")(points.asInstanceOf[js.Any], temp_coeff.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def solve(
    points: js.Array[Point],
    temp_coeff: Unit,
    callback: js.Function1[/* order */ js.Array[Double], Unit]
  ): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("solve")(points.asInstanceOf[js.Any], temp_coeff.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
}
