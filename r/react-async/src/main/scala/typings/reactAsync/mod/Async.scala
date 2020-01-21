package typings.reactAsync.mod

import typings.react.mod.Component
import typings.react.mod._Global_.JSX.Element
import typings.reactAsync.AnonChildren
import typings.reactAsync.AnonChildrenInitial
import typings.reactAsync.AnonChildrenPersist
import typings.reactAsync.AnonChildrenPersistBoolean
import typings.reactAsync.AnonChildrenPersistBooleanSettledChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-async", "Async")
@js.native
class Async[T] ()
  extends Component[AsyncProps[T], AsyncState[T], js.Any]

@JSImport("react-async", "Async")
@js.native
object Async extends js.Object {
  def Fulfilled[T](props: AnonChildrenPersist[T]): Element = js.native
  def Initial[T](props: AnonChildren[T]): Element = js.native
  def Loading[T](props: AnonChildrenInitial[T]): Element = js.native
  def Pending[T](props: AnonChildrenInitial[T]): Element = js.native
  def Rejected[T](props: AnonChildrenPersistBoolean[T]): Element = js.native
  def Resolved[T](props: AnonChildrenPersist[T]): Element = js.native
  def Settled[T](props: AnonChildrenPersistBooleanSettledChildren[T]): Element = js.native
}

