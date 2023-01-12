package typings.reactJsonEditorAjrm

import typings.react.mod.Component
import typings.reactJsonEditorAjrm.anon.Ampersand
import typings.reactJsonEditorAjrm.anon.Array
import typings.reactJsonEditorAjrm.anon.Curly
import typings.reactJsonEditorAjrm.anon.MissingClose
import typings.reactJsonEditorAjrm.anon.NumberAndLetterMissingQuotes
import typings.reactJsonEditorAjrm.anon.TermSequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-json-editor-ajrm", JSImport.Default)
  @js.native
  open class default ()
    extends Component[JSONInputProperties, js.Object, Any]
  
  type JSONInput = Component[JSONInputProperties, js.Object, Any]
  
  trait JSONInputProperties extends StObject {
    
    var colors: js.UndefOr[typings.reactJsonEditorAjrm.mod.colors] = js.undefined
    
    var confirmGood: js.UndefOr[Boolean] = js.undefined
    
    var error: js.UndefOr[typings.reactJsonEditorAjrm.mod.error] = js.undefined
    
    var height: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var locale: typings.reactJsonEditorAjrm.mod.locale
    
    var modifyErrorText: js.UndefOr[js.Function1[/* errorReason */ String, String]] = js.undefined
    
    var onBlur: js.UndefOr[Any] = js.undefined
    
    var onChange: js.UndefOr[Any] = js.undefined
    
    var onKeyPressUpdate: js.UndefOr[Boolean] = js.undefined
    
    var placeholder: js.UndefOr[Any] = js.undefined
    
    var reset: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[typings.reactJsonEditorAjrm.mod.style] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
    
    var viewOnly: js.UndefOr[Boolean] = js.undefined
    
    var waitAfterKeyPress: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object JSONInputProperties {
    
    inline def apply(locale: locale): JSONInputProperties = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONInputProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONInputProperties] (val x: Self) extends AnyVal {
      
      inline def setColors(value: colors): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setConfirmGood(value: Boolean): Self = StObject.set(x, "confirmGood", value.asInstanceOf[js.Any])
      
      inline def setConfirmGoodUndefined: Self = StObject.set(x, "confirmGood", js.undefined)
      
      inline def setError(value: error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLocale(value: locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setModifyErrorText(value: /* errorReason */ String => String): Self = StObject.set(x, "modifyErrorText", js.Any.fromFunction1(value))
      
      inline def setModifyErrorTextUndefined: Self = StObject.set(x, "modifyErrorText", js.undefined)
      
      inline def setOnBlur(value: Any): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: Any): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnKeyPressUpdate(value: Boolean): Self = StObject.set(x, "onKeyPressUpdate", value.asInstanceOf[js.Any])
      
      inline def setOnKeyPressUpdateUndefined: Self = StObject.set(x, "onKeyPressUpdate", js.undefined)
      
      inline def setPlaceholder(value: Any): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReset(value: Boolean): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      inline def setStyle(value: style): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setViewOnly(value: Boolean): Self = StObject.set(x, "viewOnly", value.asInstanceOf[js.Any])
      
      inline def setViewOnlyUndefined: Self = StObject.set(x, "viewOnly", js.undefined)
      
      inline def setWaitAfterKeyPress(value: Double): Self = StObject.set(x, "waitAfterKeyPress", value.asInstanceOf[js.Any])
      
      inline def setWaitAfterKeyPressUndefined: Self = StObject.set(x, "waitAfterKeyPress", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait colors extends StObject {
    
    var default: js.UndefOr[String] = js.undefined
    
    var background: js.UndefOr[String] = js.undefined
    
    var background_warning: js.UndefOr[String] = js.undefined
    
    var colon: js.UndefOr[String] = js.undefined
    
    var keys: js.UndefOr[String] = js.undefined
    
    var keys_whiteSpace: js.UndefOr[String] = js.undefined
    
    var number: js.UndefOr[String] = js.undefined
    
    var primitive: js.UndefOr[String] = js.undefined
    
    var string: js.UndefOr[String] = js.undefined
  }
  object colors {
    
    inline def apply(): colors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[colors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: colors] (val x: Self) extends AnyVal {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBackground_warning(value: String): Self = StObject.set(x, "background_warning", value.asInstanceOf[js.Any])
      
      inline def setBackground_warningUndefined: Self = StObject.set(x, "background_warning", js.undefined)
      
      inline def setColon(value: String): Self = StObject.set(x, "colon", value.asInstanceOf[js.Any])
      
      inline def setColonUndefined: Self = StObject.set(x, "colon", js.undefined)
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setKeys(value: String): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeys_whiteSpace(value: String): Self = StObject.set(x, "keys_whiteSpace", value.asInstanceOf[js.Any])
      
      inline def setKeys_whiteSpaceUndefined: Self = StObject.set(x, "keys_whiteSpace", js.undefined)
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setPrimitive(value: String): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
      
      inline def setPrimitiveUndefined: Self = StObject.set(x, "primitive", js.undefined)
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    }
  }
  
  trait error extends StObject {
    
    var line: js.UndefOr[Double] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
  }
  object error {
    
    inline def apply(): error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: error] (val x: Self) extends AnyVal {
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait locale extends StObject {
    
    var brace: Curly
    
    var format: String
    
    var invalidToken: TermSequence
    
    var key: NumberAndLetterMissingQuotes
    
    var noTrailingOrLeadingComma: String
    
    var string: MissingClose
    
    var symbols: Ampersand
    
    var types: Array
  }
  object locale {
    
    inline def apply(
      brace: Curly,
      format: String,
      invalidToken: TermSequence,
      key: NumberAndLetterMissingQuotes,
      noTrailingOrLeadingComma: String,
      string: MissingClose,
      symbols: Ampersand,
      types: Array
    ): locale = {
      val __obj = js.Dynamic.literal(brace = brace.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], invalidToken = invalidToken.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], noTrailingOrLeadingComma = noTrailingOrLeadingComma.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], symbols = symbols.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[locale]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: locale] (val x: Self) extends AnyVal {
      
      inline def setBrace(value: Curly): Self = StObject.set(x, "brace", value.asInstanceOf[js.Any])
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setInvalidToken(value: TermSequence): Self = StObject.set(x, "invalidToken", value.asInstanceOf[js.Any])
      
      inline def setKey(value: NumberAndLetterMissingQuotes): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNoTrailingOrLeadingComma(value: String): Self = StObject.set(x, "noTrailingOrLeadingComma", value.asInstanceOf[js.Any])
      
      inline def setString(value: MissingClose): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setSymbols(value: Ampersand): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: Array): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    }
  }
  
  trait style extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var container: js.UndefOr[Any] = js.undefined
    
    var contentBox: js.UndefOr[Any] = js.undefined
    
    var errorMessage: js.UndefOr[Any] = js.undefined
    
    var labelColumn: js.UndefOr[Any] = js.undefined
    
    var labels: js.UndefOr[Any] = js.undefined
    
    var outerBox: js.UndefOr[Any] = js.undefined
    
    var warningBox: js.UndefOr[Any] = js.undefined
  }
  object style {
    
    inline def apply(): style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[style]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: style] (val x: Self) extends AnyVal {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContentBox(value: Any): Self = StObject.set(x, "contentBox", value.asInstanceOf[js.Any])
      
      inline def setContentBoxUndefined: Self = StObject.set(x, "contentBox", js.undefined)
      
      inline def setErrorMessage(value: Any): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
      
      inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
      
      inline def setLabelColumn(value: Any): Self = StObject.set(x, "labelColumn", value.asInstanceOf[js.Any])
      
      inline def setLabelColumnUndefined: Self = StObject.set(x, "labelColumn", js.undefined)
      
      inline def setLabels(value: Any): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setOuterBox(value: Any): Self = StObject.set(x, "outerBox", value.asInstanceOf[js.Any])
      
      inline def setOuterBoxUndefined: Self = StObject.set(x, "outerBox", js.undefined)
      
      inline def setWarningBox(value: Any): Self = StObject.set(x, "warningBox", value.asInstanceOf[js.Any])
      
      inline def setWarningBoxUndefined: Self = StObject.set(x, "warningBox", js.undefined)
    }
  }
}
