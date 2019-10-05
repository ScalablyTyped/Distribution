package typings.semanticDashUiDashSticky.SemanticUI.Sticky.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Impl extends js.Object {
  /**
    * @default 'Sticky element must be inside a relative container'
    */
  var container: String
  /**
    * @default 'Sticky element is larger than its container, cannot create sticky.'
    */
  var elementSize: String
  /**
    * @default 'Context specified does not exist'
    */
  var invalidContext: String
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String
  /**
    * @default 'Element is hidden, you must call refresh after element becomes visible'
    */
  var visible: String
}

object _Impl {
  @scala.inline
  def apply(container: String, elementSize: String, invalidContext: String, method: String, visible: String): _Impl = {
    val __obj = js.Dynamic.literal(container = container, elementSize = elementSize, invalidContext = invalidContext, method = method, visible = visible)
  
    __obj.asInstanceOf[_Impl]
  }
}

