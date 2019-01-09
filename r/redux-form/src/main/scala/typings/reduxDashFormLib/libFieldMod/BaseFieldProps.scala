package typings
package reduxDashFormLib.libFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof redux-form.redux-form/lib/Field.CommonFieldProps ]:? redux-form.redux-form/lib/Field.CommonFieldProps[P]} */ trait BaseFieldProps[P] extends js.Object {
  var component: js.UndefOr[
    (reactLib.reactMod.ReactNs.ComponentType[WrappedFieldProps with P]) | reduxDashFormLib.reduxDashFormLibStrings.input | reduxDashFormLib.reduxDashFormLibStrings.select | reduxDashFormLib.reduxDashFormLibStrings.textarea
  ] = js.undefined
  var format: js.UndefOr[Formatter | scala.Null] = js.undefined
  var immutableProps: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var name: java.lang.String
  var normalize: js.UndefOr[Normalizer] = js.undefined
  var parse: js.UndefOr[Parser] = js.undefined
  var props: js.UndefOr[P] = js.undefined
  var validate: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
  var warn: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
  var withRef: js.UndefOr[scala.Boolean] = js.undefined
}

