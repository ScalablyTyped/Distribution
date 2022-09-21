package typings.secureSample

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Will return an array with `sampleSize` number of unique samples from the uniform
    * distribution `[0, populationSize)` (`populationSize` exclusive). The samples
    * will be sequential, so you may want to shuffle them.
    *
    * `sampleSize` and `populationSize` must be safe integers. `sampleSize` must not be
    * larger than `populationSize`. If any of these conditions are violated, an error
    * will be thrown.
    *
    * @example
    * import sample = require('secure-sample')
    * import shuffle = require('secure-shuffle')
    *
    * shuffle(sample(3, 10)) // [6, 2, 8]
    */
  inline def apply(sampleSize: Double, populationSize: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].apply(sampleSize.asInstanceOf[js.Any], populationSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  @JSImport("secure-sample", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
