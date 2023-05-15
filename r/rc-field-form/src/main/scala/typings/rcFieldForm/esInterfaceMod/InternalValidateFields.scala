package typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InternalValidateFields[Values] extends StObject {
  
  def apply(): js.Promise[Values] = js.native
  def apply(nameList: js.Array[NamePath]): js.Promise[Values] = js.native
  def apply(nameList: js.Array[NamePath], options: InternalValidateOptions): js.Promise[Values] = js.native
  def apply(nameList: Unit, options: InternalValidateOptions): js.Promise[Values] = js.native
  def apply(options: InternalValidateOptions): js.Promise[Values] = js.native
}
