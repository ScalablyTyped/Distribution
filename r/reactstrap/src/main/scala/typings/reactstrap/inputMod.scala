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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("reactstrap/lib/Input", JSImport.Default)
  @js.native
  class default ()
    extends Component[InputProps, js.Object, js.Any]
  
  type Input = Component[InputProps, js.Object, js.Any]
  
  trait InputProps
    extends StObject
       with InputHTMLAttributes[HTMLInputElement]
       with /* key */ StringDictionary[js.Any] {
    
    var addon: js.UndefOr[Boolean] = js.undefined
    
    var bsSize: js.UndefOr[lg | sm] = js.undefined
    
    var cssModule: js.UndefOr[CSSModule] = js.undefined
    
    var innerRef: js.UndefOr[Ref[HTMLInputElement | HTMLTextAreaElement]] = js.undefined
    
    var invalid: js.UndefOr[Boolean] = js.undefined
    
    var plaintext: js.UndefOr[Boolean] = js.undefined
    
    var tag: js.UndefOr[ElementType[js.Any]] = js.undefined
    
    @JSName("type")
    var type_InputProps: js.UndefOr[InputType] = js.undefined
    
    var valid: js.UndefOr[Boolean] = js.undefined
  }
  object InputProps {
    
    inline def apply(): InputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps]
    }
    
    extension [Self <: InputProps](x: Self) {
      
      inline def setAddon(value: Boolean): Self = StObject.set(x, "addon", value.asInstanceOf[js.Any])
      
      inline def setAddonUndefined: Self = StObject.set(x, "addon", js.undefined)
      
      inline def setBsSize(value: lg | sm): Self = StObject.set(x, "bsSize", value.asInstanceOf[js.Any])
      
      inline def setBsSizeUndefined: Self = StObject.set(x, "bsSize", js.undefined)
      
      inline def setCssModule(value: CSSModule): Self = StObject.set(x, "cssModule", value.asInstanceOf[js.Any])
      
      inline def setCssModuleUndefined: Self = StObject.set(x, "cssModule", js.undefined)
      
      inline def setInnerRef(value: Ref[HTMLInputElement | HTMLTextAreaElement]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ (HTMLInputElement | HTMLTextAreaElement) | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
      
      inline def setPlaintext(value: Boolean): Self = StObject.set(x, "plaintext", value.asInstanceOf[js.Any])
      
      inline def setPlaintextUndefined: Self = StObject.set(x, "plaintext", js.undefined)
      
      inline def setTag(value: ElementType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setType(value: InputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
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
    
    inline def button: typings.reactstrap.reactstrapStrings.button = "button".asInstanceOf[typings.reactstrap.reactstrapStrings.button]
    
    inline def checkbox: typings.reactstrap.reactstrapStrings.checkbox = "checkbox".asInstanceOf[typings.reactstrap.reactstrapStrings.checkbox]
    
    inline def color: typings.reactstrap.reactstrapStrings.color = "color".asInstanceOf[typings.reactstrap.reactstrapStrings.color]
    
    inline def date: typings.reactstrap.reactstrapStrings.date = "date".asInstanceOf[typings.reactstrap.reactstrapStrings.date]
    
    inline def datetime: typings.reactstrap.reactstrapStrings.datetime = "datetime".asInstanceOf[typings.reactstrap.reactstrapStrings.datetime]
    
    inline def `datetime-local`: typings.reactstrap.reactstrapStrings.`datetime-local` = "datetime-local".asInstanceOf[typings.reactstrap.reactstrapStrings.`datetime-local`]
    
    inline def email: typings.reactstrap.reactstrapStrings.email = "email".asInstanceOf[typings.reactstrap.reactstrapStrings.email]
    
    inline def file: typings.reactstrap.reactstrapStrings.file = "file".asInstanceOf[typings.reactstrap.reactstrapStrings.file]
    
    inline def hidden: typings.reactstrap.reactstrapStrings.hidden = "hidden".asInstanceOf[typings.reactstrap.reactstrapStrings.hidden]
    
    inline def image: typings.reactstrap.reactstrapStrings.image = "image".asInstanceOf[typings.reactstrap.reactstrapStrings.image]
    
    inline def month: typings.reactstrap.reactstrapStrings.month = "month".asInstanceOf[typings.reactstrap.reactstrapStrings.month]
    
    inline def number: typings.reactstrap.reactstrapStrings.number = "number".asInstanceOf[typings.reactstrap.reactstrapStrings.number]
    
    inline def password: typings.reactstrap.reactstrapStrings.password = "password".asInstanceOf[typings.reactstrap.reactstrapStrings.password]
    
    inline def radio: typings.reactstrap.reactstrapStrings.radio = "radio".asInstanceOf[typings.reactstrap.reactstrapStrings.radio]
    
    inline def range: typings.reactstrap.reactstrapStrings.range = "range".asInstanceOf[typings.reactstrap.reactstrapStrings.range]
    
    inline def reset: typings.reactstrap.reactstrapStrings.reset = "reset".asInstanceOf[typings.reactstrap.reactstrapStrings.reset]
    
    inline def search: typings.reactstrap.reactstrapStrings.search = "search".asInstanceOf[typings.reactstrap.reactstrapStrings.search]
    
    inline def select: typings.reactstrap.reactstrapStrings.select = "select".asInstanceOf[typings.reactstrap.reactstrapStrings.select]
    
    inline def submit: typings.reactstrap.reactstrapStrings.submit = "submit".asInstanceOf[typings.reactstrap.reactstrapStrings.submit]
    
    inline def tel: typings.reactstrap.reactstrapStrings.tel = "tel".asInstanceOf[typings.reactstrap.reactstrapStrings.tel]
    
    inline def text: typings.reactstrap.reactstrapStrings.text = "text".asInstanceOf[typings.reactstrap.reactstrapStrings.text]
    
    inline def textarea: typings.reactstrap.reactstrapStrings.textarea = "textarea".asInstanceOf[typings.reactstrap.reactstrapStrings.textarea]
    
    inline def time: typings.reactstrap.reactstrapStrings.time = "time".asInstanceOf[typings.reactstrap.reactstrapStrings.time]
    
    inline def url: typings.reactstrap.reactstrapStrings.url = "url".asInstanceOf[typings.reactstrap.reactstrapStrings.url]
    
    inline def week: typings.reactstrap.reactstrapStrings.week = "week".asInstanceOf[typings.reactstrap.reactstrapStrings.week]
  }
}
