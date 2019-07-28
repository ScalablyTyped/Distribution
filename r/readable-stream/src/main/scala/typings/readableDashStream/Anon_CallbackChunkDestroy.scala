package typings.readableDashStream

import typings.readableDashStream.readableDashStreamMod.Writable
import typings.std.ArrayLike
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackChunkDestroy extends js.Object {
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  var `final`: js.UndefOr[
    js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  var write: js.UndefOr[
    js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
  var writev: js.UndefOr[
    js.ThisFunction2[
      /* this */ Writable, 
      /* chunk */ ArrayLike[Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.undefined
}

object Anon_CallbackChunkDestroy {
  @scala.inline
  def apply(
    destroy: js.ThisFunction2[
      /* this */ Writable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    `final`: js.ThisFunction1[
      /* this */ Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    write: js.ThisFunction3[
      /* this */ Writable, 
      /* chunk */ js.Any, 
      /* encoding */ String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null,
    writev: js.ThisFunction2[
      /* this */ Writable, 
      /* chunk */ ArrayLike[Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[Error | Null], Unit], 
      Unit
    ] = null
  ): Anon_CallbackChunkDestroy = {
    val __obj = js.Dynamic.literal()
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (`final` != null) __obj.updateDynamic("final")(`final`)
    if (write != null) __obj.updateDynamic("write")(write)
    if (writev != null) __obj.updateDynamic("writev")(writev)
    __obj.asInstanceOf[Anon_CallbackChunkDestroy]
  }
}

