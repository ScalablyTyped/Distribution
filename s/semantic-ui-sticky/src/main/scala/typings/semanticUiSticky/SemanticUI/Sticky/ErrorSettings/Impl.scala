package typings.semanticUiSticky.SemanticUI.Sticky.ErrorSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'Sticky element must be inside a relative container'
    */
  var container: String = js.native
  /**
    * @default 'Sticky element is larger than its container, cannot create sticky.'
    */
  var elementSize: String = js.native
  /**
    * @default 'Context specified does not exist'
    */
  var invalidContext: String = js.native
  /**
    * @default 'The method you called is not defined.'
    */
  var method: String = js.native
  /**
    * @default 'Element is hidden, you must call refresh after element becomes visible'
    */
  var visible: String = js.native
}

object Impl {
  @scala.inline
  def apply(container: String, elementSize: String, invalidContext: String, method: String, visible: String): Impl = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], elementSize = elementSize.asInstanceOf[js.Any], invalidContext = invalidContext.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[Impl]
  }
  @scala.inline
  implicit class ImplOps[Self <: Impl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementSize(value: String): Self = this.set("elementSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvalidContext(value: String): Self = this.set("invalidContext", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: String): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
  
}

