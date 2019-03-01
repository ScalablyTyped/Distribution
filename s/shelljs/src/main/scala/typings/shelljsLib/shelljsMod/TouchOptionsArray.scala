package typings
package shelljsLib.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchOptionsArray extends js.Object {
  var `-d`: js.UndefOr[java.lang.String] = js.undefined
  var `-r`: js.UndefOr[java.lang.String] = js.undefined
}

object TouchOptionsArray {
  @scala.inline
  def apply(`-d`: java.lang.String = null, `-r`: java.lang.String = null): TouchOptionsArray = {
    val __obj = js.Dynamic.literal()
    if (`-d` != null) __obj.updateDynamic("-d")(`-d`)
    if (`-r` != null) __obj.updateDynamic("-r")(`-r`)
    __obj.asInstanceOf[TouchOptionsArray]
  }
}

