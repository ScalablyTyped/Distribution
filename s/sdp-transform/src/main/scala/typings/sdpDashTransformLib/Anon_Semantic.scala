package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Semantic extends js.Object {
  var semantic: java.lang.String
  var token: java.lang.String
}

object Anon_Semantic {
  @scala.inline
  def apply(semantic: java.lang.String, token: java.lang.String): Anon_Semantic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("semantic")(semantic)
    __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[Anon_Semantic]
  }
}

