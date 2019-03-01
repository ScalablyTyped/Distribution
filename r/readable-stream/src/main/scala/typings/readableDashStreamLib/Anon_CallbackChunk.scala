package typings
package readableDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CallbackChunk extends js.Object {
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var `final`: js.UndefOr[
    js.ThisFunction1[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var flush: js.UndefOr[
    js.ThisFunction1[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform, 
      /* callback */ js.Function2[/* er */ js.Any, /* data */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var read: js.UndefOr[
    js.ThisFunction1[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform, 
      /* size */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var transform: js.UndefOr[
    js.ThisFunction3[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function2[/* error */ js.UndefOr[nodeLib.Error], /* data */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var write: js.UndefOr[
    js.ThisFunction3[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var writev: js.UndefOr[
    js.ThisFunction2[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform, 
      /* chunks */ js.Array[Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
}

object Anon_CallbackChunk {
  @scala.inline
  def apply(
    destroy: js.ThisFunction2[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    `final`: js.ThisFunction1[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    flush: js.ThisFunction1[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform, 
      /* callback */ js.Function2[/* er */ js.Any, /* data */ js.Any, scala.Unit], 
      scala.Unit
    ] = null,
    read: js.ThisFunction1[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform, 
      /* size */ scala.Double, 
      scala.Unit
    ] = null,
    transform: js.ThisFunction3[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function2[/* error */ js.UndefOr[nodeLib.Error], /* data */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ] = null,
    write: js.ThisFunction3[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null,
    writev: js.ThisFunction2[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Transform, 
      /* chunks */ js.Array[Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ] = null
  ): Anon_CallbackChunk = {
    val __obj = js.Dynamic.literal()
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (`final` != null) __obj.updateDynamic("final")(`final`)
    if (flush != null) __obj.updateDynamic("flush")(flush)
    if (read != null) __obj.updateDynamic("read")(read)
    if (transform != null) __obj.updateDynamic("transform")(transform)
    if (write != null) __obj.updateDynamic("write")(write)
    if (writev != null) __obj.updateDynamic("writev")(writev)
    __obj.asInstanceOf[Anon_CallbackChunk]
  }
}

