package typings.rxjs.rxjsMod

import org.scalablytyped.runtime.TopLevel
import typings.rxjs.internalTypesMod.SchedulerLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "EMPTY")
@js.native
object EMPTY
  extends TopLevel[typings.rxjs.internalObservableMod.Observable[scala.Nothing]]

@JSImport("rxjs", "empty")
@js.native
object empty extends js.Object {
  def apply(): typings.rxjs.internalObservableMod.Observable[scala.Nothing] = js.native
  def apply(scheduler: SchedulerLike): typings.rxjs.internalObservableMod.Observable[scala.Nothing] = js.native
}

