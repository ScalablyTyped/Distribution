package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.localesLocalesMod.LocalesProps
import typings.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localesMod {
  
  @JSImport("react-fns/dist/Locales", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-fns/dist/Locales", "Locales")
  @js.native
  class Locales protected ()
    extends typings.reactFns.localesLocalesMod.Locales {
    def this(props: SharedRenderProps[LocalesProps]) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SharedRenderProps[LocalesProps], context: js.Any) = this()
  }
  
  @scala.inline
  def withLocales[Props](Component: ComponentType[Props & LocalesProps]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("withLocales")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
