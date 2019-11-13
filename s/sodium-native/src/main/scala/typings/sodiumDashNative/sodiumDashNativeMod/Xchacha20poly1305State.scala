package typings.sodiumDashNative.sodiumDashNativeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Xchacha20poly1305State extends js.Object {
  var _pad: Buffer
  var k: Buffer
  var nonce: Buffer
}

object Xchacha20poly1305State {
  @scala.inline
  def apply(_pad: Buffer, k: Buffer, nonce: Buffer): Xchacha20poly1305State = {
    val __obj = js.Dynamic.literal(_pad = _pad, k = k, nonce = nonce)
  
    __obj.asInstanceOf[Xchacha20poly1305State]
  }
}

