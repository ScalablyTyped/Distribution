package typings
package qiniuLib.qiniuMod

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
      def this(accessKey: java.lang.String) = this()
      def this(accessKey: java.lang.String, secretKey: java.lang.String) = this()
      var accessKey: java.lang.String = js.native
      var secretKey: java.lang.String = js.native
    }
    
  }
  
}

