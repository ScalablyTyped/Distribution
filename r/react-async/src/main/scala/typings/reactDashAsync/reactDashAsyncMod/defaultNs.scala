package typings.reactDashAsync.reactDashAsyncMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.reactDashAsync.Anon_Children
import typings.reactDashAsync.Anon_ChildrenInitial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", JSImport.Default)
@js.native
object defaultNs extends js.Object {
  def Fulfilled[T](props: Anon_Children[T]): Element = js.native
  def Initial[T](props: Anon_Children[T]): Element = js.native
  def Loading[T](props: Anon_ChildrenInitial[T]): Element = js.native
  def Pending[T](props: Anon_ChildrenInitial[T]): Element = js.native
  def Rejected[T](props: Anon_Children[T]): Element = js.native
  def Resolved[T](props: Anon_Children[T]): Element = js.native
  def Settled[T](props: Anon_Children[T]): Element = js.native
}

