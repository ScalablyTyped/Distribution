package typings
package spexLib.spexMod.spexNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrors extends js.Object {
  var BatchError: IBatchError
  var PageError: IPageError
  var SequenceError: ISequenceError
}

object IErrors {
  @scala.inline
  def apply(BatchError: IBatchError, PageError: IPageError, SequenceError: ISequenceError): IErrors = {
    val __obj = js.Dynamic.literal(BatchError = BatchError, PageError = PageError, SequenceError = SequenceError)
  
    __obj.asInstanceOf[IErrors]
  }
}

