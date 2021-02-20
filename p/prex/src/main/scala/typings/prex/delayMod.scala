package typings.prex

import typings.esfxCancelable.distMod.Cancelable
import typings.prex.cancellationMod.CancellationToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delayMod {
  
  @JSImport("prex/out/lib/delay", "delay")
  @js.native
  def delay(msec: Double): js.Promise[Unit] = js.native
  @JSImport("prex/out/lib/delay", "delay")
  @js.native
  def delay(token: Cancelable, msec: Double): js.Promise[Unit] = js.native
  @JSImport("prex/out/lib/delay", "delay")
  @js.native
  def delay(token: CancellationToken, msec: Double): js.Promise[Unit] = js.native
  @JSImport("prex/out/lib/delay", "delay")
  @js.native
  def delay[T](msec: Double, value: T): js.Promise[T] = js.native
  @JSImport("prex/out/lib/delay", "delay")
  @js.native
  def delay[T](msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
  @JSImport("prex/out/lib/delay", "delay")
  @js.native
  def delay[T](token: Cancelable, msec: Double, value: T): js.Promise[T] = js.native
  @JSImport("prex/out/lib/delay", "delay")
  @js.native
  def delay[T](token: Cancelable, msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
  @JSImport("prex/out/lib/delay", "delay")
  @js.native
  def delay[T](token: CancellationToken, msec: Double, value: T): js.Promise[T] = js.native
  @JSImport("prex/out/lib/delay", "delay")
  @js.native
  def delay[T](token: CancellationToken, msec: Double, value: js.Thenable[T]): js.Promise[T] = js.native
}
