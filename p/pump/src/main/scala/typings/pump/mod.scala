package typings.pump

import typings.node.NodeJS.ReadableStream
import typings.node.NodeJS.WritableStream
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // callback have to be passed as last argument
  @scala.inline
  def apply(streams: (Stream | Callback)*): Stream = ^.asInstanceOf[js.Dynamic].apply(streams.asInstanceOf[js.Any]).asInstanceOf[Stream]
  @scala.inline
  def apply(streams: js.Array[Stream]): Stream = ^.asInstanceOf[js.Dynamic].apply(streams.asInstanceOf[js.Any]).asInstanceOf[Stream]
  @scala.inline
  def apply(streams: js.Array[Stream], callback: Callback): Stream = (^.asInstanceOf[js.Dynamic].apply(streams.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Stream]
  
  @JSImport("pump", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type Callback = js.Function1[/* err */ Error, js.Any]
  
  type Stream = ReadableStream | WritableStream
}
