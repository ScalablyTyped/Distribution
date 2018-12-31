package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Sync.Adapter")
@js.native
class Adapter protected () extends js.Object {
  def this(local_path: java.lang.String, server_url: java.lang.String, admin_user: User, regex: java.lang.String, change_callback: js.Function) = this()
  def this(local_path: java.lang.String, server_url: java.lang.String, admin_user: User, regex: java.lang.String, change_callback: js.Function, ssl: SSLConfiguration) = this()
  /**
    * Advance the to the next transaction indicating that you are done processing the current instructions for the given Realm.
    * @param path the path for the Realm to advance
    */
  def advance(path: java.lang.String): scala.Unit = js.native
  def close(): scala.Unit = js.native
  def current(path: java.lang.String): js.Array[Instruction] = js.native
  def realmAtPath(path: java.lang.String): realmLib.Realm = js.native
  def realmAtPath(path: java.lang.String, schema: js.Array[realmLib.RealmNs.ObjectSchema]): realmLib.Realm = js.native
}

