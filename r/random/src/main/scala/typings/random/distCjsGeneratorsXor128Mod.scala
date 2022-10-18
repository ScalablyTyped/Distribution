package typings.random

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsGeneratorsXor128Mod {
  
  @JSImport("random/dist/cjs/generators/xor128", JSImport.Default)
  @js.native
  open class default protected () extends RNGXOR128 {
    def this(seed: Double) = this()
    def this(seed: Double, opts: Record[String, Any]) = this()
  }
  
  @js.native
  trait RNGXOR128
    extends typings.random.distCjsRngMod.default {
    
    def clone(seed: Double, opts: Record[String, Any]): RNGXOR128 = js.native
    
    def seed(seed: Double): Unit = js.native
    def seed(seed: Double, opts: Record[String, Any]): Unit = js.native
    
    var w: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
    
    var z: Double = js.native
  }
}
