package typings
package reduxDashFormLib.libReducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FormState extends js.Object {
  var active: js.UndefOr[java.lang.String] = js.undefined
  var anyTouched: js.UndefOr[scala.Boolean] = js.undefined
  var fields: js.UndefOr[org.scalablytyped.runtime.StringDictionary[FieldState]] = js.undefined
  var registeredFields: js.Array[RegisteredFieldState]
  var submitErrors: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var submitFailed: js.UndefOr[scala.Boolean] = js.undefined
  var submitting: js.UndefOr[scala.Boolean] = js.undefined
  var values: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

