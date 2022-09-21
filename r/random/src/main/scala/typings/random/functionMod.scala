package typings.random

import typings.random.rngMod.SeedFn
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functionMod {
  
  @JSImport("random/dist/cjs/generators/function", JSImport.Default)
  @js.native
  open class default protected () extends RNGFunction {
    def this(thunk: SeedFn) = this()
    def this(thunk: SeedFn, opts: Record[String, Any]) = this()
  }
  
  @js.native
  trait RNGFunction
    extends typings.random.rngMod.default {
    
    def _rng(): Double = js.native
    @JSName("_rng")
    var _rng_Original: SeedFn = js.native
    
    def seed(thunk: SeedFn): Unit = js.native
    def seed(thunk: SeedFn, _opts: Record[String, Any]): Unit = js.native
  }
}
