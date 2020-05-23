package typings.qiniuJs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey extends /* key */ StringDictionary[String] {
  var creation_time: String
}

object Dictkey {
  @scala.inline
  def apply(creation_time: String, StringDictionary: /* name */ StringDictionary[String] = null): Dictkey = {
    val __obj = js.Dynamic.literal(creation_time = creation_time.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

