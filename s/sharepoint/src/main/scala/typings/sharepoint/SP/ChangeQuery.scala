package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeQuery extends ClientValueObject {
  
  def get_add(): Boolean = js.native
  
  def get_alert(): Boolean = js.native
  
  def get_changeTokenEnd(): ChangeToken = js.native
  
  def get_changeTokenStart(): ChangeToken = js.native
  
  def get_contentType(): Boolean = js.native
  
  def get_deleteObject(): Boolean = js.native
  
  def get_field(): Boolean = js.native
  
  def get_file(): Boolean = js.native
  
  def get_folder(): Boolean = js.native
  
  def get_group(): Boolean = js.native
  
  def get_groupMembershipAdd(): Boolean = js.native
  
  def get_groupMembershipDelete(): Boolean = js.native
  
  def get_item(): Boolean = js.native
  
  def get_list(): Boolean = js.native
  
  def get_move(): Boolean = js.native
  
  def get_navigation(): Boolean = js.native
  
  def get_rename(): Boolean = js.native
  
  def get_restore(): Boolean = js.native
  
  def get_roleAssignmentAdd(): Boolean = js.native
  
  def get_roleAssignmentDelete(): Boolean = js.native
  
  def get_roleDefinitionAdd(): Boolean = js.native
  
  def get_roleDefinitionDelete(): Boolean = js.native
  
  def get_roleDefinitionUpdate(): Boolean = js.native
  
  def get_securityPolicy(): Boolean = js.native
  
  def get_site(): Boolean = js.native
  
  def get_systemUpdate(): Boolean = js.native
  
  def get_update(): Boolean = js.native
  
  def get_user(): Boolean = js.native
  
  def get_view(): Boolean = js.native
  
  def get_web(): Boolean = js.native
  
  def set_add(value: Boolean): Unit = js.native
  
  def set_alert(value: Boolean): Unit = js.native
  
  def set_changeTokenEnd(value: ChangeToken): Unit = js.native
  
  def set_changeTokenStart(value: ChangeToken): Unit = js.native
  
  def set_contentType(value: Boolean): Unit = js.native
  
  def set_deleteObject(value: Boolean): Unit = js.native
  
  def set_field(value: Boolean): Unit = js.native
  
  def set_file(value: Boolean): Unit = js.native
  
  def set_folder(value: Boolean): Unit = js.native
  
  def set_group(value: Boolean): Unit = js.native
  
  def set_groupMembershipAdd(value: Boolean): Unit = js.native
  
  def set_groupMembershipDelete(value: Boolean): Unit = js.native
  
  def set_item(value: Boolean): Unit = js.native
  
  def set_list(value: Boolean): Unit = js.native
  
  def set_move(value: Boolean): Unit = js.native
  
  def set_navigation(value: Boolean): Unit = js.native
  
  def set_rename(value: Boolean): Unit = js.native
  
  def set_restore(value: Boolean): Unit = js.native
  
  def set_roleAssignmentAdd(value: Boolean): Unit = js.native
  
  def set_roleAssignmentDelete(value: Boolean): Unit = js.native
  
  def set_roleDefinitionAdd(value: Boolean): Unit = js.native
  
  def set_roleDefinitionDelete(value: Boolean): Unit = js.native
  
  def set_roleDefinitionUpdate(value: Boolean): Unit = js.native
  
  def set_securityPolicy(value: Boolean): Unit = js.native
  
  def set_site(value: Boolean): Unit = js.native
  
  def set_systemUpdate(value: Boolean): Unit = js.native
  
  def set_update(value: Boolean): Unit = js.native
  
  def set_user(value: Boolean): Unit = js.native
  
  def set_view(value: Boolean): Unit = js.native
  
  def set_web(value: Boolean): Unit = js.native
}
object ChangeQuery {
  
