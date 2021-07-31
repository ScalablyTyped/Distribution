package typings.reactShare

import typings.react.mod.CSSProperties
import typings.react.mod.HTMLAttributes
import typings.react.mod.StyleHTMLAttributes
import typings.reactShare.reactShareStrings.screenCenter
import typings.reactShare.reactShareStrings.windowCenter
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined react-share.react-share.CommonShareButtonProps & {  media :string,   description :string | undefined} */
  trait CommonShareButtonPropsmed extends StObject {
    
    /**
      * An object to pass any additional properties, such as `aria-*` attributes.
      */
    var additionalProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      *  Takes a function that returns a Promise to be fulfilled before calling
      * `onClick`. If you do not return promise, `onClick` is called immediately.
      */
    var beforeOnClick: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
    
    /**
      * A class name to add to the others added by react-share (SocialMediaShareButton, ...).
      */
    var className: js.UndefOr[String] = js.undefined
    
    /** Description of the shared page */
    var description: js.UndefOr[String] = js.undefined
    
    /** Disables click action and adds `disabled` class */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style when button is disabled
      * @default { opacity: 0.6 }
      */
    var disabledStyle: js.UndefOr[StyleHTMLAttributes[HTMLDivElement]] = js.undefined
    
    /** An absolute link to the image that will be pinned */
    var media: String
    
    /**
      * Click callback handler.
      */
    var onClick: js.UndefOr[js.Function1[/* link */ String, Unit]] = js.undefined
    
    /**
      * Takes a function to be called after closing share dialog.
      */
    var onShareWindowClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If false, does not open a new window and call the onClick callback instead.
      * @default true
      */
    var openWindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The HTML role of the div.
      * @default "button"
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * Extra style for the button.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Indicates that its element can be focused, and where it participates in sequential keyboard
      * navigation.
      * @default "0"
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * URL of the shared page
      */
    var url: String
    
    var windowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to center the share box respectively to the screen or to the window.
      * @default "windowCenter"
      */
    var windowPosition: js.UndefOr[windowCenter | screenCenter] = js.undefined
    
    var windowWidth: js.UndefOr[Double] = js.undefined
  }
  object CommonShareButtonPropsmed {
    
    @scala.inline
    def apply(media: String, url: String): CommonShareButtonPropsmed = {
      val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonShareButtonPropsmed]
    }
    
    @scala.inline
    implicit class CommonShareButtonPropsmedMutableBuilder[Self <: CommonShareButtonPropsmed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "additionalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropsUndefined: Self = StObject.set(x, "additionalProps", js.undefined)
      
      @scala.inline
      def setBeforeOnClick(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "beforeOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeOnClickUndefined: Self = StObject.set(x, "beforeOnClick", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyle(value: StyleHTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: /* link */ String => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnShareWindowClose(value: () => Unit): Self = StObject.set(x, "onShareWindowClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShareWindowCloseUndefined: Self = StObject.set(x, "onShareWindowClose", js.undefined)
      
      @scala.inline
      def setOpenWindow(value: Boolean): Self = StObject.set(x, "openWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenWindowUndefined: Self = StObject.set(x, "openWindow", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
      
      @scala.inline
      def setWindowPosition(value: windowCenter | screenCenter): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
      
      @scala.inline
      def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
    }
  }
  
  /* Inlined react-share.react-share.CommonShareButtonProps & {  quote :string | undefined,   hashtag :string | undefined} */
  trait CommonShareButtonPropsquo extends StObject {
    
    /**
      * An object to pass any additional properties, such as `aria-*` attributes.
      */
    var additionalProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      *  Takes a function that returns a Promise to be fulfilled before calling
      * `onClick`. If you do not return promise, `onClick` is called immediately.
      */
    var beforeOnClick: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
    
    /**
      * A class name to add to the others added by react-share (SocialMediaShareButton, ...).
      */
    var className: js.UndefOr[String] = js.undefined
    
    /** Disables click action and adds `disabled` class */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style when button is disabled
      * @default { opacity: 0.6 }
      */
    var disabledStyle: js.UndefOr[StyleHTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      * A hashtag specified by the developer to be added to the shared
      * content. People will still have the opportunity to remove this
      * hashtag in the dialog. The hashtag should include the hash symbol.
      */
    var hashtag: js.UndefOr[String] = js.undefined
    
    /**
      * Click callback handler.
      */
    var onClick: js.UndefOr[js.Function1[/* link */ String, Unit]] = js.undefined
    
    /**
      * Takes a function to be called after closing share dialog.
      */
    var onShareWindowClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If false, does not open a new window and call the onClick callback instead.
      * @default true
      */
    var openWindow: js.UndefOr[Boolean] = js.undefined
    
    /** A quote to be shared along with the link. */
    var quote: js.UndefOr[String] = js.undefined
    
    /**
      * The HTML role of the div.
      * @default "button"
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * Extra style for the button.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Indicates that its element can be focused, and where it participates in sequential keyboard
      * navigation.
      * @default "0"
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * URL of the shared page
      */
    var url: String
    
    var windowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to center the share box respectively to the screen or to the window.
      * @default "windowCenter"
      */
    var windowPosition: js.UndefOr[windowCenter | screenCenter] = js.undefined
    
    var windowWidth: js.UndefOr[Double] = js.undefined
  }
  object CommonShareButtonPropsquo {
    
    @scala.inline
    def apply(url: String): CommonShareButtonPropsquo = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonShareButtonPropsquo]
    }
    
    @scala.inline
    implicit class CommonShareButtonPropsquoMutableBuilder[Self <: CommonShareButtonPropsquo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "additionalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropsUndefined: Self = StObject.set(x, "additionalProps", js.undefined)
      
      @scala.inline
      def setBeforeOnClick(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "beforeOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeOnClickUndefined: Self = StObject.set(x, "beforeOnClick", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyle(value: StyleHTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHashtag(value: String): Self = StObject.set(x, "hashtag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtagUndefined: Self = StObject.set(x, "hashtag", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* link */ String => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnShareWindowClose(value: () => Unit): Self = StObject.set(x, "onShareWindowClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShareWindowCloseUndefined: Self = StObject.set(x, "onShareWindowClose", js.undefined)
      
      @scala.inline
      def setOpenWindow(value: Boolean): Self = StObject.set(x, "openWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenWindowUndefined: Self = StObject.set(x, "openWindow", js.undefined)
      
      @scala.inline
      def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuoteUndefined: Self = StObject.set(x, "quote", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
      
      @scala.inline
      def setWindowPosition(value: windowCenter | screenCenter): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
      
      @scala.inline
      def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
    }
  }
  
  /* Inlined react-share.react-share.CommonShareButtonProps & {  subject :string | undefined,   body :string | undefined,   separator :string | undefined,   openWindow :boolean | undefined} */
  trait CommonShareButtonPropssub extends StObject {
    
    /**
      * An object to pass any additional properties, such as `aria-*` attributes.
      */
    var additionalProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      *  Takes a function that returns a Promise to be fulfilled before calling
      * `onClick`. If you do not return promise, `onClick` is called immediately.
      */
    var beforeOnClick: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
    
    /** Body of the email, will be prepended to the url. */
    var body: js.UndefOr[String] = js.undefined
    
    /**
      * A class name to add to the others added by react-share (SocialMediaShareButton, ...).
      */
    var className: js.UndefOr[String] = js.undefined
    
    /** Disables click action and adds `disabled` class */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style when button is disabled
      * @default { opacity: 0.6 }
      */
    var disabledStyle: js.UndefOr[StyleHTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      * Click callback handler.
      */
    var onClick: js.UndefOr[js.Function1[/* link */ String, Unit]] = js.undefined
    
    /**
      * Takes a function to be called after closing share dialog.
      */
    var onShareWindowClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If false, does not open a new window and call the onClick callback instead.
      * @default true
      */
    /** Opens the mail client in a new window. Defaults to false */
    var openWindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The HTML role of the div.
      * @default "button"
      */
    var role: js.UndefOr[String] = js.undefined
    
    /** Separates body from the url, default: ' ' */
    var separator: js.UndefOr[String] = js.undefined
    
    /**
      * Extra style for the button.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /** Title of the shared page */
    var subject: js.UndefOr[String] = js.undefined
    
    /**
      * Indicates that its element can be focused, and where it participates in sequential keyboard
      * navigation.
      * @default "0"
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * URL of the shared page
      */
    var url: String
    
    var windowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to center the share box respectively to the screen or to the window.
      * @default "windowCenter"
      */
    var windowPosition: js.UndefOr[windowCenter | screenCenter] = js.undefined
    
    var windowWidth: js.UndefOr[Double] = js.undefined
  }
  object CommonShareButtonPropssub {
    
    @scala.inline
    def apply(url: String): CommonShareButtonPropssub = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonShareButtonPropssub]
    }
    
    @scala.inline
    implicit class CommonShareButtonPropssubMutableBuilder[Self <: CommonShareButtonPropssub] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "additionalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropsUndefined: Self = StObject.set(x, "additionalProps", js.undefined)
      
      @scala.inline
      def setBeforeOnClick(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "beforeOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeOnClickUndefined: Self = StObject.set(x, "beforeOnClick", js.undefined)
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyle(value: StyleHTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* link */ String => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnShareWindowClose(value: () => Unit): Self = StObject.set(x, "onShareWindowClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShareWindowCloseUndefined: Self = StObject.set(x, "onShareWindowClose", js.undefined)
      
      @scala.inline
      def setOpenWindow(value: Boolean): Self = StObject.set(x, "openWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenWindowUndefined: Self = StObject.set(x, "openWindow", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
      
      @scala.inline
      def setWindowPosition(value: windowCenter | screenCenter): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
      
      @scala.inline
      def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
    }
  }
  
  /* Inlined react-share.react-share.CommonShareButtonProps & {  title :string | undefined,   via :string | undefined,   hashtags :std.Array<string> | undefined} */
  trait CommonShareButtonPropstit extends StObject {
    
    /**
      * An object to pass any additional properties, such as `aria-*` attributes.
      */
    var additionalProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      *  Takes a function that returns a Promise to be fulfilled before calling
      * `onClick`. If you do not return promise, `onClick` is called immediately.
      */
    var beforeOnClick: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
    
    /**
      * A class name to add to the others added by react-share (SocialMediaShareButton, ...).
      */
    var className: js.UndefOr[String] = js.undefined
    
    /** Disables click action and adds `disabled` class */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style when button is disabled
      * @default { opacity: 0.6 }
      */
    var disabledStyle: js.UndefOr[StyleHTMLAttributes[HTMLDivElement]] = js.undefined
    
    var hashtags: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Click callback handler.
      */
    var onClick: js.UndefOr[js.Function1[/* link */ String, Unit]] = js.undefined
    
    /**
      * Takes a function to be called after closing share dialog.
      */
    var onShareWindowClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If false, does not open a new window and call the onClick callback instead.
      * @default true
      */
    var openWindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The HTML role of the div.
      * @default "button"
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * Extra style for the button.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Indicates that its element can be focused, and where it participates in sequential keyboard
      * navigation.
      * @default "0"
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /** Title of the shared page */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * URL of the shared page
      */
    var url: String
    
    var via: js.UndefOr[String] = js.undefined
    
    var windowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to center the share box respectively to the screen or to the window.
      * @default "windowCenter"
      */
    var windowPosition: js.UndefOr[windowCenter | screenCenter] = js.undefined
    
    var windowWidth: js.UndefOr[Double] = js.undefined
  }
  object CommonShareButtonPropstit {
    
    @scala.inline
    def apply(url: String): CommonShareButtonPropstit = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonShareButtonPropstit]
    }
    
    @scala.inline
    implicit class CommonShareButtonPropstitMutableBuilder[Self <: CommonShareButtonPropstit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "additionalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropsUndefined: Self = StObject.set(x, "additionalProps", js.undefined)
      
      @scala.inline
      def setBeforeOnClick(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "beforeOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeOnClickUndefined: Self = StObject.set(x, "beforeOnClick", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyle(value: StyleHTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setHashtags(value: js.Array[String]): Self = StObject.set(x, "hashtags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashtagsUndefined: Self = StObject.set(x, "hashtags", js.undefined)
      
      @scala.inline
      def setHashtagsVarargs(value: String*): Self = StObject.set(x, "hashtags", js.Array(value :_*))
      
      @scala.inline
      def setOnClick(value: /* link */ String => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnShareWindowClose(value: () => Unit): Self = StObject.set(x, "onShareWindowClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShareWindowCloseUndefined: Self = StObject.set(x, "onShareWindowClose", js.undefined)
      
      @scala.inline
      def setOpenWindow(value: Boolean): Self = StObject.set(x, "openWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenWindowUndefined: Self = StObject.set(x, "openWindow", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVia(value: String): Self = StObject.set(x, "via", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViaUndefined: Self = StObject.set(x, "via", js.undefined)
      
      @scala.inline
      def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
      
      @scala.inline
      def setWindowPosition(value: windowCenter | screenCenter): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
      
      @scala.inline
      def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
    }
  }
  
  /* Inlined react-share.react-share.CommonShareButtonProps & {  title :string | undefined} */
  trait CommonShareButtonPropstitAdditionalProps extends StObject {
    
    /**
      * An object to pass any additional properties, such as `aria-*` attributes.
      */
    var additionalProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      *  Takes a function that returns a Promise to be fulfilled before calling
      * `onClick`. If you do not return promise, `onClick` is called immediately.
      */
    var beforeOnClick: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
    
    /**
      * A class name to add to the others added by react-share (SocialMediaShareButton, ...).
      */
    var className: js.UndefOr[String] = js.undefined
    
    /** Disables click action and adds `disabled` class */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style when button is disabled
      * @default { opacity: 0.6 }
      */
    var disabledStyle: js.UndefOr[StyleHTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      * Click callback handler.
      */
    var onClick: js.UndefOr[js.Function1[/* link */ String, Unit]] = js.undefined
    
    /**
      * Takes a function to be called after closing share dialog.
      */
    var onShareWindowClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If false, does not open a new window and call the onClick callback instead.
      * @default true
      */
    var openWindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The HTML role of the div.
      * @default "button"
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * Extra style for the button.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Indicates that its element can be focused, and where it participates in sequential keyboard
      * navigation.
      * @default "0"
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Title of the shared page. Note that if Pocket detects a title tag
      * on the page being saved, this parameter will be ignored
      * and the title tag of the saved page will be used instead.
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * URL of the shared page
      */
    var url: String
    
    var windowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to center the share box respectively to the screen or to the window.
      * @default "windowCenter"
      */
    var windowPosition: js.UndefOr[windowCenter | screenCenter] = js.undefined
    
    var windowWidth: js.UndefOr[Double] = js.undefined
  }
  object CommonShareButtonPropstitAdditionalProps {
    
    @scala.inline
    def apply(url: String): CommonShareButtonPropstitAdditionalProps = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonShareButtonPropstitAdditionalProps]
    }
    
    @scala.inline
    implicit class CommonShareButtonPropstitAdditionalPropsMutableBuilder[Self <: CommonShareButtonPropstitAdditionalProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "additionalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropsUndefined: Self = StObject.set(x, "additionalProps", js.undefined)
      
      @scala.inline
      def setBeforeOnClick(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "beforeOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeOnClickUndefined: Self = StObject.set(x, "beforeOnClick", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyle(value: StyleHTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* link */ String => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnShareWindowClose(value: () => Unit): Self = StObject.set(x, "onShareWindowClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShareWindowCloseUndefined: Self = StObject.set(x, "onShareWindowClose", js.undefined)
      
      @scala.inline
      def setOpenWindow(value: Boolean): Self = StObject.set(x, "openWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenWindowUndefined: Self = StObject.set(x, "openWindow", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
      
      @scala.inline
      def setWindowPosition(value: windowCenter | screenCenter): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
      
      @scala.inline
      def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
    }
  }
  
  /* Inlined react-share.react-share.CommonShareButtonProps & {  title :string | undefined,   separator :string | undefined} */
  trait CommonShareButtonPropstitBeforeOnClick extends StObject {
    
    /**
      * An object to pass any additional properties, such as `aria-*` attributes.
      */
    var additionalProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      *  Takes a function that returns a Promise to be fulfilled before calling
      * `onClick`. If you do not return promise, `onClick` is called immediately.
      */
    var beforeOnClick: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
    
    /**
      * A class name to add to the others added by react-share (SocialMediaShareButton, ...).
      */
    var className: js.UndefOr[String] = js.undefined
    
    /** Disables click action and adds `disabled` class */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style when button is disabled
      * @default { opacity: 0.6 }
      */
    var disabledStyle: js.UndefOr[StyleHTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      * Click callback handler.
      */
    var onClick: js.UndefOr[js.Function1[/* link */ String, Unit]] = js.undefined
    
    /**
      * Takes a function to be called after closing share dialog.
      */
    var onShareWindowClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If false, does not open a new window and call the onClick callback instead.
      * @default true
      */
    var openWindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The HTML role of the div.
      * @default "button"
      */
    var role: js.UndefOr[String] = js.undefined
    
    /** Separates title from the url, default: ' ' */
    var separator: js.UndefOr[String] = js.undefined
    
    /**
      * Extra style for the button.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Indicates that its element can be focused, and where it participates in sequential keyboard
      * navigation.
      * @default "0"
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /** Title of the shared page */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * URL of the shared page
      */
    var url: String
    
    var windowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to center the share box respectively to the screen or to the window.
      * @default "windowCenter"
      */
    var windowPosition: js.UndefOr[windowCenter | screenCenter] = js.undefined
    
    var windowWidth: js.UndefOr[Double] = js.undefined
  }
  object CommonShareButtonPropstitBeforeOnClick {
    
    @scala.inline
    def apply(url: String): CommonShareButtonPropstitBeforeOnClick = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonShareButtonPropstitBeforeOnClick]
    }
    
    @scala.inline
    implicit class CommonShareButtonPropstitBeforeOnClickMutableBuilder[Self <: CommonShareButtonPropstitBeforeOnClick] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "additionalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropsUndefined: Self = StObject.set(x, "additionalProps", js.undefined)
      
      @scala.inline
      def setBeforeOnClick(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "beforeOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeOnClickUndefined: Self = StObject.set(x, "beforeOnClick", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyle(value: StyleHTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* link */ String => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnShareWindowClose(value: () => Unit): Self = StObject.set(x, "onShareWindowClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShareWindowCloseUndefined: Self = StObject.set(x, "onShareWindowClose", js.undefined)
      
      @scala.inline
      def setOpenWindow(value: Boolean): Self = StObject.set(x, "openWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenWindowUndefined: Self = StObject.set(x, "openWindow", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
      
      @scala.inline
      def setWindowPosition(value: windowCenter | screenCenter): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
      
      @scala.inline
      def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
    }
  }
  
  /* Inlined react-share.react-share.CommonShareButtonProps & {  title :string | undefined,   tags :std.Array<string> | undefined,   caption :string | undefined} */
  trait CommonShareButtonPropstitCaption extends StObject {
    
    /**
      * An object to pass any additional properties, such as `aria-*` attributes.
      */
    var additionalProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      *  Takes a function that returns a Promise to be fulfilled before calling
      * `onClick`. If you do not return promise, `onClick` is called immediately.
      */
    var beforeOnClick: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
    
    /** Description of the shared page */
    var caption: js.UndefOr[String] = js.undefined
    
    /**
      * A class name to add to the others added by react-share (SocialMediaShareButton, ...).
      */
    var className: js.UndefOr[String] = js.undefined
    
    /** Disables click action and adds `disabled` class */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style when button is disabled
      * @default { opacity: 0.6 }
      */
    var disabledStyle: js.UndefOr[StyleHTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      * Click callback handler.
      */
    var onClick: js.UndefOr[js.Function1[/* link */ String, Unit]] = js.undefined
    
    /**
      * Takes a function to be called after closing share dialog.
      */
    var onShareWindowClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If false, does not open a new window and call the onClick callback instead.
      * @default true
      */
    var openWindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The HTML role of the div.
      * @default "button"
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * Extra style for the button.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Indicates that its element can be focused, and where it participates in sequential keyboard
      * navigation.
      * @default "0"
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var tags: js.UndefOr[js.Array[String]] = js.undefined
    
    /** Title of the shared page */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * URL of the shared page
      */
    var url: String
    
    var windowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to center the share box respectively to the screen or to the window.
      * @default "windowCenter"
      */
    var windowPosition: js.UndefOr[windowCenter | screenCenter] = js.undefined
    
    var windowWidth: js.UndefOr[Double] = js.undefined
  }
  object CommonShareButtonPropstitCaption {
    
    @scala.inline
    def apply(url: String): CommonShareButtonPropstitCaption = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonShareButtonPropstitCaption]
    }
    
    @scala.inline
    implicit class CommonShareButtonPropstitCaptionMutableBuilder[Self <: CommonShareButtonPropstitCaption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "additionalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropsUndefined: Self = StObject.set(x, "additionalProps", js.undefined)
      
      @scala.inline
      def setBeforeOnClick(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "beforeOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeOnClickUndefined: Self = StObject.set(x, "beforeOnClick", js.undefined)
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyle(value: StyleHTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* link */ String => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnShareWindowClose(value: () => Unit): Self = StObject.set(x, "onShareWindowClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShareWindowCloseUndefined: Self = StObject.set(x, "onShareWindowClose", js.undefined)
      
      @scala.inline
      def setOpenWindow(value: Boolean): Self = StObject.set(x, "openWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenWindowUndefined: Self = StObject.set(x, "openWindow", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
      
      @scala.inline
      def setWindowPosition(value: windowCenter | screenCenter): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
      
      @scala.inline
      def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
    }
  }
  
  /* Inlined react-share.react-share.CommonShareButtonProps & {  title :string | undefined,   description :string | undefined,   image :string | undefined} */
  trait CommonShareButtonPropstitClassName extends StObject {
    
    /**
      * An object to pass any additional properties, such as `aria-*` attributes.
      */
    var additionalProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      *  Takes a function that returns a Promise to be fulfilled before calling
      * `onClick`. If you do not return promise, `onClick` is called immediately.
      */
    var beforeOnClick: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
    
    /**
      * A class name to add to the others added by react-share (SocialMediaShareButton, ...).
      */
    var className: js.UndefOr[String] = js.undefined
    
    /** Description of the shared page */
    var description: js.UndefOr[String] = js.undefined
    
    /** Disables click action and adds `disabled` class */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style when button is disabled
      * @default { opacity: 0.6 }
      */
    var disabledStyle: js.UndefOr[StyleHTMLAttributes[HTMLDivElement]] = js.undefined
    
    /** An absolute link to the image that will be shared */
    var image: js.UndefOr[String] = js.undefined
    
    /**
      * Click callback handler.
      */
    var onClick: js.UndefOr[js.Function1[/* link */ String, Unit]] = js.undefined
    
    /**
      * Takes a function to be called after closing share dialog.
      */
    var onShareWindowClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If false, does not open a new window and call the onClick callback instead.
      * @default true
      */
    var openWindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The HTML role of the div.
      * @default "button"
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * Extra style for the button.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Indicates that its element can be focused, and where it participates in sequential keyboard
      * navigation.
      * @default "0"
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /** Title of the shared page */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * URL of the shared page
      */
    var url: String
    
    var windowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to center the share box respectively to the screen or to the window.
      * @default "windowCenter"
      */
    var windowPosition: js.UndefOr[windowCenter | screenCenter] = js.undefined
    
    var windowWidth: js.UndefOr[Double] = js.undefined
  }
  object CommonShareButtonPropstitClassName {
    
    @scala.inline
    def apply(url: String): CommonShareButtonPropstitClassName = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonShareButtonPropstitClassName]
    }
    
    @scala.inline
    implicit class CommonShareButtonPropstitClassNameMutableBuilder[Self <: CommonShareButtonPropstitClassName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "additionalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropsUndefined: Self = StObject.set(x, "additionalProps", js.undefined)
      
      @scala.inline
      def setBeforeOnClick(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "beforeOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeOnClickUndefined: Self = StObject.set(x, "beforeOnClick", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyle(value: StyleHTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* link */ String => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnShareWindowClose(value: () => Unit): Self = StObject.set(x, "onShareWindowClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShareWindowCloseUndefined: Self = StObject.set(x, "onShareWindowClose", js.undefined)
      
      @scala.inline
      def setOpenWindow(value: Boolean): Self = StObject.set(x, "openWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenWindowUndefined: Self = StObject.set(x, "openWindow", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
      
      @scala.inline
      def setWindowPosition(value: windowCenter | screenCenter): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
      
      @scala.inline
      def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
    }
  }
  
  /* Inlined react-share.react-share.CommonShareButtonProps & {  title :string | undefined,   description :string | undefined} */
  trait CommonShareButtonPropstitDescription extends StObject {
    
    /**
      * An object to pass any additional properties, such as `aria-*` attributes.
      */
    var additionalProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      *  Takes a function that returns a Promise to be fulfilled before calling
      * `onClick`. If you do not return promise, `onClick` is called immediately.
      */
    var beforeOnClick: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
    
    /**
      * A class name to add to the others added by react-share (SocialMediaShareButton, ...).
      */
    var className: js.UndefOr[String] = js.undefined
    
    /** Description of the shared page */
    var description: js.UndefOr[String] = js.undefined
    
    /** Disables click action and adds `disabled` class */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style when button is disabled
      * @default { opacity: 0.6 }
      */
    var disabledStyle: js.UndefOr[StyleHTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      * Click callback handler.
      */
    var onClick: js.UndefOr[js.Function1[/* link */ String, Unit]] = js.undefined
    
    /**
      * Takes a function to be called after closing share dialog.
      */
    var onShareWindowClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If false, does not open a new window and call the onClick callback instead.
      * @default true
      */
    var openWindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The HTML role of the div.
      * @default "button"
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * Extra style for the button.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Indicates that its element can be focused, and where it participates in sequential keyboard
      * navigation.
      * @default "0"
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /** Title of the shared page */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * URL of the shared page
      */
    var url: String
    
    var windowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to center the share box respectively to the screen or to the window.
      * @default "windowCenter"
      */
    var windowPosition: js.UndefOr[windowCenter | screenCenter] = js.undefined
    
    var windowWidth: js.UndefOr[Double] = js.undefined
  }
  object CommonShareButtonPropstitDescription {
    
    @scala.inline
    def apply(url: String): CommonShareButtonPropstitDescription = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonShareButtonPropstitDescription]
    }
    
    @scala.inline
    implicit class CommonShareButtonPropstitDescriptionMutableBuilder[Self <: CommonShareButtonPropstitDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "additionalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropsUndefined: Self = StObject.set(x, "additionalProps", js.undefined)
      
      @scala.inline
      def setBeforeOnClick(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "beforeOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeOnClickUndefined: Self = StObject.set(x, "beforeOnClick", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyle(value: StyleHTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* link */ String => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnShareWindowClose(value: () => Unit): Self = StObject.set(x, "onShareWindowClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShareWindowCloseUndefined: Self = StObject.set(x, "onShareWindowClose", js.undefined)
      
      @scala.inline
      def setOpenWindow(value: Boolean): Self = StObject.set(x, "openWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenWindowUndefined: Self = StObject.set(x, "openWindow", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
      
      @scala.inline
      def setWindowPosition(value: windowCenter | screenCenter): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
      
      @scala.inline
      def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
    }
  }
  
  /* Inlined react-share.react-share.CommonShareButtonProps & {  title :string | undefined,   image :string | undefined} */
  trait CommonShareButtonPropstitDisabled extends StObject {
    
    /**
      * An object to pass any additional properties, such as `aria-*` attributes.
      */
    var additionalProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
    
    /**
      *  Takes a function that returns a Promise to be fulfilled before calling
      * `onClick`. If you do not return promise, `onClick` is called immediately.
      */
    var beforeOnClick: js.UndefOr[js.Function0[js.Promise[Unit] | Unit]] = js.undefined
    
    /**
      * A class name to add to the others added by react-share (SocialMediaShareButton, ...).
      */
    var className: js.UndefOr[String] = js.undefined
    
    /** Disables click action and adds `disabled` class */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Style when button is disabled
      * @default { opacity: 0.6 }
      */
    var disabledStyle: js.UndefOr[StyleHTMLAttributes[HTMLDivElement]] = js.undefined
    
    /** An absolute link to the image that will be shared */
    var image: js.UndefOr[String] = js.undefined
    
    /**
      * Click callback handler.
      */
    var onClick: js.UndefOr[js.Function1[/* link */ String, Unit]] = js.undefined
    
    /**
      * Takes a function to be called after closing share dialog.
      */
    var onShareWindowClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * If false, does not open a new window and call the onClick callback instead.
      * @default true
      */
    var openWindow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The HTML role of the div.
      * @default "button"
      */
    var role: js.UndefOr[String] = js.undefined
    
    /**
      * Extra style for the button.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Indicates that its element can be focused, and where it participates in sequential keyboard
      * navigation.
      * @default "0"
      */
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /** Title of the shared page */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      * URL of the shared page
      */
    var url: String
    
    var windowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to center the share box respectively to the screen or to the window.
      * @default "windowCenter"
      */
    var windowPosition: js.UndefOr[windowCenter | screenCenter] = js.undefined
    
    var windowWidth: js.UndefOr[Double] = js.undefined
  }
  object CommonShareButtonPropstitDisabled {
    
    @scala.inline
    def apply(url: String): CommonShareButtonPropstitDisabled = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommonShareButtonPropstitDisabled]
    }
    
    @scala.inline
    implicit class CommonShareButtonPropstitDisabledMutableBuilder[Self <: CommonShareButtonPropstitDisabled] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdditionalProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "additionalProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdditionalPropsUndefined: Self = StObject.set(x, "additionalProps", js.undefined)
      
      @scala.inline
      def setBeforeOnClick(value: () => js.Promise[Unit] | Unit): Self = StObject.set(x, "beforeOnClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBeforeOnClickUndefined: Self = StObject.set(x, "beforeOnClick", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyle(value: StyleHTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "disabledStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledStyleUndefined: Self = StObject.set(x, "disabledStyle", js.undefined)
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* link */ String => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnShareWindowClose(value: () => Unit): Self = StObject.set(x, "onShareWindowClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShareWindowCloseUndefined: Self = StObject.set(x, "onShareWindowClose", js.undefined)
      
      @scala.inline
      def setOpenWindow(value: Boolean): Self = StObject.set(x, "openWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenWindowUndefined: Self = StObject.set(x, "openWindow", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeight(value: Double): Self = StObject.set(x, "windowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowHeightUndefined: Self = StObject.set(x, "windowHeight", js.undefined)
      
      @scala.inline
      def setWindowPosition(value: windowCenter | screenCenter): Self = StObject.set(x, "windowPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowPositionUndefined: Self = StObject.set(x, "windowPosition", js.undefined)
      
      @scala.inline
      def setWindowWidth(value: Double): Self = StObject.set(x, "windowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowWidthUndefined: Self = StObject.set(x, "windowWidth", js.undefined)
    }
  }
}
