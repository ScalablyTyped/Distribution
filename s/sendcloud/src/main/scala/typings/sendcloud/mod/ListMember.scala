package typings.sendcloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMember extends js.Object {
  var apiKey: String
  var apiUser: String
  def addListMember(mail_list_addr: String, member_addr: String, name: String, options: ListMemberAddOptions): js.Promise[ListMemberAddResposne]
  def addToOtherList(sourceList: String, targetList: String): js.Promise[js.Array[ListMemberAddResposne]]
  def deleteListMember(mail_list_addr: String, member_addr: String): js.Promise[ListMemberDeleteResposne]
  def getData(url: String, data: js.Object): js.Promise[js.Object]
  def getListMember(mail_list_addr: String, options: ListMemberListOptions): js.Promise[ListMemberListResponse]
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
}

