package typings.randomJs

import typings.randomJs.distTypesMod.Engine
import typings.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDistributionSampleMod {
  
  @JSImport("random-js/dist/distribution/sample", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sample[T](engine: Engine, population: ArrayLike[T], sampleSize: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("sample")(engine.asInstanceOf[js.Any], population.asInstanceOf[js.Any], sampleSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
