package typings.shiki.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlighterOptions extends StObject {
  
  /**
    * A list of languages to load upfront.
    *
    * Default to all the bundled languages.
    */
  var langs: js.UndefOr[js.Array[Lang | ILanguageRegistration]] = js.undefined
  
  /**
    * Paths for loading themes and langs. Relative to the package's root.
    */
  var paths: js.UndefOr[IHighlighterPaths] = js.undefined
  
  /**
    * The theme to load upfront.
    */
  var theme: js.UndefOr[IThemeRegistration] = js.undefined
  
  /**
    * A list of themes to load upfront.
    *
    * Default to: `['dark-plus', 'light-plus']`
    */
  var themes: js.UndefOr[js.Array[IThemeRegistration]] = js.undefined
}
object HighlighterOptions {
  
  inline def apply(): HighlighterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HighlighterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HighlighterOptions] (val x: Self) extends AnyVal {
    
    inline def setLangs(value: js.Array[Lang | ILanguageRegistration]): Self = StObject.set(x, "langs", value.asInstanceOf[js.Any])
    
    inline def setLangsUndefined: Self = StObject.set(x, "langs", js.undefined)
    
    inline def setLangsVarargs(value: (Lang | ILanguageRegistration)*): Self = StObject.set(x, "langs", js.Array(value*))
    
    inline def setPaths(value: IHighlighterPaths): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setTheme(value: IThemeRegistration): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setThemes(value: js.Array[IThemeRegistration]): Self = StObject.set(x, "themes", value.asInstanceOf[js.Any])
    
    inline def setThemesUndefined: Self = StObject.set(x, "themes", js.undefined)
    
    inline def setThemesVarargs(value: IThemeRegistration*): Self = StObject.set(x, "themes", js.Array(value*))
  }
}
