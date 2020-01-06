package typings.atPulumiAws.typesOutputMod.glue

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CatalogTableStorageDescriptorSkewedInfo extends js.Object {
  /**
    * A list of names of columns that contain skewed values.
    */
  var skewedColumnNames: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of values that appear so frequently as to be considered skewed.
    */
  var skewedColumnValueLocationMaps: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * A mapping of skewed values to the columns that contain them.
    */
  var skewedColumnValues: js.UndefOr[js.Array[String]] = js.native
}

object CatalogTableStorageDescriptorSkewedInfo {
  @scala.inline
  def apply(
    skewedColumnNames: js.Array[String] = null,
    skewedColumnValueLocationMaps: StringDictionary[String] = null,
    skewedColumnValues: js.Array[String] = null
  ): CatalogTableStorageDescriptorSkewedInfo = {
    val __obj = js.Dynamic.literal()
    if (skewedColumnNames != null) __obj.updateDynamic("skewedColumnNames")(skewedColumnNames.asInstanceOf[js.Any])
    if (skewedColumnValueLocationMaps != null) __obj.updateDynamic("skewedColumnValueLocationMaps")(skewedColumnValueLocationMaps.asInstanceOf[js.Any])
    if (skewedColumnValues != null) __obj.updateDynamic("skewedColumnValues")(skewedColumnValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[CatalogTableStorageDescriptorSkewedInfo]
  }
}

