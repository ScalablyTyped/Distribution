package typings.qlik.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialPropertiesListobject
  extends /* key */ StringDictionary[js.Any]
     with InitialProperties {
  var qListobjectDef: ListobjectDef
}

object InitialPropertiesListobject {
  @scala.inline
  def apply(qListobjectDef: ListobjectDef, StringDictionary: /* key */ StringDictionary[js.Any] = null): InitialPropertiesListobject = {
    val __obj = js.Dynamic.literal(qListobjectDef = qListobjectDef.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[InitialPropertiesListobject]
  }
}

