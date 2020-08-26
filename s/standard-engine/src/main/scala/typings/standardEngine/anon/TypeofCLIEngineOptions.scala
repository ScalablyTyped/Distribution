package typings.standardEngine.anon

import org.scalablytyped.runtime.Instantiable0
import typings.eslint.mod.CLIEngine.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCLIEngineOptions extends js.Object {
  var Options: Instantiable0[typings.eslint.mod.CLIEngine.Options] = js.native
}

object TypeofCLIEngineOptions {
  @scala.inline
  def apply(Options: Instantiable0[Options]): TypeofCLIEngineOptions = {
    val __obj = js.Dynamic.literal(Options = Options.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofCLIEngineOptions]
  }
  @scala.inline
  implicit class TypeofCLIEngineOptionsOps[Self <: TypeofCLIEngineOptions] (val x: Self) extends AnyVal {
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
    def setOptions(value: Instantiable0[Options]): Self = this.set("Options", value.asInstanceOf[js.Any])
  }
  
}

