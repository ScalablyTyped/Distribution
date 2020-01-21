package typings.samchon

import typings.urlVariables.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/library/URLVariables", JSImport.Namespace)
@js.native
object urlvariablesMod extends js.Object {
  /**
    * URLVariables class is for representing variables of HTTP.
    *
    * {@link URLVariables} class allows you to transfer variables between an application and server.
    *
    * When transfering, {@link URLVariables} will be converted to a *URI* string.
    * - URI: Uniform Resource Identifier
    *
    * @reference http://help.adobe.com/en_US/FlashPlatform/reference/actionscript/3/flash/net/URLVariables.html
    * @author Migrated by Jeongho Nam <http://samchon.org>
    */
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
  
  @js.native
  object URLVariables extends js.Object {
    def parse[T](str: String): T = js.native
    def parse[T](str: String, autoCase: Boolean): T = js.native
    def stringify[T](obj: T): String = js.native
  }
  
}

