package typings
package schwiftyLib.schwiftyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("schwifty", "Model")
@js.native
class Model ()
  extends objectionLib.objectionMod.Model {
  var joiSchema: joiLib.joiMod.Schema = js.native
}

/* static members */
@JSImport("schwifty", "Model")
@js.native
object Model extends js.Object {
  def getJoiSchema(): joiLib.joiMod.Schema = js.native
  def getJoiSchema(patch: scala.Boolean): joiLib.joiMod.Schema = js.native
}

