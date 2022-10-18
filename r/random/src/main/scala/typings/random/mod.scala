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
  val default: typings.random.distCjsRandomMod.Random = js.native
  
  /* note: abstract class */ @JSImport("random", "RNG")
  @js.native
  open class RNG ()
    extends typings.random.distCjsRandomMod.RNG
  
  inline def RNGFactory[T /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): typings.random.distCjsRngMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("RNGFactory")(args.asInstanceOf[js.Any]).asInstanceOf[typings.random.distCjsRngMod.default]
  
  @JSImport("random", "Random")
  @js.native
  open class Random ()
    extends typings.random.distCjsRandomMod.Random {
    def this(rng: typings.random.distCjsRngMod.default) = this()
  }
}
