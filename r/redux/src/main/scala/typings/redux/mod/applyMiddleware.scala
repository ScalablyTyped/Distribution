package typings.redux.mod

import typings.redux.anon.DispatchExt
import typings.redux.anon.`0`
import typings.redux.anon.`1`
import typings.redux.anon.`2`
import typings.redux.anon.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux", "applyMiddleware")
@js.native
object applyMiddleware extends js.Object {
  def apply(): StoreEnhancer[js.Object, js.Object] = js.native
  def apply[Ext1, S](middleware1: Middleware[Ext1, S, _]): StoreEnhancer[typings.redux.anon.Dispatch[Ext1], js.Object] = js.native
  def apply[Ext, S](middlewares: (Middleware[_, S, _])*): StoreEnhancer[DispatchExt[Ext], js.Object] = js.native
  def apply[Ext1, Ext2, S](middleware1: Middleware[Ext1, S, _], middleware2: Middleware[Ext2, S, _]): StoreEnhancer[`0`[Ext1, Ext2], js.Object] = js.native
  def apply[Ext1, Ext2, Ext3, S](
    middleware1: Middleware[Ext1, S, _],
    middleware2: Middleware[Ext2, S, _],
    middleware3: Middleware[Ext3, S, _]
  ): StoreEnhancer[`1`[Ext1, Ext2, Ext3], js.Object] = js.native
  def apply[Ext1, Ext2, Ext3, Ext4, S](
    middleware1: Middleware[Ext1, S, _],
    middleware2: Middleware[Ext2, S, _],
    middleware3: Middleware[Ext3, S, _],
    middleware4: Middleware[Ext4, S, _]
  ): StoreEnhancer[`2`[Ext1, Ext2, Ext3, Ext4], js.Object] = js.native
  def apply[Ext1, Ext2, Ext3, Ext4, Ext5, S](
    middleware1: Middleware[Ext1, S, _],
    middleware2: Middleware[Ext2, S, _],
    middleware3: Middleware[Ext3, S, _],
    middleware4: Middleware[Ext4, S, _],
    middleware5: Middleware[Ext5, S, _]
  ): StoreEnhancer[`3`[Ext1, Ext2, Ext3, Ext4, Ext5], js.Object] = js.native
}

