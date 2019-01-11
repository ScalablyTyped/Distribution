package typings
package reduxLib.reduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val createStore: reduxLib.reduxMod.StoreCreator = js.native
  def applyMiddleware(): reduxLib.reduxMod.StoreEnhancer[js.Object, js.Object] = js.native
  def applyMiddleware[Ext1, S](middleware1: reduxLib.reduxMod.Middleware[Ext1, S, _]): reduxLib.reduxMod.StoreEnhancer[reduxLib.Anon_Dispatch[Ext1], js.Object] = js.native
  def applyMiddleware[Ext, S](middlewares: (reduxLib.reduxMod.Middleware[_, S, _])*): reduxLib.reduxMod.StoreEnhancer[reduxLib.Anon_DispatchExt[Ext], js.Object] = js.native
  def applyMiddleware[Ext1, Ext2, S](
    middleware1: reduxLib.reduxMod.Middleware[Ext1, S, _],
    middleware2: reduxLib.reduxMod.Middleware[Ext2, S, _]
  ): reduxLib.reduxMod.StoreEnhancer[reduxLib.Anon_DispatchExt1[Ext1, Ext2], js.Object] = js.native
  def applyMiddleware[Ext1, Ext2, Ext3, S](
    middleware1: reduxLib.reduxMod.Middleware[Ext1, S, _],
    middleware2: reduxLib.reduxMod.Middleware[Ext2, S, _],
    middleware3: reduxLib.reduxMod.Middleware[Ext3, S, _]
  ): reduxLib.reduxMod.StoreEnhancer[reduxLib.Anon_DispatchExt1Ext2[Ext1, Ext2, Ext3], js.Object] = js.native
  def applyMiddleware[Ext1, Ext2, Ext3, Ext4, S](
    middleware1: reduxLib.reduxMod.Middleware[Ext1, S, _],
    middleware2: reduxLib.reduxMod.Middleware[Ext2, S, _],
    middleware3: reduxLib.reduxMod.Middleware[Ext3, S, _],
    middleware4: reduxLib.reduxMod.Middleware[Ext4, S, _]
  ): reduxLib.reduxMod.StoreEnhancer[reduxLib.Anon_DispatchExt1Ext2Ext3[Ext1, Ext2, Ext3, Ext4], js.Object] = js.native
  def applyMiddleware[Ext1, Ext2, Ext3, Ext4, Ext5, S](
    middleware1: reduxLib.reduxMod.Middleware[Ext1, S, _],
    middleware2: reduxLib.reduxMod.Middleware[Ext2, S, _],
    middleware3: reduxLib.reduxMod.Middleware[Ext3, S, _],
    middleware4: reduxLib.reduxMod.Middleware[Ext4, S, _],
    middleware5: reduxLib.reduxMod.Middleware[Ext5, S, _]
  ): reduxLib.reduxMod.StoreEnhancer[reduxLib.Anon_DispatchExt1Ext2Ext3Ext4[Ext4, Ext3, Ext5, Ext1, Ext2], js.Object] = js.native
  def bindActionCreators[M /* <: reduxLib.reduxMod.ActionCreatorsMapObject[_] */, N /* <: reduxLib.reduxMod.ActionCreatorsMapObject[_] */](actionCreators: M, dispatch: reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]): N = js.native
  @JSName("bindActionCreators")
  def bindActionCreators_AActionCreatorBActionCreatorB[A /* <: reduxLib.reduxMod.ActionCreator[_] */, B /* <: reduxLib.reduxMod.ActionCreator[_] */](actionCreator: A, dispatch: reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]): B = js.native
  @JSName("bindActionCreators")
  def bindActionCreators_ACActionCreatorC[A, C /* <: reduxLib.reduxMod.ActionCreator[A] */](actionCreator: C, dispatch: reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]): C = js.native
  @JSName("bindActionCreators")
  def bindActionCreators_AMActionCreatorsMapObjectM[A, M /* <: reduxLib.reduxMod.ActionCreatorsMapObject[A] */](actionCreators: M, dispatch: reduxLib.reduxMod.Dispatch[reduxLib.reduxMod.AnyAction]): M = js.native
  def combineReducers[S](reducers: reduxLib.reduxMod.ReducersMapObject[S, _]): reduxLib.reduxMod.Reducer[S, reduxLib.reduxMod.AnyAction] = js.native
  @JSName("combineReducers")
  def combineReducers_SAAction[S, A /* <: reduxLib.reduxMod.Action[_] */](reducers: reduxLib.reduxMod.ReducersMapObject[S, A]): reduxLib.reduxMod.Reducer[S, A] = js.native
  def compose(): js.Function1[/* a */ js.Any, _] = js.native
  def compose[R](f1: js.Function1[/* b */ js.Any, R], funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
  def compose[F /* <: js.Function */](f: F): F = js.native
  def compose[R](funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
  def compose[A, R](f1: js.Function1[/* b */ A, R], f2: reduxLib.Func0[A]): reduxLib.Func0[R] = js.native
  def compose[A, B, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: reduxLib.Func0[A]): reduxLib.Func0[R] = js.native
  def compose[A, T1, R](f1: js.Function1[/* b */ A, R], f2: reduxLib.Func1[T1, A]): reduxLib.Func1[T1, R] = js.native
  def compose[A, B, C, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: reduxLib.Func0[A]
  ): reduxLib.Func0[R] = js.native
  def compose[A, B, T1, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: reduxLib.Func1[T1, A]): reduxLib.Func1[T1, R] = js.native
  def compose[A, T1, T2, R](f1: js.Function1[/* b */ A, R], f2: reduxLib.Func2[T1, T2, A]): reduxLib.Func2[T1, T2, R] = js.native
  def compose[A, B, C, T1, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: reduxLib.Func1[T1, A]
  ): reduxLib.Func1[T1, R] = js.native
  def compose[A, B, T1, T2, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: reduxLib.Func2[T1, T2, A]): reduxLib.Func2[T1, T2, R] = js.native
  def compose[A, T1, T2, T3, R](f1: js.Function1[/* b */ A, R], f2: reduxLib.Func3[T1, T2, T3, A]): reduxLib.Func3[T1, T2, T3, R] = js.native
  def compose[A, B, C, T1, T2, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: reduxLib.Func2[T1, T2, A]
  ): reduxLib.Func2[T1, T2, R] = js.native
  def compose[A, B, T1, T2, T3, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: reduxLib.Func3[T1, T2, T3, A]): reduxLib.Func3[T1, T2, T3, R] = js.native
  def compose[A, B, C, T1, T2, T3, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: reduxLib.Func3[T1, T2, T3, A]
  ): reduxLib.Func3[T1, T2, T3, R] = js.native
}

