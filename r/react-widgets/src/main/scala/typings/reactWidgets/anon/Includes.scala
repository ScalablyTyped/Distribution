package typings.reactWidgets.anon

import typings.reactWidgets.esmTypesMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Includes extends StObject {
  
  def findOrSelf[TDataItem](data: js.Array[TDataItem], value: Value): TDataItem
  
  def includes(data: js.Array[typings.reactWidgets.esmTypesMod.DataItem], value: Value): Boolean
  
  def indexOf(data: js.Array[typings.reactWidgets.esmTypesMod.DataItem], value: Value): Double
  
  def matches(a: typings.reactWidgets.esmTypesMod.DataItem, b: typings.reactWidgets.esmTypesMod.DataItem): Boolean
  
  def text(item: typings.reactWidgets.esmTypesMod.DataItem): String
  
  def value(item: typings.reactWidgets.esmTypesMod.DataItem): Any
}
object Includes {
  
  inline def apply(
    findOrSelf: (js.Array[Any], Value) => Any,
    includes: (js.Array[typings.reactWidgets.esmTypesMod.DataItem], Value) => Boolean,
    indexOf: (js.Array[typings.reactWidgets.esmTypesMod.DataItem], Value) => Double,
    matches: (typings.reactWidgets.esmTypesMod.DataItem, typings.reactWidgets.esmTypesMod.DataItem) => Boolean,
    text: typings.reactWidgets.esmTypesMod.DataItem => String,
    value: typings.reactWidgets.esmTypesMod.DataItem => Any
  ): Includes = {
    val __obj = js.Dynamic.literal(findOrSelf = js.Any.fromFunction2(findOrSelf), includes = js.Any.fromFunction2(includes), indexOf = js.Any.fromFunction2(indexOf), matches = js.Any.fromFunction2(matches), text = js.Any.fromFunction1(text), value = js.Any.fromFunction1(value))
    __obj.asInstanceOf[Includes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Includes] (val x: Self) extends AnyVal {
    
    inline def setFindOrSelf(value: (js.Array[Any], Value) => Any): Self = StObject.set(x, "findOrSelf", js.Any.fromFunction2(value))
    
    inline def setIncludes(value: (js.Array[typings.reactWidgets.esmTypesMod.DataItem], Value) => Boolean): Self = StObject.set(x, "includes", js.Any.fromFunction2(value))
    
    inline def setIndexOf(value: (js.Array[typings.reactWidgets.esmTypesMod.DataItem], Value) => Double): Self = StObject.set(x, "indexOf", js.Any.fromFunction2(value))
    
    inline def setMatches(
      value: (typings.reactWidgets.esmTypesMod.DataItem, typings.reactWidgets.esmTypesMod.DataItem) => Boolean
    ): Self = StObject.set(x, "matches", js.Any.fromFunction2(value))
    
    inline def setText(value: typings.reactWidgets.esmTypesMod.DataItem => String): Self = StObject.set(x, "text", js.Any.fromFunction1(value))
    
    inline def setValue(value: typings.reactWidgets.esmTypesMod.DataItem => Any): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
  }
}
