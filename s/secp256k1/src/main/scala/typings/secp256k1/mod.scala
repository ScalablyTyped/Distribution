package typings.secp256k1

import typings.secp256k1.anon.Recid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("secp256k1", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def contextRandomize(seed: js.typedarray.Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("contextRandomize")(seed.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def ecdh(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdh")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdh(
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    opt: Unit,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdh")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdh(
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    opt: Unit,
    output: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdh")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdh(publicKey: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array, opt: ecdhOptions): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdh")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdh(
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    opt: ecdhOptions,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdh")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdh(
    publicKey: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    opt: ecdhOptions,
    output: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdh")(publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], opt.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def ecdsaRecover(signature: js.typedarray.Uint8Array, recid: Double, message: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaRecover")(signature.asInstanceOf[js.Any], recid.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdsaRecover(
    signature: js.typedarray.Uint8Array,
    recid: Double,
    message: js.typedarray.Uint8Array,
    compressed: Boolean
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaRecover")(signature.asInstanceOf[js.Any], recid.asInstanceOf[js.Any], message.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdsaRecover(
    signature: js.typedarray.Uint8Array,
    recid: Double,
    message: js.typedarray.Uint8Array,
    compressed: Boolean,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaRecover")(signature.asInstanceOf[js.Any], recid.asInstanceOf[js.Any], message.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdsaRecover(
    signature: js.typedarray.Uint8Array,
    recid: Double,
    message: js.typedarray.Uint8Array,
    compressed: Boolean,
    output: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaRecover")(signature.asInstanceOf[js.Any], recid.asInstanceOf[js.Any], message.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdsaRecover(
    signature: js.typedarray.Uint8Array,
    recid: Double,
    message: js.typedarray.Uint8Array,
    compressed: Unit,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaRecover")(signature.asInstanceOf[js.Any], recid.asInstanceOf[js.Any], message.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def ecdsaRecover(
    signature: js.typedarray.Uint8Array,
    recid: Double,
    message: js.typedarray.Uint8Array,
    compressed: Unit,
    output: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaRecover")(signature.asInstanceOf[js.Any], recid.asInstanceOf[js.Any], message.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def ecdsaSign(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array): Recid = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaSign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any])).asInstanceOf[Recid]
  inline def ecdsaSign(
    message: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    options: Unit,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): Recid = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaSign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Recid]
  inline def ecdsaSign(
    message: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    options: Unit,
    output: js.typedarray.Uint8Array
  ): Recid = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaSign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Recid]
  inline def ecdsaSign(message: js.typedarray.Uint8Array, privateKey: js.typedarray.Uint8Array, options: SignOptions): Recid = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaSign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Recid]
  inline def ecdsaSign(
    message: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    options: SignOptions,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): Recid = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaSign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Recid]
  inline def ecdsaSign(
    message: js.typedarray.Uint8Array,
    privateKey: js.typedarray.Uint8Array,
    options: SignOptions,
    output: js.typedarray.Uint8Array
  ): Recid = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaSign")(message.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], options.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[Recid]
  
  inline def ecdsaVerify(
    signature: js.typedarray.Uint8Array,
    message: js.typedarray.Uint8Array,
    publicKey: js.typedarray.Uint8Array
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("ecdsaVerify")(signature.asInstanceOf[js.Any], message.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def privateKeyExport(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyExport")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def privateKeyExport(privateKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyExport")(privateKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def privateKeyImport(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyImport")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def privateKeyModInverse(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyModInverse")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def privateKeyNegate(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyNegate")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def privateKeyTweakAdd(privateKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyTweakAdd")(privateKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def privateKeyTweakMul(privateKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyTweakMul")(privateKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def privateKeyVerify(privateKey: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("privateKeyVerify")(privateKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def publicKeyCombine(publicKeys: js.Array[js.typedarray.Uint8Array]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCombine")(publicKeys.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCombine(publicKeys: js.Array[js.typedarray.Uint8Array], compressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCombine")(publicKeys.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCombine(
    publicKeys: js.Array[js.typedarray.Uint8Array],
    compressed: Boolean,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCombine")(publicKeys.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCombine(
    publicKeys: js.Array[js.typedarray.Uint8Array],
    compressed: Boolean,
    output: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCombine")(publicKeys.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCombine(
    publicKeys: js.Array[js.typedarray.Uint8Array],
    compressed: Unit,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCombine")(publicKeys.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCombine(publicKeys: js.Array[js.typedarray.Uint8Array], compressed: Unit, output: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCombine")(publicKeys.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def publicKeyConvert(publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyConvert")(publicKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyConvert(publicKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyConvert")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyConvert(
    publicKey: js.typedarray.Uint8Array,
    compressed: Boolean,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyConvert")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyConvert(publicKey: js.typedarray.Uint8Array, compressed: Boolean, output: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyConvert")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyConvert(
    publicKey: js.typedarray.Uint8Array,
    compressed: Unit,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyConvert")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyConvert(publicKey: js.typedarray.Uint8Array, compressed: Unit, output: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyConvert")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def publicKeyCreate(privateKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCreate")(privateKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCreate(privateKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCreate")(privateKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCreate(
    privateKey: js.typedarray.Uint8Array,
    compressed: Boolean,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCreate")(privateKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCreate(privateKey: js.typedarray.Uint8Array, compressed: Boolean, output: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCreate")(privateKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCreate(
    privateKey: js.typedarray.Uint8Array,
    compressed: Unit,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCreate")(privateKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyCreate(privateKey: js.typedarray.Uint8Array, compressed: Unit, output: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyCreate")(privateKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def publicKeyNegate(publicKey: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyNegate")(publicKey.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyNegate(publicKey: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyNegate")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyNegate(
    publicKey: js.typedarray.Uint8Array,
    compressed: Boolean,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyNegate")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyNegate(publicKey: js.typedarray.Uint8Array, compressed: Boolean, output: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyNegate")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyNegate(
    publicKey: js.typedarray.Uint8Array,
    compressed: Unit,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyNegate")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyNegate(publicKey: js.typedarray.Uint8Array, compressed: Unit, output: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyNegate")(publicKey.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def publicKeyTweakAdd(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakAdd")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakAdd(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakAdd")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakAdd(
    publicKey: js.typedarray.Uint8Array,
    tweak: js.typedarray.Uint8Array,
    compressed: Boolean,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakAdd")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakAdd(
    publicKey: js.typedarray.Uint8Array,
    tweak: js.typedarray.Uint8Array,
    compressed: Boolean,
    output: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakAdd")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakAdd(
    publicKey: js.typedarray.Uint8Array,
    tweak: js.typedarray.Uint8Array,
    compressed: Unit,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakAdd")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakAdd(
    publicKey: js.typedarray.Uint8Array,
    tweak: js.typedarray.Uint8Array,
    compressed: Unit,
    output: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakAdd")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def publicKeyTweakMul(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakMul")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakMul(publicKey: js.typedarray.Uint8Array, tweak: js.typedarray.Uint8Array, compressed: Boolean): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakMul")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakMul(
    publicKey: js.typedarray.Uint8Array,
    tweak: js.typedarray.Uint8Array,
    compressed: Boolean,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakMul")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakMul(
    publicKey: js.typedarray.Uint8Array,
    tweak: js.typedarray.Uint8Array,
    compressed: Boolean,
    output: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakMul")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakMul(
    publicKey: js.typedarray.Uint8Array,
    tweak: js.typedarray.Uint8Array,
    compressed: Unit,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakMul")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def publicKeyTweakMul(
    publicKey: js.typedarray.Uint8Array,
    tweak: js.typedarray.Uint8Array,
    compressed: Unit,
    output: js.typedarray.Uint8Array
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyTweakMul")(publicKey.asInstanceOf[js.Any], tweak.asInstanceOf[js.Any], compressed.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def publicKeyVerify(publicKey: js.typedarray.Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("publicKeyVerify")(publicKey.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def signatureExport(signature: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureExport")(signature.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def signatureExport(
    signature: js.typedarray.Uint8Array,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("signatureExport")(signature.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def signatureExport(signature: js.typedarray.Uint8Array, output: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("signatureExport")(signature.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def signatureImport(signature: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureImport")(signature.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def signatureImport(
    signature: js.typedarray.Uint8Array,
    output: js.Function1[/* len */ Double, js.typedarray.Uint8Array]
  ): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("signatureImport")(signature.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  inline def signatureImport(signature: js.typedarray.Uint8Array, output: js.typedarray.Uint8Array): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("signatureImport")(signature.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def signatureNormalize(signature: js.typedarray.Uint8Array): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("signatureNormalize")(signature.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  trait SignOptions extends StObject {
    
    /**
      * Additional data for noncefn (RFC 6979 3.6) (32 bytes).
      *
      * By default is `null`.
      */
    var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    /** Nonce generator. By default it is rfc6979 */
    var noncefn: js.UndefOr[
        js.Function5[
          /* message */ js.typedarray.Uint8Array, 
          /* privateKey */ js.typedarray.Uint8Array, 
          /* algo */ js.typedarray.Uint8Array | Null, 
          /* data */ js.typedarray.Uint8Array | Null, 
          /* attempt */ Double, 
          js.typedarray.Uint8Array
        ]
      ] = js.undefined
  }
  object SignOptions {
    
    inline def apply(): SignOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignOptions]
    }
    
    extension [Self <: SignOptions](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setNoncefn(
        value: (/* message */ js.typedarray.Uint8Array, /* privateKey */ js.typedarray.Uint8Array, /* algo */ js.typedarray.Uint8Array | Null, /* data */ js.typedarray.Uint8Array | Null, /* attempt */ Double) => js.typedarray.Uint8Array
      ): Self = StObject.set(x, "noncefn", js.Any.fromFunction5(value))
      
      inline def setNoncefnUndefined: Self = StObject.set(x, "noncefn", js.undefined)
    }
  }
  
  trait ecdhOptions extends StObject {
    
    var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var hashfn: js.UndefOr[
        js.Function3[
          /* x */ js.typedarray.Uint8Array, 
          /* y */ js.typedarray.Uint8Array, 
          /* data */ js.typedarray.Uint8Array, 
          js.typedarray.Uint8Array
        ]
      ] = js.undefined
    
    var xbuf: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var ybuf: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object ecdhOptions {
    
    inline def apply(): ecdhOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ecdhOptions]
    }
    
    extension [Self <: ecdhOptions](x: Self) {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHashfn(
        value: (/* x */ js.typedarray.Uint8Array, /* y */ js.typedarray.Uint8Array, /* data */ js.typedarray.Uint8Array) => js.typedarray.Uint8Array
      ): Self = StObject.set(x, "hashfn", js.Any.fromFunction3(value))
      
      inline def setHashfnUndefined: Self = StObject.set(x, "hashfn", js.undefined)
      
      inline def setXbuf(value: js.typedarray.Uint8Array): Self = StObject.set(x, "xbuf", value.asInstanceOf[js.Any])
      
      inline def setXbufUndefined: Self = StObject.set(x, "xbuf", js.undefined)
      
      inline def setYbuf(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ybuf", value.asInstanceOf[js.Any])
      
      inline def setYbufUndefined: Self = StObject.set(x, "ybuf", js.undefined)
    }
  }
}
