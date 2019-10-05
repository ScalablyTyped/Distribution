package typings.rbush.rbush

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RBush[T] extends js.Object {
  /** Returns all items of the tree. */
  def all(): js.Array[T] = js.native
  /** Remove all items */
  def clear(): RBush[T] = js.native
  /**
    * Returns true if there are any items intersecting the given bounding box,
    * otherwise false.
    */
  def collides(bbox: BBox): Boolean = js.native
  /**
    * Import previously exported data.
    *
    * Importing and exporting as JSON allows you to use RBush on both the server
    * (using Node.js) and the browser combined, e.g. first indexing the data on
    * the server and and then importing the resulting tree data on the client
    * for searching.
    *
    * Note that the nodeSize option passed to the constructor must be the same
    * in both trees for export/import to work properly.
    */
  def fromJSON(data: js.Any): RBush[T] = js.native
  /**
    * Insert an item. To insert many items, use load().
    */
  def insert(item: T): RBush[T] = js.native
  /**
    * Bulk-insert the given data into the tree.
    *
    * Bulk insertion is usually ~2-3 times faster than inserting items one by one.
    * After bulk loading (bulk insertion into an empty tree), subsequent query
    * performance is also ~20-30% better.
    *
    * Note that when you do bulk insertion into an existing tree, it bulk-loads
    * the given data into a separate tree and inserts the smaller tree into the
    * larger tree. This means that bulk insertion works very well for clustered
    * data (where items in one update are close to each other), but makes query
    * performance worse if the data is scattered.
    */
  def load(items: js.Array[T]): RBush[T] = js.native
  /**
    * Remove a previously inserted item.
    *
    * By default, RBush removes objects by reference. However, you can pass a
    * custom equals function to compare by value for removal, which is useful
    * when you only have a copy of the object you need removed (e.g. loaded
    * from server).
    */
  def remove(item: T): RBush[T] = js.native
  def remove(item: T, equals: js.Function2[/* a */ T, /* b */ T, Boolean]): RBush[T] = js.native
  /**
    * Returns an array of data items (points or rectangles) that the given
    * bounding box intersects.
    *
    * Note that the search method accepts a bounding box in {minX, minY, maxX, maxY}
    * format regardless of the format specified in the constructor (which only
    * affects inserted objects).
    */
  def search(bbox: BBox): js.Array[T] = js.native
  /**
    * Export data as JSON object.
    *
    * Importing and exporting as JSON allows you to use RBush on both the server
    * (using Node.js) and the browser combined, e.g. first indexing the data on
    * the server and and then importing the resulting tree data on the client
    * for searching.
    *
    * Note that the nodeSize option passed to the constructor must be the same
    * in both trees for export/import to work properly.
    */
  def toJSON(): js.Any = js.native
}

