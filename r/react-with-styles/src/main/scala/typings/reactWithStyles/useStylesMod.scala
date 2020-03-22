package typings.reactWithStyles

import typings.reactWithStyles.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-with-styles/lib/hooks/useStyles", JSImport.Namespace)
@js.native
object useStylesMod extends js.Object {
  def default[TStyles /* <: Styles */](hasStylesFn: AnonStylesFn[TStyles]): AnonCss[TStyles] = js.native
}

