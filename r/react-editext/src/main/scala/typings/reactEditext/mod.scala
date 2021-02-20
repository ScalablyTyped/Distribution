package typings.reactEditext

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-editext", JSImport.Default)
  @js.native
  class default () extends EdiText
  
  @js.native
  trait EdiText
    extends Component[EdiTextProps, js.Any, js.Any]
  
  @js.native
  trait EdiTextProps extends StObject {
    
    /**
      * Custom class name for CANCEL button.
      */
    var cancelButtonClassName: js.UndefOr[String] = js.native
    
    /**
      * Content for CANCEL button. Any valid element and node are allowed.
      */
    var cancelButtonContent: js.UndefOr[js.Any] = js.native
    
    /**
      * Custom class name for EDIT button.
      */
    var editButtonClassName: js.UndefOr[String] = js.native
    
    /**
      * Content for EDIT button. Any valid element and node are allowed.
      */
    var editButtonContent: js.UndefOr[js.Any] = js.native
    
    /**
      * Set it to `true` if you don't want to see default icons
      * on action buttons.See Examples page for more details.
      */
    var hideIcons: js.UndefOr[Boolean] = js.native
    
    /**
      * A simple hint message appears at the bottom of input element.
      * Any valid element is allowed.
      */
    var hint: js.UndefOr[ReactNode] = js.native
    
    /**
      * Props to be passed to input element.
      * Any kind of valid DOM attributes are welcome
      */
    var inputProps: js.UndefOr[js.Object] = js.native
    
    /**
      * will be called when user clicked cancel button
      */
    var onCancel: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
    
    /**
      * will be called when user clicked save button.
      * takes one param <value> which is the current value of input
      */
    def onSave(args: String*): js.Any = js.native
    
    /**
      * will be called when validation fails.
      * takes one param <value> which is the current value of input
      */
    var onValidationFail: js.UndefOr[js.Function1[/* repeated */ String, _]] = js.native
    
    /**
      * Custom class name for SAVE button.
      */
    var saveButtonClassName: js.UndefOr[String] = js.native
    
    /**
      * Content for SAVE button. Any valid element and node are allowed.
      */
    var saveButtonContent: js.UndefOr[js.Any] = js.native
    
    /**
      * Input type. Possible options are:
      * `text`, `number`, `email`, `textarea`, `date`,
      * `datetime-local`, `time`, `month`, `url`, `week`, `tel`
      */
    var `type`: EdiTextType = js.native
    
    /**
      * Pass your own validation function.
      * takes one param -> `value`.
      * It must return `true` or `false`
      */
    var validation: js.UndefOr[js.Function1[/* repeated */ String, Boolean]] = js.native
    
    /**
      * If validation fails this message will appear
      */
    var validationMessage: js.UndefOr[String] = js.native
    
    /**
      * Value of the content [in view mode] and input [in edit mode]
      */
    var value: String = js.native
    
    /**
      * Props to be passed to div element that shows the text.
      * You can specify your own `styles` or `className`
      */
    var viewProps: js.UndefOr[js.Object] = js.native
  }
  object EdiTextProps {
    
    @scala.inline
    def apply(onSave: /* repeated */ String => js.Any, `type`: EdiTextType, value: String): EdiTextProps = {
      val __obj = js.Dynamic.literal(onSave = js.Any.fromFunction1(onSave), value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EdiTextProps]
    }
    
    @scala.inline
    implicit class EdiTextPropsMutableBuilder[Self <: EdiTextProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancelButtonClassName(value: String): Self = StObject.set(x, "cancelButtonClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonClassNameUndefined: Self = StObject.set(x, "cancelButtonClassName", js.undefined)
      
      @scala.inline
      def setCancelButtonContent(value: js.Any): Self = StObject.set(x, "cancelButtonContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelButtonContentUndefined: Self = StObject.set(x, "cancelButtonContent", js.undefined)
      
      @scala.inline
      def setEditButtonClassName(value: String): Self = StObject.set(x, "editButtonClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditButtonClassNameUndefined: Self = StObject.set(x, "editButtonClassName", js.undefined)
      
      @scala.inline
      def setEditButtonContent(value: js.Any): Self = StObject.set(x, "editButtonContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditButtonContentUndefined: Self = StObject.set(x, "editButtonContent", js.undefined)
      
      @scala.inline
      def setHideIcons(value: Boolean): Self = StObject.set(x, "hideIcons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideIconsUndefined: Self = StObject.set(x, "hideIcons", js.undefined)
      
      @scala.inline
      def setHint(value: ReactNode): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      @scala.inline
      def setInputProps(value: js.Object): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setOnCancel(value: /* repeated */ js.Any => _): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      @scala.inline
      def setOnSave(value: /* repeated */ String => js.Any): Self = StObject.set(x, "onSave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValidationFail(value: /* repeated */ String => _): Self = StObject.set(x, "onValidationFail", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnValidationFailUndefined: Self = StObject.set(x, "onValidationFail", js.undefined)
      
      @scala.inline
      def setSaveButtonClassName(value: String): Self = StObject.set(x, "saveButtonClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveButtonClassNameUndefined: Self = StObject.set(x, "saveButtonClassName", js.undefined)
      
      @scala.inline
      def setSaveButtonContent(value: js.Any): Self = StObject.set(x, "saveButtonContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveButtonContentUndefined: Self = StObject.set(x, "saveButtonContent", js.undefined)
      
      @scala.inline
      def setType(value: EdiTextType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidation(value: /* repeated */ String => Boolean): Self = StObject.set(x, "validation", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValidationMessage(value: String): Self = StObject.set(x, "validationMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationMessageUndefined: Self = StObject.set(x, "validationMessage", js.undefined)
      
      @scala.inline
      def setValidationUndefined: Self = StObject.set(x, "validation", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewProps(value: js.Object): Self = StObject.set(x, "viewProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewPropsUndefined: Self = StObject.set(x, "viewProps", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactEditext.reactEditextStrings.text
    - typings.reactEditext.reactEditextStrings.textarea
    - typings.reactEditext.reactEditextStrings.email
    - typings.reactEditext.reactEditextStrings.number
    - typings.reactEditext.reactEditextStrings.date
    - typings.reactEditext.reactEditextStrings.`datetime-local`
    - typings.reactEditext.reactEditextStrings.time
    - typings.reactEditext.reactEditextStrings.month
    - typings.reactEditext.reactEditextStrings.url
    - typings.reactEditext.reactEditextStrings.week
    - typings.reactEditext.reactEditextStrings.tel
  */
  trait EdiTextType extends StObject
  object EdiTextType {
    
    @scala.inline
    def date: typings.reactEditext.reactEditextStrings.date = "date".asInstanceOf[typings.reactEditext.reactEditextStrings.date]
    
    @scala.inline
    def `datetime-local`: typings.reactEditext.reactEditextStrings.`datetime-local` = "datetime-local".asInstanceOf[typings.reactEditext.reactEditextStrings.`datetime-local`]
    
    @scala.inline
    def email: typings.reactEditext.reactEditextStrings.email = "email".asInstanceOf[typings.reactEditext.reactEditextStrings.email]
    
    @scala.inline
    def month: typings.reactEditext.reactEditextStrings.month = "month".asInstanceOf[typings.reactEditext.reactEditextStrings.month]
    
    @scala.inline
    def number: typings.reactEditext.reactEditextStrings.number = "number".asInstanceOf[typings.reactEditext.reactEditextStrings.number]
    
    @scala.inline
    def tel: typings.reactEditext.reactEditextStrings.tel = "tel".asInstanceOf[typings.reactEditext.reactEditextStrings.tel]
    
    @scala.inline
    def text: typings.reactEditext.reactEditextStrings.text = "text".asInstanceOf[typings.reactEditext.reactEditextStrings.text]
    
    @scala.inline
    def textarea: typings.reactEditext.reactEditextStrings.textarea = "textarea".asInstanceOf[typings.reactEditext.reactEditextStrings.textarea]
    
    @scala.inline
    def time: typings.reactEditext.reactEditextStrings.time = "time".asInstanceOf[typings.reactEditext.reactEditextStrings.time]
    
    @scala.inline
    def url: typings.reactEditext.reactEditextStrings.url = "url".asInstanceOf[typings.reactEditext.reactEditextStrings.url]
    
    @scala.inline
    def week: typings.reactEditext.reactEditextStrings.week = "week".asInstanceOf[typings.reactEditext.reactEditextStrings.week]
  }
}
