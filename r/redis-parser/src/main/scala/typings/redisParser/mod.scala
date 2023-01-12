package typings.redisParser

import typings.node.bufferMod.global.Buffer
import typings.redisErrors.mod.ParserError
import typings.redisErrors.mod.RedisError
import typings.redisErrors.mod.ReplyError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Javascript Redis Parser
    */
  @JSImport("redis-parser", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with JavascriptRedisParser {
    def this(options: RedisParserOptions) = this()
    
    /* private */ /* CompleteClass */
    var arrayCache: Any = js.native
    
    /* private */ /* CompleteClass */
    var arrayPos: Any = js.native
    
    /* private */ /* CompleteClass */
    var bigStrSize: Any = js.native
    
    /* private */ /* CompleteClass */
    var buffer: Any = js.native
    
    /* private */ /* CompleteClass */
    var bufferCache: Any = js.native
    
    /**
      * Parse the redis buffer
      */
    /* CompleteClass */
    override def execute(buffer: Buffer): Unit = js.native
    
    /** Private fields  */
    /* private */ /* CompleteClass */
    var offset: Any = js.native
    
    /* CompleteClass */
    override val optionReturnBuffers: Boolean = js.native
    
    /* CompleteClass */
    override val optionStringNumbers: Boolean = js.native
    
    /**
      * Reset the parser values to the initial state
      */
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def returnError(err: ReplyError): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def returnFatalError(err: ParserError): Unit = js.native
    
    /* private */ /* CompleteClass */
    override def returnReply(reply: Any): Unit = js.native
    
    /**
      * Set the returnBuffers option
      */
    /* CompleteClass */
    override def setReturnBuffers(returnBuffers: Boolean): Unit = js.native
    
    /**
      * Set the stringNumbers option
      */
    /* CompleteClass */
    override def setStringNumbers(stringNumbers: Boolean): Unit = js.native
    
    /* private */ /* CompleteClass */
    var totalChunkSize: Any = js.native
  }
  
  /**
    * Javascript Redis Parser
    */
  trait JavascriptRedisParser extends StObject {
    
    /* private */ var arrayCache: Any
    
    /* private */ var arrayPos: Any
    
    /* private */ var bigStrSize: Any
    
    /* private */ var buffer: Any
    
    /* private */ var bufferCache: Any
    
    /**
      * Parse the redis buffer
      */
    def execute(buffer: Buffer): Unit
    
    /** Private fields  */
    /* private */ var offset: Any
    
    val optionReturnBuffers: Boolean
    
    val optionStringNumbers: Boolean
    
    /**
      * Reset the parser values to the initial state
      */
    def reset(): Unit
    
    /* private */ def returnError(err: ReplyError): Unit
    
    /* private */ def returnFatalError(err: ParserError): Unit
    
    /* private */ def returnReply(reply: Any): Unit
    
    /**
      * Set the returnBuffers option
      */
    def setReturnBuffers(returnBuffers: Boolean): Unit
    
    /**
      * Set the stringNumbers option
      */
    def setStringNumbers(stringNumbers: Boolean): Unit
    
    /* private */ var totalChunkSize: Any
  }
  object JavascriptRedisParser {
    
    inline def apply(
      arrayCache: Any,
      arrayPos: Any,
      bigStrSize: Any,
      buffer: Any,
      bufferCache: Any,
      execute: Buffer => Unit,
      offset: Any,
      optionReturnBuffers: Boolean,
      optionStringNumbers: Boolean,
      reset: () => Unit,
      returnError: ReplyError => Unit,
      returnFatalError: ParserError => Unit,
      returnReply: Any => Unit,
      setReturnBuffers: Boolean => Unit,
      setStringNumbers: Boolean => Unit,
      totalChunkSize: Any
    ): JavascriptRedisParser = {
      val __obj = js.Dynamic.literal(arrayCache = arrayCache.asInstanceOf[js.Any], arrayPos = arrayPos.asInstanceOf[js.Any], bigStrSize = bigStrSize.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], bufferCache = bufferCache.asInstanceOf[js.Any], execute = js.Any.fromFunction1(execute), offset = offset.asInstanceOf[js.Any], optionReturnBuffers = optionReturnBuffers.asInstanceOf[js.Any], optionStringNumbers = optionStringNumbers.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), returnError = js.Any.fromFunction1(returnError), returnFatalError = js.Any.fromFunction1(returnFatalError), returnReply = js.Any.fromFunction1(returnReply), setReturnBuffers = js.Any.fromFunction1(setReturnBuffers), setStringNumbers = js.Any.fromFunction1(setStringNumbers), totalChunkSize = totalChunkSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[JavascriptRedisParser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JavascriptRedisParser] (val x: Self) extends AnyVal {
      
      inline def setArrayCache(value: Any): Self = StObject.set(x, "arrayCache", value.asInstanceOf[js.Any])
      
      inline def setArrayPos(value: Any): Self = StObject.set(x, "arrayPos", value.asInstanceOf[js.Any])
      
      inline def setBigStrSize(value: Any): Self = StObject.set(x, "bigStrSize", value.asInstanceOf[js.Any])
      
      inline def setBuffer(value: Any): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setBufferCache(value: Any): Self = StObject.set(x, "bufferCache", value.asInstanceOf[js.Any])
      
      inline def setExecute(value: Buffer => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setOffset(value: Any): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOptionReturnBuffers(value: Boolean): Self = StObject.set(x, "optionReturnBuffers", value.asInstanceOf[js.Any])
      
      inline def setOptionStringNumbers(value: Boolean): Self = StObject.set(x, "optionStringNumbers", value.asInstanceOf[js.Any])
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setReturnError(value: ReplyError => Unit): Self = StObject.set(x, "returnError", js.Any.fromFunction1(value))
      
      inline def setReturnFatalError(value: ParserError => Unit): Self = StObject.set(x, "returnFatalError", js.Any.fromFunction1(value))
      
      inline def setReturnReply(value: Any => Unit): Self = StObject.set(x, "returnReply", js.Any.fromFunction1(value))
      
      inline def setSetReturnBuffers(value: Boolean => Unit): Self = StObject.set(x, "setReturnBuffers", js.Any.fromFunction1(value))
      
      inline def setSetStringNumbers(value: Boolean => Unit): Self = StObject.set(x, "setStringNumbers", js.Any.fromFunction1(value))
      
      inline def setTotalChunkSize(value: Any): Self = StObject.set(x, "totalChunkSize", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * RedisParserOptions
    */
  trait RedisParserOptions extends StObject {
    
    /** All strings are returned as Buffer e.g. <Buffer 48 65 6c 6c 6f>. optional, defaults to false */
    var returnBuffers: js.UndefOr[Boolean] = js.undefined
    
    /** returnError */
    def returnError(err: RedisError): Unit
    
    /** optional, defaults to the `returnError` function */
    var returnFatalError: js.UndefOr[js.Function1[/* err */ ParserError, Unit]] = js.undefined
    
    /** returnReply */
    def returnReply(reply: Any): Unit
    
    /** All numbers are returned as String. optional, defaults to false */
    var stringNumbers: js.UndefOr[Boolean] = js.undefined
  }
  object RedisParserOptions {
    
    inline def apply(returnError: RedisError => Unit, returnReply: Any => Unit): RedisParserOptions = {
      val __obj = js.Dynamic.literal(returnError = js.Any.fromFunction1(returnError), returnReply = js.Any.fromFunction1(returnReply))
      __obj.asInstanceOf[RedisParserOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RedisParserOptions] (val x: Self) extends AnyVal {
      
      inline def setReturnBuffers(value: Boolean): Self = StObject.set(x, "returnBuffers", value.asInstanceOf[js.Any])
      
      inline def setReturnBuffersUndefined: Self = StObject.set(x, "returnBuffers", js.undefined)
      
      inline def setReturnError(value: RedisError => Unit): Self = StObject.set(x, "returnError", js.Any.fromFunction1(value))
      
      inline def setReturnFatalError(value: /* err */ ParserError => Unit): Self = StObject.set(x, "returnFatalError", js.Any.fromFunction1(value))
      
      inline def setReturnFatalErrorUndefined: Self = StObject.set(x, "returnFatalError", js.undefined)
      
      inline def setReturnReply(value: Any => Unit): Self = StObject.set(x, "returnReply", js.Any.fromFunction1(value))
      
      inline def setStringNumbers(value: Boolean): Self = StObject.set(x, "stringNumbers", value.asInstanceOf[js.Any])
      
      inline def setStringNumbersUndefined: Self = StObject.set(x, "stringNumbers", js.undefined)
    }
  }
}
