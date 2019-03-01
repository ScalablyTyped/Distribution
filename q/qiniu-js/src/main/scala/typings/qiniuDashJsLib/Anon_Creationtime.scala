package typings
package qiniuDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Creationtime
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  var creation_time: java.lang.String
}

object Anon_Creationtime {
  @scala.inline
  def apply(
    creation_time: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Anon_Creationtime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("creation_time")(creation_time)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Creationtime]
  }
}

