package typings.stacktraceGps

import org.scalablytyped.runtime.StringDictionary
import typings.sourceMap.mod.SourceMapConsumer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("stacktrace-gps", JSImport.Namespace)
  @js.native
  /**
    * @param opts - StackTraceGPS.Options object
    */
  open class ^ ()
    extends StObject
       with StackTraceGPS {
    def this(opts: Options) = this()
    
    /**
      * Given a StackFrame, guess function name from location
      * information.
      *
      * @param stackframe - StackFrame object
      * @returns Promise that resolves with enhanced StackFrame
      */
    /* CompleteClass */
    override def findFunctionName(stackframe: typings.stackframe.mod.^): js.Promise[typings.stackframe.mod.^] = js.native
    
    /**
      * Given a StackFrame, seek source-mapped location and return new
      * enhanced StackFrame.
      *
      * @param stackframe - StackFrame object
      * @returns Promise that resolves with enhanced StackFrame
      */
    /* CompleteClass */
    override def getMappedLocation(stackframe: typings.stackframe.mod.^): js.Promise[typings.stackframe.mod.^] = js.native
    
    /**
      * Given a StackFrame, enhance function name and use source maps for
      * a better StackFrame.
      *
      * @param stackframe - StackFrame object
      * @returns Promise that resolves with with source-mapped StackFrame
      */
    /* CompleteClass */
    override def pinpoint(stackframe: typings.stackframe.mod.^): js.Promise[typings.stackframe.mod.^] = js.native
  }
  
  /**
    * Options for the StackTraceGPS constructor
    */
  trait Options extends StObject {
    
    /** Function to be used for making X-Domain requests */
    var ajax: js.UndefOr[js.Function1[/* url */ String, js.Promise[String]]] = js.undefined
    
    /** Function to convert base64-encoded strings to their original representation */
    var atob: js.UndefOr[js.Function1[/* base64 */ String, String]] = js.undefined
    
    /** True to prevent network requests (best effort without sources or source maps) */
    var offline: js.UndefOr[Boolean] = js.undefined
    
    /** Pre-populate source cache to avoid network requests */
    var sourceCache: js.UndefOr[StringDictionary[String | js.Promise[String]]] = js.undefined
    
    /** Pre-populate SourceMapConsumer cache to avoid network requests */
    var sourceMapConsumerCache: js.UndefOr[StringDictionary[SourceMapConsumer]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAjax(value: /* url */ String => js.Promise[String]): Self = StObject.set(x, "ajax", js.Any.fromFunction1(value))
      
      inline def setAjaxUndefined: Self = StObject.set(x, "ajax", js.undefined)
      
      inline def setAtob(value: /* base64 */ String => String): Self = StObject.set(x, "atob", js.Any.fromFunction1(value))
      
      inline def setAtobUndefined: Self = StObject.set(x, "atob", js.undefined)
      
      inline def setOffline(value: Boolean): Self = StObject.set(x, "offline", value.asInstanceOf[js.Any])
      
      inline def setOfflineUndefined: Self = StObject.set(x, "offline", js.undefined)
      
      inline def setSourceCache(value: StringDictionary[String | js.Promise[String]]): Self = StObject.set(x, "sourceCache", value.asInstanceOf[js.Any])
      
      inline def setSourceCacheUndefined: Self = StObject.set(x, "sourceCache", js.undefined)
      
      inline def setSourceMapConsumerCache(value: StringDictionary[SourceMapConsumer]): Self = StObject.set(x, "sourceMapConsumerCache", value.asInstanceOf[js.Any])
      
      inline def setSourceMapConsumerCacheUndefined: Self = StObject.set(x, "sourceMapConsumerCache", js.undefined)
    }
  }
  
  trait StackTraceGPS extends StObject {
    
    /**
      * Given a StackFrame, guess function name from location
      * information.
      *
      * @param stackframe - StackFrame object
      * @returns Promise that resolves with enhanced StackFrame
      */
    def findFunctionName(stackframe: typings.stackframe.mod.^): js.Promise[typings.stackframe.mod.^]
    
    /**
      * Given a StackFrame, seek source-mapped location and return new
      * enhanced StackFrame.
      *
      * @param stackframe - StackFrame object
      * @returns Promise that resolves with enhanced StackFrame
      */
    def getMappedLocation(stackframe: typings.stackframe.mod.^): js.Promise[typings.stackframe.mod.^]
    
    /**
      * Given a StackFrame, enhance function name and use source maps for
      * a better StackFrame.
      *
      * @param stackframe - StackFrame object
      * @returns Promise that resolves with with source-mapped StackFrame
      */
    def pinpoint(stackframe: typings.stackframe.mod.^): js.Promise[typings.stackframe.mod.^]
  }
  object StackTraceGPS {
    
    inline def apply(
      findFunctionName: typings.stackframe.mod.^ => js.Promise[typings.stackframe.mod.^],
      getMappedLocation: typings.stackframe.mod.^ => js.Promise[typings.stackframe.mod.^],
      pinpoint: typings.stackframe.mod.^ => js.Promise[typings.stackframe.mod.^]
    ): StackTraceGPS = {
      val __obj = js.Dynamic.literal(findFunctionName = js.Any.fromFunction1(findFunctionName), getMappedLocation = js.Any.fromFunction1(getMappedLocation), pinpoint = js.Any.fromFunction1(pinpoint))
      __obj.asInstanceOf[StackTraceGPS]
    }
    
    extension [Self <: StackTraceGPS](x: Self) {
      
      inline def setFindFunctionName(value: typings.stackframe.mod.^ => js.Promise[typings.stackframe.mod.^]): Self = StObject.set(x, "findFunctionName", js.Any.fromFunction1(value))
      
      inline def setGetMappedLocation(value: typings.stackframe.mod.^ => js.Promise[typings.stackframe.mod.^]): Self = StObject.set(x, "getMappedLocation", js.Any.fromFunction1(value))
      
      inline def setPinpoint(value: typings.stackframe.mod.^ => js.Promise[typings.stackframe.mod.^]): Self = StObject.set(x, "pinpoint", js.Any.fromFunction1(value))
    }
  }
}
