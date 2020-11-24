package typings.streamEach

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stream-each", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(
    stream: ReadableStream,
    iterator: js.Function2[
      /* data */ Buffer | String, 
      /* next */ js.Function1[/* error */ js.UndefOr[Error], Unit], 
      Unit
    ],
    cb: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = js.native
}
