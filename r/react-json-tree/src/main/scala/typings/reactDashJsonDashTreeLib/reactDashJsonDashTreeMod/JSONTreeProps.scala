package typings
package reactDashJsonDashTreeLib.reactDashJsonDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JSONTreeProps
  extends reactLib.reactMod.ReactNs.Props[JSONTreeComponent] {
  var collectionLimit: js.UndefOr[scala.Double] = js.undefined
  var data: js.Array[_] | js.Object
  var getItemString: js.UndefOr[
    js.Function4[
      /* type */ java.lang.String, 
      /* data */ js.Array[_] | js.Object, 
      /* itemType */ java.lang.String, 
      /* itemString */ java.lang.String, 
      reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  var hideRoot: js.UndefOr[scala.Boolean] = js.undefined
  var invertTheme: js.UndefOr[scala.Boolean] = js.undefined
  var isCustomNode: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
  var keyPath: js.UndefOr[js.Array[java.lang.String | scala.Double]] = js.undefined
  var labelRenderer: js.UndefOr[
    js.Function1[
      /* raw */ js.Tuple2[java.lang.String, java.lang.String], 
      reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
  var postprocessValue: js.UndefOr[js.Function1[/* raw */ java.lang.String, reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var shouldExpandNode: js.UndefOr[
    js.Function3[
      /* keyPath */ js.Array[java.lang.String | scala.Double], 
      /* data */ js.Array[_] | js.Object, 
      /* level */ scala.Double, 
      scala.Boolean
    ]
  ] = js.undefined
  var sortObjectKeys: js.UndefOr[js.Function | scala.Boolean] = js.undefined
  var theme: js.UndefOr[js.Object | java.lang.String] = js.undefined
  var valueRenderer: js.UndefOr[js.Function1[/* raw */ java.lang.String, reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
}

