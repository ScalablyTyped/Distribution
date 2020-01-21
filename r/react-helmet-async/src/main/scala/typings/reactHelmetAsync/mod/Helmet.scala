package typings.reactHelmetAsync.mod

import typings.reactHelmet.mod.HelmetData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-helmet-async", "Helmet")
@js.native
class Helmet ()
  extends typings.reactHelmet.mod.Helmet

/* static members */
@JSImport("react-helmet-async", "Helmet")
@js.native
object Helmet extends js.Object {
  var canUseDOM: Boolean = js.native
  def peek(): HelmetData = js.native
  def renderStatic(): HelmetData = js.native
  def rewind(): HelmetData = js.native
}

