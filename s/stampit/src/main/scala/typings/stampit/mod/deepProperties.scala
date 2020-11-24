package typings.stampit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stampit", "deepProperties")
@js.native
object deepProperties extends js.Object {
  
  def apply[Obj](deepObjects: PropertyMap*): StampType[Obj] = js.native
}
