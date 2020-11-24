package typings.readableStream.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringDecoder extends js.Object {
  
  def end(): String = js.native
  def end(buffer: Buffer): String = js.native
  
  def write(buffer: Buffer): String = js.native
}
