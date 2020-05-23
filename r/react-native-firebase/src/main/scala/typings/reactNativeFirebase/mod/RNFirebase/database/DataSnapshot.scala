package typings.reactNativeFirebase.mod.RNFirebase.database

import typings.reactNativeFirebase.anon.Priority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSnapshot extends js.Object {
  var key: String | Null
  var ref: Reference
  def child(path: String): DataSnapshot
  def exists(): Boolean
  def exportVal(): Priority
  def forEach(action: js.Function1[/* a */ this.type, Boolean]): Boolean
  def getPriority(): String | Double | Null
  def hasChild(path: String): Boolean
  def hasChildren(): Boolean
  def numChildren(): Double
  def toJSON(): js.Object | Null
  def `val`(): js.Any
}

object DataSnapshot {
  @scala.inline
  def apply(
    child: String => DataSnapshot,
    exists: () => Boolean,
    exportVal: () => Priority,
    forEach: js.Function1[DataSnapshot, Boolean] => Boolean,
    getPriority: () => String | Double | Null,
    hasChild: String => Boolean,
    hasChildren: () => Boolean,
    numChildren: () => Double,
    ref: Reference,
    toJSON: () => js.Object | Null,
    `val`: () => js.Any,
    key: String = null
  ): DataSnapshot = {
    val __obj = js.Dynamic.literal(child = js.Any.fromFunction1(child), exists = js.Any.fromFunction0(exists), exportVal = js.Any.fromFunction0(exportVal), forEach = js.Any.fromFunction1(forEach), getPriority = js.Any.fromFunction0(getPriority), hasChild = js.Any.fromFunction1(hasChild), hasChildren = js.Any.fromFunction0(hasChildren), numChildren = js.Any.fromFunction0(numChildren), ref = ref.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
    __obj.asInstanceOf[DataSnapshot]
  }
}

