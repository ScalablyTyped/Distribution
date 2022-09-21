package typings.readableStream.mod

import typings.readableStream.anon.End
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("readable-stream", "Stream")
@js.native
open class Stream ()
  extends StObject
     with _Readable {
  def this(options: ReadableOptions) = this()
  
  def pipe[T /* <: IWritable */](destination: T): T = js.native
  def pipe[T /* <: IWritable */](destination: T, options: End): T = js.native
}
