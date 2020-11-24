package typings.reactFns.localesLocalesMod

import typings.react.mod.Component
import typings.reactFns.typesMod.SharedRenderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-fns/dist/Locales/Locales", "Locales")
@js.native
class Locales ()
  extends Component[SharedRenderProps[LocalesProps], LocalesProps, js.Any] {
  
  @JSName("componentDidMount")
  def componentDidMount_MLocales(): Unit = js.native
  
  @JSName("componentWillUnmount")
  def componentWillUnmount_MLocales(): Unit = js.native
  
  def handleLanguageChange(): Unit = js.native
  
  def preferredLocales(): String = js.native
}
