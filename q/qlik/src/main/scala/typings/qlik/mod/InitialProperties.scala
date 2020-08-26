package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qlik.mod.InitialPropertiesHyperCube
  - typings.qlik.mod.InitialPropertiesListobject
*/
trait InitialProperties extends js.Object

object InitialProperties {
  @scala.inline
  def InitialPropertiesHyperCube(qHyperCubeDef: HyperCubeDef): InitialProperties = {
    val __obj = js.Dynamic.literal(qHyperCubeDef = qHyperCubeDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialProperties]
  }
  @scala.inline
  def InitialPropertiesListobject(qListobjectDef: ListobjectDef): InitialProperties = {
    val __obj = js.Dynamic.literal(qListobjectDef = qListobjectDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialProperties]
  }
}

