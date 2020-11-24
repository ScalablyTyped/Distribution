package typings.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Path
  extends /* key */ StringDictionary[js.Any] {
  
  var first: js.UndefOr[Id] = js.native
  
  var second: js.UndefOr[Id] = js.native
}
object Path {
  
  @scala.inline
  def apply(): Path = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Path]
  }
  
  @scala.inline
  implicit class PathOps[Self <: Path] (val x: Self) extends AnyVal {
    
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
    def setFirst(value: Id): Self = this.set("first", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirst: Self = this.set("first", js.undefined)
    
    @scala.inline
    def setSecond(value: Id): Self = this.set("second", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecond: Self = this.set("second", js.undefined)
  }
}
