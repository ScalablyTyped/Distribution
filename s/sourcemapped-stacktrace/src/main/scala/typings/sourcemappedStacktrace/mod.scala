package typings.sourcemappedStacktrace

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sourcemapped-stacktrace", "mapStackTrace")
  @js.native
  def mapStackTrace(stack: js.UndefOr[scala.Nothing], done: js.Function1[/* mappedStack */ js.Array[String], Unit]): Unit = js.native
  @JSImport("sourcemapped-stacktrace", "mapStackTrace")
  @js.native
  def mapStackTrace(
    stack: js.UndefOr[scala.Nothing],
    done: js.Function1[/* mappedStack */ js.Array[String], Unit],
    opts: MapStackTraceOptions
  ): Unit = js.native
  @JSImport("sourcemapped-stacktrace", "mapStackTrace")
  @js.native
  def mapStackTrace(stack: String, done: js.Function1[/* mappedStack */ js.Array[String], Unit]): Unit = js.native
  @JSImport("sourcemapped-stacktrace", "mapStackTrace")
  @js.native
  def mapStackTrace(
    stack: String,
    done: js.Function1[/* mappedStack */ js.Array[String], Unit],
    opts: MapStackTraceOptions
  ): Unit = js.native
  
  @js.native
  trait MapStackTraceOptions extends StObject {
    
    /** Whether to cache sourcemaps globally across multiple calls. */
    var cacheGlobally: js.UndefOr[Boolean] = js.native
    
    /** Filter function applied to each stackTrace line. Lines which do not pass the filter won't be processesd. */
    var filter: js.UndefOr[js.Function1[/* line */ String, Boolean]] = js.native
    
    /** Whether to use synchronous ajax to load the sourcemaps. */
    var sync: js.UndefOr[Boolean] = js.native
  }
  object MapStackTraceOptions {
    
    @scala.inline
    def apply(): MapStackTraceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MapStackTraceOptions]
    }
    
    @scala.inline
    implicit class MapStackTraceOptionsMutableBuilder[Self <: MapStackTraceOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheGlobally(value: Boolean): Self = StObject.set(x, "cacheGlobally", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheGloballyUndefined: Self = StObject.set(x, "cacheGlobally", js.undefined)
      
      @scala.inline
      def setFilter(value: /* line */ String => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      @scala.inline
      def setSync(value: Boolean): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncUndefined: Self = StObject.set(x, "sync", js.undefined)
    }
  }
}
