package typings.reactAsync.anon

import typings.react.mod.global.JSX.Element
import typings.reactAsync.mod.FulfilledProps
import typings.reactAsync.mod.InitialProps
import typings.reactAsync.mod.PendingProps
import typings.reactAsync.mod.RejectedProps
import typings.reactAsync.mod.SettledProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Fulfilled extends js.Object {
  def Fulfilled[T](props: FulfilledProps[T]): Element
  def Initial[T](props: InitialProps[T]): Element
  def Loading[T](props: PendingProps[T]): Element
  def Pending[T](props: PendingProps[T]): Element
  def Rejected[T](props: RejectedProps[T]): Element
  def Resolved[T](props: FulfilledProps[T]): Element
  def Settled[T](props: SettledProps[T]): Element
}

object Fulfilled {
  @scala.inline
  def apply(
    Fulfilled: FulfilledProps[js.Any] => Element,
    Initial: InitialProps[js.Any] => Element,
    Loading: PendingProps[js.Any] => Element,
    Pending: PendingProps[js.Any] => Element,
    Rejected: RejectedProps[js.Any] => Element,
    Resolved: FulfilledProps[js.Any] => Element,
    Settled: SettledProps[js.Any] => Element
  ): Fulfilled = {
    val __obj = js.Dynamic.literal(Fulfilled = js.Any.fromFunction1(Fulfilled), Initial = js.Any.fromFunction1(Initial), Loading = js.Any.fromFunction1(Loading), Pending = js.Any.fromFunction1(Pending), Rejected = js.Any.fromFunction1(Rejected), Resolved = js.Any.fromFunction1(Resolved), Settled = js.Any.fromFunction1(Settled))
    __obj.asInstanceOf[Fulfilled]
  }
}

