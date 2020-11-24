package typings.socketIo.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Except extends js.Object {
  
  var except: js.UndefOr[js.Array[String]] = js.native
  
  var flags: js.UndefOr[StringDictionary[Boolean]] = js.native
  
  var rooms: js.UndefOr[js.Array[String]] = js.native
}
object Except {
  
  @scala.inline
  def apply(): Except = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Except]
  }
  
  @scala.inline
  implicit class ExceptOps[Self <: Except] (val x: Self) extends AnyVal {
    
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
    def setExceptVarargs(value: String*): Self = this.set("except", js.Array(value :_*))
    
    @scala.inline
    def setExcept(value: js.Array[String]): Self = this.set("except", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcept: Self = this.set("except", js.undefined)
    
    @scala.inline
    def setFlags(value: StringDictionary[Boolean]): Self = this.set("flags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlags: Self = this.set("flags", js.undefined)
    
    @scala.inline
    def setRoomsVarargs(value: String*): Self = this.set("rooms", js.Array(value :_*))
    
    @scala.inline
    def setRooms(value: js.Array[String]): Self = this.set("rooms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRooms: Self = this.set("rooms", js.undefined)
  }
}
