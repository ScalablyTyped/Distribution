package typings.readableDashStream

import typings.readableDashStream.readableDashStreamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterTransform extends js.Object {
  var needTransform: Boolean
  var transforming: Boolean
  var writecb: (js.Function1[/* err */ js.Any, _]) | Null
  var writechunk: js.Any
   // TODO
  var writeencoding: String | Null
  def afterTransform(`this`: Transform, er: js.Any, data: js.Any): Unit | Boolean
}

object Anon_AfterTransform {
  @scala.inline
  def apply(
    afterTransform: (Transform, js.Any, js.Any) => Unit | Boolean,
    needTransform: Boolean,
    transforming: Boolean,
    writechunk: js.Any,
    writecb: /* err */ js.Any => _ = null,
    writeencoding: String = null
  ): Anon_AfterTransform = {
    val __obj = js.Dynamic.literal(afterTransform = js.Any.fromFunction3(afterTransform), needTransform = needTransform.asInstanceOf[js.Any], transforming = transforming.asInstanceOf[js.Any], writechunk = writechunk.asInstanceOf[js.Any])
    if (writecb != null) __obj.updateDynamic("writecb")(js.Any.fromFunction1(writecb))
    if (writeencoding != null) __obj.updateDynamic("writeencoding")(writeencoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AfterTransform]
  }
}

