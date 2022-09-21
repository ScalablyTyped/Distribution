package typings.reactNativeUuid

import typings.reactNativeUuid.anon.Clockseq
import typings.reactNativeUuid.anon.Random
import typings.reactNativeUuid.v35Mod.GenerateUUID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-uuid", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-uuid", "default.DNS")
    @js.native
    def DNS: String = js.native
    inline def DNS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DNS")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-uuid", "default.NIL")
    @js.native
    def NIL: String = js.native
    inline def NIL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NIL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-uuid", "default.OID")
    @js.native
    def OID: String = js.native
    inline def OID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OID")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-uuid", "default.URL")
    @js.native
    def URL: String = js.native
    inline def URL_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("URL")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-uuid", "default.X500")
    @js.native
    def X500: String = js.native
    inline def X500_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("X500")(x.asInstanceOf[js.Any])
    
    inline def parse(s: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    inline def parse(s: String, buf: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def parse(s: String, buf: js.Array[Double], offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    inline def parse(s: String, buf: Unit, offset: Double): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(s.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
    
    inline def unparse(buf: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(buf.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def unparse(buf: js.Array[Double], offset: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("unparse")(buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def v1(): String | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")().asInstanceOf[String | js.typedarray.Uint8Array]
    inline def v1(options: Unit, buf: js.typedarray.Uint8Array): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
    inline def v1(options: Unit, buf: js.typedarray.Uint8Array, offset: Double): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
    inline def v1(options: Unit, buf: Unit, offset: Double): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
    inline def v1(options: Clockseq): String | js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any]).asInstanceOf[String | js.typedarray.Uint8Array]
    inline def v1(options: Clockseq, buf: js.typedarray.Uint8Array): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
    inline def v1(options: Clockseq, buf: js.typedarray.Uint8Array, offset: Double): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
    inline def v1(options: Clockseq, buf: Unit, offset: Double): String | js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("v1")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.typedarray.Uint8Array]
    
    inline def v4(): String | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")().asInstanceOf[String | js.Array[Double]]
    inline def v4(options: String): String | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[Double]]
    inline def v4(options: String, buf: js.Array[Double]): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v4(options: String, buf: js.Array[Double], offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v4(options: String, buf: Unit, offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v4(options: Unit, buf: js.Array[Double]): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v4(options: Unit, buf: js.Array[Double], offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v4(options: Unit, buf: Unit, offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v4(options: Random): String | js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any]).asInstanceOf[String | js.Array[Double]]
    inline def v4(options: Random, buf: js.Array[Double]): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v4(options: Random, buf: js.Array[Double], offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v4(options: Random, buf: Unit, offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v4")(options.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    
    @JSImport("react-native-uuid", "default.v5")
    @js.native
    def v5: GenerateUUID = js.native
    inline def v5(value: String, namespace: String): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5(value: String, namespace: String, buf: js.Array[Double]): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5(value: String, namespace: String, buf: js.Array[Double], offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5(value: String, namespace: String, buf: Unit, offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5(value: String, namespace: js.Array[Double]): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5(value: String, namespace: js.Array[Double], buf: js.Array[Double]): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5(value: String, namespace: js.Array[Double], buf: js.Array[Double], offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5(value: String, namespace: js.Array[Double], buf: Unit, offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5(value: js.typedarray.Uint8Array, namespace: String): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5(value: js.typedarray.Uint8Array, namespace: String, buf: js.Array[Double]): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5(value: js.typedarray.Uint8Array, namespace: String, buf: js.Array[Double], offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5(value: js.typedarray.Uint8Array, namespace: String, buf: Unit, offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5(value: js.typedarray.Uint8Array, namespace: js.Array[Double]): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5(value: js.typedarray.Uint8Array, namespace: js.Array[Double], buf: js.Array[Double]): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], buf.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5(
      value: js.typedarray.Uint8Array,
      namespace: js.Array[Double],
      buf: js.Array[Double],
      offset: Double
    ): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5(value: js.typedarray.Uint8Array, namespace: js.Array[Double], buf: Unit, offset: Double): String | js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("v5")(value.asInstanceOf[js.Any], namespace.asInstanceOf[js.Any], buf.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[String | js.Array[Double]]
    inline def v5_=(x: GenerateUUID): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("v5")(x.asInstanceOf[js.Any])
    
    inline def validate(uuid: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(uuid.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def version(uuid: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("version")(uuid.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
}
