package typings.rest.registryMod

import typings.when.When.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MIMEConverter extends js.Object {
  
  def read(value: String): js.Any | Promise[_] = js.native
  
  def write(value: js.Any): String | Promise[String] = js.native
}
object MIMEConverter {
  
  @scala.inline
  def apply(read: String => js.Any | Promise[_], write: js.Any => String | Promise[String]): MIMEConverter = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read), write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[MIMEConverter]
  }
  
  @scala.inline
  implicit class MIMEConverterOps[Self <: MIMEConverter] (val x: Self) extends AnyVal {
    
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
    def setRead(value: String => js.Any | Promise[_]): Self = this.set("read", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWrite(value: js.Any => String | Promise[String]): Self = this.set("write", js.Any.fromFunction1(value))
  }
}
