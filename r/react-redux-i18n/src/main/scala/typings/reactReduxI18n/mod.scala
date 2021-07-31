package typings.reactReduxI18n

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactType
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
    def l(timestamp: Double, options: js.Any): String = js.native
    
    def t(code: String): String = js.native
    def t(code: String, options: js.Any): String = js.native
  }
  @JSImport("react-redux-i18n", "I18n")
  @js.native
  def I18n: I18n = js.native
  @scala.inline
  def I18n_=(x: I18n): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("I18n")(x.asInstanceOf[js.Any])
  
  @JSImport("react-redux-i18n", "Localize")
  @js.native
  class Localize protected ()
    extends Component[LocalizeProps, js.Object, js.Any] {
    def this(props: LocalizeProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LocalizeProps, context: js.Any) = this()
  }
  
  @JSImport("react-redux-i18n", "Translate")
  @js.native
  class Translate protected ()
    extends Component[TranslateProps, js.Object, js.Any] {
    def this(props: TranslateProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: TranslateProps, context: js.Any) = this()
  }
  
  @scala.inline
  def i18nReducer(): Reducer[I18nState, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("i18nReducer")().asInstanceOf[Reducer[I18nState, AnyAction]]
  @scala.inline
  def i18nReducer(state: js.Any): Reducer[I18nState, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("i18nReducer")(state.asInstanceOf[js.Any]).asInstanceOf[Reducer[I18nState, AnyAction]]
  @scala.inline
  def i18nReducer(state: js.Any, options: js.Any): Reducer[I18nState, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nReducer")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Reducer[I18nState, AnyAction]]
  @scala.inline
  def i18nReducer(state: Unit, options: js.Any): Reducer[I18nState, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("i18nReducer")(state.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Reducer[I18nState, AnyAction]]
  
  @scala.inline
  def loadTranslations(translationsObject: TranslationObjects): DispatchCallback[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTranslations")(translationsObject.asInstanceOf[js.Any]).asInstanceOf[DispatchCallback[js.Any]]
  
  @scala.inline
  def setLocale(locale: String): DispatchCallback[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("setLocale")(locale.asInstanceOf[js.Any]).asInstanceOf[DispatchCallback[js.Any]]
  
  @scala.inline
  def syncTranslationWithStore(store: Store[js.Any, AnyAction]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncTranslationWithStore")(store.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type DispatchCallback[S /* <: Action[js.Any] */] = js.Function2[
    /* dispatch */ js.UndefOr[Dispatch[S]], 
    /* getState */ js.UndefOr[js.Function0[S]], 
    js.Any
  ]
  
  trait I18nState extends StObject {
    
    var locale: String
    
    var translations: TranslationObjects
  }
  object I18nState {
    
    @scala.inline
    def apply(locale: String, translations: TranslationObjects): I18nState = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nState]
    }
    
    @scala.inline
    implicit class I18nStateMutableBuilder[Self <: I18nState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslations(value: TranslationObjects): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocalizeProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dangerousHTML: js.UndefOr[Boolean] = js.undefined
    
    var dateFormat: js.UndefOr[String] = js.undefined
    
    var options: js.UndefOr[js.Object] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tag: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    var value: String | Double | js.Object
  }
  object LocalizeProps {
    
    @scala.inline
    def apply(value: String | Double | js.Object): LocalizeProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalizeProps]
    }
    
    @scala.inline
    implicit class LocalizePropsMutableBuilder[Self <: LocalizeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDangerousHTML(value: Boolean): Self = StObject.set(x, "dangerousHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerousHTMLUndefined: Self = StObject.set(x, "dangerousHTML", js.undefined)
      
      @scala.inline
      def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateFormatUndefined: Self = StObject.set(x, "dateFormat", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTag(value: ReactType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setValue(value: String | Double | js.Object): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SubTranslationObject = String | (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias react-redux-i18n.react-redux-i18n.SubTranslationObject */ js.Object
  ])
  
  trait TranslateProps
    extends StObject
       with /* prop */ StringDictionary[js.Any] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dangerousHTML: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tag: js.UndefOr[ReactType[js.Any]] = js.undefined
    
    var value: String
  }
  object TranslateProps {
    
    @scala.inline
    def apply(value: String): TranslateProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranslateProps]
    }
    
    @scala.inline
    implicit class TranslatePropsMutableBuilder[Self <: TranslateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDangerousHTML(value: Boolean): Self = StObject.set(x, "dangerousHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerousHTMLUndefined: Self = StObject.set(x, "dangerousHTML", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTag(value: ReactType[js.Any]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type TranslationObjects = StringDictionary[SubTranslationObject]
}
