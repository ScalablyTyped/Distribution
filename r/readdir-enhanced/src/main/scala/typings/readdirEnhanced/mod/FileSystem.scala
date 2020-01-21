package typings.readdirEnhanced.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystem
  extends /* key */ StringDictionary[js.Any] {
  var lstat: js.UndefOr[
    js.Function2[/* path */ String, /* callback */ Callback[typings.node.fsMod.Stats], Unit]
  ] = js.undefined
  var readdir: js.UndefOr[js.Function2[/* path */ String, /* callback */ Callback[js.Array[String]], Unit]] = js.undefined
  var stat: js.UndefOr[
    js.Function2[/* path */ String, /* callback */ Callback[typings.node.fsMod.Stats], Unit]
  ] = js.undefined
}

object FileSystem {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    lstat: (/* path */ String, /* callback */ Callback[typings.node.fsMod.Stats]) => Unit = null,
    readdir: (/* path */ String, /* callback */ Callback[js.Array[String]]) => Unit = null,
    stat: (/* path */ String, /* callback */ Callback[typings.node.fsMod.Stats]) => Unit = null
  ): FileSystem = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (lstat != null) __obj.updateDynamic("lstat")(js.Any.fromFunction2(lstat))
    if (readdir != null) __obj.updateDynamic("readdir")(js.Any.fromFunction2(readdir))
    if (stat != null) __obj.updateDynamic("stat")(js.Any.fromFunction2(stat))
    __obj.asInstanceOf[FileSystem]
  }
}

