package typings.std.global

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.QueuingStrategy
import typings.std.UnderlyingByteSource
import typings.std.UnderlyingSource
import typings.std.anon.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ReadableStream")
@js.native
class ReadableStream[R] ()
  extends typings.std.ReadableStream[R] {
  def this(underlyingSource: UnderlyingSource[R]) = this()
  def this(underlyingSource: js.UndefOr[scala.Nothing], strategy: QueuingStrategy[R]) = this()
  def this(underlyingSource: UnderlyingSource[R], strategy: QueuingStrategy[R]) = this()
}
@JSGlobal("ReadableStream")
@js.native
object ReadableStream
  extends Instantiable0[typings.std.ReadableStream[js.Object]]
     with Instantiable1[
      (/* underlyingSource */ UnderlyingByteSource) | (/* underlyingSource */ UnderlyingSource[js.Object]), 
      typings.std.ReadableStream[js.Object | typings.std.Uint8Array]
    ]
     with Instantiable2[
      js.UndefOr[
        (/* underlyingSource */ UnderlyingByteSource) | (/* underlyingSource */ UnderlyingSource[js.Object])
      ], 
      (/* strategy */ QueuingStrategy[js.Object]) | (/* strategy */ Size), 
      typings.std.ReadableStream[js.Object | typings.std.Uint8Array]
    ]
