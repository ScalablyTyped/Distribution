package typings.readableDashStream

import typings.readableDashStream.readableDashStreamMod.Duplex
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowHalfOpen extends js.Object {
  var allowHalfOpen: js.UndefOr[Boolean] = js.undefined
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ Duplex, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  var `final`: js.UndefOr[
    js.ThisFunction1[
      /* this */ Duplex, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  var read: js.UndefOr[js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit]] = js.undefined
  var readable: js.UndefOr[Boolean] = js.undefined
  var writable: js.UndefOr[Boolean] = js.undefined
  var write: js.UndefOr[
    js.ThisFunction3[
      /* this */ Duplex, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  var writev: js.UndefOr[
    js.ThisFunction2[
      /* this */ Duplex, 
      /* chunks */ js.Array[Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
}

object Anon_AllowHalfOpen {
  @scala.inline
  def apply(
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    destroy: js.ThisFunction2[
      /* this */ Duplex, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    `final`: js.ThisFunction1[
      /* this */ Duplex, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    read: js.ThisFunction1[/* this */ Duplex, /* size */ Double, Unit] = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined,
    write: js.ThisFunction3[
      /* this */ Duplex, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    writev: js.ThisFunction2[
      /* this */ Duplex, 
      /* chunks */ js.Array[Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null
  ): Anon_AllowHalfOpen = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (`final` != null) __obj.updateDynamic("final")(`final`)
    if (read != null) __obj.updateDynamic("read")(read)
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    if (write != null) __obj.updateDynamic("write")(write)
    if (writev != null) __obj.updateDynamic("writev")(writev)
    __obj.asInstanceOf[Anon_AllowHalfOpen]
  }
}

