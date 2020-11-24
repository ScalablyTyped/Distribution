package typings.serverless.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PopulateService extends js.Object {
  
  def populateService(): js.Promise[_] = js.native
}
object PopulateService {
  
  @scala.inline
  def apply(populateService: () => js.Promise[_]): PopulateService = {
    val __obj = js.Dynamic.literal(populateService = js.Any.fromFunction0(populateService))
    __obj.asInstanceOf[PopulateService]
  }
  
  @scala.inline
  implicit class PopulateServiceOps[Self <: PopulateService] (val x: Self) extends AnyVal {
    
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
    def setPopulateService(value: () => js.Promise[_]): Self = this.set("populateService", js.Any.fromFunction0(value))
  }
}
