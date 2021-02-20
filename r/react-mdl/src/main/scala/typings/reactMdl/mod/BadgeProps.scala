package typings.reactMdl.mod

import typings.react.mod.ClassAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BadgeProps
  extends ClassAttributes[js.Any] {
  
  var className: js.UndefOr[String] = js.native
  
  var noBackground: js.UndefOr[Boolean] = js.native
  
  var overlap: js.UndefOr[Boolean] = js.native
  
  var text: String | Double = js.native
}
object BadgeProps {
  
  @scala.inline
  def apply(text: String | Double): BadgeProps = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
  
  @scala.inline
  implicit class BadgePropsMutableBuilder[Self <: BadgeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setNoBackground(value: Boolean): Self = StObject.set(x, "noBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoBackgroundUndefined: Self = StObject.set(x, "noBackground", js.undefined)
    
    @scala.inline
    def setOverlap(value: Boolean): Self = StObject.set(x, "overlap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverlapUndefined: Self = StObject.set(x, "overlap", js.undefined)
    
    @scala.inline
    def setText(value: String | Double): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
