package typings.shuffleSeed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("shuffle-seed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shuffle[T](arr: js.Array[T], seed: Any): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(arr.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def unshuffle[T](arr: js.Array[T], seed: Any): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unshuffle")(arr.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
