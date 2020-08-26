package typings.reactNativeFirebase.mod.RNFirebase.database

import typings.reactNativeFirebase.anon.Priority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSnapshot extends js.Object {
  var key: String | Null = js.native
  var ref: Reference = js.native
  def child(path: String): DataSnapshot = js.native
  def exists(): Boolean = js.native
  def exportVal(): Priority = js.native
  def forEach(action: js.Function1[/* a */ this.type, Boolean]): Boolean = js.native
  def getPriority(): String | Double | Null = js.native
  def hasChild(path: String): Boolean = js.native
  def hasChildren(): Boolean = js.native
  def numChildren(): Double = js.native
  def toJSON(): js.Object | Null = js.native
  def `val`(): js.Any = js.native
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
    `val`: () => js.Any
  ): DataSnapshot = {
    val __obj = js.Dynamic.literal(child = js.Any.fromFunction1(child), exists = js.Any.fromFunction0(exists), exportVal = js.Any.fromFunction0(exportVal), forEach = js.Any.fromFunction1(forEach), getPriority = js.Any.fromFunction0(getPriority), hasChild = js.Any.fromFunction1(hasChild), hasChildren = js.Any.fromFunction0(hasChildren), numChildren = js.Any.fromFunction0(numChildren), ref = ref.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.updateDynamic("val")(js.Any.fromFunction0(`val`))
    __obj.asInstanceOf[DataSnapshot]
  }
  @scala.inline
  implicit class DataSnapshotOps[Self <: DataSnapshot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChild(value: String => DataSnapshot): Self = this.set("child", js.Any.fromFunction1(value))
    @scala.inline
    def setExists(value: () => Boolean): Self = this.set("exists", js.Any.fromFunction0(value))
    @scala.inline
    def setExportVal(value: () => Priority): Self = this.set("exportVal", js.Any.fromFunction0(value))
    @scala.inline
    def setForEach(value: js.Function1[DataSnapshot, Boolean] => Boolean): Self = this.set("forEach", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPriority(value: () => String | Double | Null): Self = this.set("getPriority", js.Any.fromFunction0(value))
    @scala.inline
    def setHasChild(value: String => Boolean): Self = this.set("hasChild", js.Any.fromFunction1(value))
    @scala.inline
    def setHasChildren(value: () => Boolean): Self = this.set("hasChildren", js.Any.fromFunction0(value))
    @scala.inline
    def setNumChildren(value: () => Double): Self = this.set("numChildren", js.Any.fromFunction0(value))
    @scala.inline
    def setRef(value: Reference): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setToJSON(value: () => js.Object | Null): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setVal(value: () => js.Any): Self = this.set("val", js.Any.fromFunction0(value))
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
  }
  
}

