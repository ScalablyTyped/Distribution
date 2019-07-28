package typings.saslmechanisms.saslmechanismsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Factory extends js.Object {
  def create(mechanisms: js.Array[String]): Mechanism | Null = js.native
  def use(mechanism: MechanismStatic): this.type = js.native
  def use(name: String, mechanism: MechanismStatic): this.type = js.native
}

