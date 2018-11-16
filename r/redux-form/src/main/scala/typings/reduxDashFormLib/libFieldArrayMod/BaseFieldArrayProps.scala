package typings
package reduxDashFormLib.libFieldArrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseFieldArrayProps[P] extends js.Object {
  var component: reactLib.reactMod.ReactNs.ComponentType[P]
  var name: java.lang.String
  var props: js.UndefOr[P] = js.undefined
  var rerenderOnEveryChange: js.UndefOr[scala.Boolean] = js.undefined
  var validate: js.UndefOr[
    reduxDashFormLib.libFieldMod.Validator | js.Array[reduxDashFormLib.libFieldMod.Validator]
  ] = js.undefined
  var warn: js.UndefOr[
    reduxDashFormLib.libFieldMod.Validator | js.Array[reduxDashFormLib.libFieldMod.Validator]
  ] = js.undefined
  var withRef: js.UndefOr[scala.Boolean] = js.undefined
}

