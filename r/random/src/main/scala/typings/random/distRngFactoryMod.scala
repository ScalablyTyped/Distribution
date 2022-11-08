package typings.random

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRngFactoryMod {
  
  @JSImport("random/dist/rng-factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Construct an RNG with variable inputs. Used in calls to Random constructor
    * @param {...*} args - Distribution-specific arguments
    * @return RNG
    *
    * @example
    * new Random(RNGFactory(...args))
    */
  inline def default[T /* <: js.Array[Any] */](
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): typings.random.distRngMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(args.asInstanceOf[js.Any]).asInstanceOf[typings.random.distRngMod.default]
}
