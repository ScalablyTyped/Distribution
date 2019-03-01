package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeySkewedColumnNamesSkewedColumnValueLocationMaps extends js.Object {
  var skewedColumnNames: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var skewedColumnValueLocationMaps: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ]
  ] = js.undefined
  var skewedColumnValues: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
}

object Anon_KeySkewedColumnNamesSkewedColumnValueLocationMaps {
  @scala.inline
  def apply(
    skewedColumnNames: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    skewedColumnValueLocationMaps: atPulumiPulumiLib.outputMod.Input[
      org.scalablytyped.runtime.StringDictionary[atPulumiPulumiLib.outputMod.Input[java.lang.String]]
    ] = null,
    skewedColumnValues: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null
  ): Anon_KeySkewedColumnNamesSkewedColumnValueLocationMaps = {
    val __obj = js.Dynamic.literal()
    if (skewedColumnNames != null) __obj.updateDynamic("skewedColumnNames")(skewedColumnNames.asInstanceOf[js.Any])
    if (skewedColumnValueLocationMaps != null) __obj.updateDynamic("skewedColumnValueLocationMaps")(skewedColumnValueLocationMaps.asInstanceOf[js.Any])
    if (skewedColumnValues != null) __obj.updateDynamic("skewedColumnValues")(skewedColumnValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeySkewedColumnNamesSkewedColumnValueLocationMaps]
  }
}

