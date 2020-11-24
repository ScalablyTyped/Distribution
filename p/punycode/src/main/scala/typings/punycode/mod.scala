package typings.punycode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("punycode", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def decode(input: String): String = js.native
  
  def encode(input: String): String = js.native
  
  def toASCII(input: String): String = js.native
  
  def toUnicode(input: String): String = js.native
  
  val version: String = js.native
  
  @js.native
  object ucs2 extends js.Object {
    
    def decode(string: String): js.Array[Double] = js.native
    
    def encode(array: js.Array[Double]): String = js.native
  }
}
