package typings.rxDashDom.rxDashDomMod

import typings.rxDashCore.RxNs.IDisposable
import typings.rxDashLite.RxNs.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-dom", "SchedulerCls")
@js.native
class SchedulerCls protected ()
  extends typings.rx.rxMod.SchedulerCls {
  def this(
    now: js.Function0[Double],
    schedule: js.Function2[
        /* state */ js.Any, 
        /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable], 
        IDisposable
      ],
    scheduleRelative: js.Function3[
        /* state */ js.Any, 
        /* dueTime */ Double, 
        /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable], 
        IDisposable
      ],
    scheduleAbsolute: js.Function3[
        /* state */ js.Any, 
        /* dueTime */ Double, 
        /* action */ js.Function2[/* scheduler */ IScheduler, /* state */ js.Any, IDisposable], 
        IDisposable
      ]
  ) = this()
}

