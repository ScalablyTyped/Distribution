package typings
package showdownLib.showdownMod.ShowdownNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If you'd just like to do everything yourself,you can specify a filter property.
  * The filter property should be a function that acts as a callback.
  */
trait FilterExtension extends Extension {
  var filter: js.UndefOr[
    js.Function3[
      /* text */ java.lang.String, 
      /* converter */ Converter, 
      /* options */ js.UndefOr[ConverterOptions], 
      java.lang.String
    ]
  ] = js.undefined
}

object FilterExtension {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    filter: js.Function3[
      /* text */ java.lang.String, 
      /* converter */ Converter, 
      /* options */ js.UndefOr[ConverterOptions], 
      java.lang.String
    ] = null
  ): FilterExtension = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    __obj.asInstanceOf[FilterExtension]
  }
}