  @scala.inline
  def apply(
    customFromJson: js.Any => Boolean,
    customWriteToXml: (XmlWriter, SerializationContext) => Boolean,
    fromJson: js.Any => Unit,
    get_add: () => Boolean,
    get_alert: () => Boolean,
    get_changeTokenEnd: () => ChangeToken,
    get_changeTokenStart: () => ChangeToken,
    get_contentType: () => Boolean,
    get_deleteObject: () => Boolean,
    get_field: () => Boolean,
    get_file: () => Boolean,
    get_folder: () => Boolean,
    get_group: () => Boolean,
    get_groupMembershipAdd: () => Boolean,
    get_groupMembershipDelete: () => Boolean,
    get_item: () => Boolean,
    get_list: () => Boolean,
    get_move: () => Boolean,
    get_navigation: () => Boolean,
    get_rename: () => Boolean,
    get_restore: () => Boolean,
    get_roleAssignmentAdd: () => Boolean,
    get_roleAssignmentDelete: () => Boolean,
    get_roleDefinitionAdd: () => Boolean,
    get_roleDefinitionDelete: () => Boolean,
    get_roleDefinitionUpdate: () => Boolean,
    get_securityPolicy: () => Boolean,
    get_site: () => Boolean,
    get_systemUpdate: () => Boolean,
    get_typeId: () => String,
    get_update: () => Boolean,
    get_user: () => Boolean,
    get_view: () => Boolean,
    get_web: () => Boolean,
    set_add: Boolean => Unit,
    set_alert: Boolean => Unit,
    set_changeTokenEnd: ChangeToken => Unit,
    set_changeTokenStart: ChangeToken => Unit,
    set_contentType: Boolean => Unit,
    set_deleteObject: Boolean => Unit,
    set_field: Boolean => Unit,
    set_file: Boolean => Unit,
    set_folder: Boolean => Unit,
    set_group: Boolean => Unit,
    set_groupMembershipAdd: Boolean => Unit,
    set_groupMembershipDelete: Boolean => Unit,
    set_item: Boolean => Unit,
    set_list: Boolean => Unit,
    set_move: Boolean => Unit,
    set_navigation: Boolean => Unit,
    set_rename: Boolean => Unit,
    set_restore: Boolean => Unit,
    set_roleAssignmentAdd: Boolean => Unit,
    set_roleAssignmentDelete: Boolean => Unit,
    set_roleDefinitionAdd: Boolean => Unit,
    set_roleDefinitionDelete: Boolean => Unit,
    set_roleDefinitionUpdate: Boolean => Unit,
    set_securityPolicy: Boolean => Unit,
    set_site: Boolean => Unit,
    set_systemUpdate: Boolean => Unit,
    set_update: Boolean => Unit,
    set_user: Boolean => Unit,
    set_view: Boolean => Unit,
    set_web: Boolean => Unit,
    writeToXml: (XmlWriter, SerializationContext) => Unit
  ): ChangeQuery = {
    val __obj = js.Dynamic.literal(customFromJson = js.Any.fromFunction1(customFromJson), customWriteToXml = js.Any.fromFunction2(customWriteToXml), fromJson = js.Any.fromFunction1(fromJson), get_add = js.Any.fromFunction0(get_add), get_alert = js.Any.fromFunction0(get_alert), get_changeTokenEnd = js.Any.fromFunction0(get_changeTokenEnd), get_changeTokenStart = js.Any.fromFunction0(get_changeTokenStart), get_contentType = js.Any.fromFunction0(get_contentType), get_deleteObject = js.Any.fromFunction0(get_deleteObject), get_field = js.Any.fromFunction0(get_field), get_file = js.Any.fromFunction0(get_file), get_folder = js.Any.fromFunction0(get_folder), get_group = js.Any.fromFunction0(get_group), get_groupMembershipAdd = js.Any.fromFunction0(get_groupMembershipAdd), get_groupMembershipDelete = js.Any.fromFunction0(get_groupMembershipDelete), get_item = js.Any.fromFunction0(get_item), get_list = js.Any.fromFunction0(get_list), get_move = js.Any.fromFunction0(get_move), get_navigation = js.Any.fromFunction0(get_navigation), get_rename = js.Any.fromFunction0(get_rename), get_restore = js.Any.fromFunction0(get_restore), get_roleAssignmentAdd = js.Any.fromFunction0(get_roleAssignmentAdd), get_roleAssignmentDelete = js.Any.fromFunction0(get_roleAssignmentDelete), get_roleDefinitionAdd = js.Any.fromFunction0(get_roleDefinitionAdd), get_roleDefinitionDelete = js.Any.fromFunction0(get_roleDefinitionDelete), get_roleDefinitionUpdate = js.Any.fromFunction0(get_roleDefinitionUpdate), get_securityPolicy = js.Any.fromFunction0(get_securityPolicy), get_site = js.Any.fromFunction0(get_site), get_systemUpdate = js.Any.fromFunction0(get_systemUpdate), get_typeId = js.Any.fromFunction0(get_typeId), get_update = js.Any.fromFunction0(get_update), get_user = js.Any.fromFunction0(get_user), get_view = js.Any.fromFunction0(get_view), get_web = js.Any.fromFunction0(get_web), set_add = js.Any.fromFunction1(set_add), set_alert = js.Any.fromFunction1(set_alert), set_changeTokenEnd = js.Any.fromFunction1(set_changeTokenEnd), set_changeTokenStart = js.Any.fromFunction1(set_changeTokenStart), set_contentType = js.Any.fromFunction1(set_contentType), set_deleteObject = js.Any.fromFunction1(set_deleteObject), set_field = js.Any.fromFunction1(set_field), set_file = js.Any.fromFunction1(set_file), set_folder = js.Any.fromFunction1(set_folder), set_group = js.Any.fromFunction1(set_group), set_groupMembershipAdd = js.Any.fromFunction1(set_groupMembershipAdd), set_groupMembershipDelete = js.Any.fromFunction1(set_groupMembershipDelete), set_item = js.Any.fromFunction1(set_item), set_list = js.Any.fromFunction1(set_list), set_move = js.Any.fromFunction1(set_move), set_navigation = js.Any.fromFunction1(set_navigation), set_rename = js.Any.fromFunction1(set_rename), set_restore = js.Any.fromFunction1(set_restore), set_roleAssignmentAdd = js.Any.fromFunction1(set_roleAssignmentAdd), set_roleAssignmentDelete = js.Any.fromFunction1(set_roleAssignmentDelete), set_roleDefinitionAdd = js.Any.fromFunction1(set_roleDefinitionAdd), set_roleDefinitionDelete = js.Any.fromFunction1(set_roleDefinitionDelete), set_roleDefinitionUpdate = js.Any.fromFunction1(set_roleDefinitionUpdate), set_securityPolicy = js.Any.fromFunction1(set_securityPolicy), set_site = js.Any.fromFunction1(set_site), set_systemUpdate = js.Any.fromFunction1(set_systemUpdate), set_update = js.Any.fromFunction1(set_update), set_user = js.Any.fromFunction1(set_user), set_view = js.Any.fromFunction1(set_view), set_web = js.Any.fromFunction1(set_web), writeToXml = js.Any.fromFunction2(writeToXml))
    __obj.asInstanceOf[ChangeQuery]
  }
  
