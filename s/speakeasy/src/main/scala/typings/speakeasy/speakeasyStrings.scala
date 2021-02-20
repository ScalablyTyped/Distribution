package typings.speakeasy

import typings.speakeasy.mod.Algorithm
import typings.speakeasy.mod.Encoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object speakeasyStrings {
  
  @js.native
  sealed trait ascii extends Encoding
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  
  @js.native
  sealed trait base32 extends Encoding
  @scala.inline
  def base32: base32 = "base32".asInstanceOf[base32]
  
  @js.native
  sealed trait base64 extends Encoding
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait hex extends Encoding
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  
  @js.native
  sealed trait htop extends StObject
  @scala.inline
  def htop: htop = "htop".asInstanceOf[htop]
  
  @js.native
  sealed trait sha1 extends Algorithm
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  
  @js.native
  sealed trait sha256 extends Algorithm
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  
  @js.native
  sealed trait sha512 extends Algorithm
  @scala.inline
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
  
  @js.native
  sealed trait totp extends StObject
  @scala.inline
  def totp: totp = "totp".asInstanceOf[totp]
}
