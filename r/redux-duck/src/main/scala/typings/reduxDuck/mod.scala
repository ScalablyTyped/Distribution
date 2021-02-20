package typings.reduxDuck

import org.scalablytyped.runtime.TopLevel
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.reduxDuck.anon.Type
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-duck", "createDuck")
  @js.native
  def createDuck(a: DuckName): DuckBuilder[AnyAction] = js.native
  @JSImport("redux-duck", "createDuck")
  @js.native
  def createDuck(a: DuckName, b: AppName): DuckBuilder[AnyAction] = js.native
  
  type ActionCreator[A /* <: FSAHack */] = js.Function0[A] | (js.Function1[
    /* import warning: importer.ImportType#apply Failed type conversion: A['payload'] */ /* a */ js.Any, 
    A
  ])
  
  type ActionHandlers[S, A /* <: Action[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ T in A['type'] ]:? (x : S, y : std.Extract<A, {  type :T}>): S}
    */ typings.reduxDuck.reduxDuckStrings.ActionHandlers with TopLevel[js.Any]
  
  type ActionName = String
  
  type ActionType = String
  
  type AppName = String
  
  @js.native
  trait DuckBuilder[AppAction /* <: Action[_] */] extends StObject {
    
    def createAction[T /* <: String with (/* import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] */ js.Any) */](a: T): ActionCreator[Extract[AppAction, Type[T, AppAction]]] = js.native
    
    def createReducer[S](a: ActionHandlers[S, AppAction], b: S): Reducer[S, AppAction] = js.native
    
    def defineType(a: ActionName): ActionType = js.native
  }
  object DuckBuilder {
    
    @scala.inline
    def apply[AppAction /* <: Action[_] */](
      createAction: js.Any => ActionCreator[Extract[AppAction, Type[js.Any, AppAction]]],
      createReducer: (ActionHandlers[js.Any, AppAction], js.Any) => Reducer[js.Any, AppAction],
      defineType: ActionName => ActionType
    ): DuckBuilder[AppAction] = {
      val __obj = js.Dynamic.literal(createAction = js.Any.fromFunction1(createAction), createReducer = js.Any.fromFunction2(createReducer), defineType = js.Any.fromFunction1(defineType))
      __obj.asInstanceOf[DuckBuilder[AppAction]]
    }
    
    @scala.inline
    implicit class DuckBuilderMutableBuilder[Self <: DuckBuilder[_], AppAction /* <: Action[_] */] (val x: Self with DuckBuilder[AppAction]) extends AnyVal {
      
      @scala.inline
      def setCreateAction(value: js.Any => ActionCreator[Extract[AppAction, Type[js.Any, AppAction]]]): Self = StObject.set(x, "createAction", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateReducer(value: (ActionHandlers[js.Any, AppAction], js.Any) => Reducer[js.Any, AppAction]): Self = StObject.set(x, "createReducer", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDefineType(value: ActionName => ActionType): Self = StObject.set(x, "defineType", js.Any.fromFunction1(value))
    }
  }
  
  type DuckName = String
  
  /* Inlined redux.redux.Action<string> & {  payload :any | undefined} */
  @js.native
  trait FSAHack extends StObject {
    
    var payload: js.UndefOr[js.Any] = js.native
    
    var `type`: String = js.native
  }
  object FSAHack {
    
    @scala.inline
    def apply(`type`: String): FSAHack = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FSAHack]
    }
    
    @scala.inline
    implicit class FSAHackMutableBuilder[Self <: FSAHack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: js.Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
