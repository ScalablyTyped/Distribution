package typings.reduxForm

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.reduxForm.mod.FieldType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libReducerMod extends Shortcut {
  
  @JSImport("redux-form/lib/reducer", JSImport.Default)
  @js.native
  val default: FormReducer = js.native
  
  @JSImport("redux-form/lib/reducer", "reducer")
  @js.native
  val reducer: FormReducer = js.native
  
  trait FieldState extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var touched: js.UndefOr[Boolean] = js.undefined
    
    var visited: js.UndefOr[Boolean] = js.undefined
  }
  object FieldState {
    
    inline def apply(): FieldState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldState]
    }
    
    extension [Self <: FieldState](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      inline def setTouchedUndefined: Self = StObject.set(x, "touched", js.undefined)
      
      inline def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      inline def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
    }
  }
  
  @js.native
  trait FormReducer extends Reducer[FormStateMap, AnyAction] {
    
    def plugin(reducers: FormReducerMapObject): Reducer[FormStateMap, AnyAction] = js.native
  }
  
  type FormReducerMapObject = // and `<any>` to make it compatible with redux@3
  // tslint:disable-next-line use-default-type-parameter
  StringDictionary[Reducer[Any, AnyAction]]
  
  trait FormState extends StObject {
    
    var active: js.UndefOr[String] = js.undefined
    
    var anyTouched: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[Any] = js.undefined
    
    var fields: js.UndefOr[StringDictionary[FieldState]] = js.undefined
    
    var registeredFields: js.Array[RegisteredFieldState]
    
    var submitErrors: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var submitFailed: js.UndefOr[Boolean] = js.undefined
    
    var submitting: js.UndefOr[Boolean] = js.undefined
    
    var values: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object FormState {
    
    inline def apply(registeredFields: js.Array[RegisteredFieldState]): FormState = {
      val __obj = js.Dynamic.literal(registeredFields = registeredFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormState]
    }
    
    extension [Self <: FormState](x: Self) {
      
      inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAnyTouched(value: Boolean): Self = StObject.set(x, "anyTouched", value.asInstanceOf[js.Any])
      
      inline def setAnyTouchedUndefined: Self = StObject.set(x, "anyTouched", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFields(value: StringDictionary[FieldState]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setRegisteredFields(value: js.Array[RegisteredFieldState]): Self = StObject.set(x, "registeredFields", value.asInstanceOf[js.Any])
      
      inline def setRegisteredFieldsVarargs(value: RegisteredFieldState*): Self = StObject.set(x, "registeredFields", js.Array(value*))
      
      inline def setSubmitErrors(value: StringDictionary[String]): Self = StObject.set(x, "submitErrors", value.asInstanceOf[js.Any])
      
      inline def setSubmitErrorsUndefined: Self = StObject.set(x, "submitErrors", js.undefined)
      
      inline def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      inline def setSubmitFailedUndefined: Self = StObject.set(x, "submitFailed", js.undefined)
      
      inline def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      inline def setSubmittingUndefined: Self = StObject.set(x, "submitting", js.undefined)
      
      inline def setValues(value: StringDictionary[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  type FormStateMap = StringDictionary[FormState]
  
  trait RegisteredFieldState extends StObject {
    
    var count: Double
    
    var name: String
    
    var `type`: FieldType
  }
  object RegisteredFieldState {
    
    inline def apply(count: Double, name: String, `type`: FieldType): RegisteredFieldState = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredFieldState]
    }
    
    extension [Self <: RegisteredFieldState](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FormReducer
  
  /* This means you don't have to write `default`, but can instead just say `libReducerMod.foo` */
  override def _to: FormReducer = default
}
