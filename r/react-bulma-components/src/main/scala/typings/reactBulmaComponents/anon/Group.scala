package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.buttonMod.ButtonGroupProps
import typings.reactBulmaComponents.componentsMod.BulmaComponent
import typings.reactBulmaComponents.componentsMod.ElementProps
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
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
