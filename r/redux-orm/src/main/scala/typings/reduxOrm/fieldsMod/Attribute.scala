package typings.reduxOrm.fieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("redux-orm/fields", "Attribute")
@js.native
class Attribute () extends Field {
  def this(opts: AttributeOpts) = this()
  
  var `type`: typings.reduxOrm.reduxOrmStrings.attr = js.native
}
