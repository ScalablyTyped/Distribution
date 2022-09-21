package typings.reactBulmaComponents.anon

import typings.react.mod.ReactElement
import typings.reactBulmaComponents.columnsMod.ColumnProps
import typings.reactBulmaComponents.componentsMod.BulmaComponent
import typings.reactBulmaComponents.componentsMod.ElementProps
import typings.reactBulmaComponents.reactBulmaComponentsStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Column extends StObject {
  
  var Column: BulmaComponent[ColumnProps, div]
}
object Column {
  
  inline def apply(Column: /* props */ ColumnProps & (ElementProps[ColumnProps, div]) => ReactElement): Column = {
    val __obj = js.Dynamic.literal(Column = js.Any.fromFunction1(Column))
    __obj.asInstanceOf[Column]
  }
  
  extension [Self <: Column](x: Self) {
    
    inline def setColumn(value: /* props */ ColumnProps & (ElementProps[ColumnProps, div]) => ReactElement): Self = StObject.set(x, "Column", js.Any.fromFunction1(value))
  }
}
