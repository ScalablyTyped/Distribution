package typings.recoil.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionInterfaceUNSTABLE extends StObject {
  
  def get[T](a: RecoilValue[T]): T = js.native
  
  def reset(s: RecoilState[Any]): Unit = js.native
  
  def set[T](s: RecoilState[T], u: T): Unit = js.native
  def set[T](s: RecoilState[T], u: js.Function1[/* currVal */ T, T]): Unit = js.native
}
