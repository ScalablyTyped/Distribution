package typings.reactEditText

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-edit-text", "EditText")
  @js.native
  class EditText protected ()
    extends Component[EditTextProps, js.Object, js.Any] {
    def this(props: EditTextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: EditTextProps, context: js.Any) = this()
  }
  
  @JSImport("react-edit-text", "EditTextarea")
  @js.native
  class EditTextarea protected ()
    extends Component[EditTextareaProps, js.Object, js.Any] {
    def this(props: EditTextareaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: EditTextareaProps, context: js.Any) = this()
  }
  
  trait EditTextProps
    extends StObject
       with SharedProps {
    
    /**
      * Sets the element display to inline when set to true,
      * default: false
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
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
    
    extension [Self <: EditTextProps](x: Self) {
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
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
    
    extension [Self <: EditTextareaProps](x: Self) {
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
  
  trait SharedProps extends StObject {
    
    /**
      * className attribute set for both input and div element
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * id attribute set for both input and div element
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * name attribute set for input element
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * onSave is called when the input blur event is triggered or enter key is pressed
      * returns an object: {name, value} which correspond to the input name and value
      */
    var onSave: js.UndefOr[js.Function1[/* hasNameValue */ onSaveProps, Unit]] = js.undefined
    
    /**
      * placeholder is displayed in the div element when value is empty
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
      * value sets the defaultValue for input element and display text of div element
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object SharedProps {
    
    inline def apply(): SharedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedProps]
    }
    
    extension [Self <: SharedProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnSave(value: /* hasNameValue */ onSaveProps => Unit): Self = StObject.set(x, "onSave", js.Any.fromFunction1(value))
      
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
    
    var value: String
  }
  object onSaveProps {
    
    inline def apply(name: String, value: String): onSaveProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[onSaveProps]
    }
    
    extension [Self <: onSaveProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
