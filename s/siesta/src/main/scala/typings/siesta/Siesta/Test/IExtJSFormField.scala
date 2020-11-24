package typings.siesta.Siesta.Test

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @mixin
  */
@js.native
trait IExtJSFormField extends js.Object {
  
  def fieldHasValue(field: js.Any, value: js.Any): Unit = js.native
  def fieldHasValue(field: js.Any, value: js.Any, description: String): Unit = js.native
  
  def isFieldEmpty(field: js.Any): Unit = js.native
  def isFieldEmpty(field: js.Any, description: String): Unit = js.native
}
