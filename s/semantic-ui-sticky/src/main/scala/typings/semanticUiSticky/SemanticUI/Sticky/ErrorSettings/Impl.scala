package typings.semanticUiSticky.SemanticUI.Sticky.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Impl extends js.Object {
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

object Impl {
  @scala.inline
  def apply(container: String, elementSize: String, invalidContext: String, method: String, visible: String): Impl = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], elementSize = elementSize.asInstanceOf[js.Any], invalidContext = invalidContext.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Impl]
  }
}

