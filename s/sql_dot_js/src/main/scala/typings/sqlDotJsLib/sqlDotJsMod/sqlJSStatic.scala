package typings
package sqlDotJsLib.sqlDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait sqlJSStatic extends js.Object {
  var Database: org.scalablytyped.runtime.Instantiable0[Database]
  var Statement: org.scalablytyped.runtime.Instantiable0[Statement]
}

object sqlJSStatic {
  @scala.inline
  def apply(
    Database: org.scalablytyped.runtime.Instantiable0[Database],
    Statement: org.scalablytyped.runtime.Instantiable0[Statement]
  ): sqlJSStatic = {
    val __obj = js.Dynamic.literal(Database = Database, Statement = Statement)
  
    __obj.asInstanceOf[sqlJSStatic]
  }
}

