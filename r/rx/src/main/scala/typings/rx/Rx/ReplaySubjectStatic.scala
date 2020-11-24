package typings.rx.Rx

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaySubjectStatic
  extends /**
  *  Initializes a new instance of the ReplaySubject class with the specified buffer size, window size and scheduler.
  *  @param {Number} [bufferSize] Maximum element count of the replay buffer.
  *  @param {Number} [windowSize] Maximum time length of the replay buffer.
  *  @param {Scheduler} [scheduler] Scheduler the observers are invoked on.
  */
Instantiable0[ReplaySubject[js.Object]]
     with Instantiable1[/* bufferSize */ Double, ReplaySubject[js.Object]]
     with Instantiable2[js.UndefOr[/* bufferSize */ Double], /* window */ Double, ReplaySubject[js.Object]]
     with Instantiable3[
      js.UndefOr[/* bufferSize */ Double], 
      js.UndefOr[/* window */ Double], 
      /* scheduler */ IScheduler, 
      ReplaySubject[js.Object]
    ]
