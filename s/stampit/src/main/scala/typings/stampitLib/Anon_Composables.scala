package typings
package stampitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Composables extends js.Object {
  var composables: js.Array[Composable]
  var stamp: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify stampit.Stamp */ js.Any
}

object Anon_Composables {
  @scala.inline
  def apply(
    composables: js.Array[Composable],
    stamp: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify stampit.Stamp */ js.Any
  ): Anon_Composables = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("composables")(composables)
    __obj.updateDynamic("stamp")(stamp)
    __obj.asInstanceOf[Anon_Composables]
  }
}

