package typings.readableStream

import typings.readableStream.mod._Readable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  var destroy: js.UndefOr[
    js.ThisFunction2[
      /* this */ _Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ]
  ] = js.undefined
  var read: js.UndefOr[js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit]] = js.undefined
}

object AnonCallback {
  @scala.inline
  def apply(
    destroy: js.ThisFunction2[
      /* this */ _Readable, 
      /* error */ Error | Null, 
      /* callback */ js.Function1[/* error */ Error | Null, Unit], 
      Unit
    ] = null,
    read: js.ThisFunction1[/* this */ _Readable, /* size */ Double, Unit] = null
  ): AnonCallback = {
    val __obj = js.Dynamic.literal()
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallback]
  }
}

