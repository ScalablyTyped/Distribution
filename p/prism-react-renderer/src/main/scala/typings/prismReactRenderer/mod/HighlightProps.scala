package typings.prismReactRenderer.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightProps extends StObject {
  
  var Prism: PrismLib
  
  def children(props: RenderProps): ReactNode
  
  var code: String
  
  var language: Language
  
  var theme: js.UndefOr[PrismTheme] = js.undefined
}
object HighlightProps {
  
  @scala.inline
  def apply(Prism: PrismLib, children: RenderProps => ReactNode, code: String, language: Language): HighlightProps = {
    val __obj = js.Dynamic.literal(Prism = Prism.asInstanceOf[js.Any], children = js.Any.fromFunction1(children), code = code.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightProps]
  }
  
  @scala.inline
  implicit class HighlightPropsMutableBuilder[Self <: HighlightProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: RenderProps => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrism(value: PrismLib): Self = StObject.set(x, "Prism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: PrismTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
