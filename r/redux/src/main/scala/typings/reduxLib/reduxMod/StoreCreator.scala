package typings
package reduxLib.reduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoreCreator extends js.Object {
  def apply[S, A /* <: Action[_] */, Ext, StateExt](reducer: Reducer[S, A]): (Store[S with StateExt, A]) with Ext = js.native
  def apply[S, A /* <: Action[_] */, Ext, StateExt](reducer: Reducer[S, A], enhancer: StoreEnhancer[Ext, StateExt]): (Store[S with StateExt, A]) with Ext = js.native
  def apply[S, A /* <: Action[_] */, Ext, StateExt](reducer: Reducer[S, A], preloadedState: DeepPartial[S]): (Store[S with StateExt, A]) with Ext = js.native
  def apply[S, A /* <: Action[_] */, Ext, StateExt](reducer: Reducer[S, A], preloadedState: DeepPartial[S], enhancer: StoreEnhancer[Ext, js.Object]): (Store[S with StateExt, A]) with Ext = js.native
}

