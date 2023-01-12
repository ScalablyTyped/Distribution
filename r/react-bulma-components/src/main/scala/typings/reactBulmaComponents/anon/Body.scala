package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.srcComponentsFormMod.FieldLabelProps
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var Body: BulmaComponent[js.Object, div]
  
  var Label: BulmaComponent[FieldLabelProps, div]
}
object Body {
  
  inline def apply(
    Body: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement,
    Label: /* props */ FieldLabelProps & (ElementProps[FieldLabelProps, div]) => ReactElement
  ): Body = {
    val __obj = js.Dynamic.literal(Body = js.Any.fromFunction1(Body), Label = js.Any.fromFunction1(Label))
    __obj.asInstanceOf[Body]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Body] (val x: Self) extends AnyVal {
    
    inline def setBody(value: /* props */ js.Object & (ElementProps[js.Object, div]) => ReactElement): Self = StObject.set(x, "Body", js.Any.fromFunction1(value))
    
    inline def setLabel(value: /* props */ FieldLabelProps & (ElementProps[FieldLabelProps, div]) => ReactElement): Self = StObject.set(x, "Label", js.Any.fromFunction1(value))
  }
}
