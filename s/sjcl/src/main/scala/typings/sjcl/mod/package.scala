package typings.sjcl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // ________________________________________________________________________
  type BitArray_ = js.Array[scala.Double]
  
  type SjclConvenienceDecryptor = js.Function4[
    /* password */ typings.sjcl.mod.SjclElGamalSecretKey | typings.sjcl.mod.BitArray_ | java.lang.String, 
    /* ciphertext */ typings.sjcl.mod.SjclCipherEncrypted | java.lang.String, 
    /* params */ js.UndefOr[typings.sjcl.mod.SjclCipherDecryptParams], 
    /* rp */ js.UndefOr[typings.sjcl.mod.SjclCipherDecrypted], 
    java.lang.String
  ]
  
  type SjclConvenienceEncryptor = js.Function4[
    /* password */ typings.sjcl.mod.SjclElGamalPublicKey | typings.sjcl.mod.BitArray_ | java.lang.String, 
    /* plaintext */ java.lang.String, 
    /* params */ js.UndefOr[typings.sjcl.mod.SjclCipherEncryptParams], 
    /* rp */ js.UndefOr[typings.sjcl.mod.SjclCipherEncrypted], 
    typings.sjcl.mod.SjclCipherEncrypted
  ]
  
  type SjclKeysGenerator[P /* <: typings.sjcl.mod.SjclECCPublicKey */, S /* <: typings.sjcl.mod.SjclECCSecretKey */] = js.Function3[
    /* curve */ typings.sjcl.mod.SjclEllipticalCurve | scala.Double, 
    /* paranoia */ scala.Double, 
    /* sec */ js.UndefOr[typings.sjcl.mod.BigNumber], 
    typings.sjcl.mod.SjclKeyPair[P, S]
  ]
}
