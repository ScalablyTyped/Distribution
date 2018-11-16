package typings
package reduxDashLittleDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashLittleDashRouterMod {
  type Href = java.lang.String | Location
  type Params = ObjectLiteral[java.lang.String]
  type Query = ObjectLiteral[java.lang.String]
  type RouterActions = LocationChangedAction | PushAction | ReplaceAction | GoAction | GoBackAction | GoForwardAction | BlockAction | UnblockAction | ReplaceRoutesAction
  type Routes = ObjectLiteral[ObjectLiteral[js.Any]]
}
