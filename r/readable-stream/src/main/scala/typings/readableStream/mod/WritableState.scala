package typings.readableStream.mod

import typings.node.bufferMod.global.BufferEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WritableState extends StObject {
  
  var buffer: js.Array[BufferRequest] = js.native
  
  var bufferProcessing: Boolean = js.native
  
  var bufferedRequest: BufferRequest | Null = js.native
  
  var bufferedRequestCount: Double = js.native
  
  var corked: Double = js.native
  
  var corkedRequestsFree: CorkedRequest = js.native
  
  var decodeStrings: Boolean = js.native
  
  var defaultEncoding: BufferEncoding = js.native
  
  var destroyed: Boolean = js.native
  
  var ended: Boolean = js.native
  
  var ending: Boolean = js.native
  
  var errorEmitted: Boolean = js.native
  
  var finalCalled: Boolean = js.native
  
  var finished: Boolean = js.native
  
  // new (options: WritableStateOptions, stream: Writable): WritableState;
  def getBuffer(): js.Array[BufferRequest] = js.native
  
  var highWaterMark: Double = js.native
  
  var lastBufferedRequest: BufferRequest | Null = js.native
  
  var length: Double = js.native
  
  var needDrain: Boolean = js.native
  
  var objectMode: Boolean = js.native
  
  def onwrite(): Any = js.native
  def onwrite(er: js.Error): Any = js.native
  
  var pendingcb: Double = js.native
  
  var prefinished: Boolean = js.native
  
  var sync: Boolean = js.native
  
  var writecb: (js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) | Null = js.native
  
  var writelen: Double = js.native
  
  var writing: Boolean = js.native
}
