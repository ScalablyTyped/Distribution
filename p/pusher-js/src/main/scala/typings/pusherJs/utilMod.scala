package typings.pusherJs

import typings.pusherJs.timedCallbackMod.TimedCallback
import typings.pusherJs.timersMod.OneOffTimer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  object default {
    
    @JSImport("pusher-js/types/src/core/util", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def defer(callback: TimedCallback): OneOffTimer = ^.asInstanceOf[js.Dynamic].applyDynamic("defer")(callback.asInstanceOf[js.Any]).asInstanceOf[OneOffTimer]
    
    inline def method(name: String, args: Any*): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("method")(List(name.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Function]
    
    inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  }
}
