package typings.rax.mod

import typings.rax.anon.ReadonlychildrenRaxNode
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Base component for plain JS classes
// tslint:disable-next-line:no-empty-interface
@JSImport("rax", "Component")
@js.native
class Component[P, S, SS] protected () extends ComponentLifecycle[P, S, SS] {
  def this(props: P) = this()
  val props: P with ReadonlychildrenRaxNode = js.native
  var state: S = js.native
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[Unit]): Unit = js.native
  def render(): RaxNode = js.native
  def setState[K /* <: /* keyof S */ String */](): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: S): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: S, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: js.Function2[/* prevState */ S, /* props */ P, (Pick[S, K]) | S | Null]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](
    state: js.Function2[/* prevState */ S, /* props */ P, (Pick[S, K]) | S | Null],
    callback: js.Function0[Unit]
  ): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: Null, callback: js.Function0[Unit]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: Pick[S, K]): Unit = js.native
  def setState[K /* <: /* keyof S */ String */](state: Pick[S, K], callback: js.Function0[Unit]): Unit = js.native
}

