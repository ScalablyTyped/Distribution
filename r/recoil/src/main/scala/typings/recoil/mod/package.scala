package typings.recoil.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.FC
import typings.recoil.anon.ChildrenReactNode
import typings.recoil.anon.GetInfoUNSTABLE
import typings.recoil.anon.PreviousSnapshot
import typings.recoil.mod.^
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def RecoilBridge: FC[ChildrenReactNode] = ^.asInstanceOf[js.Dynamic].selectDynamic("RecoilBridge").asInstanceOf[FC[ChildrenReactNode]]

inline def RecoilRoot: FC[RecoilRootProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("RecoilRoot").asInstanceOf[FC[RecoilRootProps]]

inline def atomFamily[T, P /* <: SerializableParam */](options: AtomFamilyOptions[T, P]): js.Function1[/* param */ P, RecoilState[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atomFamily")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param */ P, RecoilState[T]]]

inline def constSelector(constant: String): RecoilValueReadOnly[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[String]]
inline def constSelector(constant: js.Array[SerializableParam]): RecoilValueReadOnly[js.Array[SerializableParam]] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[js.Array[SerializableParam]]]
inline def constSelector(constant: js.Symbol): RecoilValueReadOnly[js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[js.Symbol]]
inline def constSelector(constant: Boolean): RecoilValueReadOnly[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[Boolean]]
inline def constSelector(constant: Double): RecoilValueReadOnly[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[Double]]
inline def constSelector(constant: Null): RecoilValueReadOnly[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[Null]]
inline def constSelector(constant: Unit): RecoilValueReadOnly[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[Unit]]
inline def constSelector(constant: HasToJSON): RecoilValueReadOnly[HasToJSON] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[HasToJSON]]
inline def constSelector(constant: ReadonlyMap[SerializableParam, SerializableParam]): RecoilValueReadOnly[ReadonlyMap[SerializableParam, SerializableParam]] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[ReadonlyMap[SerializableParam, SerializableParam]]]
inline def constSelector(constant: ReadonlySet[SerializableParam]): RecoilValueReadOnly[ReadonlySet[SerializableParam]] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[ReadonlySet[SerializableParam]]]
inline def constSelector[T /* <: js.Object */](constant: T): RecoilValueReadOnly[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[T]]

inline def errorSelector(message: String): RecoilValueReadOnly[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorSelector")(message.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[scala.Nothing]]

inline def isRecoilValue(`val`: Any): /* is recoil.recoil.RecoilValue<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRecoilValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is recoil.recoil.RecoilValue<any> */ Boolean]

