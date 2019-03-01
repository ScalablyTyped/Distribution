package typings
package stompjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SupportedVersions extends js.Object {
  var V1_0: java.lang.String
  var V1_1: java.lang.String
  var V1_2: java.lang.String
  def supportedVersions(): js.Array[java.lang.String]
}

object Anon_SupportedVersions {
  @scala.inline
  def apply(
    V1_0: java.lang.String,
    V1_1: java.lang.String,
    V1_2: java.lang.String,
    supportedVersions: js.Function0[js.Array[java.lang.String]]
  ): Anon_SupportedVersions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("V1_0")(V1_0)
    __obj.updateDynamic("V1_1")(V1_1)
    __obj.updateDynamic("V1_2")(V1_2)
    __obj.updateDynamic("supportedVersions")(supportedVersions)
    __obj.asInstanceOf[Anon_SupportedVersions]
  }
}

