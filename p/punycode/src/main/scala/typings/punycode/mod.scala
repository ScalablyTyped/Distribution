package typings.punycode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("punycode", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def decode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def encode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toASCII(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toASCII")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def toUnicode(input: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnicode")(input.asInstanceOf[js.Any]).asInstanceOf[String]
  
  object ucs2 {
    
    @JSImport("punycode", "ucs2")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def decode(string: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(string.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
    
    @scala.inline
    def encode(array: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(array.asInstanceOf[js.Any]).asInstanceOf[String]
  }
  
  @JSImport("punycode", "version")
  @js.native
  val version: String = js.native
}
