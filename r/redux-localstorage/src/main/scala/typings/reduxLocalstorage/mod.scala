package typings.reduxLocalstorage

import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-localstorage", JSImport.Default)
  @js.native
  def default[A](): js.Any = js.native
  @JSImport("redux-localstorage", JSImport.Default)
  @js.native
  def default[A](storage: js.UndefOr[scala.Nothing], key: js.UndefOr[scala.Nothing], callback: js.Function): js.Any = js.native
  @JSImport("redux-localstorage", JSImport.Default)
  @js.native
  def default[A](storage: js.UndefOr[scala.Nothing], key: String): js.Any = js.native
  @JSImport("redux-localstorage", JSImport.Default)
  @js.native
  def default[A](storage: js.UndefOr[scala.Nothing], key: String, callback: js.Function): js.Any = js.native
  @JSImport("redux-localstorage", JSImport.Default)
  @js.native
  def default[A](storage: StorageAdapter[A]): js.Any = js.native
  @JSImport("redux-localstorage", JSImport.Default)
  @js.native
  def default[A](storage: StorageAdapter[A], key: js.UndefOr[scala.Nothing], callback: js.Function): js.Any = js.native
  @JSImport("redux-localstorage", JSImport.Default)
  @js.native
  def default[A](storage: StorageAdapter[A], key: String): js.Any = js.native
  @JSImport("redux-localstorage", JSImport.Default)
  @js.native
  def default[A](storage: StorageAdapter[A], key: String, callback: js.Function): js.Any = js.native
  
  @JSImport("redux-localstorage", "actionTypes")
  @js.native
  val actionTypes: ActionTypes_ = js.native
  
  @JSImport("redux-localstorage", "mergePersistedState")
  @js.native
  def mergePersistedState(): js.Function1[/* next */ Reducer[_, AnyAction], Reducer[_, AnyAction]] = js.native
  @JSImport("redux-localstorage", "mergePersistedState")
  @js.native
  def mergePersistedState(merge: js.Function2[/* initialState */ js.Any, /* persistentState */ js.Any, js.Any]): js.Function1[/* next */ Reducer[_, AnyAction], Reducer[_, AnyAction]] = js.native
  
  @JSImport("redux-localstorage", "transformState")
  @js.native
  def transformState[A1, A2](down: js.Array[js.Function1[/* state */ _, _]], up: js.Array[js.Function1[/* state */ _, _]]): js.Function1[/* storage */ StorageAdapter[A1], A2] = js.native
  @JSImport("redux-localstorage", "transformState")
  @js.native
  def transformState[A1, A2](down: js.Array[js.Function1[/* state */ _, _]], up: js.Function1[/* state */ A2, A1]): js.Function1[/* storage */ StorageAdapter[A1], A2] = js.native
  @JSImport("redux-localstorage", "transformState")
  @js.native
  def transformState[A1, A2](down: js.Function1[/* state */ A1, A2], up: js.Array[js.Function1[/* state */ _, _]]): js.Function1[/* storage */ StorageAdapter[A1], A2] = js.native
  @JSImport("redux-localstorage", "transformState")
  @js.native
  def transformState[A1, A2](down: js.Function1[/* state */ A1, A2], up: js.Function1[/* state */ A2, A1]): js.Function1[/* storage */ StorageAdapter[A1], A2] = js.native
  
  @js.native
  trait ActionTypes_ extends StObject {
    
    var INIT: String = js.native
  }
  object ActionTypes_ {
    
    @scala.inline
    def apply(INIT: String): ActionTypes_ = {
      val __obj = js.Dynamic.literal(INIT = INIT.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionTypes_]
    }
    
    @scala.inline
    implicit class ActionTypes_MutableBuilder[Self <: ActionTypes_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setINIT(value: String): Self = StObject.set(x, "INIT", value.asInstanceOf[js.Any])
    }
  }
  
  type AdapterCallback = js.Function2[/* err */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], Unit]
  
  @js.native
  trait StorageAdapter[A] extends StObject {
    
    var `0`: A = js.native
    
    def del(key: String, callback: AdapterCallback): Unit = js.native
    
    def get(key: String, callback: AdapterCallback): Unit = js.native
    
    def put(key: String, value: js.Any, callback: AdapterCallback): Unit = js.native
  }
  object StorageAdapter {
    
    @scala.inline
    def apply[A](
      `0`: A,
      del: (String, AdapterCallback) => Unit,
      get: (String, AdapterCallback) => Unit,
      put: (String, js.Any, AdapterCallback) => Unit
    ): StorageAdapter[A] = {
      val __obj = js.Dynamic.literal(del = js.Any.fromFunction2(del), get = js.Any.fromFunction2(get), put = js.Any.fromFunction3(put))
      __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageAdapter[A]]
    }
    
    @scala.inline
    implicit class StorageAdapterMutableBuilder[Self <: StorageAdapter[_], A] (val x: Self with StorageAdapter[A]) extends AnyVal {
      
      @scala.inline
      def set0(value: A): Self = StObject.set(x, "0", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDel(value: (String, AdapterCallback) => Unit): Self = StObject.set(x, "del", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGet(value: (String, AdapterCallback) => Unit): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPut(value: (String, js.Any, AdapterCallback) => Unit): Self = StObject.set(x, "put", js.Any.fromFunction3(value))
    }
  }
  
  type StorageAdapterCreator[A] = js.Function1[/* storage */ A, StorageAdapter[A]]
  
  @js.native
  trait StorageAdapterEnhancer extends StObject
}
