package typings.recurlyRecurlyJs

import typings.recurlyRecurlyJs.anon.CommonElementStyleinvalid
import typings.recurlyRecurlyJs.anon.CommonElementStyleinvalidFontColor
import typings.recurlyRecurlyJs.emitterMod.Emitter
import typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.submit
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementsMod {
  
  type Attach[ElementType] = js.Function1[/* el */ String | HTMLElement, ElementType]
  
  @js.native
  trait CardElement
    extends StObject
       with Emitter[ElementEvent] {
    
    /**
      * Attaches an Element to the DOM, as a child of the specified parent target.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementattach|Element.attach}
      */
    def attach(el: String): CardElement = js.native
    def attach(el: HTMLElement): CardElement = js.native
    /**
      * Attaches an Element to the DOM, as a child of the specified parent target.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementattach|Element.attach}
      */
    @JSName("attach")
    var attach_Original: Attach[CardElement] = js.native
    
    /**
      * Updates the configuration of the Element.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementconfigure|Element.configure}
      */
    def configure(options: CardElementOptions): CardElement = js.native
    
    def focus(): CardElement = js.native
    
    /**
      * If an Element has been attached, removes the Element from the DOM. If it is not attached, does nothing.
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementremove|Element.remove}
      */
    def remove(): CardElement = js.native
  }
  
  trait CardElementOptions extends StObject {
    
    /**
      * If false, the card brand icon will be hidden
      */
    var displayIcon: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Modifies the input type of the card field:
      *
      * 'text' - text input for all fields.
      *
      * 'mobileSelect' - if the user is using amobile device, a native expiry select interface will appear when entering the
      * expiration date.
      *
      * 'select' - Expiration date will be input using a select field on all devices. Mobile devices will display an
      * optimized interface.
      */
    var inputType: js.UndefOr[String] = js.undefined
    
    /**
      * Style to apply to input elements
      *
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#styling-the-individual-card-elements|Styling the invididual card elements}
      */
    var style: js.UndefOr[CommonElementStyleinvalid] = js.undefined
    
    /**
      * `tabindex` property to be applied to the outer iframe.
      */
    var tabIndex: js.UndefOr[String] = js.undefined
  }
  object CardElementOptions {
    
    inline def apply(): CardElementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardElementOptions]
    }
    
    extension [Self <: CardElementOptions](x: Self) {
      
      inline def setDisplayIcon(value: Boolean): Self = StObject.set(x, "displayIcon", value.asInstanceOf[js.Any])
      
      inline def setDisplayIconUndefined: Self = StObject.set(x, "displayIcon", js.undefined)
      
      inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
      
      inline def setStyle(value: CommonElementStyleinvalid): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
  
  trait CommonElementStyle extends StObject {
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/color|color}
      */
    var fontColor: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-family|font-family}
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-feature-settings|feature-settings}
      */
    var fontFeatureSettings: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-kerning|font-kerning}
      */
    var fontKerning: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-size|font-size}
      */
    var fontSize: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-smoothing|font-smoothing}
      */
    var fontSmooth: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-stretch|font-stretch}
      */
    var fontStretch: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-style|font-style}
      */
    var fontStyle: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-variant|font-variant}
      */
    var fontVariant: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/font-weight|font-weight}
      */
    var fontWeight: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/letter-spacing|letter-spacing}
      */
    var letterSpacing: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/line-height|line-height}
      */
    var lineHeight: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/text-align|text-align}
      */
    var textAlign: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/text-decoration|text-decoration}
      */
    var textDecoration: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/text-rendering|text-rendering}
      */
    var textRendering: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/text-shadow|text-shadow}
      */
    var textShadow: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developer.mozilla.org/en-US/docs/Web/CSS/text-transform|text-transform}
      */
    var textTransform: js.UndefOr[String] = js.undefined
  }
  object CommonElementStyle {
    
    inline def apply(): CommonElementStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonElementStyle]
    }
    
    extension [Self <: CommonElementStyle](x: Self) {
      
      inline def setFontColor(value: String): Self = StObject.set(x, "fontColor", value.asInstanceOf[js.Any])
      
      inline def setFontColorUndefined: Self = StObject.set(x, "fontColor", js.undefined)
      
      inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontFeatureSettings(value: String): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
      
      inline def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
      
      inline def setFontKerning(value: String): Self = StObject.set(x, "fontKerning", value.asInstanceOf[js.Any])
      
      inline def setFontKerningUndefined: Self = StObject.set(x, "fontKerning", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontSmooth(value: String): Self = StObject.set(x, "fontSmooth", value.asInstanceOf[js.Any])
      
      inline def setFontSmoothUndefined: Self = StObject.set(x, "fontSmooth", js.undefined)
      
      inline def setFontStretch(value: String): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
      
      inline def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontVariant(value: String): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      inline def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setLetterSpacing(value: String): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacingUndefined: Self = StObject.set(x, "letterSpacing", js.undefined)
      
      inline def setLineHeight(value: String): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setLineHeightUndefined: Self = StObject.set(x, "lineHeight", js.undefined)
      
      inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
      
      inline def setTextRendering(value: String): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
      
      inline def setTextRenderingUndefined: Self = StObject.set(x, "textRendering", js.undefined)
      
      inline def setTextShadow(value: String): Self = StObject.set(x, "textShadow", value.asInstanceOf[js.Any])
      
      inline def setTextShadowUndefined: Self = StObject.set(x, "textShadow", js.undefined)
      
      inline def setTextTransform(value: String): Self = StObject.set(x, "textTransform", value.asInstanceOf[js.Any])
      
      inline def setTextTransformUndefined: Self = StObject.set(x, "textTransform", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.change
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.focus
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.blur
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.submit
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.attach
    - typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.remove
  */
  trait ElementEvent extends StObject
  object ElementEvent {
    
    inline def attach: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.attach = "attach".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.attach]
    
    inline def blur: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.blur = "blur".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.blur]
    
    inline def change: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.change = "change".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.change]
    
    inline def focus: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.focus = "focus".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.focus]
    
    inline def remove: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.remove = "remove".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.remove]
    
    inline def submit: typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.submit = "submit".asInstanceOf[typings.recurlyRecurlyJs.recurlyRecurlyJsStrings.submit]
  }
  
  type Elements = js.Function0[ElementsInstance]
  
  @js.native
  trait ElementsInstance
    extends StObject
       with Emitter[ElementsInstanceEvents] {
    
    def CardCvvElement(): IndividualElement = js.native
    def CardCvvElement(cardCvvElementOptions: IndividualElementOptions): IndividualElement = js.native
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#the-card-element|The Card Element}
      */
    def CardElement(): typings.recurlyRecurlyJs.elementsMod.CardElement = js.native
    def CardElement(cardElementOptions: CardElementOptions): typings.recurlyRecurlyJs.elementsMod.CardElement = js.native
    
    def CardMonthElement(): IndividualElement = js.native
    def CardMonthElement(cardMonthElementOptions: IndividualElementOptions): IndividualElement = js.native
    
    def CardNumberElement(): IndividualElement = js.native
    def CardNumberElement(cardNumberElementOptions: IndividualElementOptions): IndividualElement = js.native
    
    def CardYearElement(): IndividualElement = js.native
    def CardYearElement(cardYearElementOptions: IndividualElementOptions): IndividualElement = js.native
  }
  
  type ElementsInstanceEvents = submit
  
  @js.native
  trait IndividualElement
    extends StObject
       with Emitter[ElementEvent] {
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementattach|Element.attach}
      */
    def attach(el: String): IndividualElement = js.native
    def attach(el: HTMLElement): IndividualElement = js.native
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementattach|Element.attach}
      */
    @JSName("attach")
    var attach_Original: Attach[IndividualElement] = js.native
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementconfigure|Element.configure}
      */
    def configure(options: IndividualElementOptions): IndividualElement = js.native
    
    def focus(): IndividualElement = js.native
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#fn-elementremove|Element.remove}
      */
    def remove(): IndividualElement = js.native
  }
  
  trait IndividualElementOptions extends StObject {
    
    /**
      * Enables contextual input formatting, injecting spaces to match the card brand, and forcing numeric input on expiry
      * and cvv.
      */
    var format: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Modifies the input type of the expiry fields. 'text' - normal text input. 'mobileSelect' - if the user is using a
      * mobile device, a native select interface will appear. 'select' - A select field will display on all devices
      */
    var inputType: js.UndefOr[String] = js.undefined
    
    /**
      * @see {@link https://developers.recurly.com/reference/recurly-js/index.html#common-field-style-properties|Common field style properties}
      */
    var style: js.UndefOr[CommonElementStyleinvalidFontColor] = js.undefined
    
    /**
      * tabIndex property to be applied to the outer iframe.
      */
    var tabIndex: js.UndefOr[String] = js.undefined
  }
  object IndividualElementOptions {
    
    inline def apply(): IndividualElementOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IndividualElementOptions]
    }
    
    extension [Self <: IndividualElementOptions](x: Self) {
      
      inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setInputType(value: String): Self = StObject.set(x, "inputType", value.asInstanceOf[js.Any])
      
      inline def setInputTypeUndefined: Self = StObject.set(x, "inputType", js.undefined)
      
      inline def setStyle(value: CommonElementStyleinvalidFontColor): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabIndex(value: String): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    }
  }
}
