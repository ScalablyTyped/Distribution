package typings
package sourceDashMapLib.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mapping extends js.Object {
  var generated: Position
  var name: js.UndefOr[java.lang.String] = js.undefined
  var original: Position
  var source: java.lang.String
}

object Mapping {
  @scala.inline
  def apply(generated: Position, original: Position, source: java.lang.String, name: java.lang.String = null): Mapping = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generated")(generated)
    __obj.updateDynamic("original")(original)
    __obj.updateDynamic("source")(source)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Mapping]
  }
}

