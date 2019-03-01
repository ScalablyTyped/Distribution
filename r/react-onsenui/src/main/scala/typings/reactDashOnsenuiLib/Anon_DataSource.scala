package typings
package reactDashOnsenuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataSource extends js.Object {
  var dataSource: js.UndefOr[js.Array[_]] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var renderFooter: js.UndefOr[js.Function0[js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]]] = js.undefined
  var renderHeader: js.UndefOr[js.Function0[js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]]] = js.undefined
  var renderRow: js.UndefOr[
    js.Function2[
      /* row */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]
    ]
  ] = js.undefined
}

object Anon_DataSource {
  @scala.inline
  def apply(
    dataSource: js.Array[_] = null,
    modifier: java.lang.String = null,
    renderFooter: js.Function0[js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]] = null,
    renderHeader: js.Function0[js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]] = null,
    renderRow: js.Function2[
      /* row */ js.Any, 
      /* index */ js.UndefOr[scala.Double], 
      js.UndefOr[reactLib.reactMod.Global.JSXNs.Element]
    ] = null
  ): Anon_DataSource = {
    val __obj = js.Dynamic.literal()
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (renderFooter != null) __obj.updateDynamic("renderFooter")(renderFooter)
    if (renderHeader != null) __obj.updateDynamic("renderHeader")(renderHeader)
    if (renderRow != null) __obj.updateDynamic("renderRow")(renderRow)
    __obj.asInstanceOf[Anon_DataSource]
  }
}

