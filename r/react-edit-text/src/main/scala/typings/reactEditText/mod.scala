package typings.reactEditText

import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.CSSProperties
import typings.react.mod.ChangeEvent
import typings.react.mod.Component
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-edit-text", "EditText")
  @js.native
  open class EditText protected ()
    extends Component[EditTextProps, js.Object, Any] {
    def this(props: EditTextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: EditTextProps, context: Any) = this()
  }
  
  @JSImport("react-edit-text", "EditTextarea")
  @js.native
  open class EditTextarea protected ()
    extends Component[EditTextareaProps, js.Object, Any] {
    def this(props: EditTextareaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: EditTextareaProps, context: Any) = this()
  }
  
  trait EditTextProps
    extends StObject
       with SharedProps {
    
    /**
      * Sets the content for the edit button. This can be any valid element,
      * default: <EditIcon />
      */
    var editButtonContent: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Sets the props passed to the edit button. This can be any valid DOM attribute,
      * default: {}
      */
    var editButtonProps: js.UndefOr[DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]] = js.undefined
    
    /**
      * Sets the element display to inline when set to true,
      * default: false
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Displays an edit button that can be pressed to enable edit mode,
      * default: false
      */
    var showEditButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * type attribute set for input element,
      * default: 'text'
      */
    var `type`: js.UndefOr[inputTextType] = js.undefined
  }
  object EditTextProps {
    
    inline def apply(): EditTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditTextProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditTextProps] (val x: Self) extends AnyVal {
      
      inline def setEditButtonContent(value: ReactNode): Self = StObject.set(x, "editButtonContent", value.asInstanceOf[js.Any])
      
      inline def setEditButtonContentUndefined: Self = StObject.set(x, "editButtonContent", js.undefined)
      
      inline def setEditButtonProps(value: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]): Self = StObject.set(x, "editButtonProps", value.asInstanceOf[js.Any])
      
      inline def setEditButtonPropsUndefined: Self = StObject.set(x, "editButtonProps", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setShowEditButton(value: Boolean): Self = StObject.set(x, "showEditButton", value.asInstanceOf[js.Any])
      
      inline def setShowEditButtonUndefined: Self = StObject.set(x, "showEditButton", js.undefined)
      
      inline def setType(value: inputTextType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait EditTextareaProps
    extends StObject
       with SharedProps {
    
    /**
      * the number of visible rows,
      * default: 3
      */
    var rows: js.UndefOr[Double] = js.undefined
  }
  object EditTextareaProps {
    
    inline def apply(): EditTextareaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditTextareaProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditTextareaProps] (val x: Self) extends AnyVal {
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
  
  trait SharedProps extends StObject {
    
    /**
      * class attribute set for display element
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * defaultValue sets the defaultValue for input element and initial text of display element
      */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /**
      * formatDisplayText is used to pass in a function which takes in a value and returns a formatted value
      * which is used to format the text shown in the display element
      * default: (val) => val
      */
    var formatDisplayText: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
    
    /**
      * id attribute set for both input and display element
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * class attribute set for input element
      */
    var inputClassName: js.UndefOr[String] = js.undefined
    
    /**
      * name attribute set for input element
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * onBlur is a callback function triggered when the focus is blurred
      * and edit mode is toggled off
      */
    var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * onChange is called when the input value changes and
      * returns a string which corresponds to the new input value
      */
    var onChange: js.UndefOr[
        js.Function1[/* event */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement], Unit]
      ] = js.undefined
    
    /**
      * onEditMode is a callback function triggered when the display
      * component is clicked and edit mode is toggled on
      */
    var onEditMode: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * onSave is called when the input blur event is triggered or enter key is pressed
      * returns an object: {name, value, previousValue} which correspond to the input name, value, and previous value before changes were made
      */
    var onSave: js.UndefOr[js.Function1[/* param0 */ onSaveProps, Unit]] = js.undefined
    
    /**
      * placeholder is shown in the display element when value is empty
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Displays only the view element when set to true,
      * default: false
      */
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the css styling for both input and div elements
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * value sets the input value and text of display element
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object SharedProps {
    
    inline def apply(): SharedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SharedProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setFormatDisplayText(value: /* value */ String => String): Self = StObject.set(x, "formatDisplayText", js.Any.fromFunction1(value))
      
      inline def setFormatDisplayTextUndefined: Self = StObject.set(x, "formatDisplayText", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: () => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction0(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: /* event */ ChangeEvent[HTMLInputElement | HTMLTextAreaElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnEditMode(value: () => Unit): Self = StObject.set(x, "onEditMode", js.Any.fromFunction0(value))
      
      inline def setOnEditModeUndefined: Self = StObject.set(x, "onEditMode", js.undefined)
      
      inline def setOnSave(value: /* param0 */ onSaveProps => Unit): Self = StObject.set(x, "onSave", js.Any.fromFunction1(value))
      
      inline def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactEditText.reactEditTextStrings.date
    - typings.reactEditText.reactEditTextStrings.`datetime-local`
    - typings.reactEditText.reactEditTextStrings.email
    - typings.reactEditText.reactEditTextStrings.month
    - typings.reactEditText.reactEditTextStrings.number
    - typings.reactEditText.reactEditTextStrings.password
    - typings.reactEditText.reactEditTextStrings.search
    - typings.reactEditText.reactEditTextStrings.tel
    - typings.reactEditText.reactEditTextStrings.text
    - typings.reactEditText.reactEditTextStrings.url
    - typings.reactEditText.reactEditTextStrings.week
  */
  trait inputTextType extends StObject
  object inputTextType {
    
    inline def date: typings.reactEditText.reactEditTextStrings.date = "date".asInstanceOf[typings.reactEditText.reactEditTextStrings.date]
    
    inline def `datetime-local`: typings.reactEditText.reactEditTextStrings.`datetime-local` = "datetime-local".asInstanceOf[typings.reactEditText.reactEditTextStrings.`datetime-local`]
    
    inline def email: typings.reactEditText.reactEditTextStrings.email = "email".asInstanceOf[typings.reactEditText.reactEditTextStrings.email]
    
    inline def month: typings.reactEditText.reactEditTextStrings.month = "month".asInstanceOf[typings.reactEditText.reactEditTextStrings.month]
    
    inline def number: typings.reactEditText.reactEditTextStrings.number = "number".asInstanceOf[typings.reactEditText.reactEditTextStrings.number]
    
    inline def password: typings.reactEditText.reactEditTextStrings.password = "password".asInstanceOf[typings.reactEditText.reactEditTextStrings.password]
    
    inline def search: typings.reactEditText.reactEditTextStrings.search = "search".asInstanceOf[typings.reactEditText.reactEditTextStrings.search]
    
    inline def tel: typings.reactEditText.reactEditTextStrings.tel = "tel".asInstanceOf[typings.reactEditText.reactEditTextStrings.tel]
    
    inline def text: typings.reactEditText.reactEditTextStrings.text = "text".asInstanceOf[typings.reactEditText.reactEditTextStrings.text]
    
    inline def url: typings.reactEditText.reactEditTextStrings.url = "url".asInstanceOf[typings.reactEditText.reactEditTextStrings.url]
    
    inline def week: typings.reactEditText.reactEditTextStrings.week = "week".asInstanceOf[typings.reactEditText.reactEditTextStrings.week]
  }
  
  trait onSaveProps extends StObject {
    
    var name: String
    
    var previousValue: String
    
    var value: String
  }
  object onSaveProps {
    
    inline def apply(name: String, previousValue: String, value: String): onSaveProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[onSaveProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: onSaveProps] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPreviousValue(value: String): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
