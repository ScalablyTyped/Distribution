package typings.reactI18next

import typings.i18next.mod.FallbackOrNS
import typings.i18next.mod.KeyPrefix
import typings.i18next.mod.Namespace
import typings.i18next.mod.ReactOptions
import typings.i18next.mod.Resource
import typings.i18next.mod.TFunction
import typings.i18next.mod.ThirdPartyModule
import typings.i18next.mod.i18n
import typings.react.mod.ComponentProps
import typings.react.mod.ComponentType
import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.LibraryManagedAttributes
import typings.reactI18next.anon.Call
import typings.reactI18next.anon.Children
import typings.reactI18next.anon.I18n
import typings.reactI18next.anon.I18nI18n
import typings.reactI18next.anon.InitialI18nStore
import typings.reactI18next.anon.Lng
import typings.reactI18next.reactI18nextBooleans.`false`
import typings.reactI18next.reactI18nextStrings.default
import typings.reactI18next.reactI18nextStrings.fallback
import typings.reactI18next.reactI18nextStrings.t
import typings.reactI18next.reactI18nextStrings.tReady
import typings.reactI18next.reactI18nextStrings.translation
import typings.std.Omit
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-i18next", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-i18next", "I18nContext")
  @js.native
  val I18nContext: Context[I18nI18n] = js.native
  
  @JSImport("react-i18next", "I18nextProvider")
  @js.native
  val I18nextProvider: FunctionComponent[I18nextProviderProps] = js.native
  
  inline def Trans[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, TKPrefix, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */, E](props: TransProps[K, N, TKPrefix, E]): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("Trans")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  inline def Translation[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](props: TranslationProps[N, TKPrefix]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("Translation")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def composeInitialProps(ForComponent: Any): js.Function1[/* ctx */ Any, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeInitialProps")(ForComponent.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ctx */ Any, js.Promise[Any]]]
  
  inline def getDefaults(): ReactOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaults")().asInstanceOf[ReactOptions]
  
  inline def getI18n(): i18n = ^.asInstanceOf[js.Dynamic].applyDynamic("getI18n")().asInstanceOf[i18n]
  
  inline def getInitialProps(): InitialI18nStore = ^.asInstanceOf[js.Dynamic].applyDynamic("getInitialProps")().asInstanceOf[InitialI18nStore]
  
  @JSImport("react-i18next", "initReactI18next")
  @js.native
  val initReactI18next: ThirdPartyModule = js.native
  
  inline def setDefaults(options: ReactOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaults")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setI18n(instance: i18n): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setI18n")(instance.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def useSSR(initialI18nStore: Resource, initialLanguage: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useSSR")(initialI18nStore.asInstanceOf[js.Any], initialLanguage.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def useTranslation[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](): UseTranslationResponse[N, TKPrefix] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTranslation")().asInstanceOf[UseTranslationResponse[N, TKPrefix]]
  inline def useTranslation[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](ns: N): UseTranslationResponse[N, TKPrefix] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTranslation")(ns.asInstanceOf[js.Any]).asInstanceOf[UseTranslationResponse[N, TKPrefix]]
  inline def useTranslation[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](ns: N, options: UseTranslationOptions[TKPrefix]): UseTranslationResponse[N, TKPrefix] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTranslation")(ns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseTranslationResponse[N, TKPrefix]]
  inline def useTranslation[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](ns: Unit, options: UseTranslationOptions[TKPrefix]): UseTranslationResponse[N, TKPrefix] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTranslation")(ns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[UseTranslationResponse[N, TKPrefix]]
  
  inline def withSSR(): js.Function1[/* WrappedComponent */ ComponentType[Any], Call[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSSR")().asInstanceOf[js.Function1[/* WrappedComponent */ ComponentType[Any], Call[Any]]]
  
  inline def withTranslation[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](): js.Function1[
    /* component */ ComponentType[ComponentProps[Any] & WithTranslationProps], 
    ComponentType[
      (Omit[
        LibraryManagedAttributes[
          ComponentType[ComponentProps[Any] & WithTranslationProps], 
          Subtract[
            ComponentProps[ComponentType[ComponentProps[Any] & WithTranslationProps]], 
            WithTranslationProps
          ]
        ], 
        /* keyof react-i18next.react-i18next.WithTranslation<N, undefined> */ t | typings.reactI18next.reactI18nextStrings.i18n | tReady
      ]) & WithTranslationProps
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTranslation")().asInstanceOf[js.Function1[
    /* component */ ComponentType[ComponentProps[Any] & WithTranslationProps], 
    ComponentType[
      (Omit[
        LibraryManagedAttributes[
          ComponentType[ComponentProps[Any] & WithTranslationProps], 
          Subtract[
            ComponentProps[ComponentType[ComponentProps[Any] & WithTranslationProps]], 
            WithTranslationProps
          ]
        ], 
        /* keyof react-i18next.react-i18next.WithTranslation<N, undefined> */ t | typings.reactI18next.reactI18nextStrings.i18n | tReady
      ]) & WithTranslationProps
    ]
  ]]
  inline def withTranslation[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](ns: N): js.Function1[
    /* component */ ComponentType[ComponentProps[Any] & WithTranslationProps], 
    ComponentType[
      (Omit[
        LibraryManagedAttributes[
          ComponentType[ComponentProps[Any] & WithTranslationProps], 
          Subtract[
            ComponentProps[ComponentType[ComponentProps[Any] & WithTranslationProps]], 
            WithTranslationProps
          ]
        ], 
        /* keyof react-i18next.react-i18next.WithTranslation<N, undefined> */ t | typings.reactI18next.reactI18nextStrings.i18n | tReady
      ]) & WithTranslationProps
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTranslation")(ns.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* component */ ComponentType[ComponentProps[Any] & WithTranslationProps], 
    ComponentType[
      (Omit[
        LibraryManagedAttributes[
          ComponentType[ComponentProps[Any] & WithTranslationProps], 
          Subtract[
            ComponentProps[ComponentType[ComponentProps[Any] & WithTranslationProps]], 
            WithTranslationProps
          ]
        ], 
        /* keyof react-i18next.react-i18next.WithTranslation<N, undefined> */ t | typings.reactI18next.reactI18nextStrings.i18n | tReady
      ]) & WithTranslationProps
    ]
  ]]
  inline def withTranslation[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](ns: N, options: typings.reactI18next.anon.KeyPrefix[TKPrefix, N]): js.Function1[
    /* component */ ComponentType[ComponentProps[Any] & WithTranslationProps], 
    ComponentType[
      (Omit[
        LibraryManagedAttributes[
          ComponentType[ComponentProps[Any] & WithTranslationProps], 
          Subtract[
            ComponentProps[ComponentType[ComponentProps[Any] & WithTranslationProps]], 
            WithTranslationProps
          ]
        ], 
        /* keyof react-i18next.react-i18next.WithTranslation<N, undefined> */ t | typings.reactI18next.reactI18nextStrings.i18n | tReady
      ]) & WithTranslationProps
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTranslation")(ns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ ComponentType[ComponentProps[Any] & WithTranslationProps], 
    ComponentType[
      (Omit[
        LibraryManagedAttributes[
          ComponentType[ComponentProps[Any] & WithTranslationProps], 
          Subtract[
            ComponentProps[ComponentType[ComponentProps[Any] & WithTranslationProps]], 
            WithTranslationProps
          ]
        ], 
        /* keyof react-i18next.react-i18next.WithTranslation<N, undefined> */ t | typings.reactI18next.reactI18nextStrings.i18n | tReady
      ]) & WithTranslationProps
    ]
  ]]
  inline def withTranslation[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](ns: Unit, options: typings.reactI18next.anon.KeyPrefix[TKPrefix, N]): js.Function1[
    /* component */ ComponentType[ComponentProps[Any] & WithTranslationProps], 
    ComponentType[
      (Omit[
        LibraryManagedAttributes[
          ComponentType[ComponentProps[Any] & WithTranslationProps], 
          Subtract[
            ComponentProps[ComponentType[ComponentProps[Any] & WithTranslationProps]], 
            WithTranslationProps
          ]
        ], 
        /* keyof react-i18next.react-i18next.WithTranslation<N, undefined> */ t | typings.reactI18next.reactI18nextStrings.i18n | tReady
      ]) & WithTranslationProps
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTranslation")(ns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* component */ ComponentType[ComponentProps[Any] & WithTranslationProps], 
    ComponentType[
      (Omit[
        LibraryManagedAttributes[
          ComponentType[ComponentProps[Any] & WithTranslationProps], 
          Subtract[
            ComponentProps[ComponentType[ComponentProps[Any] & WithTranslationProps]], 
            WithTranslationProps
          ]
        ], 
        /* keyof react-i18next.react-i18next.WithTranslation<N, undefined> */ t | typings.reactI18next.reactI18nextStrings.i18n | tReady
      ]) & WithTranslationProps
    ]
  ]]
  
  /* Inlined i18next.i18next.TypeOptions['defaultNS'] */
  type DefaultNamespace = translation
  
  trait I18nextProviderProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var defaultNS: js.UndefOr[String] = js.undefined
    
    var i18n: typings.i18next.mod.i18n
  }
  object I18nextProviderProps {
    
    inline def apply(i18n: i18n): I18nextProviderProps = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
      __obj.asInstanceOf[I18nextProviderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: I18nextProviderProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefaultNS(value: String): Self = StObject.set(x, "defaultNS", value.asInstanceOf[js.Any])
      
      inline def setDefaultNSUndefined: Self = StObject.set(x, "defaultNS", js.undefined)
      
      inline def setI18n(value: i18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    false extends true ? std.Record<string, unknown> : never
    }}}
    */
  type ObjectOrNever = Record[String, Any]
  
  type ReactI18NextChild = ReactNode | ObjectOrNever
  
  trait ReportNamespaces extends StObject {
    
    def addUsedNamespaces(namespaces: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]]): Unit
    
    def getUsedNamespaces(): js.Array[String]
  }
  object ReportNamespaces {
    
    inline def apply(
      addUsedNamespaces: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] => Unit,
      getUsedNamespaces: () => js.Array[String]
    ): ReportNamespaces = {
      val __obj = js.Dynamic.literal(addUsedNamespaces = js.Any.fromFunction1(addUsedNamespaces), getUsedNamespaces = js.Any.fromFunction0(getUsedNamespaces))
      __obj.asInstanceOf[ReportNamespaces]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ReportNamespaces] (val x: Self) extends AnyVal {
      
      inline def setAddUsedNamespaces(value: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] => Unit): Self = StObject.set(x, "addUsedNamespaces", js.Any.fromFunction1(value))
      
      inline def setGetUsedNamespaces(value: () => js.Array[String]): Self = StObject.set(x, "getUsedNamespaces", js.Any.fromFunction0(value))
    }
  }
  
  type Subtract[T /* <: K */, K] = Omit[T, /* keyof K */ String]
  
  type TransChild = ReactNode | (Record[String, Any])
  
  type TransProps[K /* <: /* import warning: importer.ImportType#apply Failed type conversion: i18next.i18next.TFuncKey<N, TKPrefix, i18next.i18next.Resources> extends infer A ? A : never */ js.Any */, N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix, E] = E & (Children[K, N, TKPrefix])
  
  trait TranslationProps[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */] extends StObject {
    
    def children(t: TFunction[N, TKPrefix], options: Lng, ready: Boolean): ReactNode
    
    var i18n: js.UndefOr[typings.i18next.mod.i18n] = js.undefined
    
    var keyPrefix: js.UndefOr[TKPrefix] = js.undefined
    
    var ns: js.UndefOr[N] = js.undefined
    
    var nsMode: js.UndefOr[fallback | default] = js.undefined
    
    var useSuspense: js.UndefOr[Boolean] = js.undefined
  }
  object TranslationProps {
    
    inline def apply[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](children: (TFunction[N, TKPrefix], Lng, Boolean) => ReactNode): TranslationProps[N, TKPrefix] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction3(children))
      __obj.asInstanceOf[TranslationProps[N, TKPrefix]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TranslationProps[?, ?], N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */] (val x: Self & (TranslationProps[N, TKPrefix])) extends AnyVal {
      
      inline def setChildren(value: (TFunction[N, TKPrefix], Lng, Boolean) => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction3(value))
      
      inline def setI18n(value: i18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setKeyPrefix(value: TKPrefix): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
      
      inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
      
      inline def setNs(value: N): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
      
      inline def setNsMode(value: fallback | default): Self = StObject.set(x, "nsMode", value.asInstanceOf[js.Any])
      
      inline def setNsModeUndefined: Self = StObject.set(x, "nsMode", js.undefined)
      
      inline def setNsUndefined: Self = StObject.set(x, "ns", js.undefined)
      
      inline def setUseSuspense(value: Boolean): Self = StObject.set(x, "useSuspense", value.asInstanceOf[js.Any])
      
      inline def setUseSuspenseUndefined: Self = StObject.set(x, "useSuspense", js.undefined)
    }
  }
  
  trait UseTranslationOptions[TKPrefix] extends StObject {
    
    var bindI18n: js.UndefOr[String | `false`] = js.undefined
    
    var i18n: js.UndefOr[typings.i18next.mod.i18n] = js.undefined
    
    var keyPrefix: js.UndefOr[TKPrefix] = js.undefined
    
    var nsMode: js.UndefOr[fallback | default] = js.undefined
    
    var useSuspense: js.UndefOr[Boolean] = js.undefined
  }
  object UseTranslationOptions {
    
    inline def apply[TKPrefix](): UseTranslationOptions[TKPrefix] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UseTranslationOptions[TKPrefix]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UseTranslationOptions[?], TKPrefix] (val x: Self & UseTranslationOptions[TKPrefix]) extends AnyVal {
      
      inline def setBindI18n(value: String | `false`): Self = StObject.set(x, "bindI18n", value.asInstanceOf[js.Any])
      
      inline def setBindI18nUndefined: Self = StObject.set(x, "bindI18n", js.undefined)
      
      inline def setI18n(value: i18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setKeyPrefix(value: TKPrefix): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
      
      inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
      
      inline def setNsMode(value: fallback | default): Self = StObject.set(x, "nsMode", value.asInstanceOf[js.Any])
      
      inline def setNsModeUndefined: Self = StObject.set(x, "nsMode", js.undefined)
      
      inline def setUseSuspense(value: Boolean): Self = StObject.set(x, "useSuspense", value.asInstanceOf[js.Any])
      
      inline def setUseSuspenseUndefined: Self = StObject.set(x, "useSuspense", js.undefined)
    }
  }
  
  type UseTranslationResponse[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix] = (js.Tuple3[TFunction[N, TKPrefix], i18n, Boolean]) & (I18n[N, TKPrefix])
  
  trait WithTranslationProps extends StObject {
    
    var i18n: js.UndefOr[typings.i18next.mod.i18n] = js.undefined
    
    var useSuspense: js.UndefOr[Boolean] = js.undefined
  }
  object WithTranslationProps {
    
    inline def apply(): WithTranslationProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithTranslationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithTranslationProps] (val x: Self) extends AnyVal {
      
      inline def setI18n(value: i18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setUseSuspense(value: Boolean): Self = StObject.set(x, "useSuspense", value.asInstanceOf[js.Any])
      
      inline def setUseSuspenseUndefined: Self = StObject.set(x, "useSuspense", js.undefined)
    }
  }
  
  trait WithTranslation_[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */] extends StObject {
    
    var i18n: typings.i18next.mod.i18n
    
    var t: TFunction[N, TKPrefix]
    
    var tReady: Boolean
  }
  object WithTranslation_ {
    
    inline def apply[N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */](i18n: i18n, t: TFunction[N, TKPrefix], tReady: Boolean): WithTranslation_[N, TKPrefix] = {
      val __obj = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], tReady = tReady.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithTranslation_[N, TKPrefix]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WithTranslation_[?, ?], N /* <: Namespace[FallbackOrNS[String, /* keyof i18next.i18next.Resources */ String]] */, TKPrefix /* <: KeyPrefix[N] */] (val x: Self & (WithTranslation_[N, TKPrefix])) extends AnyVal {
      
      inline def setI18n(value: i18n): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setT(value: TFunction[N, TKPrefix]): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      inline def setTReady(value: Boolean): Self = StObject.set(x, "tReady", value.asInstanceOf[js.Any])
    }
  }
  
  /* augmented module */
  object i18nextAugmentingMod {
    
    trait i18n extends StObject {
      
      var reportNamespaces: ReportNamespaces
    }
    object i18n {
      
      inline def apply(reportNamespaces: ReportNamespaces): typings.reactI18next.mod.i18nextAugmentingMod.i18n = {
        val __obj = js.Dynamic.literal(reportNamespaces = reportNamespaces.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.reactI18next.mod.i18nextAugmentingMod.i18n]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.reactI18next.mod.i18nextAugmentingMod.i18n] (val x: Self) extends AnyVal {
        
        inline def setReportNamespaces(value: ReportNamespaces): Self = StObject.set(x, "reportNamespaces", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /* augmented module */
  object reactAugmentingMod {
    
    trait HTMLAttributes[T] extends StObject {
      
      var children: js.UndefOr[ReactI18NextChild | js.Iterable[ReactI18NextChild]] = js.undefined
    }
    object HTMLAttributes {
      
      inline def apply[T](): HTMLAttributes[T] = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[HTMLAttributes[T]]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: HTMLAttributes[?], T] (val x: Self & HTMLAttributes[T]) extends AnyVal {
        
        inline def setChildren(value: ReactI18NextChild | js.Iterable[ReactI18NextChild]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      }
    }
  }
}
