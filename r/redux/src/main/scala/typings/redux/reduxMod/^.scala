package typings.redux.reduxMod

import typings.redux.Anon_Dispatch
import typings.redux.Anon_DispatchExt
import typings.redux.Anon_DispatchExt1
import typings.redux.Anon_DispatchExt1Ext2
import typings.redux.Anon_DispatchExt1Ext2Ext3
import typings.redux.Anon_DispatchExt1Ext2Ext3Ext4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val createStore: StoreCreator = js.native
  def applyMiddleware(): StoreEnhancer[js.Object, js.Object] = js.native
  def applyMiddleware[Ext1, S](middleware1: Middleware[Ext1, S, _]): StoreEnhancer[Anon_Dispatch[Ext1], js.Object] = js.native
  def applyMiddleware[Ext, S](middlewares: (Middleware[_, S, _])*): StoreEnhancer[Anon_DispatchExt[Ext], js.Object] = js.native
  def applyMiddleware[Ext1, Ext2, S](middleware1: Middleware[Ext1, S, _], middleware2: Middleware[Ext2, S, _]): StoreEnhancer[Anon_DispatchExt1[Ext1, Ext2], js.Object] = js.native
  def applyMiddleware[Ext1, Ext2, Ext3, S](
    middleware1: Middleware[Ext1, S, _],
    middleware2: Middleware[Ext2, S, _],
    middleware3: Middleware[Ext3, S, _]
  ): StoreEnhancer[Anon_DispatchExt1Ext2[Ext1, Ext2, Ext3], js.Object] = js.native
  def applyMiddleware[Ext1, Ext2, Ext3, Ext4, S](
    middleware1: Middleware[Ext1, S, _],
    middleware2: Middleware[Ext2, S, _],
    middleware3: Middleware[Ext3, S, _],
    middleware4: Middleware[Ext4, S, _]
  ): StoreEnhancer[Anon_DispatchExt1Ext2Ext3[Ext1, Ext2, Ext3, Ext4], js.Object] = js.native
  def applyMiddleware[Ext1, Ext2, Ext3, Ext4, Ext5, S](
    middleware1: Middleware[Ext1, S, _],
    middleware2: Middleware[Ext2, S, _],
    middleware3: Middleware[Ext3, S, _],
    middleware4: Middleware[Ext4, S, _],
    middleware5: Middleware[Ext5, S, _]
  ): StoreEnhancer[Anon_DispatchExt1Ext2Ext3Ext4[Ext4, Ext3, Ext5, Ext1, Ext2], js.Object] = js.native
  def bindActionCreators[A /* <: ActionCreator[_] */, B /* <: ActionCreator[_] */](actionCreator: A, dispatch: Dispatch[AnyAction]): B = js.native
  @JSName("bindActionCreators")
  def bindActionCreators_AC_ActionCreatorA_C[A, C /* <: ActionCreator[A] */](actionCreator: C, dispatch: Dispatch[AnyAction]): C = js.native
  @JSName("bindActionCreators")
  def bindActionCreators_AM_ActionCreatorsMapObjectA_M[A, M /* <: ActionCreatorsMapObject[A] */](actionCreators: M, dispatch: Dispatch[AnyAction]): M = js.native
  @JSName("bindActionCreators")
  def bindActionCreators_M_ActionCreatorsMapObjectWildcardN_ActionCreatorsMapObjectWildcard_N[M /* <: ActionCreatorsMapObject[_] */, N /* <: ActionCreatorsMapObject[_] */](actionCreators: M, dispatch: Dispatch[AnyAction]): N = js.native
  def combineReducers[S](reducers: ReducersMapObject[S, _]): Reducer[S, AnyAction] = js.native
  @JSName("combineReducers")
  def combineReducers_SA_ActionWildcard[S, A /* <: Action[_] */](reducers: ReducersMapObject[S, A]): Reducer[S, A] = js.native
  def compose(): js.Function1[/* a */ js.Any, _] = js.native
  def compose[R](f1: js.Function1[/* b */ js.Any, R], funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
  def compose[F /* <: js.Function */](f: F): F = js.native
  def compose[R](funcs: js.Function*): js.Function1[/* repeated */ js.Any, R] = js.native
  def compose[A, R](f1: js.Function1[/* b */ A, R], f2: Func0[A]): Func0[R] = js.native
  def compose[A, B, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func0[A]): Func0[R] = js.native
  def compose[A, T1, R](f1: js.Function1[/* b */ A, R], f2: Func1[T1, A]): Func1[T1, R] = js.native
  def compose[A, B, C, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func0[A]
  ): Func0[R] = js.native
  def compose[A, B, T1, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func1[T1, A]): Func1[T1, R] = js.native
  def compose[A, T1, T2, R](f1: js.Function1[/* b */ A, R], f2: Func2[T1, T2, A]): Func2[T1, T2, R] = js.native
  def compose[A, B, C, T1, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func1[T1, A]
  ): Func1[T1, R] = js.native
  def compose[A, B, T1, T2, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func2[T1, T2, A]): Func2[T1, T2, R] = js.native
  def compose[A, T1, T2, T3, R](f1: js.Function1[/* b */ A, R], f2: Func3[T1, T2, T3, A]): Func3[T1, T2, T3, R] = js.native
  def compose[A, B, C, T1, T2, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func2[T1, T2, A]
  ): Func2[T1, T2, R] = js.native
  def compose[A, B, T1, T2, T3, R](f1: js.Function1[/* b */ B, R], f2: js.Function1[/* a */ A, B], f3: Func3[T1, T2, T3, A]): Func3[T1, T2, T3, R] = js.native
  def compose[A, B, C, T1, T2, T3, R](
    f1: js.Function1[/* b */ C, R],
    f2: js.Function1[/* a */ B, C],
    f3: js.Function1[/* a */ A, B],
    f4: Func3[T1, T2, T3, A]
  ): Func3[T1, T2, T3, R] = js.native
}

