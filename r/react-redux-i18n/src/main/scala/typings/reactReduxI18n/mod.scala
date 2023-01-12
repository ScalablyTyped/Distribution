package typings.reactReduxI18n

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ElementType
import typings.redux.mod.Action
import typings.redux.mod.AnyAction
import typings.redux.mod.Dispatch
import typings.redux.mod.Reducer
import typings.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-redux-i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper methods
    */
  @js.native
  trait I18n extends StObject {
    
    def l(timestamp: Double): String = js.native
    def l(timestamp: Double, options: Any): String = js.native
    
    def t(code: String): String = js.native
    def t(code: String, options: Any): String = js.native
  }
  @JSImport("react-redux-i18n", "I18n")
  @js.native
  def I18n: I18n = js.native
  inline def I18n_=(x: I18n): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("I18n")(x.asInstanceOf[js.Any])
  
  @JSImport("react-redux-i18n", "Localize")
  @js.native
  open class Localize protected ()
    extends Component[LocalizeProps, js.Object, Any] {
    def this(props: LocalizeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LocalizeProps, context: Any) = this()
  }
  
  @JSImport("react-redux-i18n", "Translate")
  @js.native
  open class Translate protected ()
    extends Component[TranslateProps, js.Object, Any] {
    def this(props: TranslateProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TranslateProps, context: Any) = this()
  }
  
  inline def i18nReducer(): Reducer[I18nState, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("i18nReducer")().asInstanceOf[Reducer[I18nState, AnyAction]]
  inline def i18nReducer(state: Any): Reducer[I18nState, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("i18nReducer")(state.asInstanceOf[js.Any]).asInstanceOf[Reducer[I18nState, AnyAction]]
  inline def i18nReducer(state: Any, options: Any): Reducer[I18nState, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nReducer")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Reducer[I18nState, AnyAction]]
  inline def i18nReducer(state: Unit, options: Any): Reducer[I18nState, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nReducer")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Reducer[I18nState, AnyAction]]
  
  inline def loadTranslations(translationsObject: TranslationObjects): DispatchCallback[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTranslations")(translationsObject.asInstanceOf[js.Any]).asInstanceOf[DispatchCallback[Any]]
  
  inline def setLocale(locale: String): DispatchCallback[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[DispatchCallback[Any]]
  
  inline def syncTranslationWithStore(store: Store[Any, AnyAction]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncTranslationWithStore")(store.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type DispatchCallback[S /* <: Action[Any] */] = js.Function2[
    /* dispatch */ js.UndefOr[Dispatch[S]], 
    /* getState */ js.UndefOr[js.Function0[S]], 
    Any
  ]
  
  trait I18nState extends StObject {
    
    var locale: String
    
    var translations: TranslationObjects
  }
  object I18nState {
    
    inline def apply(locale: String, translations: TranslationObjects): I18nState = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: I18nState] (val x: Self) extends AnyVal {
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setTranslations(value: TranslationObjects): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalizeProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dangerousHTML: js.UndefOr[Boolean] = js.undefined
    
    var dateFormat: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[js.Object] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
    
    var value: String | Double | js.Object
  }
  object LocalizeProps {
    
    inline def apply(value: String | Double | js.Object): LocalizeProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizeProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocalizeProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDangerousHTML(value: Boolean): Self = StObject.set(x, "dangerousHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerousHTMLUndefined: Self = StObject.set(x, "dangerousHTML", js.undefined)
      
      inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      inline def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setValue(value: String | Double | js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type SubTranslationObject = string | {[key: string] : react-redux-i18n.react-redux-i18n.SubTranslationObject}
  }}}
  to avoid circular code involving: 
  - react-redux-i18n.react-redux-i18n.SubTranslationObject
  */
  type SubTranslationObject = String | StringDictionary[Any]
  
  trait TranslateProps
    extends StObject
       with /* prop */ StringDictionary[Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dangerousHTML: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tag: js.UndefOr[ElementType[Any]] = js.undefined
    
    var value: String
  }
  object TranslateProps {
    
    inline def apply(value: String): TranslateProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranslateProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TranslateProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDangerousHTML(value: Boolean): Self = StObject.set(x, "dangerousHTML", value.asInstanceOf[js.Any])
      
      inline def setDangerousHTMLUndefined: Self = StObject.set(x, "dangerousHTML", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTag(value: ElementType[Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type TranslationObjects = {[lang: string] : react-redux-i18n.react-redux-i18n.SubTranslationObject}
  }}}
  to avoid circular code involving: 
  - react-redux-i18n.react-redux-i18n.SubTranslationObject
  - react-redux-i18n.react-redux-i18n.TranslationObjects
  */
  trait TranslationObjects
    extends StObject
       with /* lang */ StringDictionary[SubTranslationObject]
  object TranslationObjects {
    
    inline def apply(): TranslationObjects = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TranslationObjects]
    }
  }
}
