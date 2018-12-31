package typings
package reactDashAriaDashMenubuttonLib.reactDashAriaDashMenubuttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItemProps[T /* <: reactLib.HTMLElement */]
  extends reactLib.reactMod.ReactNs.HTMLAttributes[T] {
  /**
  	 * The HTML tag for this element. Default: 'span'.
  	 */
  var tag: /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.UndefOr[
    /* import warning: ImportType.apply Failed type conversion: T['tagName'] */ js.Any
  ] = js.undefined
  /**
  	 * If `text` has a value, its first letter will be the letter a user can
  	 * type to navigate to that item.
  	 */
  var text: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * If value has a value, it will be passed to the onSelection handler
  	 * when the `MenuItem` is selected
  	 */
  var value: js.UndefOr[java.lang.String | scala.Boolean | scala.Double] = js.undefined
}

