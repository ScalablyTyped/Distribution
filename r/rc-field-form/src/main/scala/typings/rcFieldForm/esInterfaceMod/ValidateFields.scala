package typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateFields[Values] extends StObject {
  
  def apply(): js.Promise[Values] = js.native
  def apply(nameList: js.Array[NamePath]): js.Promise[Values] = js.native
  def apply(nameList: js.Array[NamePath], opt: ValidateOptions): js.Promise[Values] = js.native
  def apply(nameList: Unit, opt: ValidateOptions): js.Promise[Values] = js.native
  def apply(opt: ValidateOptions): js.Promise[Values] = js.native
}
