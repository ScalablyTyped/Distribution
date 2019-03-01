package typings
package shelljsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All
  extends /* s */ org.scalablytyped.runtime.StringDictionary[shelljsLib.makeMod.Global.Target] {
  var all: js.UndefOr[shelljsLib.makeMod.Global.Target] = js.undefined
}

object Anon_All {
  @scala.inline
  def apply(
    StringDictionary: /* s */ org.scalablytyped.runtime.StringDictionary[shelljsLib.makeMod.Global.Target] = null,
    all: shelljsLib.makeMod.Global.Target = null
  ): Anon_All = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (all != null) __obj.updateDynamic("all")(all)
    __obj.asInstanceOf[Anon_All]
  }
}

