package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Types extends js.Object {
  
  var map: StringDictionary[Type] = js.native
  
  def register(`type`: Type): Unit = js.native
}
object Types {
  
  @scala.inline
  def apply(map: StringDictionary[Type], register: Type => Unit): Types = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], register = js.Any.fromFunction1(register))
    __obj.asInstanceOf[Types]
  }
  
  @scala.inline
  implicit class TypesOps[Self <: Types] (val x: Self) extends AnyVal {
    
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
    def setMap(value: StringDictionary[Type]): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegister(value: Type => Unit): Self = this.set("register", js.Any.fromFunction1(value))
  }
}
