package typings.recoil

import typings.react.mod.ReactNode
import typings.recoil.mod.CachePolicyWithoutEquality
import typings.recoil.mod.ComponentInfo
import typings.recoil.mod.DefaultValue
import typings.recoil.mod.GetCallback
import typings.recoil.mod.GetRecoilValue
import typings.recoil.mod.Loadable
import typings.recoil.mod.MutableSnapshot
import typings.recoil.mod.RecoilRootProps
import typings.recoil.mod.RecoilState
import typings.recoil.mod.RecoilStateInfo
import typings.recoil.mod.RecoilValue
import typings.recoil.mod.ResetRecoilState
import typings.recoil.mod.SelectorCallbackInterface
import typings.recoil.mod.SetRecoilState
import typings.recoil.mod.Snapshot
import typings.recoil.mod.StoreID
import typings.recoil.mod.WrappedValue
import typings.recoil.recoilBooleans.`false`
import typings.recoil.recoilBooleans.`true`
import typings.recoil.recoilStrings.`keep-all`
import typings.recoil.recoilStrings.`most-recent`
import typings.recoil.recoilStrings.get
import typings.recoil.recoilStrings.lru
import typings.recoil.recoilStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`
    extends StObject
       with CachePolicyWithoutEquality {
    
    var eviction: `keep-all`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(eviction = "keep-all")
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setEviction(value: `keep-all`): Self = StObject.set(x, "eviction", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1`
    extends StObject
       with CachePolicyWithoutEquality {
    
    var eviction: `most-recent`
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal(eviction = "most-recent")
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
      inline def setEviction(value: `most-recent`): Self = StObject.set(x, "eviction", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children
    extends StObject
       with RecoilRootProps {
    
    var children: ReactNode
    
    var initializeState: js.UndefOr[js.Function1[/* mutableSnapshot */ MutableSnapshot, Unit]] = js.undefined
    
    var `override`: js.UndefOr[`true`] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitializeState(value: /* mutableSnapshot */ MutableSnapshot => Unit): Self = StObject.set(x, "initializeState", js.Any.fromFunction1(value))
      
      inline def setInitializeStateUndefined: Self = StObject.set(x, "initializeState", js.undefined)
      
      inline def setOverride(value: `true`): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    }
  }
  
  trait ChildrenReactNode extends StObject {
    
    var children: ReactNode
  }
  object ChildrenReactNode {
    
    inline def apply(): ChildrenReactNode = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChildrenReactNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChildrenReactNode] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  trait Components[T] extends StObject {
    
    var components: js.Iterable[ComponentInfo]
    
    var nodes: js.Iterable[RecoilValue[T]]
  }
  object Components {
    
    inline def apply[T](components: js.Iterable[ComponentInfo], nodes: js.Iterable[RecoilValue[T]]): Components[T] = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Components[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Components[?], T] (val x: Self & Components[T]) extends AnyVal {
      
      inline def setComponents(value: js.Iterable[ComponentInfo]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Iterable[RecoilValue[T]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    }
  }
  
  trait Eviction
    extends StObject
       with CachePolicyWithoutEquality {
    
    var eviction: lru
    
    var maxSize: Double
  }
  object Eviction {
    
    inline def apply(maxSize: Double): Eviction = {
      val __obj = js.Dynamic.literal(eviction = "lru", maxSize = maxSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Eviction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Eviction] (val x: Self) extends AnyVal {
      
      inline def setEviction(value: lru): Self = StObject.set(x, "eviction", value.asInstanceOf[js.Any])
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait Get extends StObject {
    
    var get: GetRecoilValue
    
    var getCallback: GetCallback
  }
  object Get {
    
    inline def apply(
      get: /* recoilVal */ RecoilValue[Any] => Any,
      getCallback: /* fn */ js.Function1[
          /* interface */ SelectorCallbackInterface, 
          js.Function1[/* args */ js.Array[Any], Any]
        ] => js.Function1[/* args */ js.Array[Any], Any]
    ): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getCallback = js.Any.fromFunction1(getCallback))
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      inline def setGet(value: /* recoilVal */ RecoilValue[Any] => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetCallback(
        value: /* fn */ js.Function1[
              /* interface */ SelectorCallbackInterface, 
              js.Function1[/* args */ js.Array[Any], Any]
            ] => js.Function1[/* args */ js.Array[Any], Any]
      ): Self = StObject.set(x, "getCallback", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait GetInfoUNSTABLE[T] extends StObject {
    
    def getInfo_UNSTABLE[S](recoilValue: RecoilValue[S]): RecoilStateInfo[S] = js.native
    
    def getLoadable[S](recoilValue: RecoilValue[S]): Loadable[S] = js.native
    
    // Accessors to read other atoms/selectors
    def getPromise[S](recoilValue: RecoilValue[S]): js.Promise[S] = js.native
    
    var node: RecoilState[T] = js.native
    
    // Subscribe callbacks to events.
    // Atom effect observers are called before global transaction observers
    def onSet(
      param: js.Function3[/* newValue */ T, /* oldValue */ T | DefaultValue, /* isReset */ Boolean, Unit]
    ): Unit = js.native
    
    var parentStoreID_UNSTABLE: js.UndefOr[StoreID] = js.native
    
    def resetSelf(): Unit = js.native
    
    // Call synchronously to initialize value or async to change it later
    def setSelf(param: T): Unit = js.native
    def setSelf(param: js.Function1[/* param */ T | DefaultValue, T | DefaultValue | WrappedValue[T]]): Unit = js.native
    def setSelf(param: js.Promise[T | DefaultValue]): Unit = js.native
    def setSelf(param: DefaultValue): Unit = js.native
    def setSelf(param: WrappedValue[T]): Unit = js.native
    
    var storeID: StoreID = js.native
    
    var trigger: set | get = js.native
  }
  
  trait IsInitialized extends StObject {
    
    var isInitialized: js.UndefOr[Boolean] = js.undefined
    
    var isModified: js.UndefOr[Boolean] = js.undefined
  }
  object IsInitialized {
    
    inline def apply(): IsInitialized = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsInitialized]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsInitialized] (val x: Self) extends AnyVal {
      
      inline def setIsInitialized(value: Boolean): Self = StObject.set(x, "isInitialized", value.asInstanceOf[js.Any])
      
      inline def setIsInitializedUndefined: Self = StObject.set(x, "isInitialized", js.undefined)
      
      inline def setIsModified(value: Boolean): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
      
      inline def setIsModifiedUndefined: Self = StObject.set(x, "isModified", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    var key: String
  }
  object Key {
    
    inline def apply(key: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Override
    extends StObject
       with RecoilRootProps {
    
    var children: ReactNode
    
    var `override`: `false`
  }
  object Override {
    
    inline def apply(): Override = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("override")(false)
      __obj.asInstanceOf[Override]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Override] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOverride(value: `false`): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreviousSnapshot extends StObject {
    
    var previousSnapshot: Snapshot
    
    var snapshot: Snapshot
  }
  object PreviousSnapshot {
    
    inline def apply(previousSnapshot: Snapshot, snapshot: Snapshot): PreviousSnapshot = {
      val __obj = js.Dynamic.literal(previousSnapshot = previousSnapshot.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviousSnapshot]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PreviousSnapshot] (val x: Self) extends AnyVal {
      
      inline def setPreviousSnapshot(value: Snapshot): Self = StObject.set(x, "previousSnapshot", value.asInstanceOf[js.Any])
      
      inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reset extends StObject {
    
    var get: GetRecoilValue
    
    var reset: ResetRecoilState
    
    var set: SetRecoilState
  }
  object Reset {
    
    inline def apply(
      get: /* recoilVal */ RecoilValue[Any] => Any,
      reset: /* recoilVal */ RecoilState[Any] => Unit,
      set: (/* recoilVal */ RecoilState[Any], /* newVal */ Any | DefaultValue | (js.Function1[/* prevValue */ Any, Any | DefaultValue])) => Unit
    ): Reset = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set))
      __obj.asInstanceOf[Reset]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reset] (val x: Self) extends AnyVal {
      
      inline def setGet(value: /* recoilVal */ RecoilValue[Any] => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setReset(value: /* recoilVal */ RecoilState[Any] => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
      
      inline def setSet(
        value: (/* recoilVal */ RecoilState[Any], /* newVal */ Any | DefaultValue | (js.Function1[/* prevValue */ Any, Any | DefaultValue])) => Unit
      ): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    }
  }
}
