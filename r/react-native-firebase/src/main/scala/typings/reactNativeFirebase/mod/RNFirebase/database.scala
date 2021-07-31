package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeFirebase.anon.Priority
import typings.reactNativeFirebase.anon.TIMESTAMP
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object database {
  
  trait DataSnapshot extends StObject {
    
    def child(path: String): DataSnapshot
    
    def exists(): Boolean
    
    def exportVal(): Priority
    
    def forEach(action: js.Function1[/* a */ this.type, Boolean]): Boolean
    
    def getPriority(): String | Double | Null
    
    def hasChild(path: String): Boolean
    
    def hasChildren(): Boolean
    
    var key: String | Null
    
    def numChildren(): Double
    
    var ref: Reference
    
    def toJSON(): js.Object | Null
    
    def `val`(): js.Any
  }
  object DataSnapshot {
    
    @scala.inline
    def apply(
      child: String => DataSnapshot,
      exists: () => Boolean,
      exportVal: () => Priority,
      forEach: js.Function1[DataSnapshot, Boolean] => Boolean,
      getPriority: () => String | Double | Null,
      hasChild: String => Boolean,
      hasChildren: () => Boolean,
      numChildren: () => Double,
      ref: Reference,
      toJSON: () => js.Object | Null,
      `val`: () => js.Any
    ): DataSnapshot = {
      val __obj = js.Dynamic.literal(child = js.Any.fromFunction1(child), exists = js.Any.fromFunction0(exists), exportVal = js.Any.fromFunction0(exportVal), forEach = js.Any.fromFunction1(forEach), getPriority = js.Any.fromFunction0(getPriority), hasChild = js.Any.fromFunction1(hasChild), hasChildren = js.Any.fromFunction0(hasChildren), numChildren = js.Any.fromFunction0(numChildren), ref = ref.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), key = null)
      __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
      __obj.asInstanceOf[DataSnapshot]
    }
    
    @scala.inline
    implicit class DataSnapshotMutableBuilder[Self <: DataSnapshot] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChild(value: String => DataSnapshot): Self = StObject.set(x, "child", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExists(value: () => Boolean): Self = StObject.set(x, "exists", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExportVal(value: () => Priority): Self = StObject.set(x, "exportVal", js.Any.fromFunction0(value))
      
      @scala.inline
      def setForEach(value: js.Function1[DataSnapshot, Boolean] => Boolean): Self = StObject.set(x, "forEach", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPriority(value: () => String | Double | Null): Self = StObject.set(x, "getPriority", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHasChild(value: String => Boolean): Self = StObject.set(x, "hasChild", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHasChildren(value: () => Boolean): Self = StObject.set(x, "hasChildren", js.Any.fromFunction0(value))
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setNumChildren(value: () => Double): Self = StObject.set(x, "numChildren", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRef(value: Reference): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToJSON(value: () => js.Object | Null): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
      
      @scala.inline
      def setVal(value: () => js.Any): Self = StObject.set(x, "val", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Database
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    /**
      * Removes all event handlers and their native subscriptions
      */
    def cleanup(): js.Promise[js.Any] = js.native
    
    /**
      * disconnect to firebase backend
      */
    def goOffline(): Unit = js.native
    
    /**
      * connect to firebase backend
      */
    def goOnline(): Unit = js.native
    
    /**
      * unregister listener
      */
    def off(path: String, modifiersString: String): js.Any = js.native
    def off(path: String, modifiersString: String, eventName: String): js.Any = js.native
    def off(path: String, modifiersString: String, eventName: String, origCB: js.Function0[Unit]): js.Any = js.native
    def off(path: String, modifiersString: String, eventName: Unit, origCB: js.Function0[Unit]): js.Any = js.native
    
    /**
      * register listener
      */
    def on(
      path: String,
      modifiersString: String,
      modifiers: js.Array[String],
      eventName: String,
      cb: js.Function0[Unit],
      errorCb: js.Function0[Unit]
    ): js.Any = js.native
    
    /**
      * Returns a new firebase reference instance
      * */
    def ref(): RnReference = js.native
    def ref(path: String): RnReference = js.native
  }
  
  trait DatabaseStatics extends StObject {
    
    /** @see https://www.firebase.com/docs/java-api/javadoc/com/firebase/client/ServerValue.html#TIMESTAMP */
    var ServerValue: TIMESTAMP
  }
  object DatabaseStatics {
    
    @scala.inline
    def apply(ServerValue: TIMESTAMP): DatabaseStatics = {
      val __obj = js.Dynamic.literal(ServerValue = ServerValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatabaseStatics]
    }
    
    @scala.inline
    implicit class DatabaseStaticsMutableBuilder[Self <: DatabaseStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServerValue(value: TIMESTAMP): Self = StObject.set(x, "ServerValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Query extends StObject {
    
    def endAt(): Query = js.native
    def endAt(value: String): Query = js.native
    def endAt(value: String, key: String): Query = js.native
    def endAt(value: Boolean): Query = js.native
    def endAt(value: Boolean, key: String): Query = js.native
    def endAt(value: Double): Query = js.native
    def endAt(value: Double, key: String): Query = js.native
    def endAt(value: Null, key: String): Query = js.native
    
    def equalTo(): Query = js.native
    def equalTo(value: String): Query = js.native
    def equalTo(value: String, key: String): Query = js.native
    def equalTo(value: Boolean): Query = js.native
    def equalTo(value: Boolean, key: String): Query = js.native
    def equalTo(value: Double): Query = js.native
    def equalTo(value: Double, key: String): Query = js.native
    def equalTo(value: Null, key: String): Query = js.native
    
    def isEqual(): Boolean = js.native
    def isEqual(other: Query): Boolean = js.native
    
    def limitToFirst(limit: Double): Query = js.native
    
    def limitToLast(limit: Double): Query = js.native
    
    def off(): Unit = js.native
    def off(eventType: Unit, callback: Unit, context: js.Object): Unit = js.native
    def off(eventType: Unit, callback: QuerySuccessCallback): Unit = js.native
    def off(eventType: Unit, callback: QuerySuccessCallback, context: js.Object): Unit = js.native
    def off(eventType: QueryEventType): Unit = js.native
    def off(eventType: QueryEventType, callback: Unit, context: js.Object): Unit = js.native
    def off(eventType: QueryEventType, callback: QuerySuccessCallback): Unit = js.native
    def off(eventType: QueryEventType, callback: QuerySuccessCallback, context: js.Object): Unit = js.native
    
    def on(eventType: QueryEventType, callback: QuerySuccessCallback): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], QuerySuccessCallback] = js.native
    def on(
      eventType: QueryEventType,
      callback: QuerySuccessCallback,
      cancelCallbackOrContext: Unit,
      context: js.Object
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], QuerySuccessCallback] = js.native
    def on(
      eventType: QueryEventType,
      callback: QuerySuccessCallback,
      cancelCallbackOrContext: QueryErrorCallback
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], QuerySuccessCallback] = js.native
    def on(
      eventType: QueryEventType,
      callback: QuerySuccessCallback,
      cancelCallbackOrContext: QueryErrorCallback,
      context: js.Object
    ): js.Function2[/* a */ DataSnapshot | Null, /* b */ js.UndefOr[String], QuerySuccessCallback] = js.native
    
    def once(eventType: QueryEventType): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: QueryEventType,
      successCallback: Unit,
      failureCallbackOrContext: Unit,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(eventType: QueryEventType, successCallback: Unit, failureCallbackOrContext: QueryErrorCallback): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: QueryEventType,
      successCallback: Unit,
      failureCallbackOrContext: QueryErrorCallback,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(eventType: QueryEventType, successCallback: QuerySuccessCallback): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: QueryEventType,
      successCallback: QuerySuccessCallback,
      failureCallbackOrContext: Unit,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: QueryEventType,
      successCallback: QuerySuccessCallback,
      failureCallbackOrContext: QueryErrorCallback
    ): js.Promise[DataSnapshot] = js.native
    def once(
      eventType: QueryEventType,
      successCallback: QuerySuccessCallback,
      failureCallbackOrContext: QueryErrorCallback,
      context: js.Object
    ): js.Promise[DataSnapshot] = js.native
    
    def orderByChild(path: String): Query = js.native
    
    def orderByKey(): Query = js.native
    
    def orderByPriority(): Query = js.native
    
    def orderByValue(): Query = js.native
    
    var ref: Reference = js.native
    
    def startAt(): Query = js.native
    def startAt(value: String): Query = js.native
    def startAt(value: String, key: String): Query = js.native
    def startAt(value: Boolean): Query = js.native
    def startAt(value: Boolean, key: String): Query = js.native
    def startAt(value: Double): Query = js.native
    def startAt(value: Double, key: String): Query = js.native
    def startAt(value: Null, key: String): Query = js.native
    
    def toJSON(): js.Object = js.native
  }
  
  type QueryErrorCallback = js.Function1[/* e */ Error, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.value
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.child_added
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.child_removed
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.child_changed
    - typings.reactNativeFirebase.reactNativeFirebaseStrings.child_moved
  */
  trait QueryEventType extends StObject
  object QueryEventType {
    
    @scala.inline
    def child_added: typings.reactNativeFirebase.reactNativeFirebaseStrings.child_added = "child_added".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.child_added]
    
    @scala.inline
    def child_changed: typings.reactNativeFirebase.reactNativeFirebaseStrings.child_changed = "child_changed".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.child_changed]
    
    @scala.inline
    def child_moved: typings.reactNativeFirebase.reactNativeFirebaseStrings.child_moved = "child_moved".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.child_moved]
    
    @scala.inline
    def child_removed: typings.reactNativeFirebase.reactNativeFirebaseStrings.child_removed = "child_removed".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.child_removed]
    
    @scala.inline
    def value: typings.reactNativeFirebase.reactNativeFirebaseStrings.value = "value".asInstanceOf[typings.reactNativeFirebase.reactNativeFirebaseStrings.value]
  }
  
  type QuerySuccessCallback = js.Function2[/* snapshot */ DataSnapshot, /* previousChildId */ js.UndefOr[String | Null], Unit]
  
  @js.native
  trait Reference
    extends StObject
       with Query {
    
    def child(path: String): Reference = js.native
    
    var key: String | Null = js.native
    
    def onDisconnect(): js.Any = js.native
    
    var parent: Reference | Null = js.native
    
    def push(): ThenableReference[js.Any] = js.native
    def push(value: js.Any): ThenableReference[js.Any] = js.native
    def push(value: js.Any, onComplete: js.Function1[/* a */ RnError | Null, js.Any]): ThenableReference[js.Any] = js.native
    def push(value: Unit, onComplete: js.Function1[/* a */ RnError | Null, js.Any]): ThenableReference[js.Any] = js.native
    
    def remove(): js.Promise[js.Any] = js.native
    def remove(onComplete: js.Function1[/* a */ RnError | Null, js.Any]): js.Promise[js.Any] = js.native
    
    var root: Reference = js.native
    
    def set(value: js.Any): js.Promise[js.Any] = js.native
    def set(value: js.Any, onComplete: js.Function1[/* a */ RnError | Null, js.Any]): js.Promise[js.Any] = js.native
    
    def setPriority(priority: String, onComplete: js.Function1[/* a */ RnError | Null, js.Any]): js.Promise[js.Any] = js.native
    def setPriority(priority: Double, onComplete: js.Function1[/* a */ RnError | Null, js.Any]): js.Promise[js.Any] = js.native
    def setPriority(priority: Null, onComplete: js.Function1[/* a */ RnError | Null, js.Any]): js.Promise[js.Any] = js.native
    
    def setWithPriority(newVal: js.Any): js.Promise[js.Any] = js.native
    def setWithPriority(newVal: js.Any, newPriority: String): js.Promise[js.Any] = js.native
    def setWithPriority(newVal: js.Any, newPriority: String, onComplete: js.Function1[/* a */ RnError | Null, js.Any]): js.Promise[js.Any] = js.native
    def setWithPriority(newVal: js.Any, newPriority: Double): js.Promise[js.Any] = js.native
    def setWithPriority(newVal: js.Any, newPriority: Double, onComplete: js.Function1[/* a */ RnError | Null, js.Any]): js.Promise[js.Any] = js.native
    def setWithPriority(newVal: js.Any, newPriority: Null, onComplete: js.Function1[/* a */ RnError | Null, js.Any]): js.Promise[js.Any] = js.native
    
    def transaction(transactionUpdate: js.Function1[/* a */ js.Any, js.Any]): js.Promise[js.Any] = js.native
    def transaction(
      transactionUpdate: js.Function1[/* a */ js.Any, js.Any],
      onComplete: js.Function3[/* a */ RnError | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, js.Any]
    ): js.Promise[js.Any] = js.native
    def transaction(
      transactionUpdate: js.Function1[/* a */ js.Any, js.Any],
      onComplete: js.Function3[/* a */ RnError | Null, /* b */ Boolean, /* c */ DataSnapshot | Null, js.Any],
      applyLocally: Boolean
    ): js.Promise[js.Any] = js.native
    def transaction(transactionUpdate: js.Function1[/* a */ js.Any, js.Any], onComplete: Unit, applyLocally: Boolean): js.Promise[js.Any] = js.native
    
    def update(values: js.Object): js.Promise[js.Any] = js.native
    def update(values: js.Object, onComplete: js.Function1[/* a */ RnError | Null, js.Any]): js.Promise[js.Any] = js.native
  }
  
  @js.native
  trait RnReference
    extends StObject
       with Reference
       with /* key */ StringDictionary[js.Any] {
    
    def filter(name: String, value: js.Any): js.Any = js.native
    def filter(name: String, value: js.Any, key: String): js.Any = js.native
    
    def keepSynced(bool: Boolean): js.Any = js.native
  }
  
  @js.native
  trait ThenableReference[T]
    extends js.Promise[T]
       with Reference {
    
    /* InferMemberOverrides */
    override def `then`[B](
      onFulfilled: js.Function1[T, B | js.Thenable[B]],
      onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]
    ): js.Thenable[B] & js.Promise[B] = js.native
    /* InferMemberOverrides */
    override def `then`[B](onFulfilled: Unit, onRejected: js.UndefOr[js.Function1[Any, B | js.Thenable[B]]]): js.Thenable[B] & js.Promise[B] = js.native
  }
}
