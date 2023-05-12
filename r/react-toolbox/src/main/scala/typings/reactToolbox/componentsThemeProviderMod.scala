package typings.reactToolbox

import typings.reactCssThemr.mod.ThemeProvider
import typings.reactCssThemr.mod.ThemeProviderProps
import typings.reactToolbox.anon.ReadonlyThemeProviderProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsThemeProviderMod {
  
  @JSImport("react-toolbox/components/ThemeProvider", JSImport.Default)
  @js.native
  open class default protected () extends ThemeProvider {
    def this(props: ThemeProviderProps) = this()
    def this(props: ReadonlyThemeProviderProp) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: ThemeProviderProps, context: Any) = this()
  }
}
