package typings.reactstrap

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.react.mod.InputHTMLAttributes
import typings.react.mod.Ref
import typings.reactstrap.mod.CSSModule
import typings.reactstrap.reactstrapStrings.lg
import typings.reactstrap.reactstrapStrings.sm
import typings.std.HTMLInputElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("reactstrap/lib/Input", JSImport.Default)
  @js.native
  class default ()
    extends Component[InputProps, js.Object, js.Any]
  
  type Input = Component[InputProps, js.Object, js.Any]
  
  @js.native
  trait InputProps
    extends InputHTMLAttributes[HTMLInputElement]
       with /* key */ StringDictionary[js.Any] {
    
    var addon: js.UndefOr[Boolean] = js.native
    
    var bsSize: js.UndefOr[lg | sm] = js.native
    
    var cssModule: js.UndefOr[CSSModule] = js.native
    
    var innerRef: js.UndefOr[Ref[HTMLInputElement | HTMLTextAreaElement]] = js.native
    
    var invalid: js.UndefOr[Boolean] = js.native
    
    var plaintext: js.UndefOr[Boolean] = js.native
    
    var tag: js.UndefOr[ElementType[_]] = js.native
    
    @JSName("type")
    var type_InputProps: js.UndefOr[InputType] = js.native
    
    var valid: js.UndefOr[Boolean] = js.native
  }
  object InputProps {
    
    @scala.inline
    def apply(): InputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps]
    }
    
    @scala.inline
    implicit class InputPropsMutableBuilder[Self <: InputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddon(value: Boolean): Self = StObject.set(x, "addon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddonUndefined: Self = StObject.set(x, "addon", js.undefined)
      
      @scala.inline
      def setBsSize(value: lg | sm): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      @scala.inline
      def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      @scala.inline
      def setInnerRef(value: Ref[HTMLInputElement | HTMLTextAreaElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ (HTMLInputElement | HTMLTextAreaElement) | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      @scala.inline
      def setPlaintext(value: Boolean): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
      
      @scala.inline
      def setTag(value: ElementType[_]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setType(value: InputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactstrap.reactstrapStrings.text
    - typings.reactstrap.reactstrapStrings.email
    - typings.reactstrap.reactstrapStrings.select
    - typings.reactstrap.reactstrapStrings.file
    - typings.reactstrap.reactstrapStrings.radio
    - typings.reactstrap.reactstrapStrings.checkbox
    - typings.reactstrap.reactstrapStrings.textarea
    - typings.reactstrap.reactstrapStrings.button
    - typings.reactstrap.reactstrapStrings.reset
    - typings.reactstrap.reactstrapStrings.submit
    - typings.reactstrap.reactstrapStrings.date
    - typings.reactstrap.reactstrapStrings.`datetime-local`
    - typings.reactstrap.reactstrapStrings.hidden
    - typings.reactstrap.reactstrapStrings.image
    - typings.reactstrap.reactstrapStrings.month
    - typings.reactstrap.reactstrapStrings.number
    - typings.reactstrap.reactstrapStrings.range
    - typings.reactstrap.reactstrapStrings.search
    - typings.reactstrap.reactstrapStrings.tel
    - typings.reactstrap.reactstrapStrings.url
    - typings.reactstrap.reactstrapStrings.week
    - typings.reactstrap.reactstrapStrings.password
    - typings.reactstrap.reactstrapStrings.datetime
    - typings.reactstrap.reactstrapStrings.time
    - typings.reactstrap.reactstrapStrings.color
  */
  trait InputType extends StObject
  object InputType {
    
    @scala.inline
    def button: typings.reactstrap.reactstrapStrings.button = "button".asInstanceOf[typings.reactstrap.reactstrapStrings.button]
    
    @scala.inline
    def checkbox: typings.reactstrap.reactstrapStrings.checkbox = "checkbox".asInstanceOf[typings.reactstrap.reactstrapStrings.checkbox]
    
    @scala.inline
    def color: typings.reactstrap.reactstrapStrings.color = "color".asInstanceOf[typings.reactstrap.reactstrapStrings.color]
    
    @scala.inline
    def date: typings.reactstrap.reactstrapStrings.date = "date".asInstanceOf[typings.reactstrap.reactstrapStrings.date]
    
    @scala.inline
    def datetime: typings.reactstrap.reactstrapStrings.datetime = "datetime".asInstanceOf[typings.reactstrap.reactstrapStrings.datetime]
    
    @scala.inline
    def `datetime-local`: typings.reactstrap.reactstrapStrings.`datetime-local` = "datetime-local".asInstanceOf[typings.reactstrap.reactstrapStrings.`datetime-local`]
    
    @scala.inline
    def email: typings.reactstrap.reactstrapStrings.email = "email".asInstanceOf[typings.reactstrap.reactstrapStrings.email]
    
    @scala.inline
    def file: typings.reactstrap.reactstrapStrings.file = "file".asInstanceOf[typings.reactstrap.reactstrapStrings.file]
    
    @scala.inline
    def hidden: typings.reactstrap.reactstrapStrings.hidden = "hidden".asInstanceOf[typings.reactstrap.reactstrapStrings.hidden]
    
    @scala.inline
    def image: typings.reactstrap.reactstrapStrings.image = "image".asInstanceOf[typings.reactstrap.reactstrapStrings.image]
    
    @scala.inline
    def month: typings.reactstrap.reactstrapStrings.month = "month".asInstanceOf[typings.reactstrap.reactstrapStrings.month]
    
    @scala.inline
    def number: typings.reactstrap.reactstrapStrings.number = "number".asInstanceOf[typings.reactstrap.reactstrapStrings.number]
    
    @scala.inline
    def password: typings.reactstrap.reactstrapStrings.password = "password".asInstanceOf[typings.reactstrap.reactstrapStrings.password]
    
    @scala.inline
    def radio: typings.reactstrap.reactstrapStrings.radio = "radio".asInstanceOf[typings.reactstrap.reactstrapStrings.radio]
    
    @scala.inline
    def range: typings.reactstrap.reactstrapStrings.range = "range".asInstanceOf[typings.reactstrap.reactstrapStrings.range]
    
    @scala.inline
    def reset: typings.reactstrap.reactstrapStrings.reset = "reset".asInstanceOf[typings.reactstrap.reactstrapStrings.reset]
    
    @scala.inline
    def search: typings.reactstrap.reactstrapStrings.search = "search".asInstanceOf[typings.reactstrap.reactstrapStrings.search]
    
    @scala.inline
    def select: typings.reactstrap.reactstrapStrings.select = "select".asInstanceOf[typings.reactstrap.reactstrapStrings.select]
    
    @scala.inline
    def submit: typings.reactstrap.reactstrapStrings.submit = "submit".asInstanceOf[typings.reactstrap.reactstrapStrings.submit]
    
    @scala.inline
    def tel: typings.reactstrap.reactstrapStrings.tel = "tel".asInstanceOf[typings.reactstrap.reactstrapStrings.tel]
    
    @scala.inline
    def text: typings.reactstrap.reactstrapStrings.text = "text".asInstanceOf[typings.reactstrap.reactstrapStrings.text]
    
    @scala.inline
    def textarea: typings.reactstrap.reactstrapStrings.textarea = "textarea".asInstanceOf[typings.reactstrap.reactstrapStrings.textarea]
    
    @scala.inline
    def time: typings.reactstrap.reactstrapStrings.time = "time".asInstanceOf[typings.reactstrap.reactstrapStrings.time]
    
    @scala.inline
    def url: typings.reactstrap.reactstrapStrings.url = "url".asInstanceOf[typings.reactstrap.reactstrapStrings.url]
    
    @scala.inline
    def week: typings.reactstrap.reactstrapStrings.week = "week".asInstanceOf[typings.reactstrap.reactstrapStrings.week]
  }
}
