package typings.pvtsutils

import typings.pvtsutils.convertMod._BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object pvtsutilsStrings {
  @js.native
  sealed trait base64 extends _BufferEncoding
  
  @js.native
  sealed trait base64url extends _BufferEncoding
  
  @js.native
  sealed trait binary extends _BufferEncoding
  
  @js.native
  sealed trait hex extends _BufferEncoding
  
  @js.native
  sealed trait utf8 extends _BufferEncoding
  
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def base64url: base64url = "base64url".asInstanceOf[base64url]
  @scala.inline
  def binary: binary = "binary".asInstanceOf[binary]
  @scala.inline
  def hex: hex = "hex".asInstanceOf[hex]
  @scala.inline
  def utf8: utf8 = "utf8".asInstanceOf[utf8]
}

