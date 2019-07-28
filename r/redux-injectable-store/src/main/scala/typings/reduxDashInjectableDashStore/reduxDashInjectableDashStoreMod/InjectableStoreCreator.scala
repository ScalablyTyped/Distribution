package typings.reduxDashInjectableDashStore.reduxDashInjectableDashStoreMod

import typings.redux.reduxMod.StoreEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectableStoreCreator extends js.Object {
  def apply[S](): InjectableStore[S] = js.native
  def apply[S](enhancer: StoreEnhancer[S, js.Object]): InjectableStore[S] = js.native
  def apply[S](enhancer: StoreEnhancer[S, js.Object], wrapReducer: WrapReducer[S]): InjectableStore[S] = js.native
  def apply[S](preloadedState: S): InjectableStore[S] = js.native
  def apply[S](preloadedState: S, enhancer: StoreEnhancer[S, js.Object]): InjectableStore[S] = js.native
  def apply[S](preloadedState: S, enhancer: StoreEnhancer[S, js.Object], wrapReducer: WrapReducer[S]): InjectableStore[S] = js.native
}