inline def noWait[T](state: RecoilValue[T]): RecoilValueReadOnly[Loadable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("noWait")(state.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[Loadable[T]]]

inline def readOnlySelector[T](atom: RecoilValue[T]): RecoilValueReadOnly[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("readOnlySelector")(atom.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[T]]

inline def selectorFamily[T, P /* <: SerializableParam */](options: ReadOnlySelectorFamilyOptions[T, P]): js.Function1[/* param */ P, RecoilValueReadOnly[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectorFamily")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param */ P, RecoilValueReadOnly[T]]]
inline def selectorFamily[T, P /* <: SerializableParam */](options: ReadWriteSelectorFamilyOptions[T, P]): js.Function1[/* param */ P, RecoilState[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectorFamily")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param */ P, RecoilState[T]]]

inline def snapshotUNSTABLE(): Snapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("snapshot_UNSTABLE")().asInstanceOf[Snapshot]
inline def snapshotUNSTABLE(initializeState: js.Function1[/* shapshot */ MutableSnapshot, Unit]): Snapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("snapshot_UNSTABLE")(initializeState.asInstanceOf[js.Any]).asInstanceOf[Snapshot]

inline def useGetRecoilValueInfoUNSTABLE(): js.Function1[/* recoilValue */ RecoilValue[Any], RecoilStateInfo[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGetRecoilValueInfo_UNSTABLE")().asInstanceOf[js.Function1[/* recoilValue */ RecoilValue[Any], RecoilStateInfo[Any]]]

inline def useGotoRecoilSnapshot(): js.Function1[/* snapshot */ Snapshot, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useGotoRecoilSnapshot")().asInstanceOf[js.Function1[/* snapshot */ Snapshot, Unit]]

inline def useRecoilBridgeAcrossReactRootsUNSTABLE(): FC[ChildrenReactNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilBridgeAcrossReactRoots_UNSTABLE")().asInstanceOf[FC[ChildrenReactNode]]

inline def useRecoilCallback[Args /* <: js.Array[Any] */, Return](fn: js.Function1[/* interface */ CallbackInterface, js.Function1[/* args */ Args, Return]]): js.Function1[/* args */ Args, Return] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilCallback")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, Return]]
inline def useRecoilCallback[Args /* <: js.Array[Any] */, Return](
  fn: js.Function1[/* interface */ CallbackInterface, js.Function1[/* args */ Args, Return]],
  deps: js.Array[Any]
): js.Function1[/* args */ Args, Return] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilCallback")(fn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Args, Return]]

inline def useRecoilRefresherUNSTABLE(recoilValue: RecoilValue[Any]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilRefresher_UNSTABLE")(recoilValue.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]

inline def useRecoilSnapshot(): Snapshot = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilSnapshot")().asInstanceOf[Snapshot]

inline def useRecoilState[T](recoilState: RecoilState[T]): js.Tuple2[T, SetterOrUpdater[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilState")(recoilState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, SetterOrUpdater[T]]]

inline def useRecoilStateLoadable[T](recoilState: RecoilState[T]): js.Tuple2[Loadable[T], SetterOrUpdater[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilStateLoadable")(recoilState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Loadable[T], SetterOrUpdater[T]]]

inline def useRecoilStateTRANSITIONSUPPORTUNSTABLE[T](recoilState: RecoilState[T]): js.Tuple2[T, SetterOrUpdater[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilState_TRANSITION_SUPPORT_UNSTABLE")(recoilState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, SetterOrUpdater[T]]]

inline def useRecoilStoreID(): StoreID = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilStoreID")().asInstanceOf[StoreID]

inline def useRecoilTransactionObserverUNSTABLE(callback: js.Function1[/* opts */ PreviousSnapshot, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilTransactionObserver_UNSTABLE")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def useRecoilTransactionUNSTABLE[Args /* <: js.Array[Any] */](
  fn: js.Function1[/* interface */ TransactionInterfaceUNSTABLE, js.Function1[/* args */ Args, Unit]]
): js.Function1[/* args */ Args, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilTransaction_UNSTABLE")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, Unit]]
inline def useRecoilTransactionUNSTABLE[Args /* <: js.Array[Any] */](
  fn: js.Function1[/* interface */ TransactionInterfaceUNSTABLE, js.Function1[/* args */ Args, Unit]],
  deps: js.Array[Any]
): js.Function1[/* args */ Args, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilTransaction_UNSTABLE")(fn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Args, Unit]]

inline def useRecoilValue[T](recoilValue: RecoilValue[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilValue")(recoilValue.asInstanceOf[js.Any]).asInstanceOf[T]

inline def useRecoilValueLoadable[T](recoilValue: RecoilValue[T]): Loadable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilValueLoadable")(recoilValue.asInstanceOf[js.Any]).asInstanceOf[Loadable[T]]

inline def useRecoilValueLoadableTRANSITIONSUPPORTUNSTABLE[T](recoilValue: RecoilValue[T]): Loadable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilValueLoadable_TRANSITION_SUPPORT_UNSTABLE")(recoilValue.asInstanceOf[js.Any]).asInstanceOf[Loadable[T]]

inline def useRecoilValueTRANSITIONSUPPORTUNSTABLE[T](recoilValue: RecoilValue[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilValue_TRANSITION_SUPPORT_UNSTABLE")(recoilValue.asInstanceOf[js.Any]).asInstanceOf[T]

inline def useResetRecoilState(recoilState: RecoilState[Any]): Resetter = ^.asInstanceOf[js.Dynamic].applyDynamic("useResetRecoilState")(recoilState.asInstanceOf[js.Any]).asInstanceOf[Resetter]

inline def useSetRecoilState[T](recoilState: RecoilState[T]): SetterOrUpdater[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetRecoilState")(recoilState.asInstanceOf[js.Any]).asInstanceOf[SetterOrUpdater[T]]

inline def waitForAll[RecoilValues /* <: StringDictionary[RecoilValue[Any]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValues[RecoilValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForAll")(param.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[UnwrapRecoilValues[RecoilValues]]]

inline def waitForAllSettled[RecoilValues /* <: StringDictionary[RecoilValue[Any]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForAllSettled")(param.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]]]

inline def waitForAllSettled_RecoilValues_ArrayRecoilValueAny[RecoilValues /* <: js.Array[RecoilValue[Any]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForAllSettled")(param.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]]]

inline def waitForAll_RecoilValues_ArrayRecoilValueAny[RecoilValues /* <: js.Array[RecoilValue[Any]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValues[RecoilValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForAll")(param.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[UnwrapRecoilValues[RecoilValues]]]

inline def waitForAny[RecoilValues /* <: StringDictionary[RecoilValue[Any]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForAny")(param.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]]]

inline def waitForAny_RecoilValues_ArrayRecoilValueAny[RecoilValues /* <: js.Array[RecoilValue[Any]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForAny")(param.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]]]

inline def waitForNone[RecoilValues /* <: StringDictionary[RecoilValue[Any]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForNone")(param.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]]]

inline def waitForNone_RecoilValues_ArrayRecoilValueAny[RecoilValues /* <: js.Array[RecoilValue[Any]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForNone")(param.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]]]

type AtomEffect[T] = js.Function1[/* param */ GetInfoUNSTABLE[T], Unit | js.Function0[Unit]]

type GetCallback = js.Function1[
/* fn */ js.Function1[
  /* interface */ SelectorCallbackInterface, 
  js.Function1[/* args */ js.Array[Any], Any]
], 
js.Function1[/* args */ js.Array[Any], Any]]

type GetRecoilValue = js.Function1[/* recoilVal */ RecoilValue[Any], Any]

// state.d.ts
type NodeKey = String

// eslint-disable-line @typescript-eslint/no-explicit-any
/** Utilities */
// bigint not supported yet
type Primitive = js.UndefOr[Null | Boolean | Double | js.Symbol | String]

type ResetRecoilState = js.Function1[/* recoilVal */ RecoilState[Any], Unit]

type Resetter = js.Function0[Unit]

type SerializableParam = Primitive | HasToJSON | js.Array[Any] | ReadonlySet[Any] | (ReadonlyMap[Any, Any]) | js.Object

type SetRecoilState = js.Function2[
/* recoilVal */ RecoilState[Any], 
/* newVal */ Any | DefaultValue | (js.Function1[/* prevValue */ Any, Any | DefaultValue]), 
Unit]

type SetterOrUpdater[T] = js.Function1[/* valOrUpdater */ (js.Function1[/* currVal */ T, T]) | T, Unit]

type UnwrapLoadable[T] = T

type UnwrapLoadables[T /* <: js.Array[Any] | StringDictionary[Any] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: recoil.recoil.UnwrapLoadable<T[P]>}
  */ typings.recoil.recoilStrings.UnwrapLoadables & TopLevel[T]

type UnwrapRecoilValue[T] = Any

type UnwrapRecoilValueLoadables[T /* <: js.Array[RecoilValue[Any]] | StringDictionary[RecoilValue[Any]] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: recoil.recoil.Loadable<recoil.recoil.UnwrapRecoilValue<T[P]>>}
  */ typings.recoil.recoilStrings.UnwrapRecoilValueLoadables & TopLevel[T]

type UnwrapRecoilValues[T /* <: js.Array[RecoilValue[Any]] | StringDictionary[RecoilValue[Any]] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: recoil.recoil.UnwrapRecoilValue<T[P]>}
  */ typings.recoil.recoilStrings.UnwrapRecoilValues & TopLevel[T]
