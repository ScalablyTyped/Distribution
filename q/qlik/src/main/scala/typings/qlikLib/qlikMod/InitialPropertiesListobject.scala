package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialPropertiesListobject
  extends InitialProperties
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var qListobjectDef: ListobjectDef
}

object InitialPropertiesListobject {
  @scala.inline
  def apply(
    qListobjectDef: ListobjectDef,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): InitialPropertiesListobject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qListobjectDef")(qListobjectDef)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[InitialPropertiesListobject]
  }
}

