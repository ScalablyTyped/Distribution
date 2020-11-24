package typings.stringTemplate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("StringTemplate")
@js.native
object StringTemplate extends js.Object {
  
  /**
    * Format
    */
  @js.native
  trait Format extends js.Object {
    
    // Escape {} pairs by using double {{}} 
    def apply(string: String): String = js.native
    // Format using optional arguments 
    def apply(string: String, array: js.Any*): String = js.native
    // Format using a number indexed array
    def apply(string: String, array: js.Array[_]): String = js.native
    // Format using an object hash with keys matching [0-9a-zA-Z]+ 
    def apply(string: String, `object`: js.Any): String = js.native
  }
  
  @js.native
  trait Template extends js.Object {
    
    def apply(array: js.Any*): String = js.native
    def apply(array: js.Array[_]): String = js.native
    def apply(`object`: js.Any): String = js.native
  }
  
  /**
    * Compile
    */
  type Compile = js.Function2[/* string */ String, /* inline */ js.UndefOr[Boolean], Template]
}
