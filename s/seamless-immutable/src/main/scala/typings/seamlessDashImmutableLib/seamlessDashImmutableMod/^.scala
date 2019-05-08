package typings
package seamlessDashImmutableLib.seamlessDashImmutableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("seamless-immutable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](obj: T): Immutable[T, js.Object] = js.native
  def apply[T](obj: T, options: Options): Immutable[T, js.Object] = js.native
  def ImmutableError(message: java.lang.String): stdLib.Error = js.native
  def from[T](obj: T): Immutable[T, js.Object] = js.native
  def from[T](obj: T, options: Options): Immutable[T, js.Object] = js.native
  def isImmutable[T](target: T): /* is seamless-immutable.seamless-immutable.Immutable<T, {}> */ scala.Boolean = js.native
  def isImmutable[T](target: Immutable[T, js.Object]): /* is seamless-immutable.seamless-immutable.Immutable<T, {}> */ scala.Boolean = js.native
  def replace[T, S](obj: Immutable[T, js.Object], valueObj: S): Immutable[S, js.Object] = js.native
  def replace[T, S](obj: Immutable[T, js.Object], valueObj: S, options: ReplaceConfig): Immutable[S, js.Object] = js.native
}

