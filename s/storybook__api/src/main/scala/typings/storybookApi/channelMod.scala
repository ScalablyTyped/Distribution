package typings.storybookApi

import typings.storybookApi.mod.ModuleFn
import typings.storybookChannels.mod.Channel
import typings.storybookChannels.mod.Listener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object channelMod {
  
  @JSImport("@storybook/api/dist/modules/channel", "init")
  @js.native
  val init: ModuleFn = js.native
  
  @js.native
  trait SubAPI extends StObject {
    
    def collapseAll(): Unit = js.native
    
    def emit(`type`: String, args: js.Any*): Unit = js.native
    
    def expandAll(): Unit = js.native
    
    def getChannel(): Channel = js.native
    
    def off(`type`: String, cb: Listener): Unit = js.native
    
    def on(`type`: String, cb: Listener): js.Function0[Unit] = js.native
    
    def once(`type`: String, cb: Listener): Unit = js.native
  }
  object SubAPI {
    
    @scala.inline
    def apply(
      collapseAll: () => Unit,
      emit: (String, /* repeated */ js.Any) => Unit,
      expandAll: () => Unit,
      getChannel: () => Channel,
      off: (String, Listener) => Unit,
      on: (String, Listener) => js.Function0[Unit],
      once: (String, Listener) => Unit
    ): SubAPI = {
      val __obj = js.Dynamic.literal(collapseAll = js.Any.fromFunction0(collapseAll), emit = js.Any.fromFunction2(emit), expandAll = js.Any.fromFunction0(expandAll), getChannel = js.Any.fromFunction0(getChannel), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), once = js.Any.fromFunction2(once))
      __obj.asInstanceOf[SubAPI]
    }
    
    @scala.inline
    implicit class SubAPIMutableBuilder[Self <: SubAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCollapseAll(value: () => Unit): Self = StObject.set(x, "collapseAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEmit(value: (String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "emit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setExpandAll(value: () => Unit): Self = StObject.set(x, "expandAll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetChannel(value: () => Channel): Self = StObject.set(x, "getChannel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOff(value: (String, Listener) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn(value: (String, Listener) => js.Function0[Unit]): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnce(value: (String, Listener) => Unit): Self = StObject.set(x, "once", js.Any.fromFunction2(value))
    }
  }
}
