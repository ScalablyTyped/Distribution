package typings
package readableDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackChunkDestroy extends js.Object {
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Writable, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var `final`: js.UndefOr[
    js.ThisFunction1[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var write: js.UndefOr[
    js.ThisFunction3[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Writable, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var writev: js.UndefOr[
    js.ThisFunction2[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Writable, 
      /* chunk */ stdLib.ArrayLike[Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
}

object Anon_CallbackChunkDestroy {
  @scala.inline
  def apply(
    destroy: js.ThisFunction2[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Writable, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    `final`: js.ThisFunction1[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Writable, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    write: js.ThisFunction3[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Writable, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    writev: js.ThisFunction2[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Writable, 
      /* chunk */ stdLib.ArrayLike[Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
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

