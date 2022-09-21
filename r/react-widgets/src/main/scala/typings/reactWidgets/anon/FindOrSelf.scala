package typings.reactWidgets.anon

import typings.reactWidgets.typesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindOrSelf extends StObject {
  
  def findOrSelf[TDataItem](data: js.Array[TDataItem], value: Value): TDataItem
  
  def includes(data: js.Array[typings.reactWidgets.typesMod.DataItem], value: Value): Boolean
  
  def indexOf(data: js.Array[typings.reactWidgets.typesMod.DataItem], value: Value): Double
  
  def matches(a: typings.reactWidgets.typesMod.DataItem, b: typings.reactWidgets.typesMod.DataItem): Boolean
  
  def text(item: typings.reactWidgets.typesMod.DataItem): String
  
  def value(item: typings.reactWidgets.typesMod.DataItem): Any
}
object FindOrSelf {
  
  inline def apply(
    findOrSelf: (js.Array[Any], Value) => Any,
    includes: (js.Array[typings.reactWidgets.typesMod.DataItem], Value) => Boolean,
    indexOf: (js.Array[typings.reactWidgets.typesMod.DataItem], Value) => Double,
    matches: (typings.reactWidgets.typesMod.DataItem, typings.reactWidgets.typesMod.DataItem) => Boolean,
    text: typings.reactWidgets.typesMod.DataItem => String,
    value: typings.reactWidgets.typesMod.DataItem => Any
  ): FindOrSelf = {
    val __obj = js.Dynamic.literal(findOrSelf = js.Any.fromFunction2(findOrSelf), includes = js.Any.fromFunction2(includes), indexOf = js.Any.fromFunction2(indexOf), matches = js.Any.fromFunction2(matches), text = js.Any.fromFunction1(text), value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[FindOrSelf]
  }
  
  extension [Self <: FindOrSelf](x: Self) {
    
    inline def setFindOrSelf(value: (js.Array[Any], Value) => Any): Self = StObject.set(x, "findOrSelf", js.Any.fromFunction2(value))
    
    inline def setIncludes(value: (js.Array[typings.reactWidgets.typesMod.DataItem], Value) => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction2(value))
    
    inline def setIndexOf(value: (js.Array[typings.reactWidgets.typesMod.DataItem], Value) => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction2(value))
    
    inline def setMatches(value: (typings.reactWidgets.typesMod.DataItem, typings.reactWidgets.typesMod.DataItem) => Boolean): Self = StObject.set(x, "matches", js.Any.fromFunction2(value))
    
    inline def setText(value: typings.reactWidgets.typesMod.DataItem => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    
    inline def setValue(value: typings.reactWidgets.typesMod.DataItem => Any): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
