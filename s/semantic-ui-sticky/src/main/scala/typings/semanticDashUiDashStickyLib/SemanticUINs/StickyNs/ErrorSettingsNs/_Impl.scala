package typings
package semanticDashUiDashStickyLib.SemanticUINs.StickyNs.ErrorSettingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'Sticky element must be inside a relative container'
    */
  var container: java.lang.String
  /**
    * @default 'Sticky element is larger than its container, cannot create sticky.'
    */
  var elementSize: java.lang.String
  /**
    * @default 'Context specified does not exist'
    */
  var invalidContext: java.lang.String
  /**
    * @default 'The method you called is not defined.'
    */
  var method: java.lang.String
  /**
    * @default 'Element is hidden, you must call refresh after element becomes visible'
    */
  var visible: java.lang.String
}

object _Impl {
  @scala.inline
  def apply(
    container: java.lang.String,
    elementSize: java.lang.String,
    invalidContext: java.lang.String,
    method: java.lang.String,
    visible: java.lang.String
  ): _Impl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("container")(container)
    __obj.updateDynamic("elementSize")(elementSize)
    __obj.updateDynamic("invalidContext")(invalidContext)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[_Impl]
  }
}

