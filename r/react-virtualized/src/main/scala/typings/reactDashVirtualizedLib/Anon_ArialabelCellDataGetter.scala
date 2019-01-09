package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArialabelCellDataGetter extends js.Object {
  var `aria-label`: reactLib.reactMod.ReactNs.Requireable[java.lang.String] = js.native
  var cellDataGetter: reactLib.reactMod.ReactNs.Requireable[reactDashVirtualizedLib.distEsTableMod.TableCellDataGetter] = js.native
  var cellRenderer: reactLib.reactMod.ReactNs.Requireable[reactDashVirtualizedLib.distEsTableMod.TableCellRenderer] = js.native
  var className: reactLib.reactMod.ReactNs.Requireable[java.lang.String] = js.native
  var columnData: reactLib.reactMod.ReactNs.Requireable[js.Object] = js.native
  @JSName("dataKey")
  var dataKey_Original: reactLib.reactMod.ReactNs.Validator[java.lang.String] = js.native
  var disableSort: reactLib.reactMod.ReactNs.Requireable[scala.Boolean] = js.native
  var flexGrow: reactLib.reactMod.ReactNs.Requireable[scala.Double] = js.native
  var flexShrink: reactLib.reactMod.ReactNs.Requireable[scala.Double] = js.native
  var headerClassName: reactLib.reactMod.ReactNs.Requireable[java.lang.String] = js.native
  @JSName("headerRenderer")
  var headerRenderer_Original: reactLib.reactMod.ReactNs.Validator[reactDashVirtualizedLib.distEsTableMod.TableHeaderRowRenderer] = js.native
  var id: reactLib.reactMod.ReactNs.Requireable[java.lang.String] = js.native
  var label: reactLib.reactMod.ReactNs.Requireable[java.lang.String] = js.native
  var maxWidth: reactLib.reactMod.ReactNs.Requireable[scala.Double] = js.native
  var minWidth: reactLib.reactMod.ReactNs.Requireable[scala.Double] = js.native
  var style: reactLib.reactMod.ReactNs.Requireable[reactLib.reactMod.ReactNs.CSSProperties] = js.native
  @JSName("width")
  var width_Original: reactLib.reactMod.ReactNs.Validator[scala.Double] = js.native
  def dataKey(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def headerRenderer(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def width(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

