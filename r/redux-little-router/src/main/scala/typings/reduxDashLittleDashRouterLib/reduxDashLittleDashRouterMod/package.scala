package typings
package reduxDashLittleDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashLittleDashRouterMod {
  type BlockCallback = js.Function2[/* location */ Location, /* action */ js.UndefOr[HistoryAction], java.lang.String]
  type Href = java.lang.String | Location
  type ListenCallback = js.Function2[/* location */ Location, /* action */ js.UndefOr[HistoryAction], scala.Unit]
  type ObjectLiteral[T] = org.scalablytyped.runtime.StringDictionary[T]
  type Params = ObjectLiteral[java.lang.String]
  type Query = ObjectLiteral[java.lang.String]
  type Routes = ObjectLiteral[ObjectLiteral[js.Any]]
  type Unsubscribe = js.Function0[scala.Unit]
}
