package typings.querystringify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("querystringify", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def parse(query: String): js.Object = js.native
  def stringify(obj: js.Object): String = js.native
  def stringify(obj: js.Object, prefix: String): String = js.native
  def stringify(obj: js.Object, prefix: Boolean): String = js.native
}

