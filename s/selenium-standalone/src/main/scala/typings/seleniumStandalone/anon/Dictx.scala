package typings.seleniumStandalone.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dictx
  extends /* x */ StringDictionary[js.Any] {
  var installPath: String = js.native
}

object Dictx {
  @scala.inline
  def apply(installPath: String): Dictx = {
    val __obj = js.Dynamic.literal(installPath = installPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictx]
  }
  @scala.inline
  implicit class DictxOps[Self <: Dictx] (val x: Self) extends AnyVal {
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
    def setInstallPath(value: String): Self = this.set("installPath", value.asInstanceOf[js.Any])
  }
  
}

