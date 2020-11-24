package typings.printf

import typings.node.NodeJS.WritableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("printf", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(format: String, args: js.Any*): String = js.native
  def apply(writeStream: WritableStream, format: String, args: js.Any*): Unit = js.native
}
