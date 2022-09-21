package typings.reactAsync.anon

import typings.react.mod.global.JSX.Element
import typings.reactAsync.mod.FulfilledProps
import typings.reactAsync.mod.InitialProps
import typings.reactAsync.mod.PendingProps
import typings.reactAsync.mod.RejectedProps
import typings.reactAsync.mod.SettledProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fulfilled extends StObject {
  
  def Fulfilled[T](props: FulfilledProps[T]): Element
  
  def Initial[T](props: InitialProps[T]): Element
  
  def Loading[T](props: PendingProps[T]): Element
  
  def Pending[T](props: PendingProps[T]): Element
  
  def Rejected[T](props: RejectedProps[T]): Element
  
  def Resolved[T](props: FulfilledProps[T]): Element
  
  def Settled[T](props: SettledProps[T]): Element
}
object Fulfilled {
  
  inline def apply(
    Fulfilled: FulfilledProps[Any] => Element,
    Initial: InitialProps[Any] => Element,
    Loading: PendingProps[Any] => Element,
    Pending: PendingProps[Any] => Element,
    Rejected: RejectedProps[Any] => Element,
    Resolved: FulfilledProps[Any] => Element,
    Settled: SettledProps[Any] => Element
  ): Fulfilled = {
    val __obj = js.Dynamic.literal(Fulfilled = js.Any.fromFunction1(Fulfilled), Initial = js.Any.fromFunction1(Initial), Loading = js.Any.fromFunction1(Loading), Pending = js.Any.fromFunction1(Pending), Rejected = js.Any.fromFunction1(Rejected), Resolved = js.Any.fromFunction1(Resolved), Settled = js.Any.fromFunction1(Settled))
    __obj.asInstanceOf[Fulfilled]
  }
  
  extension [Self <: Fulfilled](x: Self) {
    
    inline def setFulfilled(value: FulfilledProps[Any] => Element): Self = StObject.set(x, "Fulfilled", js.Any.fromFunction1(value))
    
    inline def setInitial(value: InitialProps[Any] => Element): Self = StObject.set(x, "Initial", js.Any.fromFunction1(value))
    
    inline def setLoading(value: PendingProps[Any] => Element): Self = StObject.set(x, "Loading", js.Any.fromFunction1(value))
    
    inline def setPending(value: PendingProps[Any] => Element): Self = StObject.set(x, "Pending", js.Any.fromFunction1(value))
    
    inline def setRejected(value: RejectedProps[Any] => Element): Self = StObject.set(x, "Rejected", js.Any.fromFunction1(value))
    
    inline def setResolved(value: FulfilledProps[Any] => Element): Self = StObject.set(x, "Resolved", js.Any.fromFunction1(value))
    
    inline def setSettled(value: SettledProps[Any] => Element): Self = StObject.set(x, "Settled", js.Any.fromFunction1(value))
  }
}
