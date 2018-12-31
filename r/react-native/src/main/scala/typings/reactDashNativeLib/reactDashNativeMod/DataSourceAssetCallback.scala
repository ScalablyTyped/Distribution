package typings
package reactDashNativeLib.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceAssetCallback extends js.Object {
  var getRowData: js.UndefOr[
    js.Function3[
      /* dataBlob */ js.Any, 
      /* sectionID */ scala.Double | java.lang.String, 
      /* rowID */ scala.Double | java.lang.String, 
      _
    ]
  ] = js.undefined
  var getSectionHeaderData: js.UndefOr[
    js.Function2[/* dataBlob */ js.Any, /* sectionID */ scala.Double | java.lang.String, _]
  ] = js.undefined
  var rowHasChanged: js.UndefOr[js.Function2[/* r1 */ js.Any, /* r2 */ js.Any, scala.Boolean]] = js.undefined
  var sectionHeaderHasChanged: js.UndefOr[js.Function2[/* h1 */ js.Any, /* h2 */ js.Any, scala.Boolean]] = js.undefined
}

