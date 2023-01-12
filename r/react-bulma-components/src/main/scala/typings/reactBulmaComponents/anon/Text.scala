package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.span
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Text extends StObject {
  
  var Text: BulmaComponent[js.Object, span]
}
object Text {
  
  inline def apply(Text: /* props */ js.Object & (ElementProps[js.Object, span]) => ReactElement): Text = {
    val __obj = js.Dynamic.literal(Text = js.Any.fromFunction1(Text))
    __obj.asInstanceOf[Text]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
    
    inline def setText(value: /* props */ js.Object & (ElementProps[js.Object, span]) => ReactElement): Self = StObject.set(x, "Text", js.Any.fromFunction1(value))
  }
}
