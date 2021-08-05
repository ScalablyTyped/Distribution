package typings.reactMaterialUiFormValidator

import org.scalablytyped.runtime.StringDictionary
import typings.materialUi.MaterialUI.SelectFieldProps
import typings.materialUi.MaterialUI.TextFieldProps
import typings.react.mod.Component
import typings.react.mod.FormEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-material-ui-form-validator", "SelectValidator")
  @js.native
  class SelectValidator protected ()
    extends Component[ValidatorComponentProps & SelectFieldProps, js.Object, js.Any] {
    def this(props: ValidatorComponentProps & SelectFieldProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ValidatorComponentProps & SelectFieldProps, context: js.Any) = this()
    
    def getErrorMessage(): String | Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    def makeInvalid(): Unit = js.native
    
    def makeValid(): Unit = js.native
    
    def validate(value: String): Unit = js.native
    def validate(value: String, includeRequired: Boolean): Unit = js.native
    def validate(value: String, includeRequired: Boolean, dryRun: Boolean): Unit = js.native
    def validate(value: String, includeRequired: Unit, dryRun: Boolean): Unit = js.native
  }
  
  @JSImport("react-material-ui-form-validator", "TextValidator")
  @js.native
  class TextValidator protected ()
    extends Component[ValidatorComponentProps & TextFieldProps, js.Object, js.Any] {
    def this(props: ValidatorComponentProps & TextFieldProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ValidatorComponentProps & TextFieldProps, context: js.Any) = this()
    
    def getErrorMessage(): String | Boolean = js.native
    
    def isValid(): Boolean = js.native
    
    def makeInvalid(): Unit = js.native
    
    def makeValid(): Unit = js.native
    
    def validate(value: String): Unit = js.native
    def validate(value: String, includeRequired: Boolean): Unit = js.native
    def validate(value: String, includeRequired: Boolean, dryRun: Boolean): Unit = js.native
    def validate(value: String, includeRequired: Unit, dryRun: Boolean): Unit = js.native
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
    def validate(value: String, includeRequired: Boolean): Unit = js.native
    def validate(value: String, includeRequired: Boolean, dryRun: Boolean): Unit = js.native
    def validate(value: String, includeRequired: Unit, dryRun: Boolean): Unit = js.native
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
    
    @JSImport("react-material-ui-form-validator", "ValidatorForm")
    @js.native
    val ^ : js.Any = js.native
    
    inline def addValidationRule(name: String, callback: js.Function1[/* value */ js.Any, Boolean | js.Promise[Boolean]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addValidationRule")(name.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def removeValidationRule(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeValidationRule")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  trait ValidatorComponentProps
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var errorMessages: js.UndefOr[js.Array[js.Any] | String] = js.undefined
    
    var name: String
    
    var validatorListener: js.UndefOr[js.Function1[/* isValid */ Boolean, Unit]] = js.undefined
    
    var validators: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var value: js.Any
    
    var withRequiredValidator: js.UndefOr[Boolean] = js.undefined
  }
  object ValidatorComponentProps {
    
    inline def apply(name: String, value: js.Any): ValidatorComponentProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidatorComponentProps]
    }
    
    extension [Self <: ValidatorComponentProps](x: Self) {
      
      inline def setErrorMessages(value: js.Array[js.Any] | String): Self = StObject.set(x, "errorMessages", value.asInstanceOf[js.Any])
      
      inline def setErrorMessagesUndefined: Self = StObject.set(x, "errorMessages", js.undefined)
      
      inline def setErrorMessagesVarargs(value: js.Any*): Self = StObject.set(x, "errorMessages", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValidatorListener(value: /* isValid */ Boolean => Unit): Self = StObject.set(x, "validatorListener", js.Any.fromFunction1(value))
      
      inline def setValidatorListenerUndefined: Self = StObject.set(x, "validatorListener", js.undefined)
      
      inline def setValidators(value: js.Array[js.Any]): Self = StObject.set(x, "validators", value.asInstanceOf[js.Any])
      
      inline def setValidatorsUndefined: Self = StObject.set(x, "validators", js.undefined)
      
      inline def setValidatorsVarargs(value: js.Any*): Self = StObject.set(x, "validators", js.Array(value :_*))
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setWithRequiredValidator(value: Boolean): Self = StObject.set(x, "withRequiredValidator", value.asInstanceOf[js.Any])
      
      inline def setWithRequiredValidatorUndefined: Self = StObject.set(x, "withRequiredValidator", js.undefined)
    }
  }
  
  trait ValidatorFormProps
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var debounceTime: js.UndefOr[Double] = js.undefined
    
    var instantValidate: js.UndefOr[Boolean] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* errors */ js.Array[js.Any], Unit]] = js.undefined
    
    def onSubmit(event: FormEvent[Element]): Unit
  }
  object ValidatorFormProps {
    
    inline def apply(onSubmit: FormEvent[Element] => Unit): ValidatorFormProps = {
      val __obj = js.Dynamic.literal(onSubmit = js.Any.fromFunction1(onSubmit))
      __obj.asInstanceOf[ValidatorFormProps]
    }
    
    extension [Self <: ValidatorFormProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDebounceTime(value: Double): Self = StObject.set(x, "debounceTime", value.asInstanceOf[js.Any])
      
      inline def setDebounceTimeUndefined: Self = StObject.set(x, "debounceTime", js.undefined)
      
      inline def setInstantValidate(value: Boolean): Self = StObject.set(x, "instantValidate", value.asInstanceOf[js.Any])
      
      inline def setInstantValidateUndefined: Self = StObject.set(x, "instantValidate", js.undefined)
      
      inline def setOnError(value: /* errors */ js.Array[js.Any] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnSubmit(value: FormEvent[Element] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
    }
  }
}
