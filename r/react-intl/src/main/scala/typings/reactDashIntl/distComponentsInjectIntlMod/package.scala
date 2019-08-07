package typings.reactDashIntl

import typings.reactDashIntl.Anon_ForwardedRef
import typings.reactDashIntl.distTypesMod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distComponentsInjectIntlMod {
  type WithIntlProps[P] = (Omit[P, String]) with Anon_ForwardedRef
  type WrappedComponentProps[IntlPropName /* <: String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in IntlPropName ]: react-intl.react-intl/dist/types.IntlShape}
    */ typings.reactDashIntl.reactDashIntlStrings.WrappedComponentProps with js.Any
}
