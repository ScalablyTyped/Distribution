package typings.random

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("random", JSImport.Default)
  @js.native
  val default: typings.random.randomMod.Random = js.native
  
  @JSImport("random", "RNG")
  @js.native
  abstract class RNG ()
    extends typings.random.randomMod.RNG
  
  inline def RNGFactory[T /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): typings.random.rngMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("RNGFactory")(args.asInstanceOf[js.Any]).asInstanceOf[typings.random.rngMod.default]
  
  @JSImport("random", "Random")
  @js.native
  open class Random ()
    extends typings.random.randomMod.Random {
    def this(rng: typings.random.rngMod.default) = this()
  }
}
