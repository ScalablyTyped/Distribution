package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IField extends js.Object {
  /** Field id */
  var id: scala.Double
  /** Field options */
  var options: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /** Field rule */
  var rule: js.UndefOr[java.lang.String] = js.undefined
  /** Field type */
  var `type`: java.lang.String
}

object IField {
  @scala.inline
  def apply(
    id: scala.Double,
    `type`: java.lang.String,
    options: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    rule: java.lang.String = null
  ): IField = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[IField]
  }
}

