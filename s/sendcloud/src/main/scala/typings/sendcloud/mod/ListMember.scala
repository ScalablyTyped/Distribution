package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListMember extends js.Object {
  
  def addListMember(mail_list_addr: String, member_addr: String, name: String, options: ListMemberAddOptions): js.Promise[ListMemberAddResposne] = js.native
  
  def addToOtherList(sourceList: String, targetList: String): js.Promise[js.Array[ListMemberAddResposne]] = js.native
  
  var apiKey: String = js.native
  
  var apiUser: String = js.native
  
  def deleteListMember(mail_list_addr: String, member_addr: String): js.Promise[ListMemberDeleteResposne] = js.native
  
  def getData(url: String, data: js.Object): js.Promise[js.Object] = js.native
  
  def getListMember(mail_list_addr: String, options: ListMemberListOptions): js.Promise[ListMemberListResponse] = js.native
}
object ListMember {
  
  @scala.inline
  def apply(
    addListMember: (String, String, String, ListMemberAddOptions) => js.Promise[ListMemberAddResposne],
    addToOtherList: (String, String) => js.Promise[js.Array[ListMemberAddResposne]],
    apiKey: String,
    apiUser: String,
    deleteListMember: (String, String) => js.Promise[ListMemberDeleteResposne],
    getData: (String, js.Object) => js.Promise[js.Object],
    getListMember: (String, ListMemberListOptions) => js.Promise[ListMemberListResponse]
  ): ListMember = {
    val __obj = js.Dynamic.literal(addListMember = js.Any.fromFunction4(addListMember), addToOtherList = js.Any.fromFunction2(addToOtherList), apiKey = apiKey.asInstanceOf[js.Any], apiUser = apiUser.asInstanceOf[js.Any], deleteListMember = js.Any.fromFunction2(deleteListMember), getData = js.Any.fromFunction2(getData), getListMember = js.Any.fromFunction2(getListMember))
    __obj.asInstanceOf[ListMember]
  }
  
  @scala.inline
  implicit class ListMemberOps[Self <: ListMember] (val x: Self) extends AnyVal {
    
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
    def setAddListMember(value: (String, String, String, ListMemberAddOptions) => js.Promise[ListMemberAddResposne]): Self = this.set("addListMember", js.Any.fromFunction4(value))
    
    @scala.inline
    def setAddToOtherList(value: (String, String) => js.Promise[js.Array[ListMemberAddResposne]]): Self = this.set("addToOtherList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApiKey(value: String): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiUser(value: String): Self = this.set("apiUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteListMember(value: (String, String) => js.Promise[ListMemberDeleteResposne]): Self = this.set("deleteListMember", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetData(value: (String, js.Object) => js.Promise[js.Object]): Self = this.set("getData", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetListMember(value: (String, ListMemberListOptions) => js.Promise[ListMemberListResponse]): Self = this.set("getListMember", js.Any.fromFunction2(value))
  }
}
