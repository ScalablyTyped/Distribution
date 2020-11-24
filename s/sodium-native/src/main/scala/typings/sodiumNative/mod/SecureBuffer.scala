package typings.sodiumNative.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecureBuffer extends Buffer {
  
  /**
    * To check if a `buffer` is a "secure" `buffer`, you can access the getter `buffer.secure` which will be `true`.
    */
  var secure: Boolean = js.native
}
