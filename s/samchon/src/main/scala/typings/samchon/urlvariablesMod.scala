package typings.samchon

import typings.urlVariables.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlvariablesMod {
  
  @JSImport("samchon/library/URLVariables", "URLVariables")
  @js.native
  /**
    * Default Constructor.
    */
  class URLVariables () extends ^ {
    /**
      * Construct from a URL-encoded string.
      *
      * The {@link decode decode()} method is automatically called to convert the string to properties of the {@link URLVariables} object.
      *
      * @param str A URL-encoded string containing name/value pairs.
      */
    def this(str: String) = this()
  }
  object URLVariables {
    
    @JSImport("samchon/library/URLVariables", "URLVariables.parse")
    @js.native
    def parse[T](str: String): T = js.native
    @JSImport("samchon/library/URLVariables", "URLVariables.parse")
    @js.native
    def parse[T](str: String, autoCase: Boolean): T = js.native
    
    @JSImport("samchon/library/URLVariables", "URLVariables.stringify")
    @js.native
    def stringify[T](obj: T): String = js.native
  }
}
