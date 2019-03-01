package typings
package speakeasyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object speakeasyLibStrings {
  @js.native
  sealed trait ascii
    extends speakeasyLib.speakeasyMod.Encoding
  
  @js.native
  sealed trait base32
    extends speakeasyLib.speakeasyMod.Encoding
  
  @js.native
  sealed trait base64
    extends speakeasyLib.speakeasyMod.Encoding
  
  @js.native
  sealed trait hex
    extends speakeasyLib.speakeasyMod.Encoding
  
  @js.native
  sealed trait htop extends js.Object
  
  @js.native
  sealed trait sha1
    extends speakeasyLib.speakeasyMod.Algorithm
  
  @js.native
  sealed trait sha256
    extends speakeasyLib.speakeasyMod.Algorithm
  
  @js.native
  sealed trait sha512
    extends speakeasyLib.speakeasyMod.Algorithm
  
  @js.native
  sealed trait totp extends js.Object
  
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  @scala.inline
  def base32: base32 = "base32".asInstanceOf[base32]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  @scala.inline
  def htop: htop = "htop".asInstanceOf[htop]
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  @scala.inline
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
  @scala.inline
  def totp: totp = "totp".asInstanceOf[totp]
}

