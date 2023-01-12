package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Icon extends StObject {
  
  var Icon: BulmaComponent[js.Object, div]
  
  var Title: BulmaComponent[js.Object, div]
}
object Icon {
  
  inline def apply(
    Icon: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement,
    Title: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement
  ): Icon = {
    val __obj = js.Dynamic.literal(Icon = js.Any.fromFunction1(Icon), Title = js.Any.fromFunction1(Title))
    __obj.asInstanceOf[Icon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
    
    inline def setIcon(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Icon", js.Any.fromFunction1(value))
    
    inline def setTitle(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Title", js.Any.fromFunction1(value))
  }
}
