package typings.sanctuary.mod

import typings.sanctuary.sanctuaryStrings.sanctuarySlashMaybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Maybe[A] extends js.Object {
  
  var `@@type`: sanctuarySlashMaybe = js.native
}
object Maybe {
  
  @scala.inline
  def apply[A](`@@type`: sanctuarySlashMaybe): Maybe[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@@type")(`@@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Maybe[A]]
  }
  
  @scala.inline
  implicit class MaybeOps[Self <: Maybe[_], A] (val x: Self with Maybe[A]) extends AnyVal {
    
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
    def `set@@type`(value: sanctuarySlashMaybe): Self = this.set("@@type", value.asInstanceOf[js.Any])
  }
}
