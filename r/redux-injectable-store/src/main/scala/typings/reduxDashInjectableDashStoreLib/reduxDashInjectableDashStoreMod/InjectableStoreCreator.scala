package typings
package reduxDashInjectableDashStoreLib.reduxDashInjectableDashStoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InjectableStoreCreator extends js.Object {
  def apply[S](): InjectableStore[S] = js.native
  def apply[S](enhancer: reduxLib.reduxMod.StoreEnhancer[S, js.Object]): InjectableStore[S] = js.native
  def apply[S](enhancer: reduxLib.reduxMod.StoreEnhancer[S, js.Object], wrapReducer: WrapReducer[S]): InjectableStore[S] = js.native
  def apply[S](preloadedState: S): InjectableStore[S] = js.native
  def apply[S](preloadedState: S, enhancer: reduxLib.reduxMod.StoreEnhancer[S, js.Object]): InjectableStore[S] = js.native
  def apply[S](
    preloadedState: S,
    enhancer: reduxLib.reduxMod.StoreEnhancer[S, js.Object],
    wrapReducer: WrapReducer[S]
  ): InjectableStore[S] = js.native
}

