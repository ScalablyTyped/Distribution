package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.localesLocalesMod.LocalesProps
import typings.reactFns.typesMod.SharedRenderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object localesMod {
  
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
  
  @JSImport("react-fns/dist/Locales", "withLocales")
  @js.native
  def withLocales[Props](Component: ComponentType[Props with LocalesProps]): ComponentType[Props] = js.native
}
