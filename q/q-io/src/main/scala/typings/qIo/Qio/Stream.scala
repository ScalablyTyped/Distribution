package typings.qIo.Qio

import typings.node.Buffer
import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stream extends js.Object {
  
  def close(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def flush(): Promise[Unit] = js.native
  
  var node: js.Any = js.native
  
  def read(): Promise[Buffer] = js.native
  def read(charset: String): Promise[String] = js.native
  
  def write(content: String): Unit = js.native
  def write(content: Buffer): Unit = js.native
}
