package typings.react

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.reactStrings.Fn_TypeAny
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnTypeAny extends js.Object {
  def apply[T](`type`: Validator[T]): Requireable[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof any ]: T}
    */ Fn_TypeAny with js.Any
  ] = js.native
}

