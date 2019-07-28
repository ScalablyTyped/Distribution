package typings.samchon.protocolEntityIEntityMod

import typings.sxml.sxmlMod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/entity/IEntity", "IEntity")
@js.native
object IEntityNs extends js.Object {
  def construct(entity: IEntity, xml: XML, prohibited_names: String*): Unit = js.native
  def toXML(entity: IEntity, prohibited_names: String*): XML = js.native
}

