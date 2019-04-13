package typings
package showdownLib.showdownMod

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
    filter: (/* text */ java.lang.String, /* converter */ Converter, /* options */ js.UndefOr[ConverterOptions]) => java.lang.String = null
  ): FilterExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3(filter))
    __obj.asInstanceOf[FilterExtension]
  }
}

