package typings.recoil.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackInterface extends StObject {
  
  def gotoSnapshot(snapshot: Snapshot): Unit = js.native
  
  // eslint-disable-line @typescript-eslint/no-explicit-any
  def refresh(recoilValue: RecoilValue[Any]): Unit = js.native
  
  def reset(recoilVal: RecoilState[Any]): Unit = js.native
  
  def set[T](recoilVal: RecoilState[T], valOrUpdater: T): Unit = js.native
  def set[T](recoilVal: RecoilState[T], valOrUpdater: js.Function1[/* currVal */ T, T]): Unit = js.native
  
  var snapshot: Snapshot = js.native
  
  def transact_UNSTABLE(cb: js.Function1[/* i */ TransactionInterfaceUNSTABLE, Unit]): Unit = js.native
}
