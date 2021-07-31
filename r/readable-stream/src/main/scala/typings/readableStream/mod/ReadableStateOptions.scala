package typings.readableStream.mod

import typings.node.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== _stream_readable ====
trait ReadableStateOptions extends StObject {
  
  var defaultEncoding: js.UndefOr[BufferEncoding] = js.undefined
  
  var encoding: js.UndefOr[BufferEncoding] = js.undefined
  
  var highWaterMark: js.UndefOr[Double] = js.undefined
  
  var objectMode: js.UndefOr[Boolean] = js.undefined
  
  var readableHighWaterMark: js.UndefOr[Double] = js.undefined
  
  var readableObjectMode: js.UndefOr[Boolean] = js.undefined
}
object ReadableStateOptions {
  
  @scala.inline
  def apply(): ReadableStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadableStateOptions]
  }
  
  @scala.inline
  implicit class ReadableStateOptionsMutableBuilder[Self <: ReadableStateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultEncoding(value: BufferEncoding): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
    
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
    def setReadableHighWaterMark(value: Double): Self = StObject.set(x, "readableHighWaterMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableHighWaterMarkUndefined: Self = StObject.set(x, "readableHighWaterMark", js.undefined)
    
    @scala.inline
    def setReadableObjectMode(value: Boolean): Self = StObject.set(x, "readableObjectMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadableObjectModeUndefined: Self = StObject.set(x, "readableObjectMode", js.undefined)
  }
}
