package typings.speakeasy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  @scala.inline
  def counter: typings.speakeasy.mod.Hotp_ = typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].selectDynamic("counter").asInstanceOf[typings.speakeasy.mod.Hotp_]
  
  @scala.inline
  def digest(options: typings.speakeasy.mod.DigestOptions): typings.node.Buffer = typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("digest")(options.asInstanceOf[js.Any]).asInstanceOf[typings.node.Buffer]
  
  @scala.inline
  def generateKey(): typings.speakeasy.mod.GeneratedSecret = typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate_key")().asInstanceOf[typings.speakeasy.mod.GeneratedSecret]
  @scala.inline
  def generateKey(options: typings.speakeasy.mod.GenerateSecretOptions): typings.speakeasy.mod.GeneratedSecret = typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate_key")(options.asInstanceOf[js.Any]).asInstanceOf[typings.speakeasy.mod.GeneratedSecret]
  @scala.inline
  def generateKey(options: typings.speakeasy.mod.GenerateSecretWithOtpAuthUrlOptions): typings.speakeasy.mod.GeneratedSecretWithOtpAuthUrl = typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generate_key")(options.asInstanceOf[js.Any]).asInstanceOf[typings.speakeasy.mod.GeneratedSecretWithOtpAuthUrl]
  
  @scala.inline
  def generateKeyAscii: js.Function2[
    /* length */ js.UndefOr[scala.Double], 
    /* symbols */ js.UndefOr[scala.Boolean], 
    java.lang.String
  ] = typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].selectDynamic("generate_key_ascii").asInstanceOf[js.Function2[
    /* length */ js.UndefOr[scala.Double], 
    /* symbols */ js.UndefOr[scala.Boolean], 
    java.lang.String
  ]]
  
  @scala.inline
  def generateSecret(): typings.speakeasy.mod.GeneratedSecret = typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")().asInstanceOf[typings.speakeasy.mod.GeneratedSecret]
  @scala.inline
  def generateSecret(options: typings.speakeasy.mod.GenerateSecretOptions): typings.speakeasy.mod.GeneratedSecret = typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(options.asInstanceOf[js.Any]).asInstanceOf[typings.speakeasy.mod.GeneratedSecret]
  @scala.inline
  def generateSecret(options: typings.speakeasy.mod.GenerateSecretWithOtpAuthUrlOptions): typings.speakeasy.mod.GeneratedSecretWithOtpAuthUrl = typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecret")(options.asInstanceOf[js.Any]).asInstanceOf[typings.speakeasy.mod.GeneratedSecretWithOtpAuthUrl]
  
  @scala.inline
  def generateSecretASCII(): java.lang.String = typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecretASCII")().asInstanceOf[java.lang.String]
  @scala.inline
  def generateSecretASCII(length: js.UndefOr[scala.Nothing], symbols: scala.Boolean): java.lang.String = (typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecretASCII")(length.asInstanceOf[js.Any], symbols.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  @scala.inline
  def generateSecretASCII(length: scala.Double): java.lang.String = typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecretASCII")(length.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  @scala.inline
  def generateSecretASCII(length: scala.Double, symbols: scala.Boolean): java.lang.String = (typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("generateSecretASCII")(length.asInstanceOf[js.Any], symbols.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  
  @scala.inline
  def hotp: typings.speakeasy.mod.Hotp_ = typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].selectDynamic("hotp").asInstanceOf[typings.speakeasy.mod.Hotp_]
  
  @scala.inline
  def otpauthURL(options: typings.speakeasy.mod.OtpauthURLOptions): java.lang.String = typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].applyDynamic("otpauthURL")(options.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
  @scala.inline
  def time: typings.speakeasy.mod.Totp_ = typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].selectDynamic("time").asInstanceOf[typings.speakeasy.mod.Totp_]
  
  @scala.inline
  def totp: typings.speakeasy.mod.Totp_ = typings.speakeasy.mod.^.asInstanceOf[js.Dynamic].selectDynamic("totp").asInstanceOf[typings.speakeasy.mod.Totp_]
}
