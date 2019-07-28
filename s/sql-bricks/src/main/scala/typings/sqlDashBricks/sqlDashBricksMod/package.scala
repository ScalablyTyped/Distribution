package typings.sqlDashBricks

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqlDashBricksMod {
  type OnCriteria = StringDictionary[String]
  type TableName = String | SelectStatement
  /**
    * When a non-expression object is passed somewhere a whereExpression is expected,
    * each key/value pair will be ANDed together:
    */
  /* Rewritten from type alias, can be one of: 
    - typings.sqlDashBricks.sqlDashBricksMod.WhereGroup
    - typings.sqlDashBricks.sqlDashBricksMod.WhereBinary
    - typings.sqlDashBricks.sqlDashBricksMod.WhereObject
    - java.lang.String
  */
  type WhereExpression = _WhereExpression | WhereObject | String
  type WhereObject = StringDictionary[js.Any]
}
