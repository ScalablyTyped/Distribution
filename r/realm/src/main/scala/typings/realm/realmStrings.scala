package typings.realm

import typings.realm.Realm.App.Sync.LogLevel
import typings.realm.Realm.OpenRealmBehaviorType
import typings.realm.Realm.OpenRealmTimeOutBehavior
import typings.realm.Realm.ProgressDirection
import typings.realm.Realm.ProgressMode
import typings.realm.Realm.Services.MongoDB.OperationType
import typings.realm.Realm.SessionStopPolicy
import typings.realm.Realm._PropertyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object realmStrings {
  
  @scala.inline
  def RealmOptionalParMappedModel: RealmOptionalParMappedModel = "RealmOptionalParMappedModel".asInstanceOf[RealmOptionalParMappedModel]
  
  @scala.inline
  def _id: _id = "_id".asInstanceOf[_id]
  
  @scala.inline
  def _objectId: _objectId = "_objectId".asInstanceOf[_objectId]
  
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @scala.inline
  def addListener: addListener = "addListener".asInstanceOf[addListener]
  
  @scala.inline
  def `after-upload`: `after-upload` = "after-upload".asInstanceOf[`after-upload`]
  
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @scala.inline
  def bool: bool = "bool".asInstanceOf[bool]
  
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  
  @scala.inline
  def debug: debug = "debug".asInstanceOf[debug]
  
  @scala.inline
  def decimal128: decimal128 = "decimal128".asInstanceOf[decimal128]
  
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @scala.inline
  def detail: detail = "detail".asInstanceOf[detail]
  
  @scala.inline
  def double: double = "double".asInstanceOf[double]
  
  @scala.inline
  def download: download = "download".asInstanceOf[download]
  
  @scala.inline
  def downloadBeforeOpen: downloadBeforeOpen = "downloadBeforeOpen".asInstanceOf[downloadBeforeOpen]
  
  @scala.inline
  def drop: drop = "drop".asInstanceOf[drop]
  
  @scala.inline
  def dropDatabase: dropDatabase = "dropDatabase".asInstanceOf[dropDatabase]
  
  @scala.inline
  def entries: entries = "entries".asInstanceOf[entries]
  
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
  def insert: insert = "insert".asInstanceOf[insert]
  
  @scala.inline
  def int: int = "int".asInstanceOf[int]
  
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @scala.inline
  def invalidate: invalidate = "invalidate".asInstanceOf[invalidate]
  
  @scala.inline
  def isValid: isValid = "isValid".asInstanceOf[isValid]
  
  @scala.inline
  def keys: keys = "keys".asInstanceOf[keys]
  
  @scala.inline
  def linkingObjects: linkingObjects = "linkingObjects".asInstanceOf[linkingObjects]
  
  @scala.inline
  def linkingObjectsCount: linkingObjectsCount = "linkingObjectsCount".asInstanceOf[linkingObjectsCount]
  
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  
  @scala.inline
  def never: never = "never".asInstanceOf[never]
  
  @scala.inline
  def objectId: objectId = "objectId".asInstanceOf[objectId]
  
  @scala.inline
  def objectSchema: objectSchema = "objectSchema".asInstanceOf[objectSchema]
  
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @scala.inline
  def openImmediately: openImmediately = "openImmediately".asInstanceOf[openImmediately]
  
  @scala.inline
  def openLocalRealm: openLocalRealm = "openLocalRealm".asInstanceOf[openLocalRealm]
  
  @scala.inline
  def removeAllListeners: removeAllListeners = "removeAllListeners".asInstanceOf[removeAllListeners]
  
  @scala.inline
  def removeListener: removeListener = "removeListener".asInstanceOf[removeListener]
  
  @scala.inline
  def rename: rename = "rename".asInstanceOf[rename]
  
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @scala.inline
  def reportIndefinitely: reportIndefinitely = "reportIndefinitely".asInstanceOf[reportIndefinitely]
  
  @scala.inline
  def schema: schema = "schema".asInstanceOf[schema]
  
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @scala.inline
  def throwException: throwException = "throwException".asInstanceOf[throwException]
  
  @scala.inline
  def toJSON: toJSON = "toJSON".asInstanceOf[toJSON]
  
  @scala.inline
  def trace: trace = "trace".asInstanceOf[trace]
  
  @scala.inline
  def update: update = "update".asInstanceOf[update]
  
  @scala.inline
  def upload: upload = "upload".asInstanceOf[upload]
  
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait RealmOptionalParMappedModel extends js.Object
  
  @js.native
  sealed trait _id extends js.Object
  
  @js.native
  sealed trait _objectId extends js.Object
  
  @js.native
  sealed trait active extends js.Object
  
  @js.native
  sealed trait addListener extends js.Object
  
  @js.native
  sealed trait `after-upload` extends SessionStopPolicy
  
  @js.native
  sealed trait all extends LogLevel
  
  @js.native
  sealed trait bool extends _PropertyType
  
  @js.native
  sealed trait change extends js.Object
  
  @js.native
  sealed trait data extends _PropertyType
  
  @js.native
  sealed trait date extends _PropertyType
  
  @js.native
  sealed trait debug extends LogLevel
  
  @js.native
  sealed trait decimal128 extends _PropertyType
  
  @js.native
  sealed trait delete extends OperationType
  
  @js.native
  sealed trait detail extends LogLevel
  
  @js.native
  sealed trait double extends _PropertyType
  
  @js.native
  sealed trait download extends ProgressDirection
  
  @js.native
  sealed trait downloadBeforeOpen extends OpenRealmBehaviorType
  
  @js.native
  sealed trait drop extends OperationType
  
  @js.native
  sealed trait dropDatabase extends OperationType
  
  @js.native
  sealed trait entries extends js.Object
  
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
  sealed trait insert extends OperationType
  
  @js.native
  sealed trait int extends _PropertyType
  
  @js.native
  sealed trait invalid extends js.Object
  
  @js.native
  sealed trait invalidate extends OperationType
  
  @js.native
  sealed trait isValid extends js.Object
  
  @js.native
  sealed trait keys extends js.Object
  
  @js.native
  sealed trait linkingObjects extends _PropertyType
  
  @js.native
  sealed trait linkingObjectsCount extends js.Object
  
  @js.native
  sealed trait list extends _PropertyType
  
  @js.native
  sealed trait never extends SessionStopPolicy
  
  @js.native
  sealed trait objectId extends _PropertyType
  
  @js.native
  sealed trait objectSchema extends js.Object
  
  @js.native
  sealed trait off extends LogLevel
  
  @js.native
  sealed trait openImmediately extends OpenRealmBehaviorType
  
  @js.native
  sealed trait openLocalRealm extends OpenRealmTimeOutBehavior
  
  @js.native
  sealed trait removeAllListeners extends js.Object
  
  @js.native
  sealed trait removeListener extends js.Object
  
  @js.native
  sealed trait rename extends OperationType
  
  @js.native
  sealed trait replace extends OperationType
  
  @js.native
  sealed trait reportIndefinitely extends ProgressMode
  
  @js.native
  sealed trait schema extends js.Object
  
  @js.native
  sealed trait string extends _PropertyType
  
  @js.native
  sealed trait throwException extends OpenRealmTimeOutBehavior
  
  @js.native
  sealed trait toJSON extends js.Object
  
  @js.native
  sealed trait trace extends LogLevel
  
  @js.native
  sealed trait update extends OperationType
  
  @js.native
  sealed trait upload extends ProgressDirection
  
  @js.native
  sealed trait warn extends LogLevel
}
