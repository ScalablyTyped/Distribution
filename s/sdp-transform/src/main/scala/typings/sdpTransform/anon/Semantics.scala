package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Semantics extends js.Object {
  var semantics: String
  var ssrcs: String
}

object Semantics {
  @scala.inline
  def apply(semantics: String, ssrcs: String): Semantics = {
    val __obj = js.Dynamic.literal(semantics = semantics.asInstanceOf[js.Any], ssrcs = ssrcs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Semantics]
  }
}

