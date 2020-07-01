package typings.recoil.mod

import typings.recoil.recoilStrings.hasError
import typings.recoil.recoilStrings.hasValue
import typings.recoil.recoilStrings.loading
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.recoil.anon.Contents[T]
  - typings.recoil.anon.ReadonlystatehasErrorcont
  - typings.recoil.anon.State[T]
*/
trait Loadable[T] extends js.Object

object Loadable {
  @scala.inline
  def Contents[T](contents: T, state: hasValue): Loadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loadable[T]]
  }
  @scala.inline
  def ReadonlystatehasErrorcont[T](contents: Error, state: hasError): Loadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loadable[T]]
  }
  @scala.inline
  def State[T](contents: LoadablePromise[T], state: loading): Loadable[T] = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Loadable[T]]
  }
}

