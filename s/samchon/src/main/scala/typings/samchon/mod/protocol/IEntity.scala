package typings.samchon.mod.protocol

import typings.sxml.mod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("samchon", "protocol.IEntity")
@js.native
object IEntity extends js.Object {
  
  def construct(entity: typings.samchon.ientityMod.IEntity, xml: XML, prohibited_names: String*): Unit = js.native
  
  def toXML(entity: typings.samchon.ientityMod.IEntity, prohibited_names: String*): XML = js.native
}
