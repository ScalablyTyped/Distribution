package typings.rebass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rebassMod {
  import typings.atStyledDashSystemCss.atStyledDashSystemCssMod.ResponsiveStyleValue
  import typings.atStyledDashSystemCss.atStyledDashSystemCssMod.SystemStyleObject
  import typings.std.Exclude
  import typings.std.Pick
  import typings.std.Record

  // tslint:disable-next-line no-empty-interface
  type LinkKnownProps = BoxKnownProps
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type SxStyleProp = SystemStyleObject | (Record[
    String, 
    SystemStyleObject | (ResponsiveStyleValue[Double | String]) | (Record[String, SystemStyleObject | (ResponsiveStyleValue[Double | String])])
  ])
}
