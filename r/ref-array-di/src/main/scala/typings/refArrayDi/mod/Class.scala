package typings.refArrayDi.mod

import typings.refNapi.mod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ref-array-di", JSImport.Namespace)
@js.native
class Class[T] protected () extends ArrayType[T] {
  def this(`type`: String) = this()
  def this(`type`: Type) = this()
  def this(`type`: String, length: Double) = this()
  def this(`type`: Type, length: Double) = this()
}
