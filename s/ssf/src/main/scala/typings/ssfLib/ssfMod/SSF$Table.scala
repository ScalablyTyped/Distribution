package typings
package ssfLib.ssfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SSF$Table
  extends /* key */ org.scalablytyped.runtime.NumberDictionary[java.lang.String]
     with /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String]

object SSF$Table {
  @scala.inline
  def apply(
    NumberDictionary: /* key */ org.scalablytyped.runtime.NumberDictionary[java.lang.String] = null,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): SSF$Table = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[SSF$Table]
  }
}

