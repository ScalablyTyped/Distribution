package typings
package reactDashVirtualizedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Children extends js.Object {
  @JSName("children")
  var children_Original: reactLib.reactMod.ReactNs.Validator[
    js.Function1[
      /* props */ reactDashVirtualizedLib.distEsColumnSizerMod.SizedColumnProps, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.native
  @JSName("columnCount")
  var columnCount_Original: reactLib.reactMod.ReactNs.Validator[scala.Double] = js.native
  var columnMaxWidth: reactLib.reactMod.ReactNs.Requireable[scala.Double] = js.native
  var columnMinWidth: reactLib.reactMod.ReactNs.Requireable[scala.Double] = js.native
  @JSName("width")
  var width_Original: reactLib.reactMod.ReactNs.Validator[scala.Double] = js.native
  def children(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def columnCount(
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

