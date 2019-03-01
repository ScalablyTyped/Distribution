package typings
package siestaLib.SiestaNs.HarnessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITestUrlDescriptor extends js.Object {
  var url: java.lang.String
}

object ITestUrlDescriptor {
  @scala.inline
  def apply(url: java.lang.String): ITestUrlDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ITestUrlDescriptor]
  }
}

