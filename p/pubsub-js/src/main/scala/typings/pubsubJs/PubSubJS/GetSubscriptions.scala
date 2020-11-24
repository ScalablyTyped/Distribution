package typings.pubsubJs.PubSubJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSubscriptions extends js.Object {
  
  def getSubscriptions(token: js.Any): js.Array[_] = js.native
}
object GetSubscriptions {
  
  @scala.inline
  def apply(getSubscriptions: js.Any => js.Array[_]): GetSubscriptions = {
    val __obj = js.Dynamic.literal(getSubscriptions = js.Any.fromFunction1(getSubscriptions))
    __obj.asInstanceOf[GetSubscriptions]
  }
  
  @scala.inline
  implicit class GetSubscriptionsOps[Self <: GetSubscriptions] (val x: Self) extends AnyVal {
    
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
    def setGetSubscriptions(value: js.Any => js.Array[_]): Self = this.set("getSubscriptions", js.Any.fromFunction1(value))
  }
}
