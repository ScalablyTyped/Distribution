package typings.rxLiteTesting

import typings.rxCore.Rx.IScheduler
import typings.rxLiteTesting.Rx.MockObserverStatic
import typings.rxLiteTesting.Rx.TestScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rx-lite-testing", "MockObserver")
  @js.native
  val MockObserver: MockObserverStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx-lite-testing", "MockObserver")
  @js.native
  class MockObserverCls[T] protected ()
    extends typings.rxLiteTesting.Rx.MockObserver[T] {
    def this(scheduler: IScheduler) = this()
  }
  
  object ReactiveTest {
    
    @JSImport("rx-lite-testing", "ReactiveTest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("rx-lite-testing", "ReactiveTest.created")
    @js.native
    def created: Double = js.native
    @scala.inline
    def created_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("created")(x.asInstanceOf[js.Any])
    
    @JSImport("rx-lite-testing", "ReactiveTest.disposed")
    @js.native
    def disposed: Double = js.native
    @scala.inline
    def disposed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disposed")(x.asInstanceOf[js.Any])
    
    @JSImport("rx-lite-testing", "ReactiveTest.onCompleted")
    @js.native
    def onCompleted(ticks: Double): typings.rxLiteTesting.Rx.Recorded = js.native
    
    @JSImport("rx-lite-testing", "ReactiveTest.onError")
    @js.native
    def onError(ticks: Double, exception: js.Any): typings.rxLiteTesting.Rx.Recorded = js.native
    
    @JSImport("rx-lite-testing", "ReactiveTest.onNext")
    @js.native
    def onNext(ticks: Double, value: js.Any): typings.rxLiteTesting.Rx.Recorded = js.native
    
    @JSImport("rx-lite-testing", "ReactiveTest.subscribe")
    @js.native
    def subscribe(subscribeAt: Double): typings.rxLiteTesting.Rx.Subscription = js.native
    @JSImport("rx-lite-testing", "ReactiveTest.subscribe")
    @js.native
    def subscribe(subscribeAt: Double, unsubscribeAt: Double): typings.rxLiteTesting.Rx.Subscription = js.native
    
    @JSImport("rx-lite-testing", "ReactiveTest.subscribed")
    @js.native
    def subscribed: Double = js.native
    @scala.inline
    def subscribed_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subscribed")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("rx-lite-testing", "Recorded")
  @js.native
  class Recorded protected ()
    extends typings.rxLiteTesting.Rx.Recorded {
    def this(time: Double, value: js.Any) = this()
    def this(
      time: Double,
      value: js.Any,
      equalityComparer: js.Function2[/* x */ js.Any, /* y */ js.Any, Boolean]
    ) = this()
  }
  
  @JSImport("rx-lite-testing", "Subscription")
  @js.native
  class Subscription protected ()
    extends typings.rxLiteTesting.Rx.Subscription {
    def this(subscribeAt: Double) = this()
    def this(subscribeAt: Double, unsubscribeAt: Double) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("rx-lite-testing", "TestScheduler")
  @js.native
  class TestSchedulerCls () extends TestScheduler
}
