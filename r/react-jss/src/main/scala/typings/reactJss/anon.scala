package typings.reactJss

import typings.jss.mod.CreateGenerateIdOptions
import typings.jss.mod.GenerateId
import typings.jss.mod.Jss
import typings.jss.mod.Rule
import typings.jss.mod.SheetsRegistry
import typings.jss.mod.StyleSheet
import typings.jss.mod.StyleSheetFactoryOptions
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactJss.mod.ClassesForStyles
import typings.reactJss.mod.Managers
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`[Theme] extends StObject {
    
    var theme: js.UndefOr[Theme] = js.undefined
  }
  object `0` {
    
    inline def apply[Theme](): `0`[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`[Theme]]
    }
    
    extension [Self <: `0`[?], Theme](x: Self & `0`[Theme]) {
      
      inline def setTheme(value: Theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait Children extends StObject {
    
    var children: ReactNode
    
    var classNamePrefix: js.UndefOr[String] = js.undefined
    
    var disableStylesGeneration: js.UndefOr[Boolean] = js.undefined
    
    var generateId: js.UndefOr[GenerateId] = js.undefined
    
    var id: js.UndefOr[CreateGenerateIdOptions] = js.undefined
    
    var isSSR: js.UndefOr[Boolean] = js.undefined
    
    var jss: js.UndefOr[Jss] = js.undefined
    
    var registry: js.UndefOr[SheetsRegistry] = js.undefined
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassNamePrefix(value: String): Self = StObject.set(x, "classNamePrefix", value.asInstanceOf[js.Any])
      
      inline def setClassNamePrefixUndefined: Self = StObject.set(x, "classNamePrefix", js.undefined)
      
      inline def setDisableStylesGeneration(value: Boolean): Self = StObject.set(x, "disableStylesGeneration", value.asInstanceOf[js.Any])
      
      inline def setDisableStylesGenerationUndefined: Self = StObject.set(x, "disableStylesGeneration", js.undefined)
      
      inline def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateId", js.Any.fromFunction2(value))
      
      inline def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
      
      inline def setId(value: CreateGenerateIdOptions): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsSSR(value: Boolean): Self = StObject.set(x, "isSSR", value.asInstanceOf[js.Any])
      
      inline def setIsSSRUndefined: Self = StObject.set(x, "isSSR", js.undefined)
      
      inline def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      inline def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
      
      inline def setRegistry(value: SheetsRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
  
  trait Classes extends StObject {
    
    var classes: js.UndefOr[
        Partial[
          ClassesForStyles[
            /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof styles */ Any
          ]
        ]
      ] = js.undefined
    
    var innerRef: js.UndefOr[RefObject[Any] | (js.Function1[/* instance */ Any, Unit])] = js.undefined
  }
  object Classes {
    
    inline def apply(): Classes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Classes]
    }
    
    extension [Self <: Classes](x: Self) {
      
      inline def setClasses(
        value: Partial[
              ClassesForStyles[
                /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof styles */ Any
              ]
            ]
      ): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setInnerRef(value: RefObject[Any] | (js.Function1[/* instance */ Any, Unit])): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ Any => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
  
  trait DisableStylesGeneration extends StObject {
    
    var disableStylesGeneration: Boolean
    
    var isSSR: Boolean
    
    var jss: js.UndefOr[Jss] = js.undefined
    
    var managers: js.UndefOr[Managers] = js.undefined
    
    var registry: js.UndefOr[SheetsRegistry] = js.undefined
    
    var sheetOptions: StyleSheetFactoryOptions
  }
  object DisableStylesGeneration {
    
    inline def apply(disableStylesGeneration: Boolean, isSSR: Boolean, sheetOptions: StyleSheetFactoryOptions): DisableStylesGeneration = {
      val __obj = js.Dynamic.literal(disableStylesGeneration = disableStylesGeneration.asInstanceOf[js.Any], isSSR = isSSR.asInstanceOf[js.Any], sheetOptions = sheetOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisableStylesGeneration]
    }
    
    extension [Self <: DisableStylesGeneration](x: Self) {
      
      inline def setDisableStylesGeneration(value: Boolean): Self = StObject.set(x, "disableStylesGeneration", value.asInstanceOf[js.Any])
      
      inline def setIsSSR(value: Boolean): Self = StObject.set(x, "isSSR", value.asInstanceOf[js.Any])
      
      inline def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      inline def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
      
      inline def setManagers(value: Managers): Self = StObject.set(x, "managers", value.asInstanceOf[js.Any])
      
      inline def setManagersUndefined: Self = StObject.set(x, "managers", js.undefined)
      
      inline def setRegistry(value: SheetsRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
      
      inline def setSheetOptions(value: StyleSheetFactoryOptions): Self = StObject.set(x, "sheetOptions", value.asInstanceOf[js.Any])
    }
  }
}
