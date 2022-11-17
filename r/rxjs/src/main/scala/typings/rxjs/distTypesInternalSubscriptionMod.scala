package typings.rxjs

import typings.rxjs.distTypesInternalTypesMod.SubscriptionLike
import typings.rxjs.distTypesInternalTypesMod.TeardownLogic
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalSubscriptionMod {
  
  @JSImport("rxjs/dist/types/internal/Subscription", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("rxjs/dist/types/internal/Subscription", "EMPTY_SUBSCRIPTION")
  @js.native
  val EMPTY_SUBSCRIPTION: Subscription = js.native
  
  @JSImport("rxjs/dist/types/internal/Subscription", "Subscription")
  @js.native
  /**
    * @param initialTeardown A function executed first as part of the finalization
    * process that is kicked off when {@link #unsubscribe} is called.
    */
  open class Subscription ()
    extends StObject
       with SubscriptionLike {
    def this(initialTeardown: js.Function0[Unit]) = this()
    
    /**
      * Adds a parent to this subscription so it can be removed from the parent if it
      * unsubscribes on it's own.
      *
      * NOTE: THIS ASSUMES THAT {@link _hasParent} HAS ALREADY BEEN CHECKED.
      * @param parent The parent subscription to add
      */
    /* private */ var _addParent: Any = js.native
    
    /**
      * The list of registered finalizers to execute upon unsubscription. Adding and removing from this
      * list occurs in the {@link #add} and {@link #remove} methods.
      */
    /* private */ var _finalizers: Any = js.native
    
    /**
      * Checks to see if a this subscription already has a particular parent.
      * This will signal that this subscription has already been added to the parent in question.
      * @param parent the parent to check for
      */
    /* private */ var _hasParent: Any = js.native
    
    /* private */ var _parentage: Any = js.native
    
    /**
      * Called on a child when it is removed via {@link #remove}.
      * @param parent The parent to remove
      */
    /* private */ var _removeParent: Any = js.native
    
    /**
      * Adds a finalizer to this subscription, so that finalization will be unsubscribed/called
      * when this subscription is unsubscribed. If this subscription is already {@link #closed},
      * because it has already been unsubscribed, then whatever finalizer is passed to it
      * will automatically be executed (unless the finalizer itself is also a closed subscription).
      *
      * Closed Subscriptions cannot be added as finalizers to any subscription. Adding a closed
      * subscription to a any subscription will result in no operation. (A noop).
      *
      * Adding a subscription to itself, or adding `null` or `undefined` will not perform any
      * operation at all. (A noop).
      *
      * `Subscription` instances that are added to this instance will automatically remove themselves
      * if they are unsubscribed. Functions and {@link Unsubscribable} objects that you wish to remove
      * will need to be removed manually with {@link #remove}
      *
      * @param teardown The finalization logic to add to this subscription.
      */
    def add(teardown: TeardownLogic): Unit = js.native
    
    /* CompleteClass */
    override val closed: Boolean = js.native
    
    /* private */ var initialTeardown: Any = js.native
    
    /**
      * Removes a finalizer from this subscription that was previously added with the {@link #add} method.
      *
      * Note that `Subscription` instances, when unsubscribed, will automatically remove themselves
      * from every other `Subscription` they have been added to. This means that using the `remove` method
      * is not a common thing and should be used thoughtfully.
      *
      * If you add the same finalizer instance of a function or an unsubscribable object to a `Subscription` instance
      * more than once, you will need to call `remove` the same number of times to remove all instances.
      *
      * All finalizer instances are removed to free up memory upon unsubscription.
      *
      * @param teardown The finalizer to remove from this subscription
      */
    def remove(teardown: Exclude[TeardownLogic, Unit]): Unit = js.native
    
    /* CompleteClass */
    override def unsubscribe(): Unit = js.native
  }
  /* static members */
  object Subscription {
    
    @JSImport("rxjs/dist/types/internal/Subscription", "Subscription")
    @js.native
    val ^ : js.Any = js.native
    
    /** @nocollapse */
    @JSImport("rxjs/dist/types/internal/Subscription", "Subscription.EMPTY")
    @js.native
    def EMPTY: Subscription = js.native
    inline def EMPTY_=(x: Subscription): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
  }
  
  inline def isSubscription(value: Any): /* is rxjs.rxjs/dist/types/internal/Subscription.Subscription */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSubscription")(value.asInstanceOf[js.Any]).asInstanceOf[/* is rxjs.rxjs/dist/types/internal/Subscription.Subscription */ Boolean]
}
