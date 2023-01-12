package typings.pusherJs

import org.scalablytyped.runtime.Instantiable2
import typings.pusherJs.typesSrcCorePusherMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Abort extends StObject {
    
    def abort(): Unit
    
    def forceMinPriority(p: Any): Unit
  }
  object Abort {
    
    inline def apply(abort: () => Unit, forceMinPriority: Any => Unit): Abort = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), forceMinPriority = js.Any.fromFunction1(forceMinPriority))
      __obj.asInstanceOf[Abort]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Abort] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setForceMinPriority(value: Any => Unit): Self = StObject.set(x, "forceMinPriority", js.Any.fromFunction1(value))
    }
  }
  
  trait Delay extends StObject {
    
    var delay: Any
  }
  object Delay {
    
    inline def apply(delay: Any): Delay = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delay]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Delay] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Any): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    }
  }
  
  trait DelayNumber extends StObject {
    
    var delay: Double
  }
  object DelayNumber {
    
    inline def apply(delay: Double): DelayNumber = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[DelayNumber]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DelayNumber] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    }
  }
  
  trait ForceMinPriority extends StObject {
    
    def abort(): Unit
    
    def forceMinPriority(): Unit
  }
  object ForceMinPriority {
    
    inline def apply(abort: () => Unit, forceMinPriority: () => Unit): ForceMinPriority = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), forceMinPriority = js.Any.fromFunction0(forceMinPriority))
      __obj.asInstanceOf[ForceMinPriority]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ForceMinPriority] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setForceMinPriority(value: () => Unit): Self = StObject.set(x, "forceMinPriority", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable2[/* key */ String, /* options */ Any, default] {
    
    def ready(): Unit = js.native
  }
  
  trait Promise extends StObject {
    
    var promise: js.Promise[Any]
    
    var reject: Any
    
    var resolve: Any
  }
  object Promise {
    
    inline def apply(promise: js.Promise[Any], reject: Any, resolve: Any): Promise = {
      val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], reject = reject.asInstanceOf[js.Any], resolve = resolve.asInstanceOf[js.Any])
      __obj.asInstanceOf[Promise]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Promise] (val x: Self) extends AnyVal {
      
      inline def setPromise(value: js.Promise[Any]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setReject(value: Any): Self = StObject.set(x, "reject", value.asInstanceOf[js.Any])
      
      inline def setResolve(value: Any): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    }
  }
}
