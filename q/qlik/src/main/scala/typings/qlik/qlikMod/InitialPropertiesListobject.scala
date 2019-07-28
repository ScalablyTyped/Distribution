package typings.qlik.qlikMod

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
    val __obj = js.Dynamic.literal(qListobjectDef = qListobjectDef)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[InitialPropertiesListobject]
  }
}

