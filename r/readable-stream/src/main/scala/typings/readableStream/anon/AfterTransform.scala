package typings.readableStream.anon

import typings.node.BufferEncoding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterTransform extends js.Object {
  var needTransform: Boolean = js.native
  var transforming: Boolean = js.native
  var writecb: (js.Function1[/* err */ js.Any, _]) | Null = js.native
  var writechunk: js.Any = js.native
   // TODO
  var writeencoding: BufferEncoding | Null = js.native
  def afterTransform(er: js.Any, data: js.Any): Unit | Boolean = js.native
}

object AfterTransform {
  @scala.inline
  def apply(
    afterTransform: (js.Any, js.Any) => Unit | Boolean,
    needTransform: Boolean,
    transforming: Boolean,
    writechunk: js.Any
  ): AfterTransform = {
    val __obj = js.Dynamic.literal(afterTransform = js.Any.fromFunction2(afterTransform), needTransform = needTransform.asInstanceOf[js.Any], transforming = transforming.asInstanceOf[js.Any], writechunk = writechunk.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterTransform]
  }
  @scala.inline
  implicit class AfterTransformOps[Self <: AfterTransform] (val x: Self) extends AnyVal {
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
    def setAfterTransform(value: (js.Any, js.Any) => Unit | Boolean): Self = this.set("afterTransform", js.Any.fromFunction2(value))
    @scala.inline
    def setNeedTransform(value: Boolean): Self = this.set("needTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def setTransforming(value: Boolean): Self = this.set("transforming", value.asInstanceOf[js.Any])
    @scala.inline
    def setWritechunk(value: js.Any): Self = this.set("writechunk", value.asInstanceOf[js.Any])
    @scala.inline
    def setWritecb(value: /* err */ js.Any => _): Self = this.set("writecb", js.Any.fromFunction1(value))
    @scala.inline
    def setWritecbNull: Self = this.set("writecb", null)
    @scala.inline
    def setWriteencoding(value: BufferEncoding): Self = this.set("writeencoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setWriteencodingNull: Self = this.set("writeencoding", null)
  }
  
}

