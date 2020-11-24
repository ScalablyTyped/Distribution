package typings.simperium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Authorize extends js.Object {
  
  def authorize(username: String, password: String): js.Promise[Accesstoken] = js.native
  
  def create(username: String, password: String): js.Promise[Accesstoken] = js.native
}
object Authorize {
  
  @scala.inline
  def apply(
    authorize: (String, String) => js.Promise[Accesstoken],
    create: (String, String) => js.Promise[Accesstoken]
  ): Authorize = {
    val __obj = js.Dynamic.literal(authorize = js.Any.fromFunction2(authorize), create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[Authorize]
  }
  
  @scala.inline
  implicit class AuthorizeOps[Self <: Authorize] (val x: Self) extends AnyVal {
    
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
    def setAuthorize(value: (String, String) => js.Promise[Accesstoken]): Self = this.set("authorize", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCreate(value: (String, String) => js.Promise[Accesstoken]): Self = this.set("create", js.Any.fromFunction2(value))
  }
}
