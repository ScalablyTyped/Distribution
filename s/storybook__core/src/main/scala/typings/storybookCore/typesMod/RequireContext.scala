package typings.storybookCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequireContext extends js.Object {
  
  def apply(id: String): js.Any = js.native
  
  def keys(): js.Array[String] = js.native
  
  def resolve(id: String): String = js.native
}
