package typings.reactSpeechRecognition.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends js.Object {
  
  def callback(args: js.Any*): js.Any = js.native
  
  var command: String | RegExp = js.native
  
  var fuzzyMatchingThreshold: js.UndefOr[Double] = js.native
  
  var isFuzzyMatch: js.UndefOr[Boolean] = js.native
  
  var matchInterim: js.UndefOr[Boolean] = js.native
}
object Command {
  
  @scala.inline
  def apply(callback: /* repeated */ js.Any => js.Any, command: String | RegExp): Command = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction1(callback), command = command.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandOps[Self <: Command] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: /* repeated */ js.Any => js.Any): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommand(value: String | RegExp): Self = this.set("command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFuzzyMatchingThreshold(value: Double): Self = this.set("fuzzyMatchingThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFuzzyMatchingThreshold: Self = this.set("fuzzyMatchingThreshold", js.undefined)
    
    @scala.inline
    def setIsFuzzyMatch(value: Boolean): Self = this.set("isFuzzyMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFuzzyMatch: Self = this.set("isFuzzyMatch", js.undefined)
    
    @scala.inline
    def setMatchInterim(value: Boolean): Self = this.set("matchInterim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchInterim: Self = this.set("matchInterim", js.undefined)
  }
}
