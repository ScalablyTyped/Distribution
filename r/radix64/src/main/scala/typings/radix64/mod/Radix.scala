package typings.radix64.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Radix extends js.Object {
  
  def ascii64(number: Double): String = js.native
  def ascii64(number: Double, pad: Double): String = js.native
  
  var methods: MethodsEnum = js.native
  
  def radix64(number: Double): String = js.native
  def radix64(number: Double, method: MethodsString): String = js.native
}
