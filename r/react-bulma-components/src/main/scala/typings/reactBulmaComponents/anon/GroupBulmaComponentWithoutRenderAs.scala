package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.reactBulmaComponentsStrings.renderAs
import typings.reactBulmaComponents.reactBulmaComponentsStrings.span
import typings.reactBulmaComponents.srcComponentsMod.BulmaComponentWithoutRenderAs
import typings.reactBulmaComponents.srcComponentsMod.ElementProps
import typings.reactBulmaComponents.srcComponentsTagMod.TagGroupProps
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupBulmaComponentWithoutRenderAs extends StObject {
  
  var Group: BulmaComponentWithoutRenderAs[TagGroupProps, span]
}
object GroupBulmaComponentWithoutRenderAs {
  
  inline def apply(
    Group: /* props */ TagGroupProps & (Omit[ElementProps[TagGroupProps, span], renderAs]) => ReactElement
  ): GroupBulmaComponentWithoutRenderAs = {
    val __obj = js.Dynamic.literal(Group = js.Any.fromFunction1(Group))
    __obj.asInstanceOf[GroupBulmaComponentWithoutRenderAs]
  }
  
  extension [Self <: GroupBulmaComponentWithoutRenderAs](x: Self) {
    
    inline def setGroup(
      value: /* props */ TagGroupProps & (Omit[ElementProps[TagGroupProps, span], renderAs]) => ReactElement
    ): Self = StObject.set(x, "Group", js.Any.fromFunction1(value))
  }
}
