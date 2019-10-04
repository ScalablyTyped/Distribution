package typings.realm

import typings.realm.RealmNs.SyncNs.AccessLevel
import typings.realm.RealmNs.SyncNs.ClientResyncMode
import typings.realm.RealmNs.SyncNs.LogLevel
import typings.realm.RealmNs.SyncNs.OpenRealmBehaviorType
import typings.realm.RealmNs.SyncNs.OpenRealmTimeOutBehavior
import typings.realm.RealmNs.SyncNs.ProgressDirection
import typings.realm.RealmNs.SyncNs.ProgressMode
import typings.realm.RealmNs.SyncNs.RealmListenerEventName
import typings.realm.RealmNs.SyncNs.SessionStopPolicy
import typings.realm.RealmNs._PropertyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object realmStrings {
  @js.native
  sealed trait ADD_PROPERTIES extends js.Object
  
  @js.native
  sealed trait ADD_TYPE extends js.Object
  
  @js.native
  sealed trait CHANGE_IDENTITY extends js.Object
  
  @js.native
  sealed trait CLEAR extends js.Object
  
  @js.native
  sealed trait DELETE extends js.Object
  
  @js.native
  sealed trait INSERT extends js.Object
  
  @js.native
  sealed trait LIST_CLEAR extends js.Object
  
  @js.native
  sealed trait LIST_ERASE extends js.Object
  
  @js.native
  sealed trait LIST_INSERT extends js.Object
  
  @js.native
  sealed trait LIST_SET extends js.Object
  
  @js.native
  sealed trait SET extends js.Object
  
  @js.native
  sealed trait SWAP_IDENTITY extends js.Object
  
  @js.native
  sealed trait active extends js.Object
  
  @js.native
  sealed trait admin extends AccessLevel
  
  @js.native
  sealed trait adminToken extends js.Object
  
  @js.native
  sealed trait `after-upload` extends SessionStopPolicy
  
  @js.native
  sealed trait all extends LogLevel
  
  @js.native
  sealed trait any extends js.Object
  
  @js.native
  sealed trait available extends RealmListenerEventName
  
  @js.native
  sealed trait bool extends _PropertyType
  
  @js.native
  sealed trait change extends RealmListenerEventName
  
  @js.native
  sealed trait currentUser extends js.Object
  
  @js.native
  sealed trait data extends _PropertyType
  
  @js.native
  sealed trait date extends _PropertyType
  
  @js.native
  sealed trait debug extends LogLevel
  
  @js.native
  sealed trait delete extends RealmListenerEventName
  
  @js.native
  sealed trait detail extends LogLevel
  
  @js.native
  sealed trait discard extends ClientResyncMode
  
  @js.native
  sealed trait double extends _PropertyType
  
  @js.native
  sealed trait download extends ProgressDirection
  
  @js.native
  sealed trait downloadBeforeOpen extends OpenRealmBehaviorType
  
  @js.native
  sealed trait error extends LogLevel
  
  @js.native
  sealed trait fatal extends LogLevel
  
  @js.native
  sealed trait float extends _PropertyType
  
  @js.native
  sealed trait forCurrentlyOutstandingWork extends ProgressMode
  
  @js.native
  sealed trait immediately extends SessionStopPolicy
  
  @js.native
  sealed trait inactive extends js.Object
  
  @js.native
  sealed trait info extends LogLevel
  
  @js.native
  sealed trait int extends _PropertyType
  
  @js.native
  sealed trait invalid extends js.Object
  
  @js.native
  sealed trait linkingObjects extends _PropertyType
  
  @js.native
  sealed trait list extends _PropertyType
  
  @js.native
  sealed trait manual extends ClientResyncMode
  
  @js.native
  sealed trait never extends SessionStopPolicy
  
  @js.native
  sealed trait none extends AccessLevel
  
  @js.native
  sealed trait off extends LogLevel
  
  @js.native
  sealed trait openImmediately extends OpenRealmBehaviorType
  
  @js.native
  sealed trait openLocalRealm extends OpenRealmTimeOutBehavior
  
  @js.native
  sealed trait otherUser extends js.Object
  
  @js.native
  sealed trait read extends AccessLevel
  
  @js.native
  sealed trait recover extends ClientResyncMode
  
  @js.native
  sealed trait reportIndefinitely extends ProgressMode
  
  @js.native
  sealed trait schema extends js.Object
  
  @js.native
  sealed trait string extends _PropertyType
  
  @js.native
  sealed trait throwException extends OpenRealmTimeOutBehavior
  
  @js.native
  sealed trait trace extends LogLevel
  
  @js.native
  sealed trait upload extends ProgressDirection
  
  @js.native
  sealed trait warn extends LogLevel
  
  @js.native
  sealed trait write extends AccessLevel
  
  @scala.inline
  def ADD_PROPERTIES: ADD_PROPERTIES = "ADD_PROPERTIES".asInstanceOf[ADD_PROPERTIES]
  @scala.inline
  def ADD_TYPE: ADD_TYPE = "ADD_TYPE".asInstanceOf[ADD_TYPE]
  @scala.inline
  def CHANGE_IDENTITY: CHANGE_IDENTITY = "CHANGE_IDENTITY".asInstanceOf[CHANGE_IDENTITY]
  @scala.inline
  def CLEAR: CLEAR = "CLEAR".asInstanceOf[CLEAR]
  @scala.inline
  def DELETE: DELETE = "DELETE".asInstanceOf[DELETE]
  @scala.inline
  def INSERT: INSERT = "INSERT".asInstanceOf[INSERT]
  @scala.inline
  def LIST_CLEAR: LIST_CLEAR = "LIST_CLEAR".asInstanceOf[LIST_CLEAR]
  @scala.inline
  def LIST_ERASE: LIST_ERASE = "LIST_ERASE".asInstanceOf[LIST_ERASE]
  @scala.inline
  def LIST_INSERT: LIST_INSERT = "LIST_INSERT".asInstanceOf[LIST_INSERT]
  @scala.inline
  def LIST_SET: LIST_SET = "LIST_SET".asInstanceOf[LIST_SET]
  @scala.inline
  def SET: SET = "SET".asInstanceOf[SET]
  @scala.inline
  def SWAP_IDENTITY: SWAP_IDENTITY = "SWAP_IDENTITY".asInstanceOf[SWAP_IDENTITY]
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  @scala.inline
  def admin: admin = "admin".asInstanceOf[admin]
  @scala.inline
  def adminToken: adminToken = "adminToken".asInstanceOf[adminToken]
  @scala.inline
  def `after-upload`: `after-upload` = "after-upload".asInstanceOf[`after-upload`]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  @scala.inline
  def bool: bool = "bool".asInstanceOf[bool]
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def currentUser: currentUser = "currentUser".asInstanceOf[currentUser]
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def detail: detail = "detail".asInstanceOf[detail]
  @scala.inline
  def discard: discard = "discard".asInstanceOf[discard]
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  @scala.inline
  def download: download = "download".asInstanceOf[download]
  @scala.inline
  def downloadBeforeOpen: downloadBeforeOpen = "downloadBeforeOpen".asInstanceOf[downloadBeforeOpen]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def fatal: fatal = "fatal".asInstanceOf[fatal]
  @scala.inline
  def float: float = "float".asInstanceOf[float]
  @scala.inline
  def forCurrentlyOutstandingWork: forCurrentlyOutstandingWork = "forCurrentlyOutstandingWork".asInstanceOf[forCurrentlyOutstandingWork]
  @scala.inline
  def immediately: immediately = "immediately".asInstanceOf[immediately]
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  @scala.inline
  def info: info = "info".asInstanceOf[info]
  @scala.inline
  def int: int = "int".asInstanceOf[int]
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  @scala.inline
  def linkingObjects: linkingObjects = "linkingObjects".asInstanceOf[linkingObjects]
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  @scala.inline
  def openImmediately: openImmediately = "openImmediately".asInstanceOf[openImmediately]
  @scala.inline
  def openLocalRealm: openLocalRealm = "openLocalRealm".asInstanceOf[openLocalRealm]
  @scala.inline
  def otherUser: otherUser = "otherUser".asInstanceOf[otherUser]
  @scala.inline
  def read: read = "read".asInstanceOf[read]
  @scala.inline
  def recover: recover = "recover".asInstanceOf[recover]
  @scala.inline
  def reportIndefinitely: reportIndefinitely = "reportIndefinitely".asInstanceOf[reportIndefinitely]
  @scala.inline
  def schema: schema = "schema".asInstanceOf[schema]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def throwException: throwException = "throwException".asInstanceOf[throwException]
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  @scala.inline
  def upload: upload = "upload".asInstanceOf[upload]
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  @scala.inline
  def write: write = "write".asInstanceOf[write]
}

