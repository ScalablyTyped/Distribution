package typings.readableStream.mod

import typings.node.BufferEncoding
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined readable-stream.readable-stream.ReadableStateOptions & {  read :(this : readable-stream.readable-stream._Readable, size : number): void | undefined,   destroy :(this : readable-stream.readable-stream._Readable, error : std.Error | null, callback : (error : std.Error | null): void): void | undefined} */
@js.native
trait ReadableOptions extends StObject {
  
  var defaultEncoding: js.UndefOr[BufferEncoding] = js.native
  
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ _Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ] = js.native
  
  var encoding: js.UndefOr[BufferEncoding] = js.native
  
  var highWaterMark: js.UndefOr[Double] = js.native
  
  var objectMode: js.UndefOr[Boolean] = js.native
  
  var read: js.UndefOr[js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]] = js.native
  
  var readableHighWaterMark: js.UndefOr[Double] = js.native
  
  var readableObjectMode: js.UndefOr[Boolean] = js.native
}
object ReadableOptions {
  
  @scala.inline
  def apply(): ReadableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadableOptions]
  }
  
  @scala.inline
  implicit class ReadableOptionsMutableBuilder[Self <: ReadableOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
    
    @scala.inline
    def setDestroy(
      value: js.ThisFunction2[
          /* this */ _Readable, 
          /* error */ Error | Null, 
          /* callback */ js.Function1[/* error */ Error | Null, Unit], 
          Unit
        ]
    ): Self = StObject.set(x, "destroy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
    
    @scala.inline
    def setEncoding(value: BufferEncoding): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    
    @scala.inline
    def setObjectMode(value: Boolean): Self = StObject.set(x, "objectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectModeUndefined: Self = StObject.set(x, "objectMode", js.undefined)
    
    @scala.inline
    def setRead(value: js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    
    @scala.inline
    def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableHighWaterMarkUndefined: Self = StObject.set(x, "readableHighWaterMark", js.undefined)
    
    @scala.inline
    def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
  }
}
