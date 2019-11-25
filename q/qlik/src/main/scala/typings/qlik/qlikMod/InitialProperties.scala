package typings.qlik.qlikMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qlik.qlikMod.InitialPropertiesHyperCube
  - typings.qlik.qlikMod.InitialPropertiesListobject
*/
trait InitialProperties extends js.Object

object InitialProperties {
  @scala.inline
  def InitialPropertiesHyperCube(qHyperCubeDef: HyperCubeDef, StringDictionary: /* key */ StringDictionary[js.Any] = null): InitialProperties = {
    val __obj = js.Dynamic.literal(qHyperCubeDef = qHyperCubeDef.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[InitialProperties]
  }
  @scala.inline
  def InitialPropertiesListobject(qListobjectDef: ListobjectDef, StringDictionary: /* key */ StringDictionary[js.Any] = null): InitialProperties = {
    val __obj = js.Dynamic.literal(qListobjectDef = qListobjectDef.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[InitialProperties]
  }
}

