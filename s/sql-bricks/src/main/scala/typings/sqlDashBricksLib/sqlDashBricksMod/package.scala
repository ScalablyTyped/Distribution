package typings
package sqlDashBricksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqlDashBricksMod {
  type OnCriteria = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type TableName = java.lang.String | SelectStatement
  /**
    * When a non-expression object is passed somewhere a whereExpression is expected,
    * each key/value pair will be ANDed together:
    */
  /* Rewritten from type alias, can be one of: 
    - WhereGroup
    - WhereBinary
    - WhereObject
    - java.lang.String
  */
  type WhereExpression = _WhereExpression | WhereObject | java.lang.String
  type WhereObject = org.scalablytyped.runtime.StringDictionary[js.Any]
}
