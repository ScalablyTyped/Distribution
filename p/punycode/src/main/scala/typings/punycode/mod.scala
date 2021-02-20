package typings.punycode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("punycode", "decode")
  @js.native
  def decode(input: String): String = js.native
  
  @JSImport("punycode", "encode")
  @js.native
  def encode(input: String): String = js.native
  
  @JSImport("punycode", "toASCII")
  @js.native
  def toASCII(input: String): String = js.native
  
  @JSImport("punycode", "toUnicode")
  @js.native
  def toUnicode(input: String): String = js.native
  
  object ucs2 {
    
    @JSImport("punycode", "ucs2.decode")
    @js.native
    def decode(string: String): js.Array[Double] = js.native
    
    @JSImport("punycode", "ucs2.encode")
    @js.native
    def encode(array: js.Array[Double]): String = js.native
  }
  
  @JSImport("punycode", "version")
  @js.native
  val version: String = js.native
}
