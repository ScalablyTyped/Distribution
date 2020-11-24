package typings.reactFns

import typings.react.mod.ComponentType
import typings.reactFns.localesLocalesMod.LocalesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-fns/dist/Locales", JSImport.Namespace)
@js.native
object localesMod extends js.Object {
  
  def withLocales[Props](Component: ComponentType[Props with LocalesProps]): ComponentType[Props] = js.native
  
  @js.native
  class Locales ()
    extends typings.reactFns.localesLocalesMod.Locales
}
