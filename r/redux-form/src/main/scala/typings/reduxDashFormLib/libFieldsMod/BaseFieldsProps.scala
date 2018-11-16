package typings
package reduxDashFormLib.libFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseFieldsProps[P] extends js.Object {
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[_]] = js.undefined
  var format: js.UndefOr[reduxDashFormLib.libFieldMod.Formatter | scala.Null] = js.undefined
  var names: js.Array[java.lang.String]
  var parse: js.UndefOr[reduxDashFormLib.libFieldMod.Parser] = js.undefined
  var props: js.UndefOr[P] = js.undefined
  var withRef: js.UndefOr[scala.Boolean] = js.undefined
}

