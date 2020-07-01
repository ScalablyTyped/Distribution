package typings.recoil.anon

import typings.recoil.mod.Loadable
import typings.recoil.recoilStrings.hasError
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<{  state  :'hasError',   contents  :std.Error}> */
trait ReadonlystatehasErrorcont
  extends Loadable[js.Any] {
  val contents: Error
  val state: hasError
}

object ReadonlystatehasErrorcont {
  @scala.inline
  def apply(contents: Error, state: hasError): ReadonlystatehasErrorcont = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlystatehasErrorcont]
  }
}