  @scala.inline
  implicit class ChangeQueryOps[Self <: ChangeQuery] (val x: Self) extends AnyVal {
    
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
    def setGet_add(value: () => Boolean): Self = this.set("get_add", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_alert(value: () => Boolean): Self = this.set("get_alert", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_changeTokenEnd(value: () => ChangeToken): Self = this.set("get_changeTokenEnd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_changeTokenStart(value: () => ChangeToken): Self = this.set("get_changeTokenStart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_contentType(value: () => Boolean): Self = this.set("get_contentType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_deleteObject(value: () => Boolean): Self = this.set("get_deleteObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_field(value: () => Boolean): Self = this.set("get_field", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_file(value: () => Boolean): Self = this.set("get_file", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_folder(value: () => Boolean): Self = this.set("get_folder", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_group(value: () => Boolean): Self = this.set("get_group", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_groupMembershipAdd(value: () => Boolean): Self = this.set("get_groupMembershipAdd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_groupMembershipDelete(value: () => Boolean): Self = this.set("get_groupMembershipDelete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_item(value: () => Boolean): Self = this.set("get_item", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_list(value: () => Boolean): Self = this.set("get_list", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_move(value: () => Boolean): Self = this.set("get_move", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_navigation(value: () => Boolean): Self = this.set("get_navigation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_rename(value: () => Boolean): Self = this.set("get_rename", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_restore(value: () => Boolean): Self = this.set("get_restore", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_roleAssignmentAdd(value: () => Boolean): Self = this.set("get_roleAssignmentAdd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_roleAssignmentDelete(value: () => Boolean): Self = this.set("get_roleAssignmentDelete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_roleDefinitionAdd(value: () => Boolean): Self = this.set("get_roleDefinitionAdd", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_roleDefinitionDelete(value: () => Boolean): Self = this.set("get_roleDefinitionDelete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_roleDefinitionUpdate(value: () => Boolean): Self = this.set("get_roleDefinitionUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_securityPolicy(value: () => Boolean): Self = this.set("get_securityPolicy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_site(value: () => Boolean): Self = this.set("get_site", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_systemUpdate(value: () => Boolean): Self = this.set("get_systemUpdate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_update(value: () => Boolean): Self = this.set("get_update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_user(value: () => Boolean): Self = this.set("get_user", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_view(value: () => Boolean): Self = this.set("get_view", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_web(value: () => Boolean): Self = this.set("get_web", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSet_add(value: Boolean => Unit): Self = this.set("set_add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_alert(value: Boolean => Unit): Self = this.set("set_alert", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_changeTokenEnd(value: ChangeToken => Unit): Self = this.set("set_changeTokenEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_changeTokenStart(value: ChangeToken => Unit): Self = this.set("set_changeTokenStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_contentType(value: Boolean => Unit): Self = this.set("set_contentType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_deleteObject(value: Boolean => Unit): Self = this.set("set_deleteObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_field(value: Boolean => Unit): Self = this.set("set_field", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_file(value: Boolean => Unit): Self = this.set("set_file", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_folder(value: Boolean => Unit): Self = this.set("set_folder", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_group(value: Boolean => Unit): Self = this.set("set_group", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_groupMembershipAdd(value: Boolean => Unit): Self = this.set("set_groupMembershipAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_groupMembershipDelete(value: Boolean => Unit): Self = this.set("set_groupMembershipDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_item(value: Boolean => Unit): Self = this.set("set_item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_list(value: Boolean => Unit): Self = this.set("set_list", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_move(value: Boolean => Unit): Self = this.set("set_move", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_navigation(value: Boolean => Unit): Self = this.set("set_navigation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_rename(value: Boolean => Unit): Self = this.set("set_rename", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_restore(value: Boolean => Unit): Self = this.set("set_restore", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_roleAssignmentAdd(value: Boolean => Unit): Self = this.set("set_roleAssignmentAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_roleAssignmentDelete(value: Boolean => Unit): Self = this.set("set_roleAssignmentDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_roleDefinitionAdd(value: Boolean => Unit): Self = this.set("set_roleDefinitionAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_roleDefinitionDelete(value: Boolean => Unit): Self = this.set("set_roleDefinitionDelete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_roleDefinitionUpdate(value: Boolean => Unit): Self = this.set("set_roleDefinitionUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_securityPolicy(value: Boolean => Unit): Self = this.set("set_securityPolicy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_site(value: Boolean => Unit): Self = this.set("set_site", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_systemUpdate(value: Boolean => Unit): Self = this.set("set_systemUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_update(value: Boolean => Unit): Self = this.set("set_update", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_user(value: Boolean => Unit): Self = this.set("set_user", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_view(value: Boolean => Unit): Self = this.set("set_view", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet_web(value: Boolean => Unit): Self = this.set("set_web", js.Any.fromFunction1(value))
  }
}
