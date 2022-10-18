package typings.reduxDuck

import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.reduxDuck.anon.Type
import typings.std.Extract
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-duck", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDuck(a: DuckName): DuckBuilder[AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDuck")(a.asInstanceOf[js.Any]).asInstanceOf[DuckBuilder[AnyAction]]
  inline def createDuck(a: DuckName, b: AppName): DuckBuilder[AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("createDuck")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[DuckBuilder[AnyAction]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    A extends {  payload :any} ? (a : A['payload']): A : (): A
    }}}
    */
  @js.native
  trait ActionCreator[A /* <: FSAHack */] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ T in A['type'] ]:? (x : S, y : std.Extract<A, {  type :T}>): S}
    }}}
    */
  @js.native
  trait ActionHandlers[S, A /* <: Action[Any] */] extends StObject
  
  type ActionName = String
  
  type ActionType = String
  
  type AppName = String
  
  trait DuckBuilder[AppAction /* <: Action[Any] */] extends StObject {
    
    def createAction[T /* <: String & (/* import warning: importer.ImportType#apply Failed type conversion: AppAction['type'] */ js.Any) */](a: T): ActionCreator[Extract[AppAction, Type[T, AppAction]]]
    
    def createReducer[S](a: ActionHandlers[S, AppAction], b: S): Reducer[S, AppAction]
    
    def defineType(a: ActionName): ActionType
  }
  object DuckBuilder {
    
    inline def apply[AppAction /* <: Action[Any] */](
      createAction: Any => ActionCreator[Extract[AppAction, Type[Any, AppAction]]],
      createReducer: (ActionHandlers[Any, AppAction], Any) => Reducer[Any, AppAction],
      defineType: ActionName => ActionType
    ): DuckBuilder[AppAction] = {
      val __obj = js.Dynamic.literal(createAction = js.Any.fromFunction1(createAction), createReducer = js.Any.fromFunction2(createReducer), defineType = js.Any.fromFunction1(defineType))
      __obj.asInstanceOf[DuckBuilder[AppAction]]
    }
    
    extension [Self <: DuckBuilder[?], AppAction /* <: Action[Any] */](x: Self & DuckBuilder[AppAction]) {
      
      inline def setCreateAction(value: Any => ActionCreator[Extract[AppAction, Type[Any, AppAction]]]): Self = StObject.set(x, "createAction", js.Any.fromFunction1(value))
      
      inline def setCreateReducer(value: (ActionHandlers[Any, AppAction], Any) => Reducer[Any, AppAction]): Self = StObject.set(x, "createReducer", js.Any.fromFunction2(value))
      
      inline def setDefineType(value: ActionName => ActionType): Self = StObject.set(x, "defineType", js.Any.fromFunction1(value))
    }
  }
  
  type DuckName = String
  
  trait FSAHack
    extends StObject
       with Action[String] {
    
    var payload: js.UndefOr[Any] = js.undefined
  }
  object FSAHack {
    
    inline def apply(`type`: String): FSAHack = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FSAHack]
    }
    
    extension [Self <: FSAHack](x: Self) {
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
}
