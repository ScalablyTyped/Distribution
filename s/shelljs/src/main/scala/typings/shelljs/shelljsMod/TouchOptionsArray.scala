package typings.shelljs.shelljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TouchOptionsArray extends js.Object {
  var `-d`: js.UndefOr[String] = js.undefined
  var `-r`: js.UndefOr[String] = js.undefined
}

object TouchOptionsArray {
  @scala.inline
  def apply(`-d`: String = null, `-r`: String = null): TouchOptionsArray = {
    val __obj = js.Dynamic.literal()
    if (`-d` != null) __obj.updateDynamic("-d")(`-d`.asInstanceOf[js.Any])
    if (`-r` != null) __obj.updateDynamic("-r")(`-r`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TouchOptionsArray]
  }
}

