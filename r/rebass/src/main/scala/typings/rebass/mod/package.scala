package typings.rebass

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  // tslint:disable-next-line no-empty-interface
  type LinkKnownProps = typings.rebass.mod.BoxKnownProps
  
  type Omit[T, K] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type SxStyleProp = typings.styledSystemCss.mod.SystemStyleObject | (typings.std.Record[
    java.lang.String, 
    typings.styledSystemCss.mod.SystemStyleObject | (typings.styledSystemCss.mod.ResponsiveStyleValue[scala.Double | java.lang.String]) | (typings.std.Record[
      java.lang.String, 
      typings.styledSystemCss.mod.SystemStyleObject | (typings.styledSystemCss.mod.ResponsiveStyleValue[scala.Double | java.lang.String])
    ])
  ])
}
