package typings.sendcloud.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMember extends StObject {
  
  def addListMember(mail_list_addr: String, member_addr: String, name: String, options: ListMemberAddOptions): js.Promise[ListMemberAddResposne]
  
  def addToOtherList(sourceList: String, targetList: String): js.Promise[js.Array[ListMemberAddResposne]]
  
  var apiKey: String
  
  var apiUser: String
  
  def deleteListMember(mail_list_addr: String, member_addr: String): js.Promise[ListMemberDeleteResposne]
  
  def getData(url: String, data: js.Object): js.Promise[js.Object]
  
  def getListMember(mail_list_addr: String, options: ListMemberListOptions): js.Promise[ListMemberListResponse]
}
object ListMember {
  
  inline def apply(
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
  
  extension [Self <: ListMember](x: Self) {
    
    inline def setAddListMember(value: (String, String, String, ListMemberAddOptions) => js.Promise[ListMemberAddResposne]): Self = StObject.set(x, "addListMember", js.Any.fromFunction4(value))
    
    inline def setAddToOtherList(value: (String, String) => js.Promise[js.Array[ListMemberAddResposne]]): Self = StObject.set(x, "addToOtherList", js.Any.fromFunction2(value))
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApiUser(value: String): Self = StObject.set(x, "apiUser", value.asInstanceOf[js.Any])
    
    inline def setDeleteListMember(value: (String, String) => js.Promise[ListMemberDeleteResposne]): Self = StObject.set(x, "deleteListMember", js.Any.fromFunction2(value))
    
    inline def setGetData(value: (String, js.Object) => js.Promise[js.Object]): Self = StObject.set(x, "getData", js.Any.fromFunction2(value))
    
    inline def setGetListMember(value: (String, ListMemberListOptions) => js.Promise[ListMemberListResponse]): Self = StObject.set(x, "getListMember", js.Any.fromFunction2(value))
  }
}
