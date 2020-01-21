package typings.reactWithStyles.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WithStylesProps[T] extends js.Object {
  var styles: StringDictionary[js.Object]
  var theme: T
  /**
    * This function takes styles that were processed by `withStyles()`, plain objects, or arrays
    * of these things. It returns an object with an opaque structure that must be spread into a
    * JSX element.
    */
  def css(styles: js.Any*): js.Object
}

object WithStylesProps {
  @scala.inline
  def apply[T](css: /* repeated */ js.Any => js.Object, styles: StringDictionary[js.Object], theme: T): WithStylesProps[T] = {
    val __obj = js.Dynamic.literal(css = js.Any.fromFunction1(css), styles = styles.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WithStylesProps[T]]
  }
}

