package typings.sourceDashMap.sourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mapping extends js.Object {
  var generated: Position
  var name: js.UndefOr[String] = js.undefined
  var original: Position
  var source: String
}

object Mapping {
  @scala.inline
  def apply(generated: Position, original: Position, source: String, name: String = null): Mapping = {
    val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mapping]
  }
}

