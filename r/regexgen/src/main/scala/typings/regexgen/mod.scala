package typings.regexgen

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(inputs: js.Array[String]): js.RegExp = ^.asInstanceOf[js.Dynamic].apply(inputs.asInstanceOf[js.Any]).asInstanceOf[js.RegExp]
  inline def apply(inputs: js.Array[String], flags: String): js.RegExp = (^.asInstanceOf[js.Dynamic].apply(inputs.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.RegExp]
  
  @JSImport("regexgen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("regexgen", "Trie")
  @js.native
  open class Trie () extends StObject {
    
    def add(input: String): Unit = js.native
    
    def addAll(inputs: js.Array[String]): Unit = js.native
    
    def minimize(): Unit = js.native
    
    def toRegExp(): js.RegExp = js.native
    def toRegExp(flags: String): js.RegExp = js.native
    
    def toString(flags: String): String = js.native
  }
}
