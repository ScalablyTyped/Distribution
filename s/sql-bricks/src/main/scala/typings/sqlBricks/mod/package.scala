package typings.sqlBricks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type OnCriteria = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type TableName = java.lang.String | typings.sqlBricks.mod.SelectStatement
  
  /**
    * When a non-expression object is passed somewhere a whereExpression is expected,
    * each key/value pair will be ANDed together:
    */
  /* Rewritten from type alias, can be one of: 
    - typings.sqlBricks.mod.WhereGroup
    - typings.sqlBricks.mod.WhereBinary
    - typings.sqlBricks.mod.WhereObject
    - java.lang.String
  */
  type WhereExpression = typings.sqlBricks.mod._WhereExpression | typings.sqlBricks.mod.WhereObject | java.lang.String
  
  type WhereObject = org.scalablytyped.runtime.StringDictionary[js.Any]
}
