package typings
package simplecrawlerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Gid extends js.Object {
  var gid: scala.Double
  var homedir: java.lang.String
  var shell: js.Any
  var uid: scala.Double
  var username: java.lang.String
}

object Anon_Gid {
  @scala.inline
  def apply(
    gid: scala.Double,
    homedir: java.lang.String,
    shell: js.Any,
    uid: scala.Double,
    username: java.lang.String
  ): Anon_Gid = {
    val __obj = js.Dynamic.literal(gid = gid, homedir = homedir, shell = shell, uid = uid, username = username)
  
    __obj.asInstanceOf[Anon_Gid]
  }
}

