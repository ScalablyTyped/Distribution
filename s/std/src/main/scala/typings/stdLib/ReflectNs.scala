package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Reflect")
@js.native
object ReflectNs extends js.Object {
  @JSName("apply")
  def apply(target: js.Function, thisArgument: js.Any, argumentsList: stdLib.ArrayLike[_]): js.Any = js.native
  def construct(target: js.Function, argumentsList: stdLib.ArrayLike[_]): js.Any = js.native
  def construct(target: js.Function, argumentsList: stdLib.ArrayLike[_], newTarget: js.Any): js.Any = js.native
  def defineProperty(target: js.Object, propertyKey: stdLib.PropertyKey, attributes: stdLib.PropertyDescriptor): scala.Boolean = js.native
  def deleteProperty(target: js.Object, propertyKey: stdLib.PropertyKey): scala.Boolean = js.native
  def enumerate(target: js.Object): stdLib.IterableIterator[_] = js.native
  def get(target: js.Object, propertyKey: stdLib.PropertyKey): js.Any = js.native
  def get(target: js.Object, propertyKey: stdLib.PropertyKey, receiver: js.Any): js.Any = js.native
  def getOwnPropertyDescriptor(target: js.Object, propertyKey: stdLib.PropertyKey): js.UndefOr[stdLib.PropertyDescriptor] = js.native
  def getPrototypeOf(target: js.Object): js.Object = js.native
  def has(target: js.Object, propertyKey: stdLib.PropertyKey): scala.Boolean = js.native
  def isExtensible(target: js.Object): scala.Boolean = js.native
  def ownKeys(target: js.Object): js.Array[stdLib.PropertyKey] = js.native
  def preventExtensions(target: js.Object): scala.Boolean = js.native
  def set(target: js.Object, propertyKey: stdLib.PropertyKey, value: js.Any): scala.Boolean = js.native
  def set(target: js.Object, propertyKey: stdLib.PropertyKey, value: js.Any, receiver: js.Any): scala.Boolean = js.native
  def setPrototypeOf(target: js.Object, proto: js.Any): scala.Boolean = js.native
}

