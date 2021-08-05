package typings.semanticUiReact

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.react.mod.StatelessComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchCategoryLayoutMod extends Shortcut {
  
  @JSImport("semantic-ui-react/dist/commonjs/modules/Search/SearchCategoryLayout", JSImport.Default)
  @js.native
  val default: StatelessComponent[SearchCategoryLayoutProps] = js.native
  
  trait SearchCategoryLayoutProps
    extends StObject
       with StrictSearchCategoryLayoutProps
       with /* key */ StringDictionary[js.Any]
  object SearchCategoryLayoutProps {
    
    inline def apply(categoryContent: ReactElement, resultsContent: ReactElement): SearchCategoryLayoutProps = {
      val __obj = js.Dynamic.literal(categoryContent = categoryContent.asInstanceOf[js.Any], resultsContent = resultsContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[SearchCategoryLayoutProps]
    }
  }
  
  trait StrictSearchCategoryLayoutProps extends StObject {
    
    /** The rendered category content */
    var categoryContent: ReactElement
    
    /** The rendered results content */
    var resultsContent: ReactElement
  }
  object StrictSearchCategoryLayoutProps {
    
    inline def apply(categoryContent: ReactElement, resultsContent: ReactElement): StrictSearchCategoryLayoutProps = {
      val __obj = js.Dynamic.literal(categoryContent = categoryContent.asInstanceOf[js.Any], resultsContent = resultsContent.asInstanceOf[js.Any])
      __obj.asInstanceOf[StrictSearchCategoryLayoutProps]
    }
    
    extension [Self <: StrictSearchCategoryLayoutProps](x: Self) {
      
      inline def setCategoryContent(value: ReactElement): Self = StObject.set(x, "categoryContent", value.asInstanceOf[js.Any])
      
      inline def setResultsContent(value: ReactElement): Self = StObject.set(x, "resultsContent", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = StatelessComponent[SearchCategoryLayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `searchCategoryLayoutMod.foo` */
  override def _to: StatelessComponent[SearchCategoryLayoutProps] = default
}
