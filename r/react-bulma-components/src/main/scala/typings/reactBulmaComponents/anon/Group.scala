package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import typings.reactBulmaComponents.srcComponentsButtonMod.ButtonGroupProps
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponent
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Group extends StObject {
  
  var Group: BulmaComponent[ButtonGroupProps, div]
}
object Group {
  
  inline def apply(Group: /* props */ ButtonGroupProps & (ElementProps[ButtonGroupProps, div]) => ReactElement): Group = {
    val __obj = js.Dynamic.literal(Group = js.Any.fromFunction1(Group))
    __obj.asInstanceOf[Group]
  }
  
  extension [Self <: Group](x: Self) {
    
    inline def setGroup(value: /* props */ ButtonGroupProps & (ElementProps[ButtonGroupProps, div]) => ReactElement): Self = StObject.set(x, "Group", js.Any.fromFunction1(value))
  }
}
