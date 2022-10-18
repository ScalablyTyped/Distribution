package typings.random

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsRngMod {
  
  /* note: abstract class */ @JSImport("random/dist/cjs/rng", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with RNG
  
  @js.native
  trait RNG extends StObject {
    
    def _seed(seed: Double): Double = js.native
    def _seed(seed: Double, _opts: Record[String, Any]): Double = js.native
    
    def clone(_seed: Unit, _opts: Record[String, Any]): RNG = js.native
    def clone(_seed: SeedType): RNG = js.native
    def clone(_seed: SeedType, _opts: Record[String, Any]): RNG = js.native
    
    def name: String = js.native
    
    def next(): Double = js.native
    
    def seed(): Unit = js.native
    def seed(_seed: Unit, _opts: Record[String, Any]): Unit = js.native
    def seed(_seed: SeedType): Unit = js.native
    def seed(_seed: SeedType, _opts: Record[String, Any]): Unit = js.native
  }
  
  type SeedFn = js.Function0[Double]
  
  type SeedType = Double | String | SeedFn | RNG
}
