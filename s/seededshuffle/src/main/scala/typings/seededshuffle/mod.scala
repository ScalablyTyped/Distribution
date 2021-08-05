package typings.seededshuffle

import typings.seededshuffle.seededshuffleBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("seededshuffle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("seededshuffle", "seed")
  @js.native
  val seed: Double = js.native
  
  inline def shuffle[T](arr: js.Array[T], seed: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(arr.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def shuffle[T](arr: js.Array[T], seed: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(arr.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def shuffle_true[T](arr: js.Array[T], seed: String, copy: `true`): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(arr.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], copy.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def shuffle_true[T](arr: js.Array[T], seed: Double, copy: `true`): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("shuffle")(arr.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], copy.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  @JSImport("seededshuffle", "strSeed")
  @js.native
  val strSeed: String = js.native
  
  inline def unshuffle[T](arr: js.Array[T], seed: String): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unshuffle")(arr.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def unshuffle[T](arr: js.Array[T], seed: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unshuffle")(arr.asInstanceOf[js.Any], seed.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def unshuffle_true[T](arr: js.Array[T], seed: String, copy: `true`): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unshuffle")(arr.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], copy.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def unshuffle_true[T](arr: js.Array[T], seed: Double, copy: `true`): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("unshuffle")(arr.asInstanceOf[js.Any], seed.asInstanceOf[js.Any], copy.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
}
