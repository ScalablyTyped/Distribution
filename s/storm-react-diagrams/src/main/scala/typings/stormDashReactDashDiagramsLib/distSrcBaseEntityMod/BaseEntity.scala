package typings
package stormDashReactDashDiagramsLib.distSrcBaseEntityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/BaseEntity", "BaseEntity")
@js.native
class BaseEntity[T /* <: BaseListener[_] */] () extends js.Object {
  def this(id: java.lang.String) = this()
  var id: java.lang.String = js.native
  var listeners: org.scalablytyped.runtime.StringDictionary[T] = js.native
  var locked: scala.Boolean = js.native
  def addListener(listener: T): java.lang.String = js.native
  def clearListeners(): scala.Unit = js.native
  def clone(lookupTable: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Any = js.native
  def deSerialize(
    data: org.scalablytyped.runtime.StringDictionary[js.Any],
    engine: stormDashReactDashDiagramsLib.distSrcDiagramEngineMod.DiagramEngine
  ): scala.Unit = js.native
  def doClone(lookupTable: org.scalablytyped.runtime.StringDictionary[js.Any], clone: js.Any): scala.Unit = js.native
  def getID(): java.lang.String = js.native
  def isLocked(): scala.Boolean = js.native
  def iterateListeners(cb: js.Function2[/* t */ T, /* event */ BaseEvent[_], _]): scala.Unit = js.native
  def removeListener(listener: java.lang.String): scala.Boolean = js.native
  def serialize(): stormDashReactDashDiagramsLib.Anon_Id = js.native
  def setLocked(): scala.Unit = js.native
  def setLocked(locked: scala.Boolean): scala.Unit = js.native
}

