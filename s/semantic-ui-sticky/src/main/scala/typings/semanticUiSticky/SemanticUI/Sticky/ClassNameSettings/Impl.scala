package typings.semanticUiSticky.SemanticUI.Sticky.ClassNameSettings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Impl extends js.Object {
  /**
    * @default 'bottom'
    */
  var bottom: String = js.native
  /**
    * @default 'bound'
    */
  var bound: String = js.native
  /**
    * @default 'fixed'
    */
  var fixed: String = js.native
  /**
    * @default 'native'
    */
  var supported: String = js.native
  /**
    * @default 'top'
    */
  var top: String = js.native
}

object Impl {
  @scala.inline
  def apply(bottom: String, bound: String, fixed: String, supported: String, top: String): Impl = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bound = bound.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], supported = supported.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
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
    def setBottom(value: String): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setBound(value: String): Self = this.set("bound", value.asInstanceOf[js.Any])
    @scala.inline
    def setFixed(value: String): Self = this.set("fixed", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupported(value: String): Self = this.set("supported", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: String): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

