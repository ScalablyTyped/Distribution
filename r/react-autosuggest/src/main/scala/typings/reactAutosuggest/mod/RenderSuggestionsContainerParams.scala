package typings.reactAutosuggest.mod

import typings.react.mod.ReactNode
import typings.reactAutosuggest.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderSuggestionsContainerParams extends StObject {
  
  var children: ReactNode
  
  var containerProps: ClassName
  
  var query: String
}
object RenderSuggestionsContainerParams {
  
  @scala.inline
  def apply(containerProps: ClassName, query: String): RenderSuggestionsContainerParams = {
    val __obj = js.Dynamic.literal(containerProps = containerProps.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderSuggestionsContainerParams]
  }
  
  @scala.inline
  implicit class RenderSuggestionsContainerParamsMutableBuilder[Self <: RenderSuggestionsContainerParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setContainerProps(value: ClassName): Self = StObject.set(x, "containerProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
