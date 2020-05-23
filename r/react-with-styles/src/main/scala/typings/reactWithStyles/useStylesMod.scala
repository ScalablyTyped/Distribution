package typings.reactWithStyles

import typings.reactWithStyles.anon.Css
import typings.reactWithStyles.anon.StylesFn
import typings.reactWithStyles.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-with-styles/lib/hooks/useStyles", JSImport.Namespace)
@js.native
object useStylesMod extends js.Object {
  def default[TStyles /* <: Styles */](hasStylesFn: StylesFn[TStyles]): Css[TStyles] = js.native
}

