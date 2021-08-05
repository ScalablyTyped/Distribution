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
import typings.reactJss.mod.Managers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Children extends StObject {
    
    var children: ReactNode
    
    var classNamePrefix: js.UndefOr[String] = js.undefined
    
    var disableStylesGeneration: js.UndefOr[Boolean] = js.undefined
    
    var generateId: js.UndefOr[GenerateId] = js.undefined
    
    var id: js.UndefOr[CreateGenerateIdOptions] = js.undefined
    
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
      
      inline def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      inline def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
      
      inline def setRegistry(value: SheetsRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
  
  trait DisableStylesGeneration extends StObject {
    
    var disableStylesGeneration: Boolean
    
    var jss: js.UndefOr[Jss] = js.undefined
    
    var managers: js.UndefOr[Managers] = js.undefined
    
    var registry: js.UndefOr[SheetsRegistry] = js.undefined
    
    var sheetOptions: StyleSheetFactoryOptions
  }
  object DisableStylesGeneration {
    
    inline def apply(disableStylesGeneration: Boolean, sheetOptions: StyleSheetFactoryOptions): DisableStylesGeneration = {
      val __obj = js.Dynamic.literal(disableStylesGeneration = disableStylesGeneration.asInstanceOf[js.Any], sheetOptions = sheetOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisableStylesGeneration]
    }
    
    extension [Self <: DisableStylesGeneration](x: Self) {
      
      inline def setDisableStylesGeneration(value: Boolean): Self = StObject.set(x, "disableStylesGeneration", value.asInstanceOf[js.Any])
      
      inline def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      inline def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
      
      inline def setManagers(value: Managers): Self = StObject.set(x, "managers", value.asInstanceOf[js.Any])
      
      inline def setManagersUndefined: Self = StObject.set(x, "managers", js.undefined)
      
      inline def setRegistry(value: SheetsRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
      
      inline def setSheetOptions(value: StyleSheetFactoryOptions): Self = StObject.set(x, "sheetOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait InnerRef extends StObject {
    
    var innerRef: js.UndefOr[RefObject[js.Any] | (js.Function1[/* instance */ js.Any, Unit])] = js.undefined
  }
  object InnerRef {
    
    inline def apply(): InnerRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InnerRef]
    }
    
    extension [Self <: InnerRef](x: Self) {
      
      inline def setInnerRef(value: RefObject[js.Any] | (js.Function1[/* instance */ js.Any, Unit])): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: /* instance */ js.Any => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
}
