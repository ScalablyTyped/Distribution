package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NameNonKeyAttributes extends js.Object {
  var name: java.lang.String
  var nonKeyAttributes: js.Array[java.lang.String]
  var projectionType: java.lang.String
  var rangeKey: java.lang.String
}

object Anon_NameNonKeyAttributes {
  @scala.inline
  def apply(
    name: java.lang.String,
    nonKeyAttributes: js.Array[java.lang.String],
    projectionType: java.lang.String,
    rangeKey: java.lang.String
  ): Anon_NameNonKeyAttributes = {
    val __obj = js.Dynamic.literal(name = name, nonKeyAttributes = nonKeyAttributes, projectionType = projectionType, rangeKey = rangeKey)
  
    __obj.asInstanceOf[Anon_NameNonKeyAttributes]
  }
}

