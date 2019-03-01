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
    js.Function4[
      /* keyPath */ js.Array[java.lang.String], 
      /* nodeType */ js.UndefOr[java.lang.String], 
      /* expanded */ js.UndefOr[scala.Boolean], 
      /* expandable */ js.UndefOr[scala.Boolean], 
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
  var valueRenderer: js.UndefOr[
    js.Function3[
      /* displayValue */ java.lang.String | scala.Double, 
      /* rawValue */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null], 
      /* repeated */ java.lang.String | scala.Double, 
      reactLib.reactMod.Global.JSXNs.Element
    ]
  ] = js.undefined
}

object JSONTreeProps {
  @scala.inline
  def apply(
    data: js.Array[_] | js.Object,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    collectionLimit: scala.Int | scala.Double = null,
    getItemString: js.Function4[
      /* type */ java.lang.String, 
      /* data */ js.Array[_] | js.Object, 
      /* itemType */ java.lang.String, 
      /* itemString */ java.lang.String, 
      reactLib.reactMod.Global.JSXNs.Element
    ] = null,
    hideRoot: js.UndefOr[scala.Boolean] = js.undefined,
    invertTheme: js.UndefOr[scala.Boolean] = js.undefined,
    isCustomNode: js.Function0[scala.Boolean] = null,
    key: reactLib.reactMod.ReactNs.Key = null,
    keyPath: js.Array[java.lang.String | scala.Double] = null,
    labelRenderer: js.Function4[
      /* keyPath */ js.Array[java.lang.String], 
      /* nodeType */ js.UndefOr[java.lang.String], 
      /* expanded */ js.UndefOr[scala.Boolean], 
      /* expandable */ js.UndefOr[scala.Boolean], 
      reactLib.reactMod.Global.JSXNs.Element
    ] = null,
    postprocessValue: js.Function1[/* raw */ java.lang.String, reactLib.reactMod.Global.JSXNs.Element] = null,
    ref: reactLib.reactMod.ReactNs.LegacyRef[JSONTreeComponent] = null,
    shouldExpandNode: js.Function3[
      /* keyPath */ js.Array[java.lang.String | scala.Double], 
      /* data */ js.Array[_] | js.Object, 
      /* level */ scala.Double, 
      scala.Boolean
    ] = null,
    sortObjectKeys: js.Function | scala.Boolean = null,
    theme: js.Object | java.lang.String = null,
    valueRenderer: js.Function3[
      /* displayValue */ java.lang.String | scala.Double, 
      /* rawValue */ js.UndefOr[java.lang.String | scala.Double | scala.Boolean | scala.Null], 
      /* repeated */ java.lang.String | scala.Double, 
      reactLib.reactMod.Global.JSXNs.Element
    ] = null
  ): JSONTreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (collectionLimit != null) __obj.updateDynamic("collectionLimit")(collectionLimit.asInstanceOf[js.Any])
    if (getItemString != null) __obj.updateDynamic("getItemString")(getItemString)
    if (!js.isUndefined(hideRoot)) __obj.updateDynamic("hideRoot")(hideRoot)
    if (!js.isUndefined(invertTheme)) __obj.updateDynamic("invertTheme")(invertTheme)
    if (isCustomNode != null) __obj.updateDynamic("isCustomNode")(isCustomNode)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyPath != null) __obj.updateDynamic("keyPath")(keyPath)
    if (labelRenderer != null) __obj.updateDynamic("labelRenderer")(labelRenderer)
    if (postprocessValue != null) __obj.updateDynamic("postprocessValue")(postprocessValue)
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (shouldExpandNode != null) __obj.updateDynamic("shouldExpandNode")(shouldExpandNode)
    if (sortObjectKeys != null) __obj.updateDynamic("sortObjectKeys")(sortObjectKeys.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (valueRenderer != null) __obj.updateDynamic("valueRenderer")(valueRenderer)
    __obj.asInstanceOf[JSONTreeProps]
  }
}

