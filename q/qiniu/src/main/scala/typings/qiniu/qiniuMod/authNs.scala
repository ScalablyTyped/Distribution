package typings.qiniu.qiniuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "auth")
@js.native
object authNs extends js.Object {
  @JSName("digest")
  @js.native
  object digestNs extends js.Object {
    @js.native
    class Mac () extends js.Object {
      def this(accessKey: String) = this()
      def this(accessKey: String, secretKey: String) = this()
      var accessKey: String = js.native
      var secretKey: String = js.native
    }
    
  }
  
}

