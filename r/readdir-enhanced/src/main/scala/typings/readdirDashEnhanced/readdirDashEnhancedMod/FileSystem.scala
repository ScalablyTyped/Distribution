package typings.readdirDashEnhanced.readdirDashEnhancedMod

import typings.node.fsMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystem extends js.Object {
  var lstat: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[Stats], Unit]] = js.undefined
  var readdir: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[js.Array[String]], Unit]] = js.undefined
  var stat: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[Stats], Unit]] = js.undefined
}

object FileSystem {
  @scala.inline
  def apply(
    lstat: (/* path */ String, /* callback */ Callback[Stats]) => Unit = null,
    readdir: (/* path */ String, /* callback */ Callback[js.Array[String]]) => Unit = null,
    stat: (/* path */ String, /* callback */ Callback[Stats]) => Unit = null
  ): FileSystem = {
    val __obj = js.Dynamic.literal()
    if (lstat != null) __obj.updateDynamic("lstat")(js.Any.fromFunction2(lstat))
    if (readdir != null) __obj.updateDynamic("readdir")(js.Any.fromFunction2(readdir))
    if (stat != null) __obj.updateDynamic("stat")(js.Any.fromFunction2(stat))
    __obj.asInstanceOf[FileSystem]
  }
}

