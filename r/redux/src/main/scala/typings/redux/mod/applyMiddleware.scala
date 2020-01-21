package typings.redux.mod

import typings.redux.AnonDispatch
import typings.redux.AnonDispatchExt
import typings.redux.AnonDispatchExt1
import typings.redux.AnonDispatchExt1Ext2
import typings.redux.AnonDispatchExt1Ext2Ext3
import typings.redux.AnonDispatchExt1Ext2Ext3Ext4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux", "applyMiddleware")
@js.native
object applyMiddleware extends js.Object {
  def apply(): StoreEnhancer[js.Object, js.Object] = js.native
  def apply[Ext1, S](middleware1: Middleware[Ext1, S, _]): StoreEnhancer[AnonDispatch[Ext1], js.Object] = js.native
  def apply[Ext, S](middlewares: (Middleware[_, S, _])*): StoreEnhancer[AnonDispatchExt[Ext], js.Object] = js.native
  def apply[Ext1, Ext2, S](middleware1: Middleware[Ext1, S, _], middleware2: Middleware[Ext2, S, _]): StoreEnhancer[AnonDispatchExt1[Ext1, Ext2], js.Object] = js.native
  def apply[Ext1, Ext2, Ext3, S](
    middleware1: Middleware[Ext1, S, _],
    middleware2: Middleware[Ext2, S, _],
    middleware3: Middleware[Ext3, S, _]
  ): StoreEnhancer[AnonDispatchExt1Ext2[Ext1, Ext2, Ext3], js.Object] = js.native
  def apply[Ext1, Ext2, Ext3, Ext4, S](
    middleware1: Middleware[Ext1, S, _],
    middleware2: Middleware[Ext2, S, _],
    middleware3: Middleware[Ext3, S, _],
    middleware4: Middleware[Ext4, S, _]
  ): StoreEnhancer[AnonDispatchExt1Ext2Ext3[Ext1, Ext2, Ext3, Ext4], js.Object] = js.native
  def apply[Ext1, Ext2, Ext3, Ext4, Ext5, S](
    middleware1: Middleware[Ext1, S, _],
    middleware2: Middleware[Ext2, S, _],
    middleware3: Middleware[Ext3, S, _],
    middleware4: Middleware[Ext4, S, _],
    middleware5: Middleware[Ext5, S, _]
  ): StoreEnhancer[AnonDispatchExt1Ext2Ext3Ext4[Ext1, Ext2, Ext3, Ext4, Ext5], js.Object] = js.native
}

