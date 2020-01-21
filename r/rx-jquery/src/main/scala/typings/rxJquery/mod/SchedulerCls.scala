package typings.rxJquery.mod

import typings.rxCore.Rx.IDisposable
import typings.rxLite.Rx.IScheduler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rx-jquery", "SchedulerCls")
@js.native
class SchedulerCls protected ()
  extends typings.rxLite.Rx.SchedulerCls {
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

