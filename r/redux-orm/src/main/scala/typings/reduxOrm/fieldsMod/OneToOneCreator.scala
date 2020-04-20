package typings.reduxOrm.fieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OneToOneCreator extends js.Object {
  def apply(opts: RelationalFieldOpts): OneToOne_ = js.native
  def apply(toModelName: String): OneToOne_ = js.native
  def apply(toModelName: String, relatedName: String): OneToOne_ = js.native
}

