package typings.reactNative.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Commands extends js.Object {
  var Commands: StringDictionary[Double] = js.native
}

object Commands {
  @scala.inline
  def apply(Commands: StringDictionary[Double]): Commands = {
    val __obj = js.Dynamic.literal(Commands = Commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commands]
  }
  @scala.inline
  implicit class CommandsOps[Self <: Commands] (val x: Self) extends AnyVal {
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
    def setCommands(value: StringDictionary[Double]): Self = this.set("Commands", value.asInstanceOf[js.Any])
  }
  
}

