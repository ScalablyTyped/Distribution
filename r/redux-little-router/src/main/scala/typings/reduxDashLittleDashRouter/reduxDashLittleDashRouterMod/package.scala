package typings.reduxDashLittleDashRouter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashLittleDashRouterMod {
  import org.scalablytyped.runtime.StringDictionary

  type BlockCallback = js.Function2[/* location */ Location, /* action */ js.UndefOr[HistoryAction], String]
  type Href = String | Location
  type ListenCallback = js.Function2[/* location */ Location, /* action */ js.UndefOr[HistoryAction], Unit]
  type ObjectLiteral[T] = StringDictionary[T]
  type Params = ObjectLiteral[String]
  type Query = ObjectLiteral[String]
  type Routes = ObjectLiteral[ObjectLiteral[js.Any]]
  type Unsubscribe = js.Function0[Unit]
}
