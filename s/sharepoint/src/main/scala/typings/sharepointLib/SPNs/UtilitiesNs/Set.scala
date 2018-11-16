package typings
package sharepointLib.SPNs.UtilitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Utilities.Set")
@js.native
class Set () extends js.Object {
  // tslint:disable-next-line: unified-signatures
  def this(items: ScalablyTyped.runtime.NumberDictionary[scala.Double]) = this()
  def this(items: ScalablyTyped.runtime.StringDictionary[scala.Double]) = this()
  /** Adds an item to the set */
  def Add(item: js.Any): js.Any = js.native
  /** Adds all items from array to the set, and returns the set */
  def AddArray(array: js.Array[_]): Set = js.native
  /** Clears all the items from set */
  def Clear(): Set = js.native
  /** Returns a copy of this set */
  def Clone(): Set = js.native
  /** Returns true if item exists in this set */
  def Contains(item: js.Any): scala.Boolean = js.native
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
  def IsEmpty(): scala.Boolean = js.native
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

