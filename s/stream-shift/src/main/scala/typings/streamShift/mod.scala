package typings.streamShift

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream-shift", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(stream: ReadableStream): Buffer | String | Null = js.native
}
