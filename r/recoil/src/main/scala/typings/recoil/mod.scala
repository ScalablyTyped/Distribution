package typings.recoil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.react.mod.FC
import typings.recoil.anon.Get
import typings.recoil.anon.Reset
import typings.recoil.anon.Set
import typings.recoil.recoilStrings.hasError
import typings.recoil.recoilStrings.hasValue
import typings.recoil.recoilStrings.loading
import typings.std.Error
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  @JSImport("recoil", "atom")
  @js.native
  def atom[T](options: AtomOptions[T]): RecoilState[T] = js.native
  
  @JSImport("recoil", "atomFamily")
  @js.native
  def atomFamily[T, P /* <: SerializableParam */](options: AtomFamilyOptions[T, P]): js.Function1[/* param */ P, RecoilState[T]] = js.native
  
  @JSImport("recoil", "constSelector")
  @js.native
  def constSelector(constant: js.UndefOr[scala.Nothing]): RecoilValueReadOnly[js.UndefOr[scala.Nothing]] = js.native
  @JSImport("recoil", "constSelector")
  @js.native
  def constSelector(constant: String): RecoilValueReadOnly[String] = js.native
  @JSImport("recoil", "constSelector")
  @js.native
  def constSelector(constant: js.Array[SerializableParam]): RecoilValueReadOnly[js.Array[SerializableParam]] = js.native
  @JSImport("recoil", "constSelector")
  @js.native
  def constSelector(constant: js.Symbol): RecoilValueReadOnly[js.Symbol] = js.native
  @JSImport("recoil", "constSelector")
  @js.native
  def constSelector(constant: Boolean): RecoilValueReadOnly[Boolean] = js.native
  @JSImport("recoil", "constSelector")
  @js.native
  def constSelector(constant: Double): RecoilValueReadOnly[Double] = js.native
  @JSImport("recoil", "constSelector")
  @js.native
  def constSelector(constant: Null): RecoilValueReadOnly[Null] = js.native
  @JSImport("recoil", "constSelector")
  @js.native
  def constSelector[T /* <: StringDictionary[SerializableParam] */](constant: T): RecoilValueReadOnly[T] = js.native
  
  @JSImport("recoil", "errorSelector")
  @js.native
  def errorSelector(message: String): RecoilValueReadOnly[scala.Nothing] = js.native
  
  @JSImport("recoil", "isRecoilValue")
  @js.native
  def isRecoilValue(`val`: js.Any): /* is recoil.recoil.RecoilValue<any> */ Boolean = js.native
  
  @JSImport("recoil", "noWait")
  @js.native
  def noWait[T](state: RecoilValue[T]): RecoilValueReadOnly[Loadable[T]] = js.native
  
  @JSImport("recoil", "readOnlySelector")
  @js.native
  def readOnlySelector[T](atom: RecoilValue[T]): RecoilValueReadOnly[T] = js.native
  
  @JSImport("recoil", "selector")
  @js.native
  def selector[T](options: ReadOnlySelectorOptions[T]): RecoilValueReadOnly[T] = js.native
  @JSImport("recoil", "selector")
  @js.native
  def selector[T](options: ReadWriteSelectorOptions[T]): RecoilState[T] = js.native
  
  @JSImport("recoil", "selectorFamily")
  @js.native
  def selectorFamily[T, P /* <: SerializableParam */](options: ReadOnlySelectorFamilyOptions[T, P]): js.Function1[/* param */ P, RecoilValueReadOnly[T]] = js.native
  @JSImport("recoil", "selectorFamily")
  @js.native
  def selectorFamily[T, P /* <: SerializableParam */](options: ReadWriteSelectorFamilyOptions[T, P]): js.Function1[/* param */ P, RecoilState[T]] = js.native
  
  @JSImport("recoil", "useRecoilCallback")
  @js.native
  def useRecoilCallback[Args /* <: js.Array[_] */, Return](fn: js.Function2[/* interface */ CallbackInterface, /* args */ Args, Return]): js.Function1[/* args */ Args, Return] = js.native
  @JSImport("recoil", "useRecoilCallback")
  @js.native
  def useRecoilCallback[Args /* <: js.Array[_] */, Return](fn: js.Function2[/* interface */ CallbackInterface, /* args */ Args, Return], deps: js.Array[_]): js.Function1[/* args */ Args, Return] = js.native
  
  @JSImport("recoil", "useRecoilState")
  @js.native
  def useRecoilState[T](recoilState: RecoilState[T]): js.Tuple2[T, SetterOrUpdater[T]] = js.native
  
  @JSImport("recoil", "useRecoilStateLoadable")
  @js.native
  def useRecoilStateLoadable[T](recoilState: RecoilState[T]): js.Tuple2[Loadable[T], SetterOrUpdater[T]] = js.native
  
  @JSImport("recoil", "useRecoilValue")
  @js.native
  def useRecoilValue[T](recoilValue: RecoilValue[T]): T = js.native
  
  @JSImport("recoil", "useRecoilValueLoadable")
  @js.native
  def useRecoilValueLoadable[T](recoilValue: RecoilValue[T]): Loadable[T] = js.native
  
  @JSImport("recoil", "useResetRecoilState")
  @js.native
  def useResetRecoilState(recoilState: RecoilState[_]): Resetter = js.native
  
  @JSImport("recoil", "useSetRecoilState")
  @js.native
  def useSetRecoilState[T](recoilState: RecoilState[T]): SetterOrUpdater[T] = js.native
  
  @JSImport("recoil", "waitForAll")
  @js.native
  def waitForAll[RecoilValues /* <: js.Array[RecoilValue[_]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = js.native
  @JSImport("recoil", "waitForAll")
  @js.native
  def waitForAll_RecoilValues_StringDictionaryRecoilValueWildcard[RecoilValues /* <: StringDictionary[RecoilValue[_]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = js.native
  
  @JSImport("recoil", "waitForAny")
  @js.native
  def waitForAny[RecoilValues /* <: js.Array[RecoilValue[_]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = js.native
  @JSImport("recoil", "waitForAny")
  @js.native
  def waitForAny_RecoilValues_StringDictionaryRecoilValueWildcard[RecoilValues /* <: StringDictionary[RecoilValue[_]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = js.native
  
  @JSImport("recoil", "waitForNone")
  @js.native
  def waitForNone[RecoilValues /* <: js.Array[RecoilValue[_]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = js.native
  @JSImport("recoil", "waitForNone")
  @js.native
  def waitForNone_RecoilValues_StringDictionaryRecoilValueWildcard[RecoilValues /* <: StringDictionary[RecoilValue[_]] */](param: RecoilValues): RecoilValueReadOnly[UnwrapRecoilValueLoadables[RecoilValues]] = js.native
  
  @js.native
  trait AtomFamilyOptions[T, P /* <: SerializableParam */] extends StObject {
    
    var default: RecoilValue[T] | js.Promise[T] | T | (js.Function1[/* param */ P, T | RecoilValue[T] | js.Promise[T]]) = js.native
    
    var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.native
    
    var key: NodeKey = js.native
  }
  object AtomFamilyOptions {
    
    @scala.inline
    def apply[T, P /* <: SerializableParam */](
      default: RecoilValue[T] | js.Promise[T] | T | (js.Function1[/* param */ P, T | RecoilValue[T] | js.Promise[T]]),
      key: NodeKey
    ): AtomFamilyOptions[T, P] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[AtomFamilyOptions[T, P]]
    }
    
    @scala.inline
    implicit class AtomFamilyOptionsMutableBuilder[Self <: AtomFamilyOptions[_, _], T, P /* <: SerializableParam */] (val x: Self with (AtomFamilyOptions[T, P])) extends AnyVal {
      
      @scala.inline
      def setDangerouslyAllowMutability(value: Boolean): Self = StObject.set(x, "dangerouslyAllowMutability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslyAllowMutabilityUndefined: Self = StObject.set(x, "dangerouslyAllowMutability", js.undefined)
      
      @scala.inline
      def setDefault(
        value: RecoilValue[T] | js.Promise[T] | T | (js.Function1[/* param */ P, T | RecoilValue[T] | js.Promise[T]])
      ): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultFunction1(value: /* param */ P => T | RecoilValue[T] | js.Promise[T]): Self = StObject.set(x, "default", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKey(value: NodeKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AtomOptions[T] extends StObject {
    
    var default: RecoilValue[T] | js.Promise[T] | T = js.native
    
    var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.native
    
    var key: NodeKey = js.native
  }
  object AtomOptions {
    
    @scala.inline
    def apply[T](default: RecoilValue[T] | js.Promise[T] | T, key: NodeKey): AtomOptions[T] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[AtomOptions[T]]
    }
    
    @scala.inline
    implicit class AtomOptionsMutableBuilder[Self <: AtomOptions[_], T] (val x: Self with AtomOptions[T]) extends AnyVal {
      
      @scala.inline
      def setDangerouslyAllowMutability(value: Boolean): Self = StObject.set(x, "dangerouslyAllowMutability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslyAllowMutabilityUndefined: Self = StObject.set(x, "dangerouslyAllowMutability", js.undefined)
      
      @scala.inline
      def setDefault(value: RecoilValue[T] | js.Promise[T] | T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: NodeKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  type AtomValues = Map[NodeKey, Loadable[js.Any]]
  
  /* Inlined std.Readonly<{getPromise <T>(recoilVal : recoil.recoil.RecoilValue<T>): std.Promise<T>, getLoadable <T>(recoilVal : recoil.recoil.RecoilValue<T>): recoil.recoil.Loadable<T>, set <T>(recoilVal : recoil.recoil.RecoilState<T>, valOrUpdater : (currVal : T): T | T): void, reset (recoilVal : recoil.recoil.RecoilState<any>): void}> */
  @js.native
  trait CallbackInterface extends StObject {
    
    val getLoadable: js.Function1[/* recoilVal */ RecoilValue[_], Loadable[_]] = js.native
    
    val getPromise: js.Function1[/* recoilVal */ RecoilValue[_], js.Promise[_]] = js.native
    
    val reset: js.Function1[/* recoilVal */ RecoilState[_], Unit] = js.native
    
    val set: js.Function2[
        /* recoilVal */ RecoilState[_], 
        /* valOrUpdater */ (js.Function1[/* currVal */ js.Any, _]) | js.Any, 
        Unit
      ] = js.native
  }
  object CallbackInterface {
    
    @scala.inline
    def apply(
      getLoadable: /* recoilVal */ RecoilValue[_] => Loadable[_],
      getPromise: /* recoilVal */ RecoilValue[_] => js.Promise[_],
      reset: /* recoilVal */ RecoilState[_] => Unit,
      set: (/* recoilVal */ RecoilState[_], /* valOrUpdater */ (js.Function1[/* currVal */ js.Any, _]) | js.Any) => Unit
    ): CallbackInterface = {
      val __obj = js.Dynamic.literal(getLoadable = js.Any.fromFunction1(getLoadable), getPromise = js.Any.fromFunction1(getPromise), reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[CallbackInterface]
    }
    
    @scala.inline
    implicit class CallbackInterfaceMutableBuilder[Self <: CallbackInterface] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetLoadable(value: /* recoilVal */ RecoilValue[_] => Loadable[_]): Self = StObject.set(x, "getLoadable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPromise(value: /* recoilVal */ RecoilValue[_] => js.Promise[_]): Self = StObject.set(x, "getPromise", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReset(value: /* recoilVal */ RecoilState[_] => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(
        value: (/* recoilVal */ RecoilState[_], /* valOrUpdater */ (js.Function1[/* currVal */ js.Any, _]) | js.Any) => Unit
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
    
    @scala.inline
    def Contents[T](contents: T, state: hasValue): typings.recoil.anon.Contents[T] = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.recoil.anon.Contents[T]]
    }
    
    @scala.inline
    def ReadonlystatehasErrorcont(contents: Error, state: hasError): typings.recoil.anon.ReadonlystatehasErrorcont = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.recoil.anon.ReadonlystatehasErrorcont]
    }
    
    @scala.inline
    def State[T](contents: LoadablePromise[T], state: loading): typings.recoil.anon.State[T] = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.recoil.anon.State[T]]
    }
  }
  
  type LoadablePromise[T] = js.Promise[ResolvedLoadablePromiseInfo[T]]
  
  type NodeKey = String
  
  type Primitive = js.UndefOr[Null | Boolean | Double | js.Symbol | String]
  
  @js.native
  trait ReadOnlySelectorFamilyOptions[T, P /* <: SerializableParam */] extends StObject {
    
    // cacheImplementation_UNSTABLE?: () => CacheImplementation<Loadable<T>>,
    // cacheImplementationForParams_UNSTABLE?: () => CacheImplementation<
    //   RecoilValue<T>,
    // >,
    var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.native
    
    def get(param: P): js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T] = js.native
    
    var key: String = js.native
  }
  object ReadOnlySelectorFamilyOptions {
    
    @scala.inline
    def apply[T, P /* <: SerializableParam */](get: P => js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T], key: String): ReadOnlySelectorFamilyOptions[T, P] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadOnlySelectorFamilyOptions[T, P]]
    }
    
    @scala.inline
    implicit class ReadOnlySelectorFamilyOptionsMutableBuilder[Self <: ReadOnlySelectorFamilyOptions[_, _], T, P /* <: SerializableParam */] (val x: Self with (ReadOnlySelectorFamilyOptions[T, P])) extends AnyVal {
      
      @scala.inline
      def setDangerouslyAllowMutability(value: Boolean): Self = StObject.set(x, "dangerouslyAllowMutability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslyAllowMutabilityUndefined: Self = StObject.set(x, "dangerouslyAllowMutability", js.undefined)
      
      @scala.inline
      def setGet(value: P => js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReadOnlySelectorOptions[T] extends StObject {
    
    var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.native
    
    def get(opts: Get): js.Promise[T] | RecoilValue[T] | T = js.native
    
    var key: String = js.native
  }
  object ReadOnlySelectorOptions {
    
    @scala.inline
    def apply[T](get: Get => js.Promise[T] | RecoilValue[T] | T, key: String): ReadOnlySelectorOptions[T] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReadOnlySelectorOptions[T]]
    }
    
    @scala.inline
    implicit class ReadOnlySelectorOptionsMutableBuilder[Self <: ReadOnlySelectorOptions[_], T] (val x: Self with ReadOnlySelectorOptions[T]) extends AnyVal {
      
      @scala.inline
      def setDangerouslyAllowMutability(value: Boolean): Self = StObject.set(x, "dangerouslyAllowMutability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslyAllowMutabilityUndefined: Self = StObject.set(x, "dangerouslyAllowMutability", js.undefined)
      
      @scala.inline
      def setGet(value: Get => js.Promise[T] | RecoilValue[T] | T): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ReadWriteSelectorFamilyOptions[T, P /* <: SerializableParam */] extends StObject {
    
    // cacheImplementation_UNSTABLE?: () => CacheImplementation<Loadable<T>>,
    // cacheImplementationForParams_UNSTABLE?: () => CacheImplementation<
    //   RecoilValue<T>,
    // >,
    var dangerouslyAllowMutability: js.UndefOr[Boolean] = js.native
    
    def get(param: P): js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T] = js.native
    
    var key: String = js.native
    
    def set(param: P): js.Function2[/* opts */ Reset, /* newValue */ T | DefaultValue, Unit] = js.native
  }
  object ReadWriteSelectorFamilyOptions {
    
    @scala.inline
    def apply[T, P /* <: SerializableParam */](
      get: P => js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T],
      key: String,
      set: P => js.Function2[/* opts */ Reset, /* newValue */ T | DefaultValue, Unit]
    ): ReadWriteSelectorFamilyOptions[T, P] = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), key = key.asInstanceOf[js.Any], set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[ReadWriteSelectorFamilyOptions[T, P]]
    }
    
    @scala.inline
    implicit class ReadWriteSelectorFamilyOptionsMutableBuilder[Self <: ReadWriteSelectorFamilyOptions[_, _], T, P /* <: SerializableParam */] (val x: Self with (ReadWriteSelectorFamilyOptions[T, P])) extends AnyVal {
      
      @scala.inline
      def setDangerouslyAllowMutability(value: Boolean): Self = StObject.set(x, "dangerouslyAllowMutability", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslyAllowMutabilityUndefined: Self = StObject.set(x, "dangerouslyAllowMutability", js.undefined)
      
      @scala.inline
      def setGet(value: P => js.Function1[/* opts */ Get, js.Promise[T] | RecoilValue[T] | T]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: P => js.Function2[/* opts */ Reset, /* newValue */ T | DefaultValue, Unit]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ReadWriteSelectorOptions[T] extends ReadOnlySelectorOptions[T] {
    
    def set(opts: Reset, newValue: T): Unit = js.native
    def set(opts: Reset, newValue: DefaultValue): Unit = js.native
  }
  
  @js.native
  trait RecoilRootProps extends StObject {
    
    var initializeState: js.UndefOr[js.Function1[/* options */ Set, Unit]] = js.native
  }
  object RecoilRootProps {
    
    @scala.inline
    def apply(): RecoilRootProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecoilRootProps]
    }
    
    @scala.inline
    implicit class RecoilRootPropsMutableBuilder[Self <: RecoilRootProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitializeState(value: /* options */ Set => Unit): Self = StObject.set(x, "initializeState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitializeStateUndefined: Self = StObject.set(x, "initializeState", js.undefined)
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
  @js.native
  trait ResolvedLoadablePromiseInfo[T] extends StObject {
    
    val upstreamState__INTERNAL_DO_NOT_USE: js.UndefOr[TreeState] = js.native
    
    val value: T = js.native
  }
  object ResolvedLoadablePromiseInfo {
    
    @scala.inline
    def apply[T](value: T): ResolvedLoadablePromiseInfo[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResolvedLoadablePromiseInfo[T]]
    }
    
    @scala.inline
    implicit class ResolvedLoadablePromiseInfoMutableBuilder[Self <: ResolvedLoadablePromiseInfo[_], T] (val x: Self with ResolvedLoadablePromiseInfo[T]) extends AnyVal {
      
      @scala.inline
      def setUpstreamState__INTERNAL_DO_NOT_USE(value: TreeState): Self = StObject.set(x, "upstreamState__INTERNAL_DO_NOT_USE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpstreamState__INTERNAL_DO_NOT_USEUndefined: Self = StObject.set(x, "upstreamState__INTERNAL_DO_NOT_USE", js.undefined)
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
  @js.native
  trait TreeState extends StObject {
    
    val atomValues: AtomValues = js.native
    
    val dirtyAtoms: typings.std.Set[NodeKey] = js.native
    
    val isSnapshot: Boolean = js.native
    
    val nodeDeps: Map[NodeKey, typings.std.Set[NodeKey]] = js.native
    
    val nodeToComponentSubscriptions: Map[NodeKey, Map[Double, js.Tuple2[String, ComponentCallback]]] = js.native
    
    val nodeToNodeSubscriptions: Map[NodeKey, typings.std.Set[NodeKey]] = js.native
    
    val nonvalidatedAtoms: Map[NodeKey, _] = js.native
    
    val transactionMetadata: js.Object = js.native
  }
  object TreeState {
    
    @scala.inline
    def apply(
      atomValues: AtomValues,
      dirtyAtoms: typings.std.Set[NodeKey],
      isSnapshot: Boolean,
      nodeDeps: Map[NodeKey, typings.std.Set[NodeKey]],
      nodeToComponentSubscriptions: Map[NodeKey, Map[Double, js.Tuple2[String, ComponentCallback]]],
      nodeToNodeSubscriptions: Map[NodeKey, typings.std.Set[NodeKey]],
      nonvalidatedAtoms: Map[NodeKey, _],
      transactionMetadata: js.Object
    ): TreeState = {
      val __obj = js.Dynamic.literal(atomValues = atomValues.asInstanceOf[js.Any], dirtyAtoms = dirtyAtoms.asInstanceOf[js.Any], isSnapshot = isSnapshot.asInstanceOf[js.Any], nodeDeps = nodeDeps.asInstanceOf[js.Any], nodeToComponentSubscriptions = nodeToComponentSubscriptions.asInstanceOf[js.Any], nodeToNodeSubscriptions = nodeToNodeSubscriptions.asInstanceOf[js.Any], nonvalidatedAtoms = nonvalidatedAtoms.asInstanceOf[js.Any], transactionMetadata = transactionMetadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[TreeState]
    }
    
    @scala.inline
    implicit class TreeStateMutableBuilder[Self <: TreeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAtomValues(value: AtomValues): Self = StObject.set(x, "atomValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirtyAtoms(value: typings.std.Set[NodeKey]): Self = StObject.set(x, "dirtyAtoms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSnapshot(value: Boolean): Self = StObject.set(x, "isSnapshot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeDeps(value: Map[NodeKey, typings.std.Set[NodeKey]]): Self = StObject.set(x, "nodeDeps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeToComponentSubscriptions(value: Map[NodeKey, Map[Double, js.Tuple2[String, ComponentCallback]]]): Self = StObject.set(x, "nodeToComponentSubscriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeToNodeSubscriptions(value: Map[NodeKey, typings.std.Set[NodeKey]]): Self = StObject.set(x, "nodeToNodeSubscriptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonvalidatedAtoms(value: Map[NodeKey, _]): Self = StObject.set(x, "nonvalidatedAtoms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionMetadata(value: js.Object): Self = StObject.set(x, "transactionMetadata", value.asInstanceOf[js.Any])
    }
  }
  
  type UnwrapRecoilValue[T] = js.Any
  
  type UnwrapRecoilValueLoadables[T /* <: js.Array[RecoilValue[_]] | StringDictionary[RecoilValue[_]] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: recoil.recoil.Loadable<recoil.recoil.UnwrapRecoilValue<T[P]>>}
    */ typings.recoil.recoilStrings.UnwrapRecoilValueLoadables with TopLevel[T]
}
