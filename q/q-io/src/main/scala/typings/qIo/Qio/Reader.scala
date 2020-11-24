package typings.qIo.Qio

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reader extends ForEach {
  
  def close(): Unit = js.native
  
  var node: ReadableStream = js.native
  
  def read(): Promise[Buffer] = js.native
  def read(charset: String): Promise[String] = js.native
}
