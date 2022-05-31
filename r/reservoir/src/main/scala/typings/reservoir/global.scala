package typings.reservoir

import typings.reservoir.mod.ReservoirArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * Create a new reservoir sampler.
    *
    * @param reservoirSize is the maximum size of the reservoir. This is the number of elements
    *   to be randomly chosen from the input provided to it using pushSome. Default is 1.
    * @param randomNumberGenerator is an optional random number generating function to use in
    *   place of the default Math.random.
    */
  inline def Reservoir[T](): ReservoirArray[T] = js.Dynamic.global.applyDynamic("Reservoir")().asInstanceOf[ReservoirArray[T]]
  inline def Reservoir[T](reservoirSize: Double): ReservoirArray[T] = js.Dynamic.global.applyDynamic("Reservoir")(reservoirSize.asInstanceOf[js.Any]).asInstanceOf[ReservoirArray[T]]
  inline def Reservoir[T](reservoirSize: Double, randomNumberGenerator: js.Function0[Double]): ReservoirArray[T] = (js.Dynamic.global.applyDynamic("Reservoir")(reservoirSize.asInstanceOf[js.Any], randomNumberGenerator.asInstanceOf[js.Any])).asInstanceOf[ReservoirArray[T]]
  inline def Reservoir[T](reservoirSize: Unit, randomNumberGenerator: js.Function0[Double]): ReservoirArray[T] = (js.Dynamic.global.applyDynamic("Reservoir")(reservoirSize.asInstanceOf[js.Any], randomNumberGenerator.asInstanceOf[js.Any])).asInstanceOf[ReservoirArray[T]]
}
