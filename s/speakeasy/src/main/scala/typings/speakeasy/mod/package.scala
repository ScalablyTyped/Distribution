package typings.speakeasy.mod

import typings.node.bufferMod.global.Buffer
import typings.speakeasy.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def counter: Hotp_ = ^.asInstanceOf[js.Dynamic].selectDynamic("counter").asInstanceOf[Hotp_]

inline def digest(options: DigestOptions): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("digest")(options.asInstanceOf[js.Any]).asInstanceOf[Buffer]

inline def generateKey(): GeneratedSecret = ^.asInstanceOf[js.Dynamic].applyDynamic("generate_key")().asInstanceOf[GeneratedSecret]
inline def generateKey(options: GenerateSecretOptions): GeneratedSecret = ^.asInstanceOf[js.Dynamic].applyDynamic("generate_key")(options.asInstanceOf[js.Any]).asInstanceOf[GeneratedSecret]
inline def generateKey(options: GenerateSecretWithOtpAuthUrlOptions): GeneratedSecretWithOtpAuthUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("generate_key")(options.asInstanceOf[js.Any]).asInstanceOf[GeneratedSecretWithOtpAuthUrl]

inline def generateKeyAscii: js.Function2[/* length */ js.UndefOr[Double], /* symbols */ js.UndefOr[Boolean], String] = ^.asInstanceOf[js.Dynamic].selectDynamic("generate_key_ascii").asInstanceOf[js.Function2[/* length */ js.UndefOr[Double], /* symbols */ js.UndefOr[Boolean], String]]

inline def generateSecret(): GeneratedSecret = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")().asInstanceOf[GeneratedSecret]
inline def generateSecret(options: GenerateSecretOptions): GeneratedSecret = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(options.asInstanceOf[js.Any]).asInstanceOf[GeneratedSecret]
inline def generateSecret(options: GenerateSecretWithOtpAuthUrlOptions): GeneratedSecretWithOtpAuthUrl = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(options.asInstanceOf[js.Any]).asInstanceOf[GeneratedSecretWithOtpAuthUrl]

inline def generateSecretASCII(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSecretASCII")().asInstanceOf[String]
inline def generateSecretASCII(length: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSecretASCII")(length.asInstanceOf[js.Any]).asInstanceOf[String]
inline def generateSecretASCII(length: Double, symbols: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSecretASCII")(length.asInstanceOf[js.Any], symbols.asInstanceOf[js.Any])).asInstanceOf[String]
inline def generateSecretASCII(length: Unit, symbols: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateSecretASCII")(length.asInstanceOf[js.Any], symbols.asInstanceOf[js.Any])).asInstanceOf[String]

inline def hotp: Hotp_ = ^.asInstanceOf[js.Dynamic].selectDynamic("hotp").asInstanceOf[Hotp_]

inline def otpauthURL(options: OtpauthURLOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("otpauthURL")(options.asInstanceOf[js.Any]).asInstanceOf[String]

inline def time: Totp_ = ^.asInstanceOf[js.Dynamic].selectDynamic("time").asInstanceOf[Totp_]

inline def totp: Totp_ = ^.asInstanceOf[js.Dynamic].selectDynamic("totp").asInstanceOf[Totp_]
