package typings.reduxForm

import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.reduxForm.anon.Props
import typings.reduxForm.fieldMod.Validator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldArrayMod {
  
  @JSImport("redux-form/lib/FieldArray", "FieldArray")
  @js.native
  class FieldArray[P, FieldValue] protected () extends GenericFieldArray[FieldValue, P] {
    def this(props: BaseFieldArrayProps[P, FieldValue]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: BaseFieldArrayProps[P, FieldValue], context: js.Any) = this()
  }
  
  type BaseFieldArrayProps[P, FieldValue] = (P | Props[P]) & (_BaseFieldArrayProps[P, FieldValue])
  
  @js.native
  trait FieldArrayFieldsProps[FieldValue] extends StObject {
    
    def forEach(callback: FieldIterate[FieldValue, Unit]): Unit = js.native
    
    def get(index: Double): FieldValue = js.native
    
    def getAll(): js.Array[FieldValue] = js.native
    
    def insert(index: Double, value: FieldValue): Unit = js.native
    
    var length: Double = js.native
    
    def map[R](callback: FieldIterate[FieldValue, R]): js.Array[R] = js.native
    
    def move(from: Double, to: Double): Unit = js.native
    
    var name: String = js.native
    
    def pop(): FieldValue = js.native
    
    def push(value: FieldValue): Unit = js.native
    
    def remove(index: Double): Unit = js.native
    
    def removeAll(): Unit = js.native
    
    def shift(): FieldValue = js.native
    
    def splice(index: Double, removeNum: Double, value: FieldValue): Unit = js.native
    def splice(index: Double, removeNum: Null, value: FieldValue): Unit = js.native
    
    def swap(indexA: Double, indexB: Double): Unit = js.native
    
    def unshift(value: FieldValue): Unit = js.native
  }
  
  trait FieldArrayMetaProps extends StObject {
    
    var dirty: Boolean
    
    var error: js.UndefOr[js.Any] = js.undefined
    
    var form: String
    
    var invalid: Boolean
    
    var pristine: Boolean
    
    var submitFailed: Boolean
    
    var submitting: Boolean
    
    var valid: Boolean
    
    var warning: js.UndefOr[js.Any] = js.undefined
  }
  object FieldArrayMetaProps {
    
    inline def apply(
      dirty: Boolean,
      form: String,
      invalid: Boolean,
      pristine: Boolean,
      submitFailed: Boolean,
      submitting: Boolean,
      valid: Boolean
    ): FieldArrayMetaProps = {
      val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], submitFailed = submitFailed.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldArrayMetaProps]
    }
    
    extension [Self <: FieldArrayMetaProps](x: Self) {
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      inline def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      inline def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: js.Any): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  type FieldIterate[FieldValue, R] = js.Function3[
    /* name */ String, 
    /* index */ Double, 
    /* fields */ FieldArrayFieldsProps[FieldValue], 
    R
  ]
  
  @js.native
  trait GenericFieldArray[FieldValue, P]
    extends Component[BaseFieldArrayProps[P, FieldValue], js.Object, js.Any] {
    
    def getRenderedComponent(): Component[WrappedFieldArrayProps[FieldValue] & P, js.Object, js.Any] = js.native
    
    var name: String = js.native
    
    var valid: Boolean = js.native
  }
  
  trait WrappedFieldArrayProps[FieldValue] extends StObject {
    
    var fields: FieldArrayFieldsProps[FieldValue]
    
    var meta: FieldArrayMetaProps
  }
  object WrappedFieldArrayProps {
    
    inline def apply[FieldValue](fields: FieldArrayFieldsProps[FieldValue], meta: FieldArrayMetaProps): WrappedFieldArrayProps[FieldValue] = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedFieldArrayProps[FieldValue]]
    }
    
    extension [Self <: WrappedFieldArrayProps[?], FieldValue](x: Self & WrappedFieldArrayProps[FieldValue]) {
      
      inline def setFields(value: FieldArrayFieldsProps[FieldValue]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: FieldArrayMetaProps): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait _BaseFieldArrayProps[P, FieldValue] extends StObject {
    
    var component: ComponentType[WrappedFieldArrayProps[FieldValue] & P]
    
    var name: String
    
    var rerenderOnEveryChange: js.UndefOr[Boolean] = js.undefined
    
    var validate: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
    
    var warn: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
    
    var withRef: js.UndefOr[Boolean] = js.undefined
  }
  object _BaseFieldArrayProps {
    
    inline def apply[P, FieldValue](component: ComponentType[WrappedFieldArrayProps[FieldValue] & P], name: String): _BaseFieldArrayProps[P, FieldValue] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[_BaseFieldArrayProps[P, FieldValue]]
    }
    
    extension [Self <: _BaseFieldArrayProps[?, ?], P, FieldValue](x: Self & (_BaseFieldArrayProps[P, FieldValue])) {
      
      inline def setComponent(value: ComponentType[WrappedFieldArrayProps[FieldValue] & P]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRerenderOnEveryChange(value: Boolean): Self = StObject.set(x, "rerenderOnEveryChange", value.asInstanceOf[js.Any])
      
      inline def setRerenderOnEveryChangeUndefined: Self = StObject.set(x, "rerenderOnEveryChange", js.undefined)
      
      inline def setValidate(value: Validator | js.Array[Validator]): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateFunction4(
        value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "validate", js.Any.fromFunction4(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setValidateVarargs(value: Validator*): Self = StObject.set(x, "validate", js.Array(value :_*))
      
      inline def setWarn(value: Validator | js.Array[Validator]): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnFunction4(
        value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "warn", js.Any.fromFunction4(value))
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
      
      inline def setWarnVarargs(value: Validator*): Self = StObject.set(x, "warn", js.Array(value :_*))
      
      inline def setWithRef(value: Boolean): Self = StObject.set(x, "withRef", value.asInstanceOf[js.Any])
      
      inline def setWithRefUndefined: Self = StObject.set(x, "withRef", js.undefined)
    }
  }
}
