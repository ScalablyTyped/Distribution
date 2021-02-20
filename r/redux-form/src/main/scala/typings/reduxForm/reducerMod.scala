package typings.reduxForm

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.redux.mod.AnyAction
import typings.redux.mod.Reducer
import typings.reduxForm.mod.FieldType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reducerMod extends Shortcut {
  
  @JSImport("redux-form/lib/reducer", JSImport.Default)
  @js.native
  val default: FormReducer = js.native
  
  @JSImport("redux-form/lib/reducer", "reducer")
  @js.native
  val reducer: FormReducer = js.native
  
  @js.native
  trait FieldState extends StObject {
    
    var active: js.UndefOr[Boolean] = js.native
    
    var touched: js.UndefOr[Boolean] = js.native
    
    var visited: js.UndefOr[Boolean] = js.native
  }
  object FieldState {
    
    @scala.inline
    def apply(): FieldState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldState]
    }
    
    @scala.inline
    implicit class FieldStateMutableBuilder[Self <: FieldState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchedUndefined: Self = StObject.set(x, "touched", js.undefined)
      
      @scala.inline
      def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisitedUndefined: Self = StObject.set(x, "visited", js.undefined)
    }
  }
  
  @js.native
  trait FormReducer extends Reducer[FormStateMap, AnyAction] {
    
    def plugin(reducers: FormReducerMapObject): Reducer[FormStateMap, AnyAction] = js.native
  }
  
  type FormReducerMapObject = // and `<any>` to make it compatible with redux@3
  // tslint:disable-next-line use-default-type-parameter
  StringDictionary[Reducer[js.Any, AnyAction]]
  
  @js.native
  trait FormState extends StObject {
    
    var active: js.UndefOr[String] = js.native
    
    var anyTouched: js.UndefOr[Boolean] = js.native
    
    var error: js.UndefOr[js.Any] = js.native
    
    var fields: js.UndefOr[StringDictionary[FieldState]] = js.native
    
    var registeredFields: js.Array[RegisteredFieldState] = js.native
    
    var submitErrors: js.UndefOr[StringDictionary[String]] = js.native
    
    var submitFailed: js.UndefOr[Boolean] = js.native
    
    var submitting: js.UndefOr[Boolean] = js.native
    
    var values: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object FormState {
    
    @scala.inline
    def apply(registeredFields: js.Array[RegisteredFieldState]): FormState = {
      val __obj = js.Dynamic.literal(registeredFields = registeredFields.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormState]
    }
    
    @scala.inline
    implicit class FormStateMutableBuilder[Self <: FormState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAnyTouched(value: Boolean): Self = StObject.set(x, "anyTouched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnyTouchedUndefined: Self = StObject.set(x, "anyTouched", js.undefined)
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setFields(value: StringDictionary[FieldState]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setRegisteredFields(value: js.Array[RegisteredFieldState]): Self = StObject.set(x, "registeredFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegisteredFieldsVarargs(value: RegisteredFieldState*): Self = StObject.set(x, "registeredFields", js.Array(value :_*))
      
      @scala.inline
      def setSubmitErrors(value: StringDictionary[String]): Self = StObject.set(x, "submitErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitErrorsUndefined: Self = StObject.set(x, "submitErrors", js.undefined)
      
      @scala.inline
      def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitFailedUndefined: Self = StObject.set(x, "submitFailed", js.undefined)
      
      @scala.inline
      def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmittingUndefined: Self = StObject.set(x, "submitting", js.undefined)
      
      @scala.inline
      def setValues(value: StringDictionary[js.Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  type FormStateMap = StringDictionary[FormState]
  
  @js.native
  trait RegisteredFieldState extends StObject {
    
    var count: Double = js.native
    
    var name: String = js.native
    
    var `type`: FieldType = js.native
  }
  object RegisteredFieldState {
    
    @scala.inline
    def apply(count: Double, name: String, `type`: FieldType): RegisteredFieldState = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredFieldState]
    }
    
    @scala.inline
    implicit class RegisteredFieldStateMutableBuilder[Self <: RegisteredFieldState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: FieldType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FormReducer
  
  /* This means you don't have to write `default`, but can instead just say `reducerMod.foo` */
  override def _to: FormReducer = default
}
