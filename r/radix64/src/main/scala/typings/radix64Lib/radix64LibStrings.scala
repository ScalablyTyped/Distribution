package typings
package radix64Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object radix64LibStrings {
  @js.native
  sealed trait base64 extends js.Object
  
  @js.native
  sealed trait base64URL extends js.Object
  
  @js.native
  sealed trait base64URLASCIISort extends js.Object
  
  @js.native
  sealed trait base64URLNaturalSort extends js.Object
  
  def base64: base64 = "base64".asInstanceOf[base64]
  def base64URL: base64URL = "base64URL".asInstanceOf[base64URL]
  def base64URLASCIISort: base64URLASCIISort = "base64URLASCIISort".asInstanceOf[base64URLASCIISort]
  def base64URLNaturalSort: base64URLNaturalSort = "base64URLNaturalSort".asInstanceOf[base64URLNaturalSort]
}

