package typings.reactNative.mod

import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.ReactType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native", "createElement")
@js.native
object createElement extends js.Object {
  
  def apply[P](`type`: ReactType[_], props: P, children: ReactNode*): ReactElement = js.native
  def apply[P](`type`: ReactType[_], props: js.UndefOr[scala.Nothing], children: ReactNode*): ReactElement = js.native
}
