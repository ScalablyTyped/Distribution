package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyName extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var parameters: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var serializationLibrary: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_KeyName {
  @scala.inline
  def apply(
    name: java.lang.String = null,
    parameters: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    serializationLibrary: java.lang.String = null
  ): Anon_KeyName = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (parameters != null) __obj.updateDynamic("parameters")(parameters)
    if (serializationLibrary != null) __obj.updateDynamic("serializationLibrary")(serializationLibrary)
    __obj.asInstanceOf[Anon_KeyName]
  }
}

