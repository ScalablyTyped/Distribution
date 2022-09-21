package typings.reactNativeUuid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object v4Mod {
  
  @JSImport("react-native-uuid/dist/v4", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def v4(): String | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")().asInstanceOf[String | js.Array[Double]]
  inline def v4(options: String): String | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[Double]]
  inline def v4(options: String, buf: js.Array[Double]): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
  inline def v4(options: String, buf: js.Array[Double], offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
  inline def v4(options: String, buf: Unit, offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
  inline def v4(options: Unit, buf: js.Array[Double]): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
  inline def v4(options: Unit, buf: js.Array[Double], offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
  inline def v4(options: Unit, buf: Unit, offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
  inline def v4(options: V4Options): String | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[Double]]
  inline def v4(options: V4Options, buf: js.Array[Double]): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
  inline def v4(options: V4Options, buf: js.Array[Double], offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
  inline def v4(options: V4Options, buf: Unit, offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
  
  trait V4Options extends StObject {
    
    var random: js.Array[Double]
    
    var rng: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
  }
  object V4Options {
    
    inline def apply(random: js.Array[Double]): V4Options = {
      val __obj = js.Dynamic.literal(random = random.asInstanceOf[js.Any])
      __obj.asInstanceOf[V4Options]
    }
    
    extension [Self <: V4Options](x: Self) {
      
      inline def setRandom(value: js.Array[Double]): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      inline def setRandomVarargs(value: Double*): Self = StObject.set(x, "random", js.Array(value*))
      
      inline def setRng(value: () => js.Array[Double]): Self = StObject.set(x, "rng", js.Any.fromFunction0(value))
      
      inline def setRngUndefined: Self = StObject.set(x, "rng", js.undefined)
    }
  }
}
