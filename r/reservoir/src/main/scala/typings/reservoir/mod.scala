package typings.reservoir

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Create a new reservoir sampler.
    *
    * @param reservoirSize is the maximum size of the reservoir. This is the number of elements
    *   to be randomly chosen from the input provided to it using pushSome. Default is 1.
    * @param randomNumberGenerator is an optional random number generating function to use in
    *   place of the default Math.random.
    */
  @scala.inline
  def apply[T](): ReservoirArray[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[ReservoirArray[T]]
  @scala.inline
  def apply[T](reservoirSize: Double): ReservoirArray[T] = ^.asInstanceOf[js.Dynamic].apply(reservoirSize.asInstanceOf[js.Any]).asInstanceOf[ReservoirArray[T]]
  @scala.inline
  def apply[T](reservoirSize: Double, randomNumberGenerator: js.Function0[Double]): ReservoirArray[T] = (^.asInstanceOf[js.Dynamic].apply(reservoirSize.asInstanceOf[js.Any], randomNumberGenerator.asInstanceOf[js.Any])).asInstanceOf[ReservoirArray[T]]
  @scala.inline
  def apply[T](reservoirSize: Unit, randomNumberGenerator: js.Function0[Double]): ReservoirArray[T] = (^.asInstanceOf[js.Dynamic].apply(reservoirSize.asInstanceOf[js.Any], randomNumberGenerator.asInstanceOf[js.Any])).asInstanceOf[ReservoirArray[T]]
  
  @JSImport("reservoir", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait ReservoirArray[T]
    extends StObject
       with Array[T] {
    
    /**
      * datum: one or more elements to consider for inclusion into the reservoir.
      * Returns the current length of the reservoir.
      */
    def pushSome(datum: T*): Double = js.native
  }
}
