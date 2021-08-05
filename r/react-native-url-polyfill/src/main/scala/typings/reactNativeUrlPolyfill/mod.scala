package typings.reactNativeUrlPolyfill

import typings.node.NodeJS.Dict
import typings.node.urlMod.URL_
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-url-polyfill", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-native-url-polyfill", "URL")
  @js.native
  class URL protected () extends URL_ {
    def this(input: String) = this()
    def this(input: String, base: String) = this()
    def this(input: String, base: URL_) = this()
  }
  
  @JSImport("react-native-url-polyfill", "URLSearchParams")
  @js.native
  class URLSearchParams ()
    extends typings.node.urlMod.URLSearchParams {
    def this(init: String) = this()
    def this(init: js.Array[js.Tuple2[String, String]]) = this()
    def this(init: Dict[String | js.Array[String]]) = this()
    def this(init: typings.node.urlMod.URLSearchParams) = this()
    def this(init: Iterable[js.Tuple2[String, String]]) = this()
  }
  
  inline def setupURLPolyfill(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setupURLPolyfill")().asInstanceOf[Unit]
}
