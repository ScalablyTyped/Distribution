package typings.reactDashJsonDashTree.reactDashJsonDashTreeMod

import typings.react.reactMod.Global.JSXNs.Element
import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONTreeProps extends Props[JSONTreeComponent] {
  var collectionLimit: js.UndefOr[Double] = js.undefined
  var data: js.Array[_] | js.Object
  var getItemString: js.UndefOr[
    js.Function4[
      /* type */ String, 
      /* data */ js.Array[_] | js.Object, 
      /* itemType */ String, 
      /* itemString */ String, 
      Element
    ]
  ] = js.undefined
  var hideRoot: js.UndefOr[Boolean] = js.undefined
  var invertTheme: js.UndefOr[Boolean] = js.undefined
  var isCustomNode: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var keyPath: js.UndefOr[js.Array[String | Double]] = js.undefined
  var labelRenderer: js.UndefOr[
    js.Function4[
      /* keyPath */ js.Array[String], 
      /* nodeType */ js.UndefOr[String], 
      /* expanded */ js.UndefOr[Boolean], 
      /* expandable */ js.UndefOr[Boolean], 
      Element
    ]
  ] = js.undefined
  var postprocessValue: js.UndefOr[js.Function1[/* raw */ String, Element]] = js.undefined
  var shouldExpandNode: js.UndefOr[
    js.Function3[
      /* keyPath */ js.Array[String | Double], 
      /* data */ js.Array[_] | js.Object, 
      /* level */ Double, 
      Boolean
    ]
  ] = js.undefined
  var sortObjectKeys: js.UndefOr[js.Function | Boolean] = js.undefined
  var theme: js.UndefOr[js.Object | String] = js.undefined
  var valueRenderer: js.UndefOr[
    js.Function3[
      /* displayValue */ String | Double, 
      /* rawValue */ js.UndefOr[String | Double | Boolean | Null], 
      /* repeated */ String | Double, 
      Element
    ]
  ] = js.undefined
}

object JSONTreeProps {
  @scala.inline
  def apply(
    data: js.Array[_] | js.Object,
    children: ReactNode = null,
    collectionLimit: Int | Double = null,
    getItemString: (/* type */ String, /* data */ js.Array[_] | js.Object, /* itemType */ String, /* itemString */ String) => Element = null,
    hideRoot: js.UndefOr[Boolean] = js.undefined,
    invertTheme: js.UndefOr[Boolean] = js.undefined,
    isCustomNode: () => Boolean = null,
    key: Key = null,
    keyPath: js.Array[String | Double] = null,
    labelRenderer: (/* keyPath */ js.Array[String], /* nodeType */ js.UndefOr[String], /* expanded */ js.UndefOr[Boolean], /* expandable */ js.UndefOr[Boolean]) => Element = null,
    postprocessValue: /* raw */ String => Element = null,
    ref: LegacyRef[JSONTreeComponent] = null,
    shouldExpandNode: (/* keyPath */ js.Array[String | Double], /* data */ js.Array[_] | js.Object, /* level */ Double) => Boolean = null,
    sortObjectKeys: js.Function | Boolean = null,
    theme: js.Object | String = null,
    valueRenderer: (/* displayValue */ String | Double, /* rawValue */ js.UndefOr[String | Double | Boolean | Null], /* repeated */ String | Double) => Element = null
  ): JSONTreeProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (collectionLimit != null) __obj.updateDynamic("collectionLimit")(collectionLimit.asInstanceOf[js.Any])
    if (getItemString != null) __obj.updateDynamic("getItemString")(js.Any.fromFunction4(getItemString))
    if (!js.isUndefined(hideRoot)) __obj.updateDynamic("hideRoot")(hideRoot)
    if (!js.isUndefined(invertTheme)) __obj.updateDynamic("invertTheme")(invertTheme)
    if (isCustomNode != null) __obj.updateDynamic("isCustomNode")(js.Any.fromFunction0(isCustomNode))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (keyPath != null) __obj.updateDynamic("keyPath")(keyPath)
    if (labelRenderer != null) __obj.updateDynamic("labelRenderer")(js.Any.fromFunction4(labelRenderer))
    if (postprocessValue != null) __obj.updateDynamic("postprocessValue")(js.Any.fromFunction1(postprocessValue))
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (shouldExpandNode != null) __obj.updateDynamic("shouldExpandNode")(js.Any.fromFunction3(shouldExpandNode))
    if (sortObjectKeys != null) __obj.updateDynamic("sortObjectKeys")(sortObjectKeys.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (valueRenderer != null) __obj.updateDynamic("valueRenderer")(js.Any.fromFunction3(valueRenderer))
    __obj.asInstanceOf[JSONTreeProps]
  }
}

