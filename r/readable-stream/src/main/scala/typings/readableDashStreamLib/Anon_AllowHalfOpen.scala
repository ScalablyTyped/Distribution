package typings
package readableDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowHalfOpen extends js.Object {
  var allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Duplex, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var `final`: js.UndefOr[
    js.ThisFunction1[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Duplex, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var read: js.UndefOr[
    js.ThisFunction1[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Duplex, 
      /* size */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
  var readable: js.UndefOr[scala.Boolean] = js.undefined
  var writable: js.UndefOr[scala.Boolean] = js.undefined
  var write: js.UndefOr[
    js.ThisFunction3[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Duplex, 
      /* chunk */ js.Any, 
      /* encoding */ java.lang.String, 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var writev: js.UndefOr[
    js.ThisFunction2[
      /* this */ readableDashStreamLib.readableDashStreamMod.underscoreReadableNs.Duplex, 
      /* chunks */ js.Array[Anon_Chunk], 
      /* callback */ js.Function1[/* error */ js.UndefOr[nodeLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
}

