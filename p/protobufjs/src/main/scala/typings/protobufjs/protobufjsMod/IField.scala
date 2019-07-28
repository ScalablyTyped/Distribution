package typings.protobufjs.protobufjsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IField extends js.Object {
  /** Field id */
  var id: Double
  /** Field options */
  var options: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /** Field rule */
  var rule: js.UndefOr[String] = js.undefined
  /** Field type */
  var `type`: String
}

object IField {
  @scala.inline
  def apply(id: Double, `type`: String, options: StringDictionary[js.Any] = null, rule: String = null): IField = {
    val __obj = js.Dynamic.literal(id = id)
    __obj.updateDynamic("type")(`type`)
    if (options != null) __obj.updateDynamic("options")(options)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    __obj.asInstanceOf[IField]
  }
}

