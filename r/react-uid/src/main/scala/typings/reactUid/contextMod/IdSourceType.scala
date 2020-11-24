package typings.reactUid.contextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IdSourceType extends js.Object {
  
  var prefix: String = js.native
  
  def uid(item: js.Any): String = js.native
  def uid(item: js.Any, index: Double): String = js.native
  
  var value: Double = js.native
}
