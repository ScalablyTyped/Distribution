package typings.resourceLoader.mod.MiniSignal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MiniSignalBinding extends js.Object {
  def detach(): Boolean
}

object MiniSignalBinding {
  @scala.inline
  def apply(detach: () => Boolean): MiniSignalBinding = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach))
  
    __obj.asInstanceOf[MiniSignalBinding]
  }
}

