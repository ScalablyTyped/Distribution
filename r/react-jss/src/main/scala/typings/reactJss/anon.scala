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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Children extends StObject {
    
    var children: ReactNode = js.native
    
    var classNamePrefix: js.UndefOr[String] = js.native
    
    var disableStylesGeneration: js.UndefOr[Boolean] = js.native
    
    var generateId: js.UndefOr[GenerateId] = js.native
    
    var id: js.UndefOr[CreateGenerateIdOptions] = js.native
    
    var jss: js.UndefOr[Jss] = js.native
    
    var registry: js.UndefOr[SheetsRegistry] = js.native
  }
  object Children {
    
    @scala.inline
    def apply(): Children = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit class ChildrenMutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassNamePrefix(value: String): Self = StObject.set(x, "classNamePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNamePrefixUndefined: Self = StObject.set(x, "classNamePrefix", js.undefined)
      
      @scala.inline
      def setDisableStylesGeneration(value: Boolean): Self = StObject.set(x, "disableStylesGeneration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStylesGenerationUndefined: Self = StObject.set(x, "disableStylesGeneration", js.undefined)
      
      @scala.inline
      def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateId", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
      
      @scala.inline
      def setId(value: CreateGenerateIdOptions): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
      
      @scala.inline
      def setRegistry(value: SheetsRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
  
  @js.native
  trait DisableStylesGeneration extends StObject {
    
    var disableStylesGeneration: Boolean = js.native
    
    var jss: js.UndefOr[Jss] = js.native
    
    var managers: js.UndefOr[Managers] = js.native
    
    var registry: js.UndefOr[SheetsRegistry] = js.native
    
    var sheetOptions: StyleSheetFactoryOptions = js.native
  }
  object DisableStylesGeneration {
    
    @scala.inline
    def apply(disableStylesGeneration: Boolean, sheetOptions: StyleSheetFactoryOptions): DisableStylesGeneration = {
      val __obj = js.Dynamic.literal(disableStylesGeneration = disableStylesGeneration.asInstanceOf[js.Any], sheetOptions = sheetOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisableStylesGeneration]
    }
    
    @scala.inline
    implicit class DisableStylesGenerationMutableBuilder[Self <: DisableStylesGeneration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisableStylesGeneration(value: Boolean): Self = StObject.set(x, "disableStylesGeneration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
      
      @scala.inline
      def setManagers(value: Managers): Self = StObject.set(x, "managers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagersUndefined: Self = StObject.set(x, "managers", js.undefined)
      
      @scala.inline
      def setRegistry(value: SheetsRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
      
      @scala.inline
      def setSheetOptions(value: StyleSheetFactoryOptions): Self = StObject.set(x, "sheetOptions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InnerRef extends StObject {
    
    var innerRef: js.UndefOr[RefObject[_] | (js.Function1[/* instance */ js.Any, Unit])] = js.native
  }
  object InnerRef {
    
    @scala.inline
    def apply(): InnerRef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InnerRef]
    }
    
    @scala.inline
    implicit class InnerRefMutableBuilder[Self <: InnerRef] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInnerRef(value: RefObject[_] | (js.Function1[/* instance */ js.Any, Unit])): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ js.Any => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
    }
  }
}
