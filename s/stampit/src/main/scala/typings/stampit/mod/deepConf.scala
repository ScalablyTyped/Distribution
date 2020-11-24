package typings.stampit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stampit", "deepConf")
@js.native
object deepConf extends js.Object {
  
  def apply[Obj](deepConfs: PropertyMap*): StampType[Obj] = js.native
}
