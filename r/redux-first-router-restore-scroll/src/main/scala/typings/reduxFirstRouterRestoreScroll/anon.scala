package typings.reduxFirstRouterRestoreScroll

import typings.history.mod.Location
import typings.reduxFirstRouter.mod.LocationState
import typings.reduxFirstRouterRestoreScroll.reduxFirstRouterRestoreScrollStrings.`profile-box`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Manual extends StObject {
    
    /** @default false */
    var manual: js.UndefOr[Boolean] = js.native
    
    /** Use to implement custom scroll positioning. */
    var shouldUpdateScroll: js.UndefOr[
        js.Function2[
          /* prev */ LocationState[js.Object, _], 
          /* locationState */ LocationState[js.Object, _], 
          Boolean | `profile-box` | (js.Tuple2[Double, Double])
        ]
      ] = js.native
    
    /**
      * To implement a custom backend storage for scroll state, pass a custom
      * stateStorage object. The object should implement the methods as described
      * by the package `scroll-behavior` as well as a function called setPrevKey
      * that keeps track of the previous key.
      */
    var stateStorage: js.UndefOr[Read] = js.native
  }
  object Manual {
    
    @scala.inline
    def apply(): Manual = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Manual]
    }
    
    @scala.inline
    implicit class ManualMutableBuilder[Self <: Manual] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setManual(value: Boolean): Self = StObject.set(x, "manual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManualUndefined: Self = StObject.set(x, "manual", js.undefined)
      
      @scala.inline
      def setShouldUpdateScroll(
        value: (/* prev */ LocationState[js.Object, _], /* locationState */ LocationState[js.Object, _]) => Boolean | `profile-box` | (js.Tuple2[Double, Double])
      ): Self = StObject.set(x, "shouldUpdateScroll", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShouldUpdateScrollUndefined: Self = StObject.set(x, "shouldUpdateScroll", js.undefined)
      
      @scala.inline
      def setStateStorage(value: Read): Self = StObject.set(x, "stateStorage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateStorageUndefined: Self = StObject.set(x, "stateStorage", js.undefined)
    }
  }
  
  @js.native
  trait Read extends StObject {
    
    def read(location: Location[typings.history.mod.LocationState]): Location[typings.history.mod.LocationState] = js.native
    def read(location: Location[typings.history.mod.LocationState], key: String): Location[typings.history.mod.LocationState] = js.native
    
    def save(location: Location[typings.history.mod.LocationState], key: String, value: js.Any): Unit = js.native
    def save(location: Location[typings.history.mod.LocationState], key: Null, value: js.Any): Unit = js.native
    
    def setPrevKey(): Unit = js.native
    def setPrevKey(key: String): Unit = js.native
  }
}
