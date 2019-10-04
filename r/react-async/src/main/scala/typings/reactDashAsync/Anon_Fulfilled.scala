package typings.reactDashAsync

import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fulfilled extends js.Object {
  def Fulfilled[T](props: Anon_ChildrenPersist[T]): Element
  def Initial[T](props: Anon_Children[T]): Element
  def Loading[T](props: Anon_ChildrenInitial[T]): Element
  def Pending[T](props: Anon_ChildrenInitial[T]): Element
  def Rejected[T](props: Anon_ChildrenPersistBoolean[T]): Element
  def Resolved[T](props: Anon_ChildrenPersist[T]): Element
  def Settled[T](props: Anon_ChildrenPersistBooleanSettledChildren[T]): Element
}

object Anon_Fulfilled {
  @scala.inline
  def apply(
    Fulfilled: Anon_ChildrenPersist[js.Any] => Element,
    Initial: Anon_Children[js.Any] => Element,
    Loading: Anon_ChildrenInitial[js.Any] => Element,
    Pending: Anon_ChildrenInitial[js.Any] => Element,
    Rejected: Anon_ChildrenPersistBoolean[js.Any] => Element,
    Resolved: Anon_ChildrenPersist[js.Any] => Element,
    Settled: Anon_ChildrenPersistBooleanSettledChildren[js.Any] => Element
  ): Anon_Fulfilled = {
    val __obj = js.Dynamic.literal(Fulfilled = js.Any.fromFunction1(Fulfilled), Initial = js.Any.fromFunction1(Initial), Loading = js.Any.fromFunction1(Loading), Pending = js.Any.fromFunction1(Pending), Rejected = js.Any.fromFunction1(Rejected), Resolved = js.Any.fromFunction1(Resolved), Settled = js.Any.fromFunction1(Settled))
  
    __obj.asInstanceOf[Anon_Fulfilled]
  }
}

