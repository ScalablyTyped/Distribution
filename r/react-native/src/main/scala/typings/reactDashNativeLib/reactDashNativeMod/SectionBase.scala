package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SectionBase[ItemT] extends js.Object {
  var ItemSeparatorComponent: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[_] | scala.Null] = js.undefined
  var data: js.Array[ItemT]
  var key: js.UndefOr[java.lang.String] = js.undefined
  var keyExtractor: js.UndefOr[js.Function2[/* item */ ItemT, /* index */ scala.Double, java.lang.String]] = js.undefined
  var renderItem: js.UndefOr[SectionListRenderItem[ItemT]] = js.undefined
}

