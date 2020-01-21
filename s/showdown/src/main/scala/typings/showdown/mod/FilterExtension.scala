package typings.showdown.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * If you'd just like to do everything yourself,you can specify a filter property.
  * The filter property should be a function that acts as a callback.
  * 
  * @example
  * ```ts
  * let myExt: ShowdownExtension = { 
  *   type: 'lang',
  *   filter: (text: string, converter: Converter) => text.replace('#', '*') 
  * };
  * ```
  */
trait FilterExtension extends Extension_ {
  var filter: js.UndefOr[
    js.Function3[
      /* text */ String, 
      /* converter */ Converter, 
      /* options */ js.UndefOr[ConverterOptions], 
      String
    ]
  ] = js.undefined
}

object FilterExtension {
  @scala.inline
  def apply(
    `type`: String,
    filter: (/* text */ String, /* converter */ Converter, /* options */ js.UndefOr[ConverterOptions]) => String = null,
    listeners: StringDictionary[EventListener] = null
  ): FilterExtension = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction3(filter))
    if (listeners != null) __obj.updateDynamic("listeners")(listeners.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterExtension]
  }
}

