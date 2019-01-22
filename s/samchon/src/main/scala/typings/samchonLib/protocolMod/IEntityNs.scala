package typings
package samchonLib.protocolMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol", "IEntity")
@js.native
object IEntityNs extends js.Object {
  def construct(
    entity: samchonLib.protocolEntityIEntityMod.IEntity,
    xml: sxmlLib.sxmlMod.XML,
    prohibited_names: java.lang.String*
  ): scala.Unit = js.native
  def toXML(entity: samchonLib.protocolEntityIEntityMod.IEntity, prohibited_names: java.lang.String*): sxmlLib.sxmlMod.XML = js.native
}

