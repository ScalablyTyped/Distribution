package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SkewXTransform extends js.Object {
  var skewX: String = js.native
}

object SkewXTransform {
  @scala.inline
  def apply(skewX: String): SkewXTransform = {
    val __obj = js.Dynamic.literal(skewX = skewX.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkewXTransform]
  }
  @scala.inline
  implicit class SkewXTransformOps[Self <: SkewXTransform] (val x: Self) extends AnyVal {
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
    def setSkewX(value: String): Self = this.set("skewX", value.asInstanceOf[js.Any])
  }
  
}

