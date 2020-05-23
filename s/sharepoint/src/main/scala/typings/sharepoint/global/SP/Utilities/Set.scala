package typings.sharepoint.global.SP.Utilities

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Utilities.Set")
@js.native
class Set ()
  extends typings.sharepoint.SP.Utilities.Set {
  def this(items: NumberDictionary[Double]) = this()
  def this(items: StringDictionary[Double]) = this()
  /** Adds an item to the set */
  /* CompleteClass */
  override def Add(item: js.Any): js.Any = js.native
  /** Adds all items from array to the set, and returns the set */
  /* CompleteClass */
  override def AddArray(array: js.Array[_]): typings.sharepoint.SP.Utilities.Set = js.native
  /** Clears all the items from set */
  /* CompleteClass */
  override def Clear(): typings.sharepoint.SP.Utilities.Set = js.native
  /** Returns a copy of this set */
  /* CompleteClass */
  override def Clone(): typings.sharepoint.SP.Utilities.Set = js.native
  /** Returns true if item exists in this set */
  /* CompleteClass */
  override def Contains(item: js.Any): Boolean = js.native
  /** Returns a set that contains all the items that are in this set but not in the otherSet */
  /* CompleteClass */
  override def Difference(otherSet: typings.sharepoint.SP.Utilities.Set): typings.sharepoint.SP.Utilities.Set = js.native
  /** Returns first item in the set */
  /* CompleteClass */
  override def First(): js.Any = js.native
  /** Returns the underlying collection of items as dictionary.
    Items are the keys, and values are always 1.
    So the return value may be either { [item: string]: number } or { [item: number]: number } */
  /* CompleteClass */
  override def GetCollection(): js.Any = js.native
  /** Returns a new set, that contains only items that exist both in this set and the otherSet */
  /* CompleteClass */
  override def Intersection(otherSet: typings.sharepoint.SP.Utilities.Set): typings.sharepoint.SP.Utilities.Set = js.native
  /** Returns true if the set is empty */
  /* CompleteClass */
  override def IsEmpty(): Boolean = js.native
  /** Removes the specified item from the set and returns the removed item */
  /* CompleteClass */
  override def Remove(item: js.Any): js.Any = js.native
  /** Returns a set that contains all the items that exist only in one of the sets (this and other), but not in both */
  /* CompleteClass */
  override def SymmetricDifference(otherSet: typings.sharepoint.SP.Utilities.Set): typings.sharepoint.SP.Utilities.Set = js.native
  /** Returns all items from the set as an array */
  /* CompleteClass */
  override def ToArray(): js.Array[_] = js.native
  /** Returns a new set, that contains items from this set and otherSet */
  /* CompleteClass */
  override def Union(otherSet: typings.sharepoint.SP.Utilities.Set): typings.sharepoint.SP.Utilities.Set = js.native
  /** Adds all items from otherSet to this set, and returns this set */
  /* CompleteClass */
  override def UnionWith(otherSet: typings.sharepoint.SP.Utilities.Set): typings.sharepoint.SP.Utilities.Set = js.native
}

