package typings.atPulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeySkewedColumnNamesSkewedColumnValueLocationMaps extends js.Object {
  var skewedColumnNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var skewedColumnValueLocationMaps: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  var skewedColumnValues: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object Anon_KeySkewedColumnNamesSkewedColumnValueLocationMaps {
  @scala.inline
  def apply(
    skewedColumnNames: Input[js.Array[Input[String]]] = null,
    skewedColumnValueLocationMaps: Input[StringDictionary[Input[String]]] = null,
    skewedColumnValues: Input[js.Array[Input[String]]] = null
  ): Anon_KeySkewedColumnNamesSkewedColumnValueLocationMaps = {
    val __obj = js.Dynamic.literal()
    if (skewedColumnNames != null) __obj.updateDynamic("skewedColumnNames")(skewedColumnNames.asInstanceOf[js.Any])
    if (skewedColumnValueLocationMaps != null) __obj.updateDynamic("skewedColumnValueLocationMaps")(skewedColumnValueLocationMaps.asInstanceOf[js.Any])
    if (skewedColumnValues != null) __obj.updateDynamic("skewedColumnValues")(skewedColumnValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_KeySkewedColumnNamesSkewedColumnValueLocationMaps]
  }
}

