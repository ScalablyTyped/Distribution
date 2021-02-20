package typings.sharepoint.SP.Utilities

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Set extends StObject {
  
  /** Adds an item to the set */
  def Add(item: js.Any): js.Any = js.native
  
  /** Adds all items from array to the set, and returns the set */
  def AddArray(array: js.Array[_]): Set = js.native
  
  /** Clears all the items from set */
  def Clear(): Set = js.native
  
  /** Returns a copy of this set */
  def Clone(): Set = js.native
  
  /** Returns true if item exists in this set */
  def Contains(item: js.Any): Boolean = js.native
  
  /** Returns a set that contains all the items that are in this set but not in the otherSet */
  def Difference(otherSet: Set): Set = js.native
  
  /** Returns first item in the set */
  def First(): js.Any = js.native
  
  /** Returns the underlying collection of items as dictionary.
    Items are the keys, and values are always 1.
    So the return value may be either { [item: string]: number } or { [item: number]: number } */
  def GetCollection(): js.Any = js.native
  
  /** Returns a new set, that contains only items that exist both in this set and the otherSet */
  def Intersection(otherSet: Set): Set = js.native
  
  /** Returns true if the set is empty */
  def IsEmpty(): Boolean = js.native
  
  /** Removes the specified item from the set and returns the removed item */
  def Remove(item: js.Any): js.Any = js.native
  
  /** Returns a set that contains all the items that exist only in one of the sets (this and other), but not in both */
  def SymmetricDifference(otherSet: Set): Set = js.native
  
  /** Returns all items from the set as an array */
  def ToArray(): js.Array[_] = js.native
  
  /** Returns a new set, that contains items from this set and otherSet */
  def Union(otherSet: Set): Set = js.native
  
  /** Adds all items from otherSet to this set, and returns this set */
  def UnionWith(otherSet: Set): Set = js.native
}
object Set {
  
  @scala.inline
  def apply(
    Add: js.Any => js.Any,
    AddArray: js.Array[_] => Set,
    Clear: () => Set,
    Clone: () => Set,
    Contains: js.Any => Boolean,
    Difference: Set => Set,
    First: () => js.Any,
    GetCollection: () => js.Any,
    Intersection: Set => Set,
    IsEmpty: () => Boolean,
    Remove: js.Any => js.Any,
    SymmetricDifference: Set => Set,
    ToArray: () => js.Array[_],
    Union: Set => Set,
    UnionWith: Set => Set
  ): Set = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), AddArray = js.Any.fromFunction1(AddArray), Clear = js.Any.fromFunction0(Clear), Clone = js.Any.fromFunction0(Clone), Contains = js.Any.fromFunction1(Contains), Difference = js.Any.fromFunction1(Difference), First = js.Any.fromFunction0(First), GetCollection = js.Any.fromFunction0(GetCollection), Intersection = js.Any.fromFunction1(Intersection), IsEmpty = js.Any.fromFunction0(IsEmpty), Remove = js.Any.fromFunction1(Remove), SymmetricDifference = js.Any.fromFunction1(SymmetricDifference), ToArray = js.Any.fromFunction0(ToArray), Union = js.Any.fromFunction1(Union), UnionWith = js.Any.fromFunction1(UnionWith))
    __obj.asInstanceOf[Set]
  }
  
  @scala.inline
  implicit class SetMutableBuilder[Self <: Set] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: js.Any => js.Any): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddArray(value: js.Array[_] => Set): Self = StObject.set(x, "AddArray", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Set): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClone(value: () => Set): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setContains(value: js.Any => Boolean): Self = StObject.set(x, "Contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDifference(value: Set => Set): Self = StObject.set(x, "Difference", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFirst(value: () => js.Any): Self = StObject.set(x, "First", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCollection(value: () => js.Any): Self = StObject.set(x, "GetCollection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIntersection(value: Set => Set): Self = StObject.set(x, "Intersection", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "IsEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemove(value: js.Any => js.Any): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSymmetricDifference(value: Set => Set): Self = StObject.set(x, "SymmetricDifference", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToArray(value: () => js.Array[_]): Self = StObject.set(x, "ToArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUnion(value: Set => Set): Self = StObject.set(x, "Union", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnionWith(value: Set => Set): Self = StObject.set(x, "UnionWith", js.Any.fromFunction1(value))
  }
}
