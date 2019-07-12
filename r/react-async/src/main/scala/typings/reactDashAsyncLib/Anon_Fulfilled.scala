package typings
package reactDashAsyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fulfilled extends js.Object {
  def Fulfilled[T](props: Anon_Children[T]): reactLib.reactMod.Global.JSXNs.Element
  def Initial[T](props: Anon_Children[T]): reactLib.reactMod.Global.JSXNs.Element
  def Loading[T](props: Anon_ChildrenInitial[T]): reactLib.reactMod.Global.JSXNs.Element
  def Pending[T](props: Anon_ChildrenInitial[T]): reactLib.reactMod.Global.JSXNs.Element
  def Rejected[T](props: Anon_Children[T]): reactLib.reactMod.Global.JSXNs.Element
  def Resolved[T](props: Anon_Children[T]): reactLib.reactMod.Global.JSXNs.Element
  def Settled[T](props: Anon_Children[T]): reactLib.reactMod.Global.JSXNs.Element
}

object Anon_Fulfilled {
  @scala.inline
  def apply(
    Fulfilled: Anon_Children[js.Any] => reactLib.reactMod.Global.JSXNs.Element,
    Initial: Anon_Children[js.Any] => reactLib.reactMod.Global.JSXNs.Element,
    Loading: Anon_ChildrenInitial[js.Any] => reactLib.reactMod.Global.JSXNs.Element,
    Pending: Anon_ChildrenInitial[js.Any] => reactLib.reactMod.Global.JSXNs.Element,
    Rejected: Anon_Children[js.Any] => reactLib.reactMod.Global.JSXNs.Element,
    Resolved: Anon_Children[js.Any] => reactLib.reactMod.Global.JSXNs.Element,
    Settled: Anon_Children[js.Any] => reactLib.reactMod.Global.JSXNs.Element
  ): Anon_Fulfilled = {
    val __obj = js.Dynamic.literal(Fulfilled = js.Any.fromFunction1(Fulfilled), Initial = js.Any.fromFunction1(Initial), Loading = js.Any.fromFunction1(Loading), Pending = js.Any.fromFunction1(Pending), Rejected = js.Any.fromFunction1(Rejected), Resolved = js.Any.fromFunction1(Resolved), Settled = js.Any.fromFunction1(Settled))
  
    __obj.asInstanceOf[Anon_Fulfilled]
  }
}

