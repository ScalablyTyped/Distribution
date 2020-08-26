package typings.reactNativeUrlPolyfill

import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-url-polyfill", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class URL () extends URL_
  
  @js.native
  class URLSearchParams ()
    extends typings.node.urlMod.URLSearchParams
  
  def setupURLPolyfill(): Unit = js.native
}

