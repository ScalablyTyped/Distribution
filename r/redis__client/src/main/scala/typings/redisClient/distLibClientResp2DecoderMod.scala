package typings.redisClient

import typings.node.bufferMod.global.Buffer
import typings.redisClient.distLibErrorsMod.ErrorReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibClientResp2DecoderMod {
  
  @JSImport("@redis/client/dist/lib/client/RESP2/decoder", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with RESP2Decoder {
    def this(options: RESP2Options) = this()
    
    /* private */ /* CompleteClass */
    var arrayItemType: Any = js.native
    
    /* private */ /* CompleteClass */
    var arraysInProcess: Any = js.native
    
    /* private */ /* CompleteClass */
    var bufferComposer: Any = js.native
    
    /* private */ /* CompleteClass */
    var bulkStringRemainingLength: Any = js.native
    
    /* private */ /* CompleteClass */
    var compose: Any = js.native
    
    /* private */ /* CompleteClass */
    var currentStringComposer: Any = js.native
    
    /* private */ /* CompleteClass */
    var cursor: Any = js.native
    
    /* private */ /* CompleteClass */
    var initializeArray: Any = js.native
    
    /* private */ /* CompleteClass */
    var integer: Any = js.native
    
    /* private */ /* CompleteClass */
    var isNegativeInteger: Any = js.native
    
    /* private */ /* CompleteClass */
    var options: Any = js.native
    
    /* private */ /* CompleteClass */
    var parseArray: Any = js.native
    
    /* private */ /* CompleteClass */
    var parseBulkString: Any = js.native
    
    /* private */ /* CompleteClass */
    var parseError: Any = js.native
    
    /* private */ /* CompleteClass */
    var parseInteger: Any = js.native
    
    /* private */ /* CompleteClass */
    var parseSimpleString: Any = js.native
    
    /* private */ /* CompleteClass */
    var parseType: Any = js.native
    
    /* private */ /* CompleteClass */
    var pushArrayItem: Any = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var returnArrayReply: Any = js.native
    
    /* private */ /* CompleteClass */
    var stringComposer: Any = js.native
    
    /* private */ /* CompleteClass */
    var `type`: Any = js.native
    
    /* CompleteClass */
    override def write(chunk: Buffer): Unit = js.native
  }
  
  trait RESP2Decoder extends StObject {
    
    /* private */ var arrayItemType: Any
    
    /* private */ var arraysInProcess: Any
    
    /* private */ var bufferComposer: Any
    
    /* private */ var bulkStringRemainingLength: Any
    
    /* private */ var compose: Any
    
    /* private */ var currentStringComposer: Any
    
    /* private */ var cursor: Any
    
    /* private */ var initializeArray: Any
    
    /* private */ var integer: Any
    
    /* private */ var isNegativeInteger: Any
    
    /* private */ var options: Any
    
    /* private */ var parseArray: Any
    
    /* private */ var parseBulkString: Any
    
    /* private */ var parseError: Any
    
    /* private */ var parseInteger: Any
    
    /* private */ var parseSimpleString: Any
    
    /* private */ var parseType: Any
    
    /* private */ var pushArrayItem: Any
    
    def reset(): Unit
    
    /* private */ var returnArrayReply: Any
    
    /* private */ var stringComposer: Any
    
    /* private */ var `type`: Any
    
    def write(chunk: Buffer): Unit
  }
  object RESP2Decoder {
    
    inline def apply(
      arrayItemType: Any,
      arraysInProcess: Any,
      bufferComposer: Any,
      bulkStringRemainingLength: Any,
      compose: Any,
      currentStringComposer: Any,
      cursor: Any,
      initializeArray: Any,
      integer: Any,
      isNegativeInteger: Any,
      options: Any,
      parseArray: Any,
      parseBulkString: Any,
      parseError: Any,
      parseInteger: Any,
      parseSimpleString: Any,
      parseType: Any,
      pushArrayItem: Any,
      reset: () => Unit,
      returnArrayReply: Any,
      stringComposer: Any,
      `type`: Any,
      write: Buffer => Unit
    ): RESP2Decoder = {
      val __obj = js.Dynamic.literal(arrayItemType = arrayItemType.asInstanceOf[js.Any], arraysInProcess = arraysInProcess.asInstanceOf[js.Any], bufferComposer = bufferComposer.asInstanceOf[js.Any], bulkStringRemainingLength = bulkStringRemainingLength.asInstanceOf[js.Any], compose = compose.asInstanceOf[js.Any], currentStringComposer = currentStringComposer.asInstanceOf[js.Any], cursor = cursor.asInstanceOf[js.Any], initializeArray = initializeArray.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], isNegativeInteger = isNegativeInteger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], parseArray = parseArray.asInstanceOf[js.Any], parseBulkString = parseBulkString.asInstanceOf[js.Any], parseError = parseError.asInstanceOf[js.Any], parseInteger = parseInteger.asInstanceOf[js.Any], parseSimpleString = parseSimpleString.asInstanceOf[js.Any], parseType = parseType.asInstanceOf[js.Any], pushArrayItem = pushArrayItem.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), returnArrayReply = returnArrayReply.asInstanceOf[js.Any], stringComposer = stringComposer.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RESP2Decoder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RESP2Decoder] (val x: Self) extends AnyVal {
      
      inline def setArrayItemType(value: Any): Self = StObject.set(x, "arrayItemType", value.asInstanceOf[js.Any])
      
      inline def setArraysInProcess(value: Any): Self = StObject.set(x, "arraysInProcess", value.asInstanceOf[js.Any])
      
      inline def setBufferComposer(value: Any): Self = StObject.set(x, "bufferComposer", value.asInstanceOf[js.Any])
      
      inline def setBulkStringRemainingLength(value: Any): Self = StObject.set(x, "bulkStringRemainingLength", value.asInstanceOf[js.Any])
      
      inline def setCompose(value: Any): Self = StObject.set(x, "compose", value.asInstanceOf[js.Any])
      
      inline def setCurrentStringComposer(value: Any): Self = StObject.set(x, "currentStringComposer", value.asInstanceOf[js.Any])
      
      inline def setCursor(value: Any): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
      
      inline def setInitializeArray(value: Any): Self = StObject.set(x, "initializeArray", value.asInstanceOf[js.Any])
      
      inline def setInteger(value: Any): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
      
      inline def setIsNegativeInteger(value: Any): Self = StObject.set(x, "isNegativeInteger", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setParseArray(value: Any): Self = StObject.set(x, "parseArray", value.asInstanceOf[js.Any])
      
      inline def setParseBulkString(value: Any): Self = StObject.set(x, "parseBulkString", value.asInstanceOf[js.Any])
      
      inline def setParseError(value: Any): Self = StObject.set(x, "parseError", value.asInstanceOf[js.Any])
      
      inline def setParseInteger(value: Any): Self = StObject.set(x, "parseInteger", value.asInstanceOf[js.Any])
      
      inline def setParseSimpleString(value: Any): Self = StObject.set(x, "parseSimpleString", value.asInstanceOf[js.Any])
      
      inline def setParseType(value: Any): Self = StObject.set(x, "parseType", value.asInstanceOf[js.Any])
      
      inline def setPushArrayItem(value: Any): Self = StObject.set(x, "pushArrayItem", value.asInstanceOf[js.Any])
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setReturnArrayReply(value: Any): Self = StObject.set(x, "returnArrayReply", value.asInstanceOf[js.Any])
      
      inline def setStringComposer(value: Any): Self = StObject.set(x, "stringComposer", value.asInstanceOf[js.Any])
      
      inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Buffer => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
  
  trait RESP2Options extends StObject {
    
    def onReply(reply: Reply): Any
    
    def returnStringsAsBuffers(): Boolean
    @JSName("returnStringsAsBuffers")
    var returnStringsAsBuffers_Original: ReturnStringsAsBuffers
  }
  object RESP2Options {
    
    inline def apply(onReply: Reply => Any, returnStringsAsBuffers: () => Boolean): RESP2Options = {
      val __obj = js.Dynamic.literal(onReply = js.Any.fromFunction1(onReply), returnStringsAsBuffers = js.Any.fromFunction0(returnStringsAsBuffers))
      __obj.asInstanceOf[RESP2Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RESP2Options] (val x: Self) extends AnyVal {
      
      inline def setOnReply(value: Reply => Any): Self = StObject.set(x, "onReply", js.Any.fromFunction1(value))
      
      inline def setReturnStringsAsBuffers(value: () => Boolean): Self = StObject.set(x, "returnStringsAsBuffers", js.Any.fromFunction0(value))
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Reply = string | node.buffer.<global>.Buffer | @redis/client.@redis/client/dist/lib/errors.ErrorReply | number | null | std.Array<@redis/client.@redis/client/dist/lib/client/RESP2/decoder.Reply>
  }}}
  to avoid circular code involving: 
  - @redis/client.@redis/client/dist/lib/client/RESP2/decoder.Reply
  */
  type Reply = String | Buffer | ErrorReply | Double | Null | js.Array[Any]
  
  type ReturnStringsAsBuffers = js.Function0[Boolean]
}
