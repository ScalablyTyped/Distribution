package typings.reactDashHelmet.reactDashHelmetMod

import typings.react.reactMod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-helmet", "Helmet")
@js.native
class Helmet ()
  extends Component[HelmetProps, js.Object, js.Any]

/* static members */
@JSImport("react-helmet", "Helmet")
@js.native
object Helmet extends js.Object {
  var canUseDOM: Boolean = js.native
  def peek(): HelmetData = js.native
  def renderStatic(): HelmetData = js.native
  def rewind(): HelmetData = js.native
}

