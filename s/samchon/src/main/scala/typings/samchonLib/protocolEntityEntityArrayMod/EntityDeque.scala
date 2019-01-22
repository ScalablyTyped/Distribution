package typings
package samchonLib.protocolEntityEntityArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("samchon/protocol/entity/EntityArray", "EntityDeque")
@js.native
abstract class EntityDeque[T /* <: samchonLib.protocolEntityIEntityMod.IEntity */] ()
  extends tstlLib.tstlMod.Deque[T] {
  /**
    * @inheritdoc
    */
  def CHILD_TAG(): java.lang.String = js.native
  /**
    * @inheritdoc
    */
  def TAG(): java.lang.String = js.native
  /**
    * @inheritdoc
    */
  def construct(xml: sxmlLib.sxmlMod.XML): scala.Unit = js.native
  /**
    * @inheritdoc
    */
  def count(key: js.Any): scala.Double = js.native
  /**
    * @inheritdoc
    */
  def createChild(xml: sxmlLib.sxmlMod.XML): T = js.native
  /**
    * @inheritdoc
    */
  def get(key: js.Any): T = js.native
  /**
    * @inheritdoc
    */
  def has(key: js.Any): scala.Boolean = js.native
  /**
    * @inheritdoc
    */
  def key(): js.Any = js.native
  /**
    * @inheritdoc
    */
  def toXML(): sxmlLib.sxmlMod.XML = js.native
}

