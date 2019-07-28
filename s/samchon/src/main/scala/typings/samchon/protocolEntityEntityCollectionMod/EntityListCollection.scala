package typings.samchon.protocolEntityEntityCollectionMod

import typings.ecol.ecolMod.ListCollection
import typings.samchon.protocolEntityIEntityMod.IEntity
import typings.sxml.sxmlMod.XML
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/entity/EntityCollection", "EntityListCollection")
@js.native
abstract class EntityListCollection[T /* <: IEntity */] () extends ListCollection[T] {
  /**
    * @inheritdoc
    */
  def CHILD_TAG(): String = js.native
  /**
    * @inheritdoc
    */
  def TAG(): String = js.native
  /**
    * @inheritdoc
    */
  def construct(xml: XML): Unit = js.native
  /**
    * @inheritdoc
    */
  def count(key: js.Any): Double = js.native
  /**
    * @inheritdoc
    */
  def createChild(xml: XML): T = js.native
  /**
    * @inheritdoc
    */
  def get(key: js.Any): T = js.native
  /**
    * @inheritdoc
    */
  def has(key: js.Any): Boolean = js.native
  /**
    * @inheritdoc
    */
  def key(): js.Any = js.native
  /**
    * @inheritdoc
    */
  def toXML(): XML = js.native
}

