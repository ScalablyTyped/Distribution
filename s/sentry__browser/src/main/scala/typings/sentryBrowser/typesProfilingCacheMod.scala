package typings.sentryBrowser

import typings.sentryBrowser.anon.Add
import typings.sentryTypes.typesEventMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesProfilingCacheMod {
  
  @JSImport("@sentry/browser/types/profiling/cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object PROFILING_EVENT_CACHE {
    
    @JSImport("@sentry/browser/types/profiling/cache", "PROFILING_EVENT_CACHE")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(key: String, value: Event): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    inline def delete(key: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def get(key: String): js.UndefOr[Event] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Event]]
    
    inline def size(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("size")().asInstanceOf[Double]
  }
  
  inline def makeProfilingCache[Key /* <: String */, Value /* <: Event */](size: Double): Add[Key, Value] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeProfilingCache")(size.asInstanceOf[js.Any]).asInstanceOf[Add[Key, Value]]
}
