package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeySkewedColumnNames extends js.Object {
  var skewedColumnNames: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var skewedColumnValueLocationMaps: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  var skewedColumnValues: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_KeySkewedColumnNames {
  @scala.inline
  def apply(
    skewedColumnNames: js.Array[java.lang.String] = null,
    skewedColumnValueLocationMaps: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    skewedColumnValues: js.Array[java.lang.String] = null
  ): Anon_KeySkewedColumnNames = {
    val __obj = js.Dynamic.literal()
    if (skewedColumnNames != null) __obj.updateDynamic("skewedColumnNames")(skewedColumnNames)
    if (skewedColumnValueLocationMaps != null) __obj.updateDynamic("skewedColumnValueLocationMaps")(skewedColumnValueLocationMaps)
    if (skewedColumnValues != null) __obj.updateDynamic("skewedColumnValues")(skewedColumnValues)
    __obj.asInstanceOf[Anon_KeySkewedColumnNames]
  }
}

