package typings.reduxUi

import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.reduxUi.anon.Pure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-ui", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[UIStateShape](): js.Function1[/* component */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* component */ js.Any, js.Any]]
  @scala.inline
  def default[UIStateShape](params: uiParams[UIStateShape]): js.Function1[/* component */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* component */ js.Any, js.Any]]
  
  @JSImport("redux-ui", "reducer")
  @js.native
  val reducer: Reducer[js.Any, AnyAction] = js.native
  
  @js.native
  trait ReduxUIProps[UIStateShape] extends StObject {
    
    // A function which resets the state within `uiKey` to its default
    def resetUI(): Unit = js.native
    
    // The UI state for the component's `uiKey`
    var ui: UIStateShape = js.native
    
    // The key passed to the decorator from the decorator
    // (eg. 'some-decorator' with `@ui('some-decorator')`
    var uiKey: String = js.native
    
    def updateUI(key: String, value: js.Any): Unit = js.native
    // A function accepting either a name/value pair or object which updates
    // state within `uiKey`
    def updateUI(obj: UIStateShape): Unit = js.native
  }
  
  trait uiParams[UIStateShape] extends StObject {
    
    // optional key which is used to determine the UI path in which state will
    // be stored. if omitted this is randomly generated.
    var key: js.UndefOr[String] = js.undefined
    
    // optional mergeProps passed to react-redux' @connect
    var mergeProps: js.UndefOr[
        js.Function3[/* stateProps */ js.Any, /* dispatchProps */ js.Any, /* ownProps */ js.Any, js.Any]
      ] = js.undefined
    
    // optional `options` passed to react-redux @connect
    var options: js.UndefOr[Pure] = js.undefined
    
    // optional persist, defaults to false. if set to true persist will keep UI
    // state for this component after it unmounts. if set to false the UI state
    // will be deleted and recreated when the component remounts
    var persist: js.UndefOr[Boolean] = js.undefined
    
    // customReducer: you can handle the UI state for this component's scope
    // by dispatching actions
    var reducer: js.UndefOr[js.Function2[/* state */ js.Any, /* action */ js.Any, js.Any]] = js.undefined
    
    // **required**: UI state for the component
    var state: UIStateShape
  }
  object uiParams {
    
    @scala.inline
    def apply[UIStateShape](state: UIStateShape): uiParams[UIStateShape] = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[uiParams[UIStateShape]]
    }
    
    @scala.inline
    implicit class uiParamsMutableBuilder[Self <: uiParams[?], UIStateShape] (val x: Self & uiParams[UIStateShape]) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMergeProps(value: (/* stateProps */ js.Any, /* dispatchProps */ js.Any, /* ownProps */ js.Any) => js.Any): Self = StObject.set(x, "mergeProps", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMergePropsUndefined: Self = StObject.set(x, "mergeProps", js.undefined)
      
      @scala.inline
      def setOptions(value: Pure): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistUndefined: Self = StObject.set(x, "persist", js.undefined)
      
      @scala.inline
      def setReducer(value: (/* state */ js.Any, /* action */ js.Any) => js.Any): Self = StObject.set(x, "reducer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReducerUndefined: Self = StObject.set(x, "reducer", js.undefined)
      
      @scala.inline
      def setState(value: UIStateShape): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
