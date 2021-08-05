package typings.recoil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.FC
import typings.recoil.anon.Get
import typings.recoil.anon.Reset
import typings.recoil.anon.Set
import typings.std.Error
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("recoil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("recoil", "AbstractRecoilValue")
  @js.native
  class AbstractRecoilValue[T] protected () extends StObject {
    def this(newKey: NodeKey) = this()
    
    def __cTag(t: T): Unit = js.native
    
    var __tag: js.Array[T] = js.native
    
    // for contravariance
    var key: NodeKey = js.native
  }
  
  @JSImport("recoil", "AbstractRecoilValueReadonly")
  @js.native
  class AbstractRecoilValueReadonly[T] protected () extends StObject {
    def this(newKey: NodeKey) = this()
    
    var __tag: js.Array[T] = js.native
    
    var key: NodeKey = js.native
  }
  
  @JSImport("recoil", "DefaultValue")
  @js.native
  class DefaultValue () extends StObject
  
  @JSImport("recoil", "RecoilRoot")
  @js.native
  val RecoilRoot: FC[RecoilRootProps] = js.native
  
  @JSImport("recoil", "RecoilState")
  @js.native
  class RecoilState[T] protected ()
    extends AbstractRecoilValue[T]
       with RecoilValue[T] {
    def this(newKey: NodeKey) = this()
  }
  
  @JSImport("recoil", "RecoilValueReadOnly")
  @js.native
  class RecoilValueReadOnly[T] protected ()
    extends AbstractRecoilValueReadonly[T]
       with RecoilValue[T] {
    def this(newKey: NodeKey) = this()
  }
  
  inline def atom[T](options: AtomOptions[T]): RecoilState[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("atom")(options.asInstanceOf[js.Any]).asInstanceOf[RecoilState[T]]
  
  inline def atomFamily[T, P /* <: SerializableParam */](options: AtomFamilyOptions[T, P]): js.Function1[/* param */ P, RecoilState[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atomFamily")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param */ P, RecoilState[T]]]
  
  inline def constSelector(constant: String): RecoilValueReadOnly[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[String]]
  inline def constSelector(constant: js.Array[SerializableParam]): RecoilValueReadOnly[js.Array[SerializableParam]] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[js.Array[SerializableParam]]]
  inline def constSelector(constant: js.Symbol): RecoilValueReadOnly[js.Symbol] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[js.Symbol]]
  inline def constSelector(constant: Boolean): RecoilValueReadOnly[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[Boolean]]
  inline def constSelector(constant: Double): RecoilValueReadOnly[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[Double]]
  inline def constSelector(constant: Null): RecoilValueReadOnly[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[Null]]
  inline def constSelector(constant: Unit): RecoilValueReadOnly[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[Unit]]
  inline def constSelector[T /* <: StringDictionary[SerializableParam] */](constant: T): RecoilValueReadOnly[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("constSelector")(constant.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[T]]
  
  inline def errorSelector(message: String): RecoilValueReadOnly[scala.Nothing] = ^.asInstanceOf[js.Dynamic].applyDynamic("errorSelector")(message.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[scala.Nothing]]
  
  inline def isRecoilValue(`val`: js.Any): /* is recoil.recoil.RecoilValue<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRecoilValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[/* is recoil.recoil.RecoilValue<any> */ Boolean]
  
  inline def noWait[T](state: RecoilValue[T]): RecoilValueReadOnly[Loadable[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("noWait")(state.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[Loadable[T]]]
  
  inline def readOnlySelector[T](atom: RecoilValue[T]): RecoilValueReadOnly[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("readOnlySelector")(atom.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[T]]
  
  inline def selector[T](options: ReadOnlySelectorOptions[T]): RecoilValueReadOnly[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("selector")(options.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[T]]
  inline def selector[T](options: ReadWriteSelectorOptions[T]): RecoilState[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("selector")(options.asInstanceOf[js.Any]).asInstanceOf[RecoilState[T]]
  
  inline def selectorFamily[T, P /* <: SerializableParam */](options: ReadOnlySelectorFamilyOptions[T, P]): js.Function1[/* param */ P, RecoilValueReadOnly[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectorFamily")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param */ P, RecoilValueReadOnly[T]]]
  inline def selectorFamily[T, P /* <: SerializableParam */](options: ReadWriteSelectorFamilyOptions[T, P]): js.Function1[/* param */ P, RecoilState[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("selectorFamily")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* param */ P, RecoilState[T]]]
  
  inline def useRecoilCallback[Args /* <: js.Array[js.Any] */, Return](fn: js.Function2[/* interface */ CallbackInterface, /* args */ Args, Return]): js.Function1[/* args */ Args, Return] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilCallback")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, Return]]
  inline def useRecoilCallback[Args /* <: js.Array[js.Any] */, Return](
    fn: js.Function2[/* interface */ CallbackInterface, /* args */ Args, Return],
    deps: js.Array[js.Any]
  ): js.Function1[/* args */ Args, Return] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilCallback")(fn.asInstanceOf[js.Any], deps.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* args */ Args, Return]]
  
  inline def useRecoilState[T](recoilState: RecoilState[T]): js.Tuple2[T, SetterOrUpdater[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilState")(recoilState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, SetterOrUpdater[T]]]
  
  inline def useRecoilStateLoadable[T](recoilState: RecoilState[T]): js.Tuple2[Loadable[T], SetterOrUpdater[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilStateLoadable")(recoilState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Loadable[T], SetterOrUpdater[T]]]
  
  inline def useRecoilValue[T](recoilValue: RecoilValue[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilValue")(recoilValue.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def useRecoilValueLoadable[T](recoilValue: RecoilValue[T]): Loadable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRecoilValueLoadable")(recoilValue.asInstanceOf[js.Any]).asInstanceOf[Loadable[T]]
  
  inline def useResetRecoilState(recoilState: RecoilState[js.Any]): Resetter = ^.asInstanceOf[js.Dynamic].applyDynamic("useResetRecoilState")(recoilState.asInstanceOf[js.Any]).asInstanceOf[Resetter]
  
  inline def useSetRecoilState[T](recoilState: RecoilState[T]): SetterOrUpdater[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetRecoilState")(recoilState.asInstanceOf[js.Any]).asInstanceOf[SetterOrUpdater[T]]
  
  inline def waitForAll[RecoilValues /* <: StringDictionary[RecoilValue[js.Any]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForAll")(param.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]]]
  
  inline def waitForAll_RecoilValues_ArrayRecoilValueAny[RecoilValues /* <: js.Array[RecoilValue[js.Any]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForAll")(param.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]]]
  
  inline def waitForAny[RecoilValues /* <: StringDictionary[RecoilValue[js.Any]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForAny")(param.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]]]
  
  inline def waitForAny_RecoilValues_ArrayRecoilValueAny[RecoilValues /* <: js.Array[RecoilValue[js.Any]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForAny")(param.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]]]
  
  inline def waitForNone[RecoilValues /* <: StringDictionary[RecoilValue[js.Any]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForNone")(param.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]]]
  
  inline def waitForNone_RecoilValues_ArrayRecoilValueAny[RecoilValues /* <: js.Array[RecoilValue[js.Any]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForNone")(param.asInstanceOf[js.Any]).asInstanceOf[RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]]]
  
  trait AtomFamilyOptions[T, P /* <: SerializableParam */] extends StObject {
    
    var default: RecoilValue[T] | js.Promise[T] | T | (js.Function1[/* param */ P, T | RecoilValue[T] | js.Promise[T]])
    
    var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
    
    var key: NodeKey
  }
  object AtomFamilyOptions {
    
    inline def apply[T, P /* <: SerializableParam */](
      default: RecoilValue[T] | js.Promise[T] | T | (js.Function1[/* param */ P, T | RecoilValue[T] | js.Promise[T]]),
      key: NodeKey
    ): AtomFamilyOptions[T, P] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[AtomFamilyOptions[T, P]]
    }
    
    extension [Self <: AtomFamilyOptions[?, ?], T, P /* <: SerializableParam */](x: Self & (AtomFamilyOptions[T, P])) {
      
      inline def setDangerouslyAllowMutability(value: Boolean): Self = StObject.set(x, "dangerouslyAllowMutability", value.asInstanceOf[js.Any])
      
      inline def setDangerouslyAllowMutabilityUndefined: Self = StObject.set(x, "dangerouslyAllowMutability", js.undefined)
      
      inline def setDefault(
        value: RecoilValue[T] | js.Promise[T] | T | (js.Function1[/* param */ P, T | RecoilValue[T] | js.Promise[T]])
      ): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultFunction1(value: /* param */ P => T | RecoilValue[T] | js.Promise[T]): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
      
      inline def setKey(value: NodeKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait AtomOptions[T] extends StObject {
    
    var default: RecoilValue[T] | js.Promise[T] | T
    
    var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
    
    var key: NodeKey
  }
  object AtomOptions {
    
    inline def apply[T](default: RecoilValue[T] | js.Promise[T] | T, key: NodeKey): AtomOptions[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[AtomOptions[T]]
    }
    
    extension [Self <: AtomOptions[?], T](x: Self & AtomOptions[T]) {
      
      inline def setDangerouslyAllowMutability(value: Boolean): Self = StObject.set(x, "dangerouslyAllowMutability", value.asInstanceOf[js.Any])
      
      inline def setDangerouslyAllowMutabilityUndefined: Self = StObject.set(x, "dangerouslyAllowMutability", js.undefined)
      
      inline def setDefault(value: RecoilValue[T] | js.Promise[T] | T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setKey(value: NodeKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type AtomValues = Map[NodeKey, Loadable[js.Any]]
  
  /* Inlined std.Readonly<{getPromise <T>(recoilVal : recoil.recoil.RecoilValue<T>): std.Promise<T>, getLoadable <T>(recoilVal : recoil.recoil.RecoilValue<T>): recoil.recoil.Loadable<T>, set <T>(recoilVal : recoil.recoil.RecoilState<T>, valOrUpdater : (currVal : T): T | T): void, reset (recoilVal : recoil.recoil.RecoilState<any>): void}> */
  trait CallbackInterface extends StObject {
    
    val getLoadable: js.Function1[/* recoilVal */ RecoilValue[js.Any], Loadable[js.Any]]
    
    val getPromise: js.Function1[/* recoilVal */ RecoilValue[js.Any], js.Promise[js.Any]]
    
    val reset: js.Function1[/* recoilVal */ RecoilState[js.Any], Unit]
    
    val set: js.Function2[
        /* recoilVal */ RecoilState[js.Any], 
        /* valOrUpdater */ (js.Function1[/* currVal */ js.Any, js.Any]) | js.Any, 
        Unit
      ]
  }
  object CallbackInterface {
    
    inline def apply(
      getLoadable: /* recoilVal */ RecoilValue[js.Any] => Loadable[js.Any],
      getPromise: /* recoilVal */ RecoilValue[js.Any] => js.Promise[js.Any],
      reset: /* recoilVal */ RecoilState[js.Any] => Unit,
      set: (/* recoilVal */ RecoilState[js.Any], /* valOrUpdater */ (js.Function1[/* currVal */ js.Any, js.Any]) | js.Any) => Unit
    ): CallbackInterface = {
      val __obj = js.Dynamic.literal(getLoadable = js.Any.fromFunction1(getLoadable), getPromise = js.Any.fromFunction1(getPromise), reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[CallbackInterface]
    }
    
    extension [Self <: CallbackInterface](x: Self) {
      
      inline def setGetLoadable(value: /* recoilVal */ RecoilValue[js.Any] => Loadable[js.Any]): Self = StObject.set(x, "getLoadable", js.Any.fromFunction1(value))
      
      inline def setGetPromise(value: /* recoilVal */ RecoilValue[js.Any] => js.Promise[js.Any]): Self = StObject.set(x, "getPromise", js.Any.fromFunction1(value))
      
      inline def setReset(value: /* recoilVal */ RecoilState[js.Any] => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setSet(
        value: (/* recoilVal */ RecoilState[js.Any], /* valOrUpdater */ (js.Function1[/* currVal */ js.Any, js.Any]) | js.Any) => Unit
      ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
  
  type ComponentCallback = js.Function1[/* state */ TreeState, Unit]
  
  type GetRecoilValue = js.Function1[/* recoilVal */ RecoilValue[js.Any], js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.recoil.anon.Contents[T]
    - typings.recoil.anon.ReadonlystatehasErrorcont
    - typings.recoil.anon.State[T]
  */
  trait Loadable[T] extends StObject
  object Loadable {
    
    inline def Contents[T](contents: T): typings.recoil.anon.Contents[T] = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = "hasValue")
      __obj.asInstanceOf[typings.recoil.anon.Contents[T]]
    }
    
    inline def ReadonlystatehasErrorcont(contents: Error): typings.recoil.anon.ReadonlystatehasErrorcont = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = "hasError")
      __obj.asInstanceOf[typings.recoil.anon.ReadonlystatehasErrorcont]
    }
    
    inline def State[T](contents: LoadablePromise[T]): typings.recoil.anon.State[T] = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = "loading")
      __obj.asInstanceOf[typings.recoil.anon.State[T]]
    }
  }
  
  type LoadablePromise[T] = js.Promise[ResolvedLoadablePromiseInfo[T]]
  
  type NodeKey = String
  
  type Primitive = js.UndefOr[Null | Boolean | Double | js.Symbol | String]
  
  trait ReadOnlySelectorFamilyOptions[T, P /* <: SerializableParam */] extends StObject {
    
    // cacheImplementation_UNSTABLE?: () => CacheImplementation<Loadable<T>>,
    // cacheImplementationForParams_UNSTABLE?: () => CacheImplementation<
    //   RecoilValue<T>,
    // >,
    var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
    
    def get(param: P): js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T]
    
    var key: String
  }
  object ReadOnlySelectorFamilyOptions {
    
    inline def apply[T, P /* <: SerializableParam */](get: P => js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T], key: String): ReadOnlySelectorFamilyOptions[T, P] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadOnlySelectorFamilyOptions[T, P]]
    }
    
    extension [Self <: ReadOnlySelectorFamilyOptions[?, ?], T, P /* <: SerializableParam */](x: Self & (ReadOnlySelectorFamilyOptions[T, P])) {
      
      inline def setDangerouslyAllowMutability(value: Boolean): Self = StObject.set(x, "dangerouslyAllowMutability", value.asInstanceOf[js.Any])
      
      inline def setDangerouslyAllowMutabilityUndefined: Self = StObject.set(x, "dangerouslyAllowMutability", js.undefined)
      
      inline def setGet(value: P => js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadOnlySelectorOptions[T] extends StObject {
    
    var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
    
    def get(opts: Get): js.Promise[T] | RecoilValue[T] | T
    
    var key: String
  }
  object ReadOnlySelectorOptions {
    
    inline def apply[T](get: Get => js.Promise[T] | RecoilValue[T] | T, key: String): ReadOnlySelectorOptions[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadOnlySelectorOptions[T]]
    }
    
    extension [Self <: ReadOnlySelectorOptions[?], T](x: Self & ReadOnlySelectorOptions[T]) {
      
      inline def setDangerouslyAllowMutability(value: Boolean): Self = StObject.set(x, "dangerouslyAllowMutability", value.asInstanceOf[js.Any])
      
      inline def setDangerouslyAllowMutabilityUndefined: Self = StObject.set(x, "dangerouslyAllowMutability", js.undefined)
      
      inline def setGet(value: Get => js.Promise[T] | RecoilValue[T] | T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait ReadWriteSelectorFamilyOptions[T, P /* <: SerializableParam */] extends StObject {
    
    // cacheImplementation_UNSTABLE?: () => CacheImplementation<Loadable<T>>,
    // cacheImplementationForParams_UNSTABLE?: () => CacheImplementation<
    //   RecoilValue<T>,
    // >,
    var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.undefined
    
    def get(param: P): js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T]
    
    var key: String
    
    def set(param: P): js.Function2[/* opts */ Reset, /* newValue */ T | DefaultValue, Unit]
  }
  object ReadWriteSelectorFamilyOptions {
    
    inline def apply[T, P /* <: SerializableParam */](
      get: P => js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T],
      key: String,
      set: P => js.Function2[/* opts */ Reset, /* newValue */ T | DefaultValue, Unit]
    ): ReadWriteSelectorFamilyOptions[T, P] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[ReadWriteSelectorFamilyOptions[T, P]]
    }
    
    extension [Self <: ReadWriteSelectorFamilyOptions[?, ?], T, P /* <: SerializableParam */](x: Self & (ReadWriteSelectorFamilyOptions[T, P])) {
      
      inline def setDangerouslyAllowMutability(value: Boolean): Self = StObject.set(x, "dangerouslyAllowMutability", value.asInstanceOf[js.Any])
      
      inline def setDangerouslyAllowMutabilityUndefined: Self = StObject.set(x, "dangerouslyAllowMutability", js.undefined)
      
      inline def setGet(value: P => js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSet(value: P => js.Function2[/* opts */ Reset, /* newValue */ T | DefaultValue, Unit]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ReadWriteSelectorOptions[T]
    extends StObject
       with ReadOnlySelectorOptions[T] {
    
    def set(opts: Reset, newValue: T): Unit = js.native
    def set(opts: Reset, newValue: DefaultValue): Unit = js.native
  }
  
  trait RecoilRootProps extends StObject {
    
    var initializeState: js.UndefOr[js.Function1[/* options */ Set, Unit]] = js.undefined
  }
  object RecoilRootProps {
    
    inline def apply(): RecoilRootProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecoilRootProps]
    }
    
    extension [Self <: RecoilRootProps](x: Self) {
      
      inline def setInitializeState(value: /* options */ Set => Unit): Self = StObject.set(x, "initializeState", js.Any.fromFunction1(value))
      
      inline def setInitializeStateUndefined: Self = StObject.set(x, "initializeState", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.recoil.mod.RecoilValueReadOnly[T]
    - typings.recoil.mod.RecoilState[T]
  */
  trait RecoilValue[T] extends StObject
  
  type ResetRecoilState = js.Function1[/* recoilVal */ RecoilState[js.Any], Unit]
  
  type Resetter = js.Function0[Unit]
  
  /* Inlined std.Readonly<{  value :T,   upstreamState__INTERNAL_DO_NOT_USE :recoil.recoil.TreeState | undefined}> */
  trait ResolvedLoadablePromiseInfo[T] extends StObject {
    
    val upstreamState__INTERNAL_DO_NOT_USE: js.UndefOr[TreeState] = js.undefined
    
    val value: T
  }
  object ResolvedLoadablePromiseInfo {
    
    inline def apply[T](value: T): ResolvedLoadablePromiseInfo[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedLoadablePromiseInfo[T]]
    }
    
    extension [Self <: ResolvedLoadablePromiseInfo[?], T](x: Self & ResolvedLoadablePromiseInfo[T]) {
      
      inline def setUpstreamState__INTERNAL_DO_NOT_USE(value: TreeState): Self = StObject.set(x, "upstreamState__INTERNAL_DO_NOT_USE", value.asInstanceOf[js.Any])
      
      inline def setUpstreamState__INTERNAL_DO_NOT_USEUndefined: Self = StObject.set(x, "upstreamState__INTERNAL_DO_NOT_USE", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SerializableParam = Primitive | (js.Array[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias recoil.recoil.SerializableParam */ js.Object
  ]) | (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias recoil.recoil.SerializableParam */ js.Object
  ])
  
  type SetRecoilState = js.Function2[
    /* recoilVal */ RecoilState[js.Any], 
    /* newVal */ js.Any | DefaultValue | (js.Function1[/* prevValue */ js.Any, js.Any | DefaultValue]), 
    Unit
  ]
  
  type SetterOrUpdater[T] = js.Function1[/* valOrUpdater */ (js.Function1[/* currVal */ T, T]) | T, Unit]
  
  /* Inlined std.Readonly<{  isSnapshot :boolean,   transactionMetadata :object,   dirtyAtoms :std.Set<recoil.recoil.NodeKey>,   atomValues :recoil.recoil.AtomValues,   nonvalidatedAtoms :std.Map<recoil.recoil.NodeKey, unknown>,   nodeDeps :std.Map<recoil.recoil.NodeKey, std.Set<recoil.recoil.NodeKey>>,   nodeToNodeSubscriptions :std.Map<recoil.recoil.NodeKey, std.Set<recoil.recoil.NodeKey>>,   nodeToComponentSubscriptions :std.Map<recoil.recoil.NodeKey, std.Map<number, [string, recoil.recoil.ComponentCallback]>>}> */
  trait TreeState extends StObject {
    
    val atomValues: AtomValues
    
    val dirtyAtoms: typings.std.Set[NodeKey]
    
    val isSnapshot: Boolean
    
    val nodeDeps: Map[NodeKey, typings.std.Set[NodeKey]]
    
    val nodeToComponentSubscriptions: Map[NodeKey, Map[Double, js.Tuple2[String, ComponentCallback]]]
    
    val nodeToNodeSubscriptions: Map[NodeKey, typings.std.Set[NodeKey]]
    
    val nonvalidatedAtoms: Map[NodeKey, js.Any]
    
    val transactionMetadata: js.Object
  }
  object TreeState {
    
    inline def apply(
      atomValues: AtomValues,
      dirtyAtoms: typings.std.Set[NodeKey],
      isSnapshot: Boolean,
      nodeDeps: Map[NodeKey, typings.std.Set[NodeKey]],
      nodeToComponentSubscriptions: Map[NodeKey, Map[Double, js.Tuple2[String, ComponentCallback]]],
      nodeToNodeSubscriptions: Map[NodeKey, typings.std.Set[NodeKey]],
      nonvalidatedAtoms: Map[NodeKey, js.Any],
      transactionMetadata: js.Object
    ): TreeState = {
      val __obj = js.Dynamic.literal(atomValues = atomValues.asInstanceOf[js.Any], dirtyAtoms = dirtyAtoms.asInstanceOf[js.Any], isSnapshot = isSnapshot.asInstanceOf[js.Any], nodeDeps = nodeDeps.asInstanceOf[js.Any], nodeToComponentSubscriptions = nodeToComponentSubscriptions.asInstanceOf[js.Any], nodeToNodeSubscriptions = nodeToNodeSubscriptions.asInstanceOf[js.Any], nonvalidatedAtoms = nonvalidatedAtoms.asInstanceOf[js.Any], transactionMetadata = transactionMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeState]
    }
    
    extension [Self <: TreeState](x: Self) {
      
      inline def setAtomValues(value: AtomValues): Self = StObject.set(x, "atomValues", value.asInstanceOf[js.Any])
      
      inline def setDirtyAtoms(value: typings.std.Set[NodeKey]): Self = StObject.set(x, "dirtyAtoms", value.asInstanceOf[js.Any])
      
      inline def setIsSnapshot(value: Boolean): Self = StObject.set(x, "isSnapshot", value.asInstanceOf[js.Any])
      
      inline def setNodeDeps(value: Map[NodeKey, typings.std.Set[NodeKey]]): Self = StObject.set(x, "nodeDeps", value.asInstanceOf[js.Any])
      
      inline def setNodeToComponentSubscriptions(value: Map[NodeKey, Map[Double, js.Tuple2[String, ComponentCallback]]]): Self = StObject.set(x, "nodeToComponentSubscriptions", value.asInstanceOf[js.Any])
      
      inline def setNodeToNodeSubscriptions(value: Map[NodeKey, typings.std.Set[NodeKey]]): Self = StObject.set(x, "nodeToNodeSubscriptions", value.asInstanceOf[js.Any])
      
      inline def setNonvalidatedAtoms(value: Map[NodeKey, js.Any]): Self = StObject.set(x, "nonvalidatedAtoms", value.asInstanceOf[js.Any])
      
      inline def setTransactionMetadata(value: js.Object): Self = StObject.set(x, "transactionMetadata", value.asInstanceOf[js.Any])
    }
  }
  
  type UnwrapRecoilValue[T] = js.Any
  
  type UnwrapRecoilValueLoadables[T /* <: js.Array[RecoilValue[js.Any]] | StringDictionary[RecoilValue[js.Any]] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: recoil.recoil.Loadable<recoil.recoil.UnwrapRecoilValue<T[P]>>}
    */ typings.recoil.recoilStrings.UnwrapRecoilValueLoadables & TopLevel[T]
}
