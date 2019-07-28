package typings.reactDashNativeDashFs

import typings.reactDashNativeDashFs.reactDashNativeDashFsMod.Encoding
import typings.reactDashNativeDashFs.reactDashNativeDashFsMod.HashAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reactDashNativeDashFsStrings {
  @js.native
  sealed trait ascii extends Encoding
  
  @js.native
  sealed trait base64 extends Encoding
  
  @js.native
  sealed trait md5 extends HashAlgorithm
  
  @js.native
  sealed trait sha1 extends HashAlgorithm
  
  @js.native
  sealed trait sha224 extends HashAlgorithm
  
  @js.native
  sealed trait sha256 extends HashAlgorithm
  
  @js.native
  sealed trait sha384 extends HashAlgorithm
  
  @js.native
  sealed trait sha512 extends HashAlgorithm
  
  @js.native
  sealed trait utf8 extends Encoding
  
  @scala.inline
  def ascii: ascii = "ascii".asInstanceOf[ascii]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def md5: md5 = "md5".asInstanceOf[md5]
  @scala.inline
  def sha1: sha1 = "sha1".asInstanceOf[sha1]
  @scala.inline
  def sha224: sha224 = "sha224".asInstanceOf[sha224]
  @scala.inline
  def sha256: sha256 = "sha256".asInstanceOf[sha256]
  @scala.inline
  def sha384: sha384 = "sha384".asInstanceOf[sha384]
  @scala.inline
  def sha512: sha512 = "sha512".asInstanceOf[sha512]
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

