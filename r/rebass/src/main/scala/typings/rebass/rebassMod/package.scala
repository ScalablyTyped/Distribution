package typings.rebass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rebassMod {
  import typings.atStyledDashSystemCss.atStyledDashSystemCssMod.ResponsiveStyleValue
  import typings.atStyledDashSystemCss.atStyledDashSystemCssMod.SystemStyleObject
  import typings.std.Record

  // tslint:disable-next-line no-empty-interface
  type LinkKnownProps = BoxKnownProps
  type SxStyleProp = SystemStyleObject | (Record[
    String, 
    SystemStyleObject | (ResponsiveStyleValue[Double | String]) | (Record[String, SystemStyleObject | (ResponsiveStyleValue[Double | String])])
  ])
}
