package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Semantics extends js.Object {
  var semantics: java.lang.String
  var ssrcs: java.lang.String
}

object Anon_Semantics {
  @scala.inline
  def apply(semantics: java.lang.String, ssrcs: java.lang.String): Anon_Semantics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("semantics")(semantics)
    __obj.updateDynamic("ssrcs")(ssrcs)
    __obj.asInstanceOf[Anon_Semantics]
  }
}

