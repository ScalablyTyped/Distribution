package typings.regexgen

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("regexgen", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(inputs: js.Array[String]): RegExp = js.native
  def apply(inputs: js.Array[String], flags: String): RegExp = js.native
  
  @js.native
  class Trie () extends js.Object {
    
    def add(input: String): Unit = js.native
    
    def addAll(inputs: js.Array[String]): Unit = js.native
    
    def minimize(): Unit = js.native
    
    def toRegExp(): RegExp = js.native
    def toRegExp(flags: String): RegExp = js.native
    
    def toString(flags: String): String = js.native
  }
}
