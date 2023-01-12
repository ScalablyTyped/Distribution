package typings.reactRedux

import typings.reactRedux.anon.Clear
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsSubscriptionMod {
  
  @JSImport("react-redux/es/utils/Subscription", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createSubscription(store: Any): Subscription = ^.asInstanceOf[js.Dynamic].applyDynamic("createSubscription")(store.asInstanceOf[js.Any]).asInstanceOf[Subscription]
  inline def createSubscription(store: Any, parentSub: Subscription): Subscription = (^.asInstanceOf[js.Dynamic].applyDynamic("createSubscription")(store.asInstanceOf[js.Any], parentSub.asInstanceOf[js.Any])).asInstanceOf[Subscription]
  
  trait Listener extends StObject {
    
    var callback: VoidFunc
    
    var next: Listener | Null
    
    var prev: Listener | Null
  }
  object Listener {
    
    inline def apply(callback: () => Unit): Listener = {
      val __obj = js.Dynamic.literal(callback = js.Any.fromFunction0(callback), next = null, prev = null)
      __obj.asInstanceOf[Listener]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Listener] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: () => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setNext(value: Listener): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      inline def setNextNull: Self = StObject.set(x, "next", null)
      
      inline def setPrev(value: Listener): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
      
      inline def setPrevNull: Self = StObject.set(x, "prev", null)
    }
  }
  
  type ListenerCollection = ReturnType[js.Function0[Clear]]
  
  trait Subscription extends StObject {
    
    def addNestedSub(listener: VoidFunc): VoidFunc
    
    def getListeners(): ListenerCollection
    
    var handleChangeWrapper: VoidFunc
    
    def isSubscribed(): Boolean
    
    var notifyNestedSubs: VoidFunc
    
    var onStateChange: js.UndefOr[VoidFunc | Null] = js.undefined
    
    var trySubscribe: VoidFunc
    
    var tryUnsubscribe: VoidFunc
  }
  object Subscription {
    
    inline def apply(
      addNestedSub: VoidFunc => VoidFunc,
      getListeners: () => ListenerCollection,
      handleChangeWrapper: () => Unit,
      isSubscribed: () => Boolean,
      notifyNestedSubs: () => Unit,
      trySubscribe: () => Unit,
      tryUnsubscribe: () => Unit
    ): Subscription = {
      val __obj = js.Dynamic.literal(addNestedSub = js.Any.fromFunction1(addNestedSub), getListeners = js.Any.fromFunction0(getListeners), handleChangeWrapper = js.Any.fromFunction0(handleChangeWrapper), isSubscribed = js.Any.fromFunction0(isSubscribed), notifyNestedSubs = js.Any.fromFunction0(notifyNestedSubs), trySubscribe = js.Any.fromFunction0(trySubscribe), tryUnsubscribe = js.Any.fromFunction0(tryUnsubscribe))
      __obj.asInstanceOf[Subscription]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
      
      inline def setAddNestedSub(value: VoidFunc => VoidFunc): Self = StObject.set(x, "addNestedSub", js.Any.fromFunction1(value))
      
      inline def setGetListeners(value: () => ListenerCollection): Self = StObject.set(x, "getListeners", js.Any.fromFunction0(value))
      
      inline def setHandleChangeWrapper(value: () => Unit): Self = StObject.set(x, "handleChangeWrapper", js.Any.fromFunction0(value))
      
      inline def setIsSubscribed(value: () => Boolean): Self = StObject.set(x, "isSubscribed", js.Any.fromFunction0(value))
      
      inline def setNotifyNestedSubs(value: () => Unit): Self = StObject.set(x, "notifyNestedSubs", js.Any.fromFunction0(value))
      
      inline def setOnStateChange(value: () => Unit): Self = StObject.set(x, "onStateChange", js.Any.fromFunction0(value))
      
      inline def setOnStateChangeNull: Self = StObject.set(x, "onStateChange", null)
      
      inline def setOnStateChangeUndefined: Self = StObject.set(x, "onStateChange", js.undefined)
      
      inline def setTrySubscribe(value: () => Unit): Self = StObject.set(x, "trySubscribe", js.Any.fromFunction0(value))
      
      inline def setTryUnsubscribe(value: () => Unit): Self = StObject.set(x, "tryUnsubscribe", js.Any.fromFunction0(value))
    }
  }
  
  type VoidFunc = js.Function0[Unit]
}
