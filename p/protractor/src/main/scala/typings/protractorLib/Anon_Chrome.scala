package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chrome extends js.Object {
  var chrome: Anon_Driver
  var firefox: Anon_Binary
  var http: Anon_Body
  var remote: Anon_DriverService
}

object Anon_Chrome {
  @scala.inline
  def apply(chrome: Anon_Driver, firefox: Anon_Binary, http: Anon_Body, remote: Anon_DriverService): Anon_Chrome = {
    val __obj = js.Dynamic.literal(chrome = chrome, firefox = firefox, http = http, remote = remote)
  
    __obj.asInstanceOf[Anon_Chrome]
  }
}

