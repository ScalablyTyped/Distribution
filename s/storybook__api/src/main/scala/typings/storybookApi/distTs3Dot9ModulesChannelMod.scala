package typings.storybookApi

import typings.storybookApi.mod.ModuleFn
import typings.storybookChannels.mod.Channel
import typings.storybookChannels.mod.Listener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTs3Dot9ModulesChannelMod {
  
  @JSImport("@storybook/api/dist/ts3.9/modules/channel", "init")
  @js.native
  val init: ModuleFn = js.native
  
  trait SubAPI extends StObject {
    
    def collapseAll(): Unit
    
    def emit(`type`: String, args: Any*): Unit
    
    def expandAll(): Unit
    
    def getChannel(): Channel
    
    def off(`type`: String, cb: Listener): Unit
    
    def on(`type`: String, cb: Listener): js.Function0[Unit]
    
    def once(`type`: String, cb: Listener): Unit
  }
  object SubAPI {
    
    inline def apply(
      collapseAll: () => Unit,
      emit: (String, /* repeated */ Any) => Unit,
      expandAll: () => Unit,
      getChannel: () => Channel,
      off: (String, Listener) => Unit,
      on: (String, Listener) => js.Function0[Unit],
      once: (String, Listener) => Unit
    ): SubAPI = {
      val __obj = js.Dynamic.literal(collapseAll = js.Any.fromFunction0(collapseAll), emit = js.Any.fromFunction2(emit), expandAll = js.Any.fromFunction0(expandAll), getChannel = js.Any.fromFunction0(getChannel), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
      __obj.asInstanceOf[SubAPI]
    }
    
    extension [Self <: SubAPI](x: Self) {
      
      inline def setCollapseAll(value: () => Unit): Self = StObject.set(x, "collapseAll", js.Any.fromFunction0(value))
      
      inline def setEmit(value: (String, /* repeated */ Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      inline def setExpandAll(value: () => Unit): Self = StObject.set(x, "expandAll", js.Any.fromFunction0(value))
      
      inline def setGetChannel(value: () => Channel): Self = StObject.set(x, "getChannel", js.Any.fromFunction0(value))
      
      inline def setOff(value: (String, Listener) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      inline def setOn(value: (String, Listener) => js.Function0[Unit]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOnce(value: (String, Listener) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    }
  }
}
