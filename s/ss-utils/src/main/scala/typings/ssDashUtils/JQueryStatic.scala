package typings.ssDashUtils

import typings.ssDashUtils.ssutils.Static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var ss: Static
}

object JQueryStatic {
  @scala.inline
  def apply(ss: Static): JQueryStatic = {
    val __obj = js.Dynamic.literal(ss = ss)
  
    __obj.asInstanceOf[JQueryStatic]
  }
}

