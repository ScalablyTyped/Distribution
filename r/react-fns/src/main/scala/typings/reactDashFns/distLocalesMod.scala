package typings.reactDashFns

import typings.react.reactMod.ComponentType
import typings.reactDashFns.distLocalesLocalesMod.LocalesProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-fns/dist/Locales", JSImport.Namespace)
@js.native
object distLocalesMod extends js.Object {
  @js.native
  class Locales ()
    extends typings.reactDashFns.distLocalesLocalesMod.Locales
  
  def withLocales[Props](Component: ComponentType[Props with LocalesProps]): ComponentType[Props] = js.native
}

