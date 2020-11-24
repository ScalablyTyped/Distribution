package typings.saslmechanisms.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Factory extends js.Object {
  
  def create(mechanisms: js.Array[String]): Mechanism | Null = js.native
  
  def use(mechanism: MechanismStatic): this.type = js.native
  def use(name: String, mechanism: MechanismStatic): this.type = js.native
}
