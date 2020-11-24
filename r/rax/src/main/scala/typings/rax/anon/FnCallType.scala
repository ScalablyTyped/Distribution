package typings.rax.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallType extends js.Object {
  
  def apply[T](`type`: Validator[T]): Requireable[js.Array[T]] = js.native
}
