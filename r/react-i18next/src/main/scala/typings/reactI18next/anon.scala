package typings.reactI18next

import org.scalablytyped.runtime.StringDictionary
import typings.i18next.mod.Resource
import typings.i18next.mod.TFunction
import typings.i18next.mod.i18n
import typings.react.mod.FunctionComponentElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call[Props] extends StObject {
    
    def apply(hasInitialI18nStoreInitialLanguageRest: InitialLanguage & Props): FunctionComponentElement[Props] = js.native
    
    def getInitialProps(ctx: js.Any): js.Promise[js.Any] = js.native
  }
  
  trait I18n extends StObject {
    
    var i18n: typings.i18next.mod.i18n
    
    var ready: Boolean
    
    var t: TFunction
  }
  object I18n {
    
    @scala.inline
    def apply(i18n: i18n, ready: Boolean, t: TFunction): I18n = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18n]
    }
    
    @scala.inline
    implicit class I18nMutableBuilder[Self <: I18n] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setI18n(value: i18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setT(value: TFunction): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
  
  trait I18nI18n extends StObject {
    
    var i18n: typings.i18next.mod.i18n
  }
  object I18nI18n {
    
    @scala.inline
    def apply(i18n: i18n): I18nI18n = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nI18n]
    }
    
    @scala.inline
    implicit class I18nI18nMutableBuilder[Self <: I18nI18n] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setI18n(value: i18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitialI18nStore extends StObject {
    
    var initialI18nStore: StringDictionary[js.Object]
    
    var initialLanguage: String
  }
  object InitialI18nStore {
    
    @scala.inline
    def apply(initialI18nStore: StringDictionary[js.Object], initialLanguage: String): InitialI18nStore = {
      val __obj = js.Dynamic.literal(initialI18nStore = initialI18nStore.asInstanceOf[js.Any], initialLanguage = initialLanguage.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialI18nStore]
    }
    
    @scala.inline
    implicit class InitialI18nStoreMutableBuilder[Self <: InitialI18nStore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialI18nStore(value: StringDictionary[js.Object]): Self = StObject.set(x, "initialI18nStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialLanguage(value: String): Self = StObject.set(x, "initialLanguage", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitialLanguage extends StObject {
    
    var initialI18nStore: Resource
    
    var initialLanguage: String
  }
  object InitialLanguage {
    
    @scala.inline
    def apply(initialI18nStore: Resource, initialLanguage: String): InitialLanguage = {
      val __obj = js.Dynamic.literal(initialI18nStore = initialI18nStore.asInstanceOf[js.Any], initialLanguage = initialLanguage.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialLanguage]
    }
    
    @scala.inline
    implicit class InitialLanguageMutableBuilder[Self <: InitialLanguage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialI18nStore(value: Resource): Self = StObject.set(x, "initialI18nStore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialLanguage(value: String): Self = StObject.set(x, "initialLanguage", value.asInstanceOf[js.Any])
    }
  }
  
  trait Lng extends StObject {
    
    var i18n: typings.i18next.mod.i18n
    
    var lng: String
  }
  object Lng {
    
    @scala.inline
    def apply(i18n: i18n, lng: String): Lng = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lng]
    }
    
    @scala.inline
    implicit class LngMutableBuilder[Self <: Lng] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setI18n(value: i18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLng(value: String): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithRef extends StObject {
    
    var withRef: js.UndefOr[Boolean] = js.undefined
  }
  object WithRef {
    
    @scala.inline
    def apply(): WithRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithRef]
    }
    
    @scala.inline
    implicit class WithRefMutableBuilder[Self <: WithRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWithRef(value: Boolean): Self = StObject.set(x, "withRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithRefUndefined: Self = StObject.set(x, "withRef", js.undefined)
    }
  }
}
