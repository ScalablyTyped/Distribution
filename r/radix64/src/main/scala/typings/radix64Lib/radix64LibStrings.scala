package typings
package radix64Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object radix64LibStrings {
  @js.native
  sealed trait base64 extends MethodsString
  
  @js.native
  sealed trait base64URL extends MethodsString
  
  @js.native
  sealed trait base64URLASCIISort extends MethodsString
  
  @js.native
  sealed trait base64URLNaturalSort extends MethodsString
  
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def base64URL: base64URL = "base64URL".asInstanceOf[base64URL]
  @scala.inline
  def base64URLASCIISort: base64URLASCIISort = "base64URLASCIISort".asInstanceOf[base64URLASCIISort]
  @scala.inline
  def base64URLNaturalSort: base64URLNaturalSort = "base64URLNaturalSort".asInstanceOf[base64URLNaturalSort]
}

