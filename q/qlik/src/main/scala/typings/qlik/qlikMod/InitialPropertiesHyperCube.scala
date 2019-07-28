package typings.qlik.qlikMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitialPropertiesHyperCube
  extends /* key */ StringDictionary[js.Any]
     with InitialProperties {
  var qHyperCubeDef: HyperCubeDef
}

object InitialPropertiesHyperCube {
  @scala.inline
  def apply(qHyperCubeDef: HyperCubeDef, StringDictionary: /* key */ StringDictionary[js.Any] = null): InitialPropertiesHyperCube = {
    val __obj = js.Dynamic.literal(qHyperCubeDef = qHyperCubeDef)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[InitialPropertiesHyperCube]
  }
}

