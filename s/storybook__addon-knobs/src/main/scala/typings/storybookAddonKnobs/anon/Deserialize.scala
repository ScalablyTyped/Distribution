package typings.storybookAddonKnobs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Deserialize extends js.Object {
  
  def deserialize(v: js.Any): js.Any = js.native
  
  def serialize(v: js.Any): js.Any = js.native
}
object Deserialize {
  
  @scala.inline
  def apply(deserialize: js.Any => js.Any, serialize: js.Any => js.Any): Deserialize = {
    val __obj = js.Dynamic.literal(deserialize = js.Any.fromFunction1(deserialize), serialize = js.Any.fromFunction1(serialize))
    __obj.asInstanceOf[Deserialize]
  }
  
  @scala.inline
  implicit class DeserializeOps[Self <: Deserialize] (val x: Self) extends AnyVal {
    
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
    def setDeserialize(value: js.Any => js.Any): Self = this.set("deserialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSerialize(value: js.Any => js.Any): Self = this.set("serialize", js.Any.fromFunction1(value))
  }
}
