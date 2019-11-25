package typings.reactDashRelay

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  @JSName(" $data")
  val ` $data`: js.UndefOr[js.Any | Null] = js.undefined
}

object Anon_Data {
  @scala.inline
  def apply(` $data`: js.Any = null): Anon_Data = {
    val __obj = js.Dynamic.literal()
    if (` $data` != null) __obj.updateDynamic(" $data")(` $data`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data]
  }
}

