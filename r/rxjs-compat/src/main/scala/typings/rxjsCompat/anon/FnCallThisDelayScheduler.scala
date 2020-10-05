package typings.rxjsCompat.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallThisDelayScheduler extends js.Object {
  def apply[T](delay: Double): js.Any = js.native
  def apply[T](
    delay: Double,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
  def apply[T](delay: Date): js.Any = js.native
  def apply[T](
    delay: Date,
    scheduler: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SchedulerLike */ js.Any
  ): js.Any = js.native
}

