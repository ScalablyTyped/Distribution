package typings
package protractorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chrome extends js.Object {
  var chrome: Typeofchrome
  var firefox: Typeoffirefox
  var http: Typeofhttp
  var remote: Typeofremote
}

object Anon_Chrome {
  @scala.inline
  def apply(chrome: Typeofchrome, firefox: Typeoffirefox, http: Typeofhttp, remote: Typeofremote): Anon_Chrome = {
    val __obj = js.Dynamic.literal(chrome = chrome, firefox = firefox, http = http, remote = remote)
  
    __obj.asInstanceOf[Anon_Chrome]
  }
}

