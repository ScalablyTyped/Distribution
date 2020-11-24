package typings.pulumiAws.getBrokerMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.mq.GetBrokerLogs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBrokerArgs extends js.Object {
  
  /**
    * The unique id of the mq broker.
    */
  val brokerId: js.UndefOr[String] = js.native
  
  /**
    * The unique name of the mq broker.
    */
  val brokerName: js.UndefOr[String] = js.native
  
  val logs: js.UndefOr[GetBrokerLogs] = js.native
  
  val tags: js.UndefOr[StringDictionary[String]] = js.native
}
object GetBrokerArgs {
  
  @scala.inline
  def apply(): GetBrokerArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBrokerArgs]
  }
  
  @scala.inline
  implicit class GetBrokerArgsOps[Self <: GetBrokerArgs] (val x: Self) extends AnyVal {
    
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
    def setBrokerId(value: String): Self = this.set("brokerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerId: Self = this.set("brokerId", js.undefined)
    
    @scala.inline
    def setBrokerName(value: String): Self = this.set("brokerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrokerName: Self = this.set("brokerName", js.undefined)
    
    @scala.inline
    def setLogs(value: GetBrokerLogs): Self = this.set("logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogs: Self = this.set("logs", js.undefined)
    
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
