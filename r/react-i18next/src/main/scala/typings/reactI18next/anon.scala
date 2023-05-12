package typings.reactI18next

import org.scalablytyped.runtime.StringDictionary
import typings.i18next.mod.FallbackOrNS
import typings.i18next.mod.Namespace
import typings.i18next.mod.Resource
import typings.i18next.mod.TFunction
import typings.i18next.mod.i18n
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponentElement
import typings.react.mod.ReactElement
import typings.reactI18next.transWithoutContextMod.TransChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Call[Props] extends StObject {
    
    def apply(param0: InitialLanguage & Props): FunctionComponentElement[Props] = js.native
    
    def getInitialProps(ctx: Any): js.Promise[Any] = js.native
  }
  
  trait Children[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, TKPrefix, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix] extends StObject {
    
    var children: js.UndefOr[TransChild | js.Array[TransChild]] = js.undefined
    
    var components: js.UndefOr[js.Array[ReactElement] | StringDictionary[ReactElement]] = js.undefined
    
    var context: js.UndefOr[String] = js.undefined
    
    var count: js.UndefOr[Double] = js.undefined
    
    var defaults: js.UndefOr[String] = js.undefined
    
    var i18n: js.UndefOr[typings.i18next.mod.i18n] = js.undefined
    
    var i18nKey: js.UndefOr[K | js.Array[K]] = js.undefined
    
    var ns: js.UndefOr[N] = js.undefined
    
    var parent: js.UndefOr[String | ComponentType[Any] | Null] = js.undefined
    
    var shouldUnescape: js.UndefOr[Boolean] = js.undefined
    
    var t: js.UndefOr[
        TFunction[
          N, 
          TKPrefix, 
          /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any
        ]
      ] = js.undefined
    
    // used in React.createElement if not null
    var tOptions: js.UndefOr[js.Object] = js.undefined
    
    var values: js.UndefOr[js.Object] = js.undefined
  }
  object Children {
    
    inline def apply[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, TKPrefix, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix](): Children[K, N, TKPrefix] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children[K, N, TKPrefix]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children[?, ?, ?], K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, TKPrefix, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix] (val x: Self & (Children[K, N, TKPrefix])) extends AnyVal {
      
      inline def setChildren(value: TransChild | js.Array[TransChild]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: TransChild*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setComponents(value: js.Array[ReactElement] | StringDictionary[ReactElement]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setComponentsVarargs(value: ReactElement*): Self = StObject.set(x, "components", js.Array(value*))
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDefaults(value: String): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setI18n(value: i18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nKey(value: K | js.Array[K]): Self = StObject.set(x, "i18nKey", value.asInstanceOf[js.Any])
      
      inline def setI18nKeyUndefined: Self = StObject.set(x, "i18nKey", js.undefined)
      
      inline def setI18nKeyVarargs(value: K*): Self = StObject.set(x, "i18nKey", js.Array(value*))
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setNs(value: N): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
      
      inline def setParent(value: String | ComponentType[Any]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setShouldUnescape(value: Boolean): Self = StObject.set(x, "shouldUnescape", value.asInstanceOf[js.Any])
      
      inline def setShouldUnescapeUndefined: Self = StObject.set(x, "shouldUnescape", js.undefined)
      
      inline def setT(
        value: TFunction[
              N, 
              TKPrefix, 
              /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any
            ]
      ): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      inline def setTOptions(value: js.Object): Self = StObject.set(x, "tOptions", value.asInstanceOf[js.Any])
      
      inline def setTOptionsUndefined: Self = StObject.set(x, "tOptions", js.undefined)
      
      inline def setTUndefined: Self = StObject.set(x, "t", js.undefined)
      
      inline def setValues(value: js.Object): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  trait I18n[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix] extends StObject {
    
    var i18n: typings.i18next.mod.i18n
    
    var ready: Boolean
    
    var t: TFunction[
        N, 
        TKPrefix, 
        /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any
      ]
  }
  object I18n {
    
    inline def apply[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix](
      i18n: i18n,
      ready: Boolean,
      t: TFunction[
          N, 
          TKPrefix, 
          /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any
        ]
    ): I18n[N, TKPrefix] = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18n[N, TKPrefix]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: I18n[?, ?], N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix] (val x: Self & (I18n[N, TKPrefix])) extends AnyVal {
      
      inline def setI18n(value: i18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setReady(value: Boolean): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      inline def setT(
        value: TFunction[
              N, 
              TKPrefix, 
              /* import warning: importer.ImportType#apply Failed type conversion: N extends null ? i18next.i18next.DefaultNamespace : N */ js.Any
            ]
      ): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
    }
  }
  
  trait I18nI18n extends StObject {
    
    var i18n: typings.i18next.mod.i18n
  }
  object I18nI18n {
    
    inline def apply(i18n: i18n): I18nI18n = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nI18n]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: I18nI18n] (val x: Self) extends AnyVal {
      
      inline def setI18n(value: i18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitialI18nStore extends StObject {
    
    var initialI18nStore: StringDictionary[js.Object]
    
    var initialLanguage: String
  }
  object InitialI18nStore {
    
    inline def apply(initialI18nStore: StringDictionary[js.Object], initialLanguage: String): InitialI18nStore = {
      val __obj = js.Dynamic.literal(initialI18nStore = initialI18nStore.asInstanceOf[js.Any], initialLanguage = initialLanguage.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialI18nStore]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InitialI18nStore] (val x: Self) extends AnyVal {
      
      inline def setInitialI18nStore(value: StringDictionary[js.Object]): Self = StObject.set(x, "initialI18nStore", value.asInstanceOf[js.Any])
      
      inline def setInitialLanguage(value: String): Self = StObject.set(x, "initialLanguage", value.asInstanceOf[js.Any])
    }
  }
  
  trait InitialLanguage extends StObject {
    
    var initialI18nStore: Resource
    
    var initialLanguage: String
  }
  object InitialLanguage {
    
    inline def apply(initialI18nStore: Resource, initialLanguage: String): InitialLanguage = {
      val __obj = js.Dynamic.literal(initialI18nStore = initialI18nStore.asInstanceOf[js.Any], initialLanguage = initialLanguage.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitialLanguage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InitialLanguage] (val x: Self) extends AnyVal {
      
      inline def setInitialI18nStore(value: Resource): Self = StObject.set(x, "initialI18nStore", value.asInstanceOf[js.Any])
      
      inline def setInitialLanguage(value: String): Self = StObject.set(x, "initialLanguage", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeyPrefix[TKPrefix /* <: typings.i18next.mod.KeyPrefix[N] */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */] extends StObject {
    
    var keyPrefix: js.UndefOr[TKPrefix] = js.undefined
    
    var withRef: js.UndefOr[Boolean] = js.undefined
  }
  object KeyPrefix {
    
    inline def apply[TKPrefix /* <: typings.i18next.mod.KeyPrefix[N] */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */](): KeyPrefix[TKPrefix, N] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyPrefix[TKPrefix, N]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyPrefix[?, ?], TKPrefix /* <: typings.i18next.mod.KeyPrefix[N] */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */] (val x: Self & (KeyPrefix[TKPrefix, N])) extends AnyVal {
      
      inline def setKeyPrefix(value: TKPrefix): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
      
      inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
      
      inline def setWithRef(value: Boolean): Self = StObject.set(x, "withRef", value.asInstanceOf[js.Any])
      
      inline def setWithRefUndefined: Self = StObject.set(x, "withRef", js.undefined)
    }
  }
  
  trait Lng extends StObject {
    
    var i18n: typings.i18next.mod.i18n
    
    var lng: String
  }
  object Lng {
    
    inline def apply(i18n: i18n, lng: String): Lng = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lng]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lng] (val x: Self) extends AnyVal {
      
      inline def setI18n(value: i18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setLng(value: String): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
    }
  }
}
