package typings.reactWithStyles.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WithStylesProps[T] extends js.Object {
  
  /**
    * This function takes styles that were processed by `withStyles()`, plain objects, or arrays
    * of these things. It returns an object with an opaque structure that must be spread into a
    * JSX element.
    */
  def css(styles: js.Any*): js.Object = js.native
  
  var styles: StringDictionary[js.Object] = js.native
  
  var theme: T = js.native
}
object WithStylesProps {
  
  @scala.inline
  def apply[T](css: /* repeated */ js.Any => js.Object, styles: StringDictionary[js.Object], theme: T): WithStylesProps[T] = {
    val __obj = js.Dynamic.literal(css = js.Any.fromFunction1(css), styles = styles.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithStylesProps[T]]
  }
  
  @scala.inline
  implicit class WithStylesPropsOps[Self <: WithStylesProps[_], T] (val x: Self with WithStylesProps[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCss(value: /* repeated */ js.Any => js.Object): Self = this.set("css", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyles(value: StringDictionary[js.Object]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTheme(value: T): Self = this.set("theme", value.asInstanceOf[js.Any])
  }
}
