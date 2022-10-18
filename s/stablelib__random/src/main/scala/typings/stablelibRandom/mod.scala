package typings.stablelibRandom

import typings.stablelibRandom.libSourceMod.RandomSource
import typings.stablelibRandom.libSourceSystemMod.SystemRandomSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stablelib/random", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stablelib/random", "defaultRandomSource")
  @js.native
  val defaultRandomSource: SystemRandomSource = js.native
  
  inline def randomBytes(length: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(length.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  inline def randomBytes(length: Double, prng: RandomSource): js.typedarray.Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("randomBytes")(length.asInstanceOf[js.Any], prng.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def randomString(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(length.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def randomString(length: Double, charset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(length.asInstanceOf[js.Any], charset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def randomString(length: Double, charset: String, prng: RandomSource): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(length.asInstanceOf[js.Any], charset.asInstanceOf[js.Any], prng.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def randomString(length: Double, charset: Unit, prng: RandomSource): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randomString")(length.asInstanceOf[js.Any], charset.asInstanceOf[js.Any], prng.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def randomStringForEntropy(bits: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("randomStringForEntropy")(bits.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def randomStringForEntropy(bits: Double, charset: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randomStringForEntropy")(bits.asInstanceOf[js.Any], charset.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def randomStringForEntropy(bits: Double, charset: String, prng: RandomSource): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randomStringForEntropy")(bits.asInstanceOf[js.Any], charset.asInstanceOf[js.Any], prng.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def randomStringForEntropy(bits: Double, charset: Unit, prng: RandomSource): String = (^.asInstanceOf[js.Dynamic].applyDynamic("randomStringForEntropy")(bits.asInstanceOf[js.Any], charset.asInstanceOf[js.Any], prng.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def randomUint32(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUint32")().asInstanceOf[Double]
  inline def randomUint32(prng: RandomSource): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("randomUint32")(prng.asInstanceOf[js.Any]).asInstanceOf[Double]
}
