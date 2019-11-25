package typings.siesta.Siesta.Harness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITestUrlDescriptor extends js.Object {
  var url: String
}

object ITestUrlDescriptor {
  @scala.inline
  def apply(url: String): ITestUrlDescriptor = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ITestUrlDescriptor]
  }
}

