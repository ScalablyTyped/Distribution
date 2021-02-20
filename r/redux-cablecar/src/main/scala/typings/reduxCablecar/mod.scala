package typings.reduxCablecar

import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Middleware
import typings.reduxCablecar.anon.Connect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-cablecar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-cablecar", JSImport.Default)
  @js.native
  def default: (Middleware[js.Object, _, Dispatch[AnyAction]]) with Connect = js.native
  @scala.inline
  def default_=(x: (Middleware[js.Object, _, Dispatch[AnyAction]]) with Connect): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  @js.native
  trait CableCar extends StObject {
    
    def changeChannel(channel: String): Unit = js.native
    def changeChannel(channel: String, options: Options): Unit = js.native
    
    def getChannel(): String = js.native
    
    def getParams(): js.Object = js.native
    
    def perform(method: String): Unit = js.native
    def perform(method: String, payload: js.Any): Unit = js.native
    
    def send(action: String): Unit = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var connected: js.UndefOr[js.Function0[Unit]] = js.native
    
    var disconnected: js.UndefOr[js.Function0[Unit]] = js.native
    
    var optimisticOnFail: js.UndefOr[Boolean] = js.native
    
    var params: js.UndefOr[js.Object] = js.native
    
    var prefix: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnected(value: () => Unit): Self = StObject.set(x, "connected", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
      
      @scala.inline
      def setDisconnected(value: () => Unit): Self = StObject.set(x, "disconnected", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisconnectedUndefined: Self = StObject.set(x, "disconnected", js.undefined)
      
      @scala.inline
      def setOptimisticOnFail(value: Boolean): Self = StObject.set(x, "optimisticOnFail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimisticOnFailUndefined: Self = StObject.set(x, "optimisticOnFail", js.undefined)
      
      @scala.inline
      def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
}
