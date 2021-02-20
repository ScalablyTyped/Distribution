package typings.readableStream.mod

import typings.node.BufferEncoding
import typings.readableStream.anon.Chunk
import typings.std.ArrayLike
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined readable-stream.readable-stream.WritableStateOptions & {  write :(this : readable-stream.readable-stream.Writable, chunk : any, encoding : node.BufferEncoding | string, callback : (error : std.Error | null | undefined): void): void | undefined,   writev :(this : readable-stream.readable-stream.Writable, chunk : std.ArrayLike<{  chunk :any,   encoding :node.BufferEncoding | string}>, callback : (error : std.Error | null | undefined): void): void | undefined,   destroy :(this : readable-stream.readable-stream.Writable, error : std.Error | null, callback : (error : std.Error | null): void): void | undefined,   final :(this : readable-stream.readable-stream.Writable, callback : (error : std.Error | null | undefined): void): void | undefined} */
@js.native
trait WritableOptions extends StObject {
  
  var decodeStrings: js.UndefOr[Boolean] = js.native
  
  var defaultEncoding: js.UndefOr[BufferEncoding] = js.native
  
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ] = js.native
  
  var `final`: js.UndefOr[
    js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  
  var highWaterMark: js.UndefOr[Double] = js.native
  
  var objectMode: js.UndefOr[Boolean] = js.native
  
  var writableHighWaterMark: js.UndefOr[Double] = js.native
  
  var writableObjectMode: js.UndefOr[Boolean] = js.native
  
  var write: js.UndefOr[
    js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ BufferEncoding | String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  
  var writev: js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* chunk */ ArrayLike[Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
}
object WritableOptions {
  
  @scala.inline
  def apply(): WritableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WritableOptions]
  }
  
  @scala.inline
  implicit class WritableOptionsMutableBuilder[Self <: WritableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecodeStrings(value: Boolean): Self = StObject.set(x, "decodeStrings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodeStringsUndefined: Self = StObject.set(x, "decodeStrings", js.undefined)
    
    @scala.inline
    def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
    
    @scala.inline
    def setDestroy(
      value: js.ThisFunction2[
          /* this */ Writable, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setFinal(
      value: js.ThisFunction1[
          /* this */ Writable, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "final", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalUndefined: Self = StObject.set(x, "final", js.undefined)
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    @scala.inline
    def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    
    @scala.inline
    def setWritableHighWaterMark(value: Double): Self = StObject.set(x, "writableHighWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableHighWaterMarkUndefined: Self = StObject.set(x, "writableHighWaterMark", js.undefined)
    
    @scala.inline
    def setWritableObjectMode(value: Boolean): Self = StObject.set(x, "writableObjectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableObjectModeUndefined: Self = StObject.set(x, "writableObjectMode", js.undefined)
    
    @scala.inline
    def setWrite(
      value: js.ThisFunction3[
          /* this */ Writable, 
          /* chunk */ js.Any, 
          /* encoding */ BufferEncoding | String, 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteUndefined: Self = StObject.set(x, "write", js.undefined)
    
    @scala.inline
    def setWritev(
      value: js.ThisFunction2[
          /* this */ Writable, 
          /* chunk */ ArrayLike[Chunk], 
          /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "writev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritevUndefined: Self = StObject.set(x, "writev", js.undefined)
  }
}
