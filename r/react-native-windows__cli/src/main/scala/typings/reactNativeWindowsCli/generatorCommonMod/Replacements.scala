package typings.reactNativeWindowsCli.generatorCommonMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Replacements
  extends /* key */ StringDictionary[js.Any] {
  
  var regExpPatternsToRemove: js.UndefOr[js.Array[RegExp]] = js.native
  
  var useMustache: js.UndefOr[Boolean] = js.native
}
object Replacements {
  
  @scala.inline
  def apply(): Replacements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Replacements]
  }
  
  @scala.inline
  implicit class ReplacementsOps[Self <: Replacements] (val x: Self) extends AnyVal {
    
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
    def setRegExpPatternsToRemoveVarargs(value: RegExp*): Self = this.set("regExpPatternsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setRegExpPatternsToRemove(value: js.Array[RegExp]): Self = this.set("regExpPatternsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegExpPatternsToRemove: Self = this.set("regExpPatternsToRemove", js.undefined)
    
    @scala.inline
    def setUseMustache(value: Boolean): Self = this.set("useMustache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMustache: Self = this.set("useMustache", js.undefined)
  }
}
