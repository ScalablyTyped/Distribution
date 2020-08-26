package typings.spex.anon

import org.scalablytyped.runtime.Instantiable0
import typings.spex.mod.errors.BatchError
import typings.spex.mod.errors.PageError
import typings.spex.mod.errors.SequenceError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoferrors extends js.Object {
  // API: http://vitaly-t.github.io/spex/errors.BatchError.html
  var BatchError: Instantiable0[typings.spex.mod.errors.BatchError] = js.native
  // API: http://vitaly-t.github.io/spex/errors.PageError.html
  var PageError: Instantiable0[typings.spex.mod.errors.PageError] = js.native
  // API: http://vitaly-t.github.io/spex/errors.SequenceError.html
  var SequenceError: Instantiable0[typings.spex.mod.errors.SequenceError] = js.native
}

object Typeoferrors {
  @scala.inline
  def apply(
    BatchError: Instantiable0[BatchError],
    PageError: Instantiable0[PageError],
    SequenceError: Instantiable0[SequenceError]
  ): Typeoferrors = {
    val __obj = js.Dynamic.literal(BatchError = BatchError.asInstanceOf[js.Any], PageError = PageError.asInstanceOf[js.Any], SequenceError = SequenceError.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeoferrors]
  }
  @scala.inline
  implicit class TypeoferrorsOps[Self <: Typeoferrors] (val x: Self) extends AnyVal {
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
    def setBatchError(value: Instantiable0[BatchError]): Self = this.set("BatchError", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageError(value: Instantiable0[PageError]): Self = this.set("PageError", value.asInstanceOf[js.Any])
    @scala.inline
    def setSequenceError(value: Instantiable0[SequenceError]): Self = this.set("SequenceError", value.asInstanceOf[js.Any])
  }
  
}

