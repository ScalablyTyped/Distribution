package typings.protractor

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
    val __obj = js.Dynamic.literal(chrome = chrome.asInstanceOf[js.Any], firefox = firefox.asInstanceOf[js.Any], http = http.asInstanceOf[js.Any], remote = remote.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Chrome]
  }
}

