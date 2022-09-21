package typings.recoil.mod

import typings.recoil.anon.IsInitialized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recoil", "Snapshot")
@js.native
open class Snapshot () extends StObject {
  
  def asyncMap(cb: js.Function1[/* mutableSnapshot */ MutableSnapshot, js.Promise[Unit]]): js.Promise[Snapshot] = js.native
  
  def getID(): SnapshotID = js.native
  
  def getInfo_UNSTABLE[T](recoilValue: RecoilValue[T]): RecoilStateInfo[T] = js.native
  
  def getLoadable[T](recoilValue: RecoilValue[T]): Loadable[T] = js.native
  
  def getNodes_UNSTABLE(): js.Iterable[RecoilValue[Any]] = js.native
  def getNodes_UNSTABLE(opts: IsInitialized): js.Iterable[RecoilValue[Any]] = js.native
  
  def getPromise[T](recoilValue: RecoilValue[T]): js.Promise[T] = js.native
  
  def isRetained(): Boolean = js.native
  
  def map(cb: js.Function1[/* mutableSnapshot */ MutableSnapshot, Unit]): Snapshot = js.native
  
  def retain(): js.Function0[Unit] = js.native
}
