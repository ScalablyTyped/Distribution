package typings.sourcemappedStacktrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sourcemapped-stacktrace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def mapStackTrace(stack: String, done: js.Function1[/* mappedStack */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapStackTrace")(stack.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mapStackTrace(
    stack: String,
    done: js.Function1[/* mappedStack */ js.Array[String], Unit],
    opts: MapStackTraceOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapStackTrace")(stack.asInstanceOf[js.Any], done.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mapStackTrace(stack: Unit, done: js.Function1[/* mappedStack */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapStackTrace")(stack.asInstanceOf[js.Any], done.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mapStackTrace(
    stack: Unit,
    done: js.Function1[/* mappedStack */ js.Array[String], Unit],
    opts: MapStackTraceOptions
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mapStackTrace")(stack.asInstanceOf[js.Any], done.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait MapStackTraceOptions extends StObject {
    
    /** Whether to cache sourcemaps globally across multiple calls. */
    var cacheGlobally: js.UndefOr[Boolean] = js.undefined
    
    /** Filter function applied to each stackTrace line. Lines which do not pass the filter won't be processesd. */
    var filter: js.UndefOr[js.Function1[/* line */ String, Boolean]] = js.undefined
    
    /** Whether to use synchronous ajax to load the sourcemaps. */
    var sync: js.UndefOr[Boolean] = js.undefined
  }
  object MapStackTraceOptions {
    
    inline def apply(): MapStackTraceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapStackTraceOptions]
    }
    
    extension [Self <: MapStackTraceOptions](x: Self) {
      
      inline def setCacheGlobally(value: Boolean): Self = StObject.set(x, "cacheGlobally", value.asInstanceOf[js.Any])
      
      inline def setCacheGloballyUndefined: Self = StObject.set(x, "cacheGlobally", js.undefined)
      
      inline def setFilter(value: /* line */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      inline def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
}
