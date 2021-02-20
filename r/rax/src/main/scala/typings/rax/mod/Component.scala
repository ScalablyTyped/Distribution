package typings.rax.mod

import typings.rax.anon.ReadonlychildrenRaxNodeun
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Base component for plain JS classes
@JSImport("rax", "Component")
@js.native
class Component[P, S, SS] protected () extends ComponentLifecycle[P, S, SS] {
  def this(props: P) = this()
  
  def forceUpdate(): Unit = js.native
  def forceUpdate(callBack: js.Function0[Unit]): Unit = js.native
  
  val props: P with ReadonlychildrenRaxNodeun = js.native
  
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
  
  var state: S = js.native
}
