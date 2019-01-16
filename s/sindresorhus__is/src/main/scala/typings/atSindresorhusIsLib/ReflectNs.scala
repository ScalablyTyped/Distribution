package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Reflect")
@js.native
object ReflectNs extends js.Object {
  @JSName("apply")
  def apply(
    target: atSindresorhusIsLib.Function,
    thisArgument: js.Any,
    argumentsList: atSindresorhusIsLib.ArrayLike[_]
  ): js.Any = js.native
  def construct(target: atSindresorhusIsLib.Function, argumentsList: atSindresorhusIsLib.ArrayLike[_]): js.Any = js.native
  def construct(
    target: atSindresorhusIsLib.Function,
    argumentsList: atSindresorhusIsLib.ArrayLike[_],
    newTarget: js.Any
  ): js.Any = js.native
  def defineProperty(
    target: js.Object,
    propertyKey: atSindresorhusIsLib.PropertyKey,
    attributes: atSindresorhusIsLib.PropertyDescriptor
  ): scala.Boolean = js.native
  def deleteProperty(target: js.Object, propertyKey: atSindresorhusIsLib.PropertyKey): scala.Boolean = js.native
  def enumerate(target: js.Object): atSindresorhusIsLib.IterableIterator[_] = js.native
  def get(target: js.Object, propertyKey: atSindresorhusIsLib.PropertyKey): js.Any = js.native
  def get(target: js.Object, propertyKey: atSindresorhusIsLib.PropertyKey, receiver: js.Any): js.Any = js.native
  def getOwnPropertyDescriptor(target: js.Object, propertyKey: atSindresorhusIsLib.PropertyKey): js.UndefOr[atSindresorhusIsLib.PropertyDescriptor] = js.native
  def getPrototypeOf(target: js.Object): js.Object = js.native
  def has(target: js.Object, propertyKey: atSindresorhusIsLib.PropertyKey): scala.Boolean = js.native
  def isExtensible(target: js.Object): scala.Boolean = js.native
  def ownKeys(target: js.Object): atSindresorhusIsLib.Array[atSindresorhusIsLib.PropertyKey] = js.native
  def preventExtensions(target: js.Object): scala.Boolean = js.native
  def set(target: js.Object, propertyKey: atSindresorhusIsLib.PropertyKey, value: js.Any): scala.Boolean = js.native
  def set(target: js.Object, propertyKey: atSindresorhusIsLib.PropertyKey, value: js.Any, receiver: js.Any): scala.Boolean = js.native
  def setPrototypeOf(target: js.Object, proto: js.Any): scala.Boolean = js.native
}

