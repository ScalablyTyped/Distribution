package typings.reactAsync

import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFulfilled extends js.Object {
  def Fulfilled[T](props: AnonChildrenPersist[T]): Element
  def Initial[T](props: AnonChildren[T]): Element
  def Loading[T](props: AnonChildrenInitial[T]): Element
  def Pending[T](props: AnonChildrenInitial[T]): Element
  def Rejected[T](props: AnonChildrenPersistBoolean[T]): Element
  def Resolved[T](props: AnonChildrenPersist[T]): Element
  def Settled[T](props: AnonChildrenPersistBooleanSettledChildren[T]): Element
}

object AnonFulfilled {
  @scala.inline
  def apply(
    Fulfilled: AnonChildrenPersist[js.Any] => Element,
    Initial: AnonChildren[js.Any] => Element,
    Loading: AnonChildrenInitial[js.Any] => Element,
    Pending: AnonChildrenInitial[js.Any] => Element,
    Rejected: AnonChildrenPersistBoolean[js.Any] => Element,
    Resolved: AnonChildrenPersist[js.Any] => Element,
    Settled: AnonChildrenPersistBooleanSettledChildren[js.Any] => Element
  ): AnonFulfilled = {
    val __obj = js.Dynamic.literal(Fulfilled = js.Any.fromFunction1(Fulfilled), Initial = js.Any.fromFunction1(Initial), Loading = js.Any.fromFunction1(Loading), Pending = js.Any.fromFunction1(Pending), Rejected = js.Any.fromFunction1(Rejected), Resolved = js.Any.fromFunction1(Resolved), Settled = js.Any.fromFunction1(Settled))
  
    __obj.asInstanceOf[AnonFulfilled]
  }
}

