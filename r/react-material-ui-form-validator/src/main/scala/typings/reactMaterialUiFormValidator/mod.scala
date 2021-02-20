package typings.reactMaterialUiFormValidator

import org.scalablytyped.runtime.StringDictionary
import typings.materialUi.MaterialUI.SelectFieldProps
import typings.materialUi.MaterialUI.TextFieldProps
import typings.react.mod.Component
import typings.react.mod.FormEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-material-ui-form-validator", "SelectValidator")
  @js.native
  class SelectValidator protected ()
    extends Component[ValidatorComponentProps with SelectFieldProps, js.Object, js.Any] {
    def this(props: ValidatorComponentProps with SelectFieldProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ValidatorComponentProps with SelectFieldProps, context: js.Any) = this()
    
    def getErrorMessage(): String | Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    def makeInvalid(): Unit = js.native
    
    def makeValid(): Unit = js.native
    
    def validate(value: String): Unit = js.native
    def validate(value: String, includeRequired: js.UndefOr[scala.Nothing], dryRun: Boolean): Unit = js.native
    def validate(value: String, includeRequired: Boolean): Unit = js.native
    def validate(value: String, includeRequired: Boolean, dryRun: Boolean): Unit = js.native
  }
  
  @JSImport("react-material-ui-form-validator", "TextValidator")
  @js.native
  class TextValidator protected ()
    extends Component[ValidatorComponentProps with TextFieldProps, js.Object, js.Any] {
    def this(props: ValidatorComponentProps with TextFieldProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ValidatorComponentProps with TextFieldProps, context: js.Any) = this()
    
    def getErrorMessage(): String | Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    def makeInvalid(): Unit = js.native
    
    def makeValid(): Unit = js.native
    
    def validate(value: String): Unit = js.native
    def validate(value: String, includeRequired: js.UndefOr[scala.Nothing], dryRun: Boolean): Unit = js.native
    def validate(value: String, includeRequired: Boolean): Unit = js.native
    def validate(value: String, includeRequired: Boolean, dryRun: Boolean): Unit = js.native
  }
  
  @JSImport("react-material-ui-form-validator", "ValidatorComponent")
  @js.native
  class ValidatorComponent protected ()
    extends Component[ValidatorComponentProps, js.Object, js.Any] {
    def this(props: ValidatorComponentProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ValidatorComponentProps, context: js.Any) = this()
    
    def getErrorMessage(): String | Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    def makeInvalid(): Unit = js.native
    
    def makeValid(): Unit = js.native
    
    def validate(value: String): Unit = js.native
    def validate(value: String, includeRequired: js.UndefOr[scala.Nothing], dryRun: Boolean): Unit = js.native
    def validate(value: String, includeRequired: Boolean): Unit = js.native
    def validate(value: String, includeRequired: Boolean, dryRun: Boolean): Unit = js.native
  }
  
  @JSImport("react-material-ui-form-validator", "ValidatorForm")
  @js.native
  class ValidatorForm protected ()
    extends Component[ValidatorFormProps, js.Object, js.Any] {
    def this(props: ValidatorFormProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ValidatorFormProps, context: js.Any) = this()
    
    def isFormValid(dryRun: Boolean): js.Promise[Boolean] = js.native
    
    def resetValidations(): Unit = js.native
  }
  /* static members */
  object ValidatorForm {
    
    @JSImport("react-material-ui-form-validator", "ValidatorForm.addValidationRule")
    @js.native
    def addValidationRule(name: String, callback: js.Function1[/* value */ js.Any, Boolean | js.Promise[Boolean]]): Unit = js.native
    
    @JSImport("react-material-ui-form-validator", "ValidatorForm.removeValidationRule")
    @js.native
    def removeValidationRule(name: String): Unit = js.native
  }
  
  @js.native
  trait ValidatorComponentProps
    extends /* key */ StringDictionary[js.Any] {
    
    var errorMessages: js.UndefOr[js.Array[_] | String] = js.native
    
    var name: String = js.native
    
    var validatorListener: js.UndefOr[js.Function1[/* isValid */ Boolean, Unit]] = js.native
    
    var validators: js.UndefOr[js.Array[_]] = js.native
    
    var value: js.Any = js.native
    
    var withRequiredValidator: js.UndefOr[Boolean] = js.native
  }
  object ValidatorComponentProps {
    
    @scala.inline
    def apply(name: String, value: js.Any): ValidatorComponentProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidatorComponentProps]
    }
    
    @scala.inline
    implicit class ValidatorComponentPropsMutableBuilder[Self <: ValidatorComponentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorMessages(value: js.Array[_] | String): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorMessagesUndefined: Self = StObject.set(x, "errorMessages", js.undefined)
      
      @scala.inline
      def setErrorMessagesVarargs(value: js.Any*): Self = StObject.set(x, "errorMessages", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorListener(value: /* isValid */ Boolean => Unit): Self = StObject.set(x, "validatorListener", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidatorListenerUndefined: Self = StObject.set(x, "validatorListener", js.undefined)
      
      @scala.inline
      def setValidators(value: js.Array[_]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
      
      @scala.inline
      def setValidatorsVarargs(value: js.Any*): Self = StObject.set(x, "validators", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithRequiredValidator(value: Boolean): Self = StObject.set(x, "withRequiredValidator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithRequiredValidatorUndefined: Self = StObject.set(x, "withRequiredValidator", js.undefined)
    }
  }
  
  @js.native
  trait ValidatorFormProps
    extends /* key */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.native
    
    var debounceTime: js.UndefOr[Double] = js.native
    
    var instantValidate: js.UndefOr[Boolean] = js.native
    
    var onError: js.UndefOr[js.Function1[/* errors */ js.Array[_], Unit]] = js.native
    
    def onSubmit(event: FormEvent[Element]): Unit = js.native
  }
  object ValidatorFormProps {
    
    @scala.inline
    def apply(onSubmit: FormEvent[Element] => Unit): ValidatorFormProps = {
      val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit))
      __obj.asInstanceOf[ValidatorFormProps]
    }
    
    @scala.inline
    implicit class ValidatorFormPropsMutableBuilder[Self <: ValidatorFormProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDebounceTime(value: Double): Self = StObject.set(x, "debounceTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceTimeUndefined: Self = StObject.set(x, "debounceTime", js.undefined)
      
      @scala.inline
      def setInstantValidate(value: Boolean): Self = StObject.set(x, "instantValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstantValidateUndefined: Self = StObject.set(x, "instantValidate", js.undefined)
      
      @scala.inline
      def setOnError(value: /* errors */ js.Array[_] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: FormEvent[Element] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    }
  }
}
