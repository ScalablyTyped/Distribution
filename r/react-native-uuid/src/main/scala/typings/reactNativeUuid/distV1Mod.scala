package typings.reactNativeUuid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distV1Mod {
  
  @JSImport("react-native-uuid/dist/v1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def v1(): String | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")().asInstanceOf[String | js.typedarray.Uint8Array]
  inline def v1(options: Unit, buf: js.typedarray.Uint8Array): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
  inline def v1(options: Unit, buf: js.typedarray.Uint8Array, offset: Double): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
  inline def v1(options: Unit, buf: Unit, offset: Double): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
  inline def v1(options: V1Options): String | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.Uint8Array]
  inline def v1(options: V1Options, buf: js.typedarray.Uint8Array): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
  inline def v1(options: V1Options, buf: js.typedarray.Uint8Array, offset: Double): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
  inline def v1(options: V1Options, buf: Unit, offset: Double): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
  
  trait V1Options extends StObject {
    
    var clockseq: Double
    
    var msecs: Double
    
    var node: js.Array[Double]
    
    var nsecs: Double
    
    var random: js.Array[Double]
    
    def rng(): js.Array[Double]
  }
  object V1Options {
    
    inline def apply(
      clockseq: Double,
      msecs: Double,
      node: js.Array[Double],
      nsecs: Double,
      random: js.Array[Double],
      rng: () => js.Array[Double]
    ): V1Options = {
      val __obj = js.Dynamic.literal(clockseq = clockseq.asInstanceOf[js.Any], msecs = msecs.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nsecs = nsecs.asInstanceOf[js.Any], random = random.asInstanceOf[js.Any], rng = js.Any.fromFunction0(rng))
      __obj.asInstanceOf[V1Options]
    }
    
    extension [Self <: V1Options](x: Self) {
      
      inline def setClockseq(value: Double): Self = StObject.set(x, "clockseq", value.asInstanceOf[js.Any])
      
      inline def setMsecs(value: Double): Self = StObject.set(x, "msecs", value.asInstanceOf[js.Any])
      
      inline def setNode(value: js.Array[Double]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeVarargs(value: Double*): Self = StObject.set(x, "node", js.Array(value*))
      
      inline def setNsecs(value: Double): Self = StObject.set(x, "nsecs", value.asInstanceOf[js.Any])
      
      inline def setRandom(value: js.Array[Double]): Self = StObject.set(x, "random", value.asInstanceOf[js.Any])
      
      inline def setRandomVarargs(value: Double*): Self = StObject.set(x, "random", js.Array(value*))
      
      inline def setRng(value: () => js.Array[Double]): Self = StObject.set(x, "rng", js.Any.fromFunction0(value))
    }
  }
}
