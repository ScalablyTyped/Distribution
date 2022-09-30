package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to describe a set of layers that an object belongs to or interacts with. See SceneObject’s layer property, Camera’s renderLayer property, and LightSource’s renderLayer property. */
trait LayerSet extends StObject {
  
  /** Returns true if all layers in the other LayerSet are also present in this one. */
  def contains(other: LayerSet): Boolean
  
  /** Returns a new LayerSet that contains layers present in this LayerSet but not present in other. */
  def except(other: LayerSet): LayerSet
  
  /** Returns a new LayerSet that only contains layers present in both this LayerSet and other. */
  def intersect(other: LayerSet): LayerSet
  
  /** Returns true if this LayerSet contains no layers. */
  def isEmpty(): Boolean
  
  /** Returns a new LayerSet combining this LayerSet and other. */
  def union(other: LayerSet): LayerSet
}
object LayerSet {
  
  inline def apply(
    contains: LayerSet => Boolean,
    except: LayerSet => LayerSet,
    intersect: LayerSet => LayerSet,
    isEmpty: () => Boolean,
    union: LayerSet => LayerSet
  ): LayerSet = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), except = js.Any.fromFunction1(except), intersect = js.Any.fromFunction1(intersect), isEmpty = js.Any.fromFunction0(isEmpty), union = js.Any.fromFunction1(union))
    __obj.asInstanceOf[LayerSet]
  }
  
  extension [Self <: LayerSet](x: Self) {
    
    inline def setContains(value: LayerSet => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    inline def setExcept(value: LayerSet => LayerSet): Self = StObject.set(x, "except", js.Any.fromFunction1(value))
    
    inline def setIntersect(value: LayerSet => LayerSet): Self = StObject.set(x, "intersect", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    inline def setUnion(value: LayerSet => LayerSet): Self = StObject.set(x, "union", js.Any.fromFunction1(value))
  }
}
