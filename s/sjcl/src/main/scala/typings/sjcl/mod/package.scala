package typings.sjcl.mod

import typings.sjcl.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def arrayBuffer: SjclArrayBufferModes = ^.asInstanceOf[js.Dynamic].selectDynamic("arrayBuffer").asInstanceOf[SjclArrayBufferModes]
inline def arrayBuffer_=(x: SjclArrayBufferModes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("arrayBuffer")(x.asInstanceOf[js.Any])

inline def bitArray: BitArrayStatic = ^.asInstanceOf[js.Dynamic].selectDynamic("bitArray").asInstanceOf[BitArrayStatic]
inline def bitArray_=(x: BitArrayStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bitArray")(x.asInstanceOf[js.Any])

inline def bn_=(x: BigNumberStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bn")(x.asInstanceOf[js.Any])

inline def codec: SjclCodecs = ^.asInstanceOf[js.Dynamic].selectDynamic("codec").asInstanceOf[SjclCodecs]
inline def codec_=(x: SjclCodecs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("codec")(x.asInstanceOf[js.Any])

inline def decrypt: SjclConvenienceDecryptor = ^.asInstanceOf[js.Dynamic].selectDynamic("decrypt").asInstanceOf[SjclConvenienceDecryptor]
inline def decrypt_=(x: SjclConvenienceDecryptor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decrypt")(x.asInstanceOf[js.Any])

inline def encrypt: SjclConvenienceEncryptor = ^.asInstanceOf[js.Dynamic].selectDynamic("encrypt").asInstanceOf[SjclConvenienceEncryptor]
inline def encrypt_=(x: SjclConvenienceEncryptor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(x.asInstanceOf[js.Any])

inline def json: SjclJson = ^.asInstanceOf[js.Dynamic].selectDynamic("json").asInstanceOf[SjclJson]
inline def json_=(x: SjclJson): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])

inline def keyexchange: SjclKeyExchange = ^.asInstanceOf[js.Dynamic].selectDynamic("keyexchange").asInstanceOf[SjclKeyExchange]
inline def keyexchange_=(x: SjclKeyExchange): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyexchange")(x.asInstanceOf[js.Any])

inline def mode: SjclModes = ^.asInstanceOf[js.Dynamic].selectDynamic("mode").asInstanceOf[SjclModes]
inline def mode_=(x: SjclModes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])

inline def prng_=(x: SjclRandomStatic): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prng")(x.asInstanceOf[js.Any])

inline def random: SjclRandom = ^.asInstanceOf[js.Dynamic].selectDynamic("random").asInstanceOf[SjclRandom]
inline def random_=(x: SjclRandom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("random")(x.asInstanceOf[js.Any])

// ________________________________________________________________________
type BitArray_ = js.Array[Double]

type SjclConvenienceDecryptor = js.Function4[
/* password */ SjclElGamalSecretKey | BitArray_ | String, 
/* ciphertext */ SjclCipherEncrypted | String, 
/* params */ js.UndefOr[SjclCipherDecryptParams], 
/* rp */ js.UndefOr[SjclCipherDecrypted], 
String]

type SjclConvenienceEncryptor = js.Function4[
/* password */ SjclElGamalPublicKey | BitArray_ | String, 
/* plaintext */ String, 
/* params */ js.UndefOr[SjclCipherEncryptParams], 
/* rp */ js.UndefOr[SjclCipherEncrypted], 
SjclCipherEncrypted]

type SjclKeysGenerator[P /* <: SjclECCPublicKey */, S /* <: SjclECCSecretKey */] = js.Function3[
/* curve */ SjclEllipticalCurve | Double, 
/* paranoia */ Double, 
/* sec */ js.UndefOr[BigNumber], 
SjclKeyPair[P, S]]
