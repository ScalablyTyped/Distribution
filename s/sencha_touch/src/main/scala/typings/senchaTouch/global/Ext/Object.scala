package typings.senchaTouch.global.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Object")
@js.native
class Object ()
  extends typings.senchaTouch.Ext.Object

/* static members */
@JSGlobal("Ext.Object")
@js.native
object Object extends js.Object {
  /** [Method] Returns a new object with the given object as the prototype chain
    * @param object Object The prototype chain for the new object.
    */
  def chain(): Unit = js.native
  def chain(`object`: js.Any): Unit = js.native
  /** [Method] Iterate through an object and invoke the given callback function for each iteration
    * @param object Object The object to iterate
    * @param fn Function The callback function.
    * @param scope Object The execution scope (this) of the callback function
    */
  def each(): Unit = js.native
  def each(`object`: js.Any): Unit = js.native
  def each(`object`: js.Any, fn: js.Any): Unit = js.native
  def each(`object`: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  /** [Method] Converts a query string back into an object
    * @param queryString String The query string to decode.
    * @param recursive Boolean Whether or not to recursively decode the string. This format is supported by PHP / Ruby on Rails servers and similar.
    * @returns Object
    */
  def fromQueryString(): js.Any = js.native
  def fromQueryString(queryString: java.lang.String): js.Any = js.native
  def fromQueryString(queryString: java.lang.String, recursive: Boolean): js.Any = js.native
  /** [Method] Returns the first matching key corresponding to the given value
    * @param object Object
    * @param value Object The value to find
    */
  def getKey(): Unit = js.native
  def getKey(`object`: js.Any): Unit = js.native
  def getKey(`object`: js.Any, value: js.Any): Unit = js.native
  /** [Method] Gets all keys of the given object as an array
    * @param object Object
    * @returns String[] An array of keys from the object.
    */
  def getKeys(): typings.senchaTouch.Ext.Array = js.native
  def getKeys(`object`: js.Any): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Gets the total number of this object s own properties
    * @param object Object
    * @returns Number size
    */
  def getSize(): Double = js.native
  def getSize(`object`: js.Any): Double = js.native
  /** [Method] Gets all values of the given object as an array
    * @param object Object
    * @returns Array An array of values from the object.
    */
  def getValues(): typings.senchaTouch.Ext.Array = js.native
  def getValues(`object`: js.Any): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Merges any number of objects recursively without referencing them or their children
    * @param source Object The first object into which to merge the others.
    * @param objs Object... One or more objects to be merged into the first.
    * @returns Object The object that is created as a result of merging all the objects passed in.
    */
  def merge(source: js.Any, objs: js.Any*): js.Any = js.native
  /** [Method]
    * @param source Object
    */
  def mergeIf(): Unit = js.native
  def mergeIf(source: js.Any): Unit = js.native
  /** [Method] Convert a name  value pair to an array of objects with support for nested structures useful to construct query stri
    * @param name String
    * @param value Object
    * @param recursive Boolean true to recursively encode any sub-objects.
    * @returns Object[] Array of objects with name and value fields.
    */
  def toQueryObjects(): typings.senchaTouch.Ext.Array = js.native
  def toQueryObjects(name: java.lang.String): typings.senchaTouch.Ext.Array = js.native
  def toQueryObjects(name: java.lang.String, value: js.Any): typings.senchaTouch.Ext.Array = js.native
  def toQueryObjects(name: java.lang.String, value: js.Any, recursive: Boolean): typings.senchaTouch.Ext.Array = js.native
  /** [Method] Takes an object and converts it to an encoded query string
    * @param object Object The object to encode.
    * @param recursive Boolean Whether or not to interpret the object in recursive format. (PHP / Ruby on Rails servers and similar).
    * @returns String queryString
    */
  def toQueryString(): java.lang.String = js.native
  def toQueryString(`object`: js.Any): java.lang.String = js.native
  def toQueryString(`object`: js.Any, recursive: Boolean): java.lang.String = js.native
}

