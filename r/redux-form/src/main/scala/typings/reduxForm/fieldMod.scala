package typings.reduxForm

import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.SelectHTMLAttributes
import typings.react.mod.TextareaHTMLAttributes
import typings.redux.mod.Dispatch
import typings.reduxForm.reduxFormStrings.input
import typings.reduxForm.reduxFormStrings.select
import typings.reduxForm.reduxFormStrings.textarea
import typings.std.HTMLInputElement
import typings.std.HTMLSelectElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fieldMod {
  
  @JSImport("redux-form/lib/Field", JSImport.Default)
  @js.native
  class default[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] protected () extends Field[P] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: js.Any) = this()
  }
  
  @JSImport("redux-form/lib/Field", "Field")
  @js.native
  class Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] protected ()
    extends Component[P, js.Object, js.Any] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: js.Any) = this()
    
    var dirty: Boolean = js.native
    
    def getRenderedComponent(): Component[WrappedFieldProps & P, js.Object, js.Any] = js.native
    
    var name: String = js.native
    
    var pristine: Boolean = js.native
    
    var value: js.Any = js.native
  }
  
  /* Inlined parent std.Partial<redux-form.redux-form/lib/Field.CommonFieldProps> */
  trait BaseFieldProps[P] extends StObject {
    
    var component: js.UndefOr[(ComponentType[WrappedFieldProps & P]) | input | select | textarea] = js.undefined
    
    var format: js.UndefOr[Formatter | Null] = js.undefined
    
    var forwardRef: js.UndefOr[Boolean] = js.undefined
    
    var immutableProps: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String
    
    var normalize: js.UndefOr[Normalizer] = js.undefined
    
    var onBlur: js.UndefOr[EventWithDataHandler[FocusEvent[js.Any]]] = js.undefined
    
    var onChange: js.UndefOr[EventWithDataHandler[ChangeEvent[js.Any]]] = js.undefined
    
    var onDragStart: js.UndefOr[EventHandler[DragEvent[js.Any]]] = js.undefined
    
    var onDrop: js.UndefOr[EventHandler[DragEvent[js.Any]]] = js.undefined
    
    var onFocus: js.UndefOr[EventHandler[FocusEvent[js.Any]]] = js.undefined
    
    var parse: js.UndefOr[Parser] = js.undefined
    
    var props: js.UndefOr[P] = js.undefined
    
    var validate: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
    
    var warn: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
  }
  object BaseFieldProps {
    
    @scala.inline
    def apply[P](name: String): BaseFieldProps[P] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseFieldProps[P]]
    }
    
    @scala.inline
    implicit class BaseFieldPropsMutableBuilder[Self <: BaseFieldProps[?], P] (val x: Self & BaseFieldProps[P]) extends AnyVal {
      
      @scala.inline
      def setComponent(value: (ComponentType[WrappedFieldProps & P]) | input | select | textarea): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      @scala.inline
      def setFormat(value: (/* value */ js.Any, /* name */ String) => js.Any): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatNull: Self = StObject.set(x, "format", null)
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
      
      @scala.inline
      def setImmutableProps(value: js.Array[String]): Self = StObject.set(x, "immutableProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmutablePropsUndefined: Self = StObject.set(x, "immutableProps", js.undefined)
      
      @scala.inline
      def setImmutablePropsVarargs(value: String*): Self = StObject.set(x, "immutableProps", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalize(
        value: (/* value */ js.Any, /* previousValue */ js.UndefOr[js.Any], /* allValues */ js.UndefOr[js.Any], /* previousAllValues */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "normalize", js.Any.fromFunction4(value))
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      @scala.inline
      def setOnBlur(
        value: (/* event */ js.UndefOr[FocusEvent[js.Any]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "onBlur", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* event */ js.UndefOr[ChangeEvent[js.Any]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: (DragEvent[js.Any], /* name */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDrop(value: (DragEvent[js.Any], /* name */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnFocus(value: (FocusEvent[js.Any], /* name */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setParse(value: (/* value */ js.Any, /* name */ String) => js.Any): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      @scala.inline
      def setValidate(value: Validator | js.Array[Validator]): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateFunction4(
        value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "validate", js.Any.fromFunction4(value))
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      @scala.inline
      def setValidateVarargs(value: Validator*): Self = StObject.set(x, "validate", js.Array(value :_*))
      
      @scala.inline
      def setWarn(value: Validator | js.Array[Validator]): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarnFunction4(
        value: (/* value */ js.Any, /* allValues */ js.UndefOr[js.Any], /* props */ js.UndefOr[js.Any], /* name */ js.UndefOr[js.Any]) => js.Any
      ): Self = StObject.set(x, "warn", js.Any.fromFunction4(value))
      
      @scala.inline
      def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
      
      @scala.inline
      def setWarnVarargs(value: Validator*): Self = StObject.set(x, "warn", js.Array(value :_*))
    }
  }
  
  trait CommonFieldInputProps extends StObject {
    
    var name: String
    
    var onDragStart: EventHandler[DragEvent[js.Any]]
    
    var onDrop: EventHandler[DragEvent[js.Any]]
    
    var onFocus: EventHandler[FocusEvent[js.Any]]
  }
  object CommonFieldInputProps {
    
    @scala.inline
    def apply(
      name: String,
      onDragStart: (DragEvent[js.Any], /* name */ js.UndefOr[String]) => Unit,
      onDrop: (DragEvent[js.Any], /* name */ js.UndefOr[String]) => Unit,
      onFocus: (FocusEvent[js.Any], /* name */ js.UndefOr[String]) => Unit
    ): CommonFieldInputProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onDragStart = js.Any.fromFunction2(onDragStart), onDrop = js.Any.fromFunction2(onDrop), onFocus = js.Any.fromFunction2(onFocus))
      __obj.asInstanceOf[CommonFieldInputProps]
    }
    
    @scala.inline
    implicit class CommonFieldInputPropsMutableBuilder[Self <: CommonFieldInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDragStart(value: (DragEvent[js.Any], /* name */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnDrop(value: (DragEvent[js.Any], /* name */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnFocus(value: (FocusEvent[js.Any], /* name */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction2(value))
    }
  }
  
  trait CommonFieldProps
    extends StObject
       with CommonFieldInputProps {
    
    var onBlur: EventWithDataHandler[FocusEvent[js.Any]]
    
    var onChange: EventWithDataHandler[ChangeEvent[js.Any]]
  }
  object CommonFieldProps {
    
    @scala.inline
    def apply(
      name: String,
      onBlur: (/* event */ js.UndefOr[FocusEvent[js.Any]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit,
      onChange: (/* event */ js.UndefOr[ChangeEvent[js.Any]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit,
      onDragStart: (DragEvent[js.Any], /* name */ js.UndefOr[String]) => Unit,
      onDrop: (DragEvent[js.Any], /* name */ js.UndefOr[String]) => Unit,
      onFocus: (FocusEvent[js.Any], /* name */ js.UndefOr[String]) => Unit
    ): CommonFieldProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = js.Any.fromFunction4(onBlur), onChange = js.Any.fromFunction4(onChange), onDragStart = js.Any.fromFunction2(onDragStart), onDrop = js.Any.fromFunction2(onDrop), onFocus = js.Any.fromFunction2(onFocus))
      __obj.asInstanceOf[CommonFieldProps]
    }
    
    @scala.inline
    implicit class CommonFieldPropsMutableBuilder[Self <: CommonFieldProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnBlur(
        value: (/* event */ js.UndefOr[FocusEvent[js.Any]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "onBlur", js.Any.fromFunction4(value))
      
      @scala.inline
      def setOnChange(
        value: (/* event */ js.UndefOr[ChangeEvent[js.Any]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4(value))
    }
  }
  
  type EventHandler[Event] = js.Function2[/* event */ Event, /* name */ js.UndefOr[String], Unit]
  
  @js.native
  trait EventOrValueHandler[Event] extends EventHandler[Event] {
    
    def apply(value: js.Any): Unit = js.native
  }
  
  type EventWithDataHandler[Event] = js.Function4[
    /* event */ js.UndefOr[Event], 
    /* newValue */ js.UndefOr[js.Any], 
    /* previousValue */ js.UndefOr[js.Any], 
    /* name */ js.UndefOr[String], 
    Unit
  ]
  
  type Formatter = js.Function2[/* value */ js.Any, /* name */ String, js.Any]
  
  @js.native
  trait GenericField[P]
    extends Component[BaseFieldProps[P] & P, js.Object, js.Any] {
    
    var dirty: Boolean = js.native
    
    def getRenderedComponent(): Component[WrappedFieldProps & P, js.Object, js.Any] = js.native
    
    var name: String = js.native
    
    var pristine: Boolean = js.native
    
    var value: js.Any = js.native
  }
  
  type GenericFieldHTMLAttributes = InputHTMLAttributes[HTMLInputElement] | SelectHTMLAttributes[HTMLSelectElement] | TextareaHTMLAttributes[HTMLTextAreaElement]
  
  type Normalizer = js.Function4[
    /* value */ js.Any, 
    /* previousValue */ js.UndefOr[js.Any], 
    /* allValues */ js.UndefOr[js.Any], 
    /* previousAllValues */ js.UndefOr[js.Any], 
    js.Any
  ]
  
  type Parser = js.Function2[/* value */ js.Any, /* name */ String, js.Any]
  
  type Validator = js.Function4[
    /* value */ js.Any, 
    /* allValues */ js.UndefOr[js.Any], 
    /* props */ js.UndefOr[js.Any], 
    /* name */ js.UndefOr[js.Any], 
    js.Any
  ]
  
  trait WrappedFieldInputProps
    extends StObject
       with CommonFieldInputProps {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: EventOrValueHandler[FocusEvent[js.Any]]
    
    var onChange: EventOrValueHandler[ChangeEvent[js.Any]]
    
    var value: js.Any
  }
  object WrappedFieldInputProps {
    
    @scala.inline
    def apply(
      name: String,
      onBlur: EventOrValueHandler[FocusEvent[js.Any]],
      onChange: EventOrValueHandler[ChangeEvent[js.Any]],
      onDragStart: (DragEvent[js.Any], /* name */ js.UndefOr[String]) => Unit,
      onDrop: (DragEvent[js.Any], /* name */ js.UndefOr[String]) => Unit,
      onFocus: (FocusEvent[js.Any], /* name */ js.UndefOr[String]) => Unit,
      value: js.Any
    ): WrappedFieldInputProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onDragStart = js.Any.fromFunction2(onDragStart), onDrop = js.Any.fromFunction2(onDrop), onFocus = js.Any.fromFunction2(onFocus), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedFieldInputProps]
    }
    
    @scala.inline
    implicit class WrappedFieldInputPropsMutableBuilder[Self <: WrappedFieldInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setOnBlur(value: EventOrValueHandler[FocusEvent[js.Any]]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnChange(value: EventOrValueHandler[ChangeEvent[js.Any]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait WrappedFieldMetaProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var asyncValidating: Boolean
    
    var autofilled: Boolean
    
    var dirty: Boolean
    
    var dispatch: Dispatch[js.Any]
    
    var error: js.UndefOr[js.Any] = js.undefined
    
    var form: String
    
    var initial: js.Any
    
    var invalid: Boolean
    
    var pristine: Boolean
    
    var submitFailed: Boolean
    
    var submitting: Boolean
    
    var touched: Boolean
    
    var valid: Boolean
    
    var visited: Boolean
    
    var warning: js.UndefOr[js.Any] = js.undefined
  }
  object WrappedFieldMetaProps {
    
    @scala.inline
    def apply(
      asyncValidating: Boolean,
      autofilled: Boolean,
      dirty: Boolean,
      dispatch: js.Any => js.Any,
      form: String,
      initial: js.Any,
      invalid: Boolean,
      pristine: Boolean,
      submitFailed: Boolean,
      submitting: Boolean,
      touched: Boolean,
      valid: Boolean,
      visited: Boolean
    ): WrappedFieldMetaProps = {
      val __obj = js.Dynamic.literal(asyncValidating = asyncValidating.asInstanceOf[js.Any], autofilled = autofilled.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), form = form.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], submitFailed = submitFailed.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedFieldMetaProps]
    }
    
    @scala.inline
    implicit class WrappedFieldMetaPropsMutableBuilder[Self <: WrappedFieldMetaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAsyncValidating(value: Boolean): Self = StObject.set(x, "asyncValidating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutofilled(value: Boolean): Self = StObject.set(x, "autofilled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispatch(value: js.Any => js.Any): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitial(value: js.Any): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarning(value: js.Any): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait WrappedFieldProps extends StObject {
    
    var input: WrappedFieldInputProps
    
    var meta: WrappedFieldMetaProps
  }
  object WrappedFieldProps {
    
    @scala.inline
    def apply(input: WrappedFieldInputProps, meta: WrappedFieldMetaProps): WrappedFieldProps = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedFieldProps]
    }
    
    @scala.inline
    implicit class WrappedFieldPropsMutableBuilder[Self <: WrappedFieldProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: WrappedFieldInputProps): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeta(value: WrappedFieldMetaProps): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
}
