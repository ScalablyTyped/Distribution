package typings.streamEach

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(
    stream: ReadableStream,
    iterator: js.Function2[
      /* data */ Buffer | String, 
      /* next */ js.Function1[/* error */ js.UndefOr[Error], Unit], 
      Unit
    ],
    cb: js.Function1[/* error */ js.UndefOr[Error], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(stream.asInstanceOf[js.Any], iterator.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("stream-each", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
