package typings
package readableDashStreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ readableDashStreamLib.readableDashStreamMod._Readable, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  var read: js.UndefOr[
    js.ThisFunction1[
      /* this */ readableDashStreamLib.readableDashStreamMod._Readable, 
      /* size */ scala.Double, 
      scala.Unit
    ]
  ] = js.undefined
}

object Anon_Callback {
  @scala.inline
  def apply(
    destroy: js.ThisFunction2[
      /* this */ readableDashStreamLib.readableDashStreamMod._Readable, 
      /* error */ nodeLib.Error | scala.Null, 
      /* callback */ js.Function1[/* error */ nodeLib.Error | scala.Null, scala.Unit], 
      scala.Unit
    ] = null,
    read: js.ThisFunction1[
      /* this */ readableDashStreamLib.readableDashStreamMod._Readable, 
      /* size */ scala.Double, 
      scala.Unit
    ] = null
  ): Anon_Callback = {
    val __obj = js.Dynamic.literal()
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (read != null) __obj.updateDynamic("read")(read)
    __obj.asInstanceOf[Anon_Callback]
  }
}

