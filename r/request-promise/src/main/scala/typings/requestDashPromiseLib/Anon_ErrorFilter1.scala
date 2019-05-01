package typings
package requestDashPromiseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ErrorFilter1 extends js.Object {
  def apply[U](): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U](onReject: js.Function1[/* error */ js.Any, bluebirdLib.bluebirdMod.Resolvable[U]]): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1](
    // tslint:disable-next-line:unified-signatures
  filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    onReject: js.Function1[/* error */ E1, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    onReject: js.Function1[/* error */ E1, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    onReject: js.Function1[/* error */ E1 | E2, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    onReject: js.Function1[/* error */ E1 | E2 | E3, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.CatchFilter[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1] | bluebirdLib.bluebirdMod.CatchFilter[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2] | bluebirdLib.bluebirdMod.CatchFilter[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3] | bluebirdLib.bluebirdMod.CatchFilter[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4] | bluebirdLib.bluebirdMod.CatchFilter[E4],
    filter5: bluebirdLib.bluebirdMod.Constructor[E5] | bluebirdLib.bluebirdMod.CatchFilter[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
  def apply[U, E1, E2, E3, E4, E5](
    filter1: bluebirdLib.bluebirdMod.Constructor[E1],
    filter2: bluebirdLib.bluebirdMod.Constructor[E2],
    filter3: bluebirdLib.bluebirdMod.Constructor[E3],
    filter4: bluebirdLib.bluebirdMod.Constructor[E4],
    filter5: bluebirdLib.bluebirdMod.Constructor[E5],
    onReject: js.Function1[/* error */ E1 | E2 | E3 | E4 | E5, bluebirdLib.bluebirdMod.Resolvable[U]]
  ): bluebirdLib.bluebirdMod.Bluebird[U | _] = js.native
}

