package typings.randexp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("randexp", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with RandExp_ {
    def this(pattern: String) = this()
    def this(pattern: js.RegExp) = this()
    def this(pattern: String, flags: String) = this()
    def this(pattern: js.RegExp, flags: String) = this()
    
    /* CompleteClass */
    var defaultRange: typings.drange.mod.^ = js.native
    
    /* CompleteClass */
    override def gen(): String = js.native
    
    /* CompleteClass */
    var max: Double = js.native
    
    /* CompleteClass */
    override def randInt(from: Double, to: Double): Double = js.native
  }
  @JSImport("randexp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def randexp(pattern: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randexp")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def randexp(pattern: String, flags: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randexp")(pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def randexp(pattern: js.RegExp): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randexp")(pattern.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def randexp(pattern: js.RegExp, flags: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randexp")(pattern.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /* static member */
  inline def sugar(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sugar")().asInstanceOf[Unit]
  
  trait RandExp_ extends StObject {
    
    var defaultRange: typings.drange.mod.^
    
    def gen(): String
    
    var max: Double
    
    def randInt(from: Double, to: Double): Double
  }
  object RandExp_ {
    
    inline def apply(
      defaultRange: typings.drange.mod.^,
      gen: () => String,
      max: Double,
      randInt: (Double, Double) => Double
    ): RandExp_ = {
      val __obj = js.Dynamic.literal(defaultRange = defaultRange.asInstanceOf[js.Any], gen = js.Any.fromFunction0(gen), max = max.asInstanceOf[js.Any], randInt = js.Any.fromFunction2(randInt))
      __obj.asInstanceOf[RandExp_]
    }
    
    extension [Self <: RandExp_](x: Self) {
      
      inline def setDefaultRange(value: typings.drange.mod.^): Self = StObject.set(x, "defaultRange", value.asInstanceOf[js.Any])
      
      inline def setGen(value: () => String): Self = StObject.set(x, "gen", js.Any.fromFunction0(value))
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setRandInt(value: (Double, Double) => Double): Self = StObject.set(x, "randInt", js.Any.fromFunction2(value))
    }
  }
}
