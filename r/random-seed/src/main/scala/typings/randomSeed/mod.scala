package typings.randomSeed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("random-seed", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def create(): RandomSeed = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[RandomSeed]
  @scala.inline
  def create(seed: String): RandomSeed = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(seed.asInstanceOf[js.Any]).asInstanceOf[RandomSeed]
  
  @js.native
  trait RandomSeed extends StObject {
    
    def apply(range: Double): Double = js.native
    
    def addEntropy(args: js.Any*): Unit = js.native
    
    def cleanString(inStr: String): String = js.native
    
    def done(): Unit = js.native
    
    def floatBetween(min: Double, max: Double): Double = js.native
    
    def hashString(inStr: String): String = js.native
    
    def initState(): Unit = js.native
    
    def intBetween(min: Double, max: Double): Double = js.native
    
    def random(): Double = js.native
    
    def range(range: Double): Double = js.native
    
    def seed(seed: String): Unit = js.native
    
    def string(count: Double): String = js.native
  }
}
