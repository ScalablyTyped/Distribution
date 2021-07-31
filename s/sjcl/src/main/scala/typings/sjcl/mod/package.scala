package typings.sjcl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


@scala.inline
def arrayBuffer: typings.sjcl.mod.SjclArrayBufferModes = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("arrayBuffer").asInstanceOf[typings.sjcl.mod.SjclArrayBufferModes]
@scala.inline
def arrayBuffer_=(x: typings.sjcl.mod.SjclArrayBufferModes): scala.Unit = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("arrayBuffer")(x.asInstanceOf[js.Any])

@scala.inline
def bitArray: typings.sjcl.mod.BitArrayStatic = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("bitArray").asInstanceOf[typings.sjcl.mod.BitArrayStatic]
@scala.inline
def bitArray_=(x: typings.sjcl.mod.BitArrayStatic): scala.Unit = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("bitArray")(x.asInstanceOf[js.Any])

@scala.inline
def bn_=(x: typings.sjcl.mod.BigNumberStatic): scala.Unit = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("bn")(x.asInstanceOf[js.Any])

@scala.inline
def codec: typings.sjcl.mod.SjclCodecs = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("codec").asInstanceOf[typings.sjcl.mod.SjclCodecs]
@scala.inline
def codec_=(x: typings.sjcl.mod.SjclCodecs): scala.Unit = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("codec")(x.asInstanceOf[js.Any])

@scala.inline
def decrypt: typings.sjcl.mod.SjclConvenienceDecryptor = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("decrypt").asInstanceOf[typings.sjcl.mod.SjclConvenienceDecryptor]
@scala.inline
def decrypt_=(x: typings.sjcl.mod.SjclConvenienceDecryptor): scala.Unit = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("decrypt")(x.asInstanceOf[js.Any])

@scala.inline
def encrypt: typings.sjcl.mod.SjclConvenienceEncryptor = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("encrypt").asInstanceOf[typings.sjcl.mod.SjclConvenienceEncryptor]
@scala.inline
def encrypt_=(x: typings.sjcl.mod.SjclConvenienceEncryptor): scala.Unit = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("encrypt")(x.asInstanceOf[js.Any])

@scala.inline
def json: typings.sjcl.mod.SjclJson = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("json").asInstanceOf[typings.sjcl.mod.SjclJson]
@scala.inline
def json_=(x: typings.sjcl.mod.SjclJson): scala.Unit = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("json")(x.asInstanceOf[js.Any])

@scala.inline
def keyexchange: typings.sjcl.mod.SjclKeyExchange = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("keyexchange").asInstanceOf[typings.sjcl.mod.SjclKeyExchange]
@scala.inline
def keyexchange_=(x: typings.sjcl.mod.SjclKeyExchange): scala.Unit = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("keyexchange")(x.asInstanceOf[js.Any])

@scala.inline
def mode: typings.sjcl.mod.SjclModes = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("mode").asInstanceOf[typings.sjcl.mod.SjclModes]
@scala.inline
def mode_=(x: typings.sjcl.mod.SjclModes): scala.Unit = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])

@scala.inline
def prng_=(x: typings.sjcl.mod.SjclRandomStatic): scala.Unit = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("prng")(x.asInstanceOf[js.Any])

@scala.inline
def random: typings.sjcl.mod.SjclRandom = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].selectDynamic("random").asInstanceOf[typings.sjcl.mod.SjclRandom]
@scala.inline
def random_=(x: typings.sjcl.mod.SjclRandom): scala.Unit = typings.sjcl.mod.^.asInstanceOf[js.Dynamic].updateDynamic("random")(x.asInstanceOf[js.Any])

// ________________________________________________________________________
type BitArray_ = js.Array[scala.Double]

type SjclConvenienceDecryptor = js.Function4[
/* password */ typings.sjcl.mod.SjclElGamalSecretKey | typings.sjcl.mod.BitArray_ | java.lang.String, 
/* ciphertext */ typings.sjcl.mod.SjclCipherEncrypted | java.lang.String, 
/* params */ js.UndefOr[typings.sjcl.mod.SjclCipherDecryptParams], 
/* rp */ js.UndefOr[typings.sjcl.mod.SjclCipherDecrypted], 
java.lang.String]

type SjclConvenienceEncryptor = js.Function4[
/* password */ typings.sjcl.mod.SjclElGamalPublicKey | typings.sjcl.mod.BitArray_ | java.lang.String, 
/* plaintext */ java.lang.String, 
/* params */ js.UndefOr[typings.sjcl.mod.SjclCipherEncryptParams], 
/* rp */ js.UndefOr[typings.sjcl.mod.SjclCipherEncrypted], 
typings.sjcl.mod.SjclCipherEncrypted]

type SjclKeysGenerator[P /* <: typings.sjcl.mod.SjclECCPublicKey */, S /* <: typings.sjcl.mod.SjclECCSecretKey */] = js.Function3[
/* curve */ typings.sjcl.mod.SjclEllipticalCurve | scala.Double, 
/* paranoia */ scala.Double, 
/* sec */ js.UndefOr[typings.sjcl.mod.BigNumber], 
typings.sjcl.mod.SjclKeyPair[P, S]]
