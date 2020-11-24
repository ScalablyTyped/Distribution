package typings.qIo

import typings.node.Buffer
import typings.qIo.Qio.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QioBufferWriter extends js.Object {
  
  def apply(writer: Buffer): Writer = js.native
  
  var Writer: typings.qIo.Qio.Writer = js.native
}
