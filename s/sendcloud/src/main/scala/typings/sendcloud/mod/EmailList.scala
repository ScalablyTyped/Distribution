package typings.sendcloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailList extends StObject {
  
  var apiKey: String = js.native
  
  var apiUser: String = js.native
  
  def createEmailList(address: String, name: String, options: EmailListCreateOptions): js.Promise[EmailListCreateResponse] = js.native
  
  def getData(url: String, data: js.Object): js.Promise[js.Object] = js.native
  
  def getEmailList(): js.Promise[EmailListResponse] = js.native
  def getEmailList(data: EmailListListData): js.Promise[EmailListResponse] = js.native
  
  def updateEmailList(address: String, options: EmailListUpdateOptions): js.Promise[EmailListUpdateResponse] = js.native
  
  def updateListMember(mail_list_addr: String, member_addr: String, name: String, options: ListMemberUpdateOptions): js.Promise[ListMemberAddResposne] = js.native
}
