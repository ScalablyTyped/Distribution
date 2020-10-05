package typings.rcTrigger.popupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignRefType extends js.Object {
  def forceAlign(): Unit = js.native
}

object AlignRefType {
  @scala.inline
  def apply(forceAlign: () => Unit): AlignRefType = {
    val __obj = js.Dynamic.literal(forceAlign = js.Any.fromFunction0(forceAlign))
    __obj.asInstanceOf[AlignRefType]
  }
  @scala.inline
  implicit class AlignRefTypeOps[Self <: AlignRefType] (val x: Self) extends AnyVal {
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
    def setForceAlign(value: () => Unit): Self = this.set("forceAlign", js.Any.fromFunction0(value))
  }
  
}

