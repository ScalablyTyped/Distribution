package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeQuery extends ClientValueObject {
  def get_add(): Boolean
  def get_alert(): Boolean
  def get_changeTokenEnd(): ChangeToken
  def get_changeTokenStart(): ChangeToken
  def get_contentType(): Boolean
  def get_deleteObject(): Boolean
  def get_field(): Boolean
  def get_file(): Boolean
  def get_folder(): Boolean
  def get_group(): Boolean
  def get_groupMembershipAdd(): Boolean
  def get_groupMembershipDelete(): Boolean
  def get_item(): Boolean
  def get_list(): Boolean
  def get_move(): Boolean
  def get_navigation(): Boolean
  def get_rename(): Boolean
  def get_restore(): Boolean
  def get_roleAssignmentAdd(): Boolean
  def get_roleAssignmentDelete(): Boolean
  def get_roleDefinitionAdd(): Boolean
  def get_roleDefinitionDelete(): Boolean
  def get_roleDefinitionUpdate(): Boolean
  def get_securityPolicy(): Boolean
  def get_site(): Boolean
  def get_systemUpdate(): Boolean
  def get_update(): Boolean
  def get_user(): Boolean
  def get_view(): Boolean
  def get_web(): Boolean
  def set_add(value: Boolean): Unit
  def set_alert(value: Boolean): Unit
  def set_changeTokenEnd(value: ChangeToken): Unit
  def set_changeTokenStart(value: ChangeToken): Unit
  def set_contentType(value: Boolean): Unit
  def set_deleteObject(value: Boolean): Unit
  def set_field(value: Boolean): Unit
  def set_file(value: Boolean): Unit
  def set_folder(value: Boolean): Unit
  def set_group(value: Boolean): Unit
  def set_groupMembershipAdd(value: Boolean): Unit
  def set_groupMembershipDelete(value: Boolean): Unit
  def set_item(value: Boolean): Unit
  def set_list(value: Boolean): Unit
  def set_move(value: Boolean): Unit
  def set_navigation(value: Boolean): Unit
  def set_rename(value: Boolean): Unit
  def set_restore(value: Boolean): Unit
  def set_roleAssignmentAdd(value: Boolean): Unit
  def set_roleAssignmentDelete(value: Boolean): Unit
  def set_roleDefinitionAdd(value: Boolean): Unit
  def set_roleDefinitionDelete(value: Boolean): Unit
  def set_roleDefinitionUpdate(value: Boolean): Unit
  def set_securityPolicy(value: Boolean): Unit
  def set_site(value: Boolean): Unit
  def set_systemUpdate(value: Boolean): Unit
  def set_update(value: Boolean): Unit
  def set_user(value: Boolean): Unit
  def set_view(value: Boolean): Unit
  def set_web(value: Boolean): Unit
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
}

