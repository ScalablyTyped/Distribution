package typings
package semanticDashUiDashShapeLib.SemanticUINs.ShapeNs.ErrorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'The method you called is not defined'
    */
  var method: java.lang.String
  /**
    * @default 'You tried to switch to a side that does not exist.'
    */
  var side: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(method: java.lang.String, side: java.lang.String): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("side")(side)
    __obj.asInstanceOf[_Impl]
  }
}

