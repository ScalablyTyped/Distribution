package typings.senchaTouch.global.Ext

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Object")
@js.native
class Object ()
  extends StObject
     with typings.senchaTouch.Ext.Object
/* static members */
object Object {
  
  @JSGlobal("Ext.Object")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Returns a new object with the given object as the prototype chain
    * @param object Object The prototype chain for the new object.
    */
  inline def chain(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")().asInstanceOf[Unit]
  inline def chain(`object`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Iterate through an object and invoke the given callback function for each iteration
    * @param object Object The object to iterate
    * @param fn Function The callback function.
    * @param scope Object The execution scope (this) of the callback function
    */
  inline def each(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")().asInstanceOf[Unit]
  inline def each(`object`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def each(`object`: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each(`object`: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each(`object`: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each(`object`: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each(`object`: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def each(`object`: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(`object`.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Converts a query string back into an object
    * @param queryString String The query string to decode.
    * @param recursive Boolean Whether or not to recursively decode the string. This format is supported by PHP / Ruby on Rails servers and similar.
    * @returns Object
    */
  inline def fromQueryString(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQueryString")().asInstanceOf[js.Any]
  inline def fromQueryString(queryString: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromQueryString")(queryString.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def fromQueryString(queryString: java.lang.String, recursive: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fromQueryString")(queryString.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def fromQueryString(queryString: Unit, recursive: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fromQueryString")(queryString.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method] Returns the first matching key corresponding to the given value
    * @param object Object
    * @param value Object The value to find
    */
  inline def getKey(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")().asInstanceOf[Unit]
  inline def getKey(`object`: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def getKey(`object`: js.Any, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getKey(`object`: Unit, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getKey")(`object`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Gets all keys of the given object as an array
    * @param object Object
    * @returns String[] An array of keys from the object.
    */
  inline def getKeys(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")().asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def getKeys(`object`: js.Any): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Gets the total number of this object s own properties
    * @param object Object
    * @returns Number size
    */
  inline def getSize(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")().asInstanceOf[Double]
  inline def getSize(`object`: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(`object`.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  /** [Method] Gets all values of the given object as an array
    * @param object Object
    * @returns Array An array of values from the object.
    */
  inline def getValues(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getValues")().asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def getValues(`object`: js.Any): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("getValues")(`object`.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Merges any number of objects recursively without referencing them or their children
    * @param source Object The first object into which to merge the others.
    * @param objs Object... One or more objects to be merged into the first.
    * @returns Object The object that is created as a result of merging all the objects passed in.
    */
  inline def merge(source: js.Any, objs: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(source.asInstanceOf[js.Any], objs.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /** [Method]
    * @param source Object
    */
  inline def mergeIf(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")().asInstanceOf[Unit]
  inline def mergeIf(source: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeIf")(source.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** [Method] Convert a name  value pair to an array of objects with support for nested structures useful to construct query stri
    * @param name String
    * @param value Object
    * @param recursive Boolean true to recursively encode any sub-objects.
    * @returns Object[] Array of objects with name and value fields.
    */
  inline def toQueryObjects(): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")().asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def toQueryObjects(name: java.lang.String): typings.senchaTouch.Ext.Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")(name.asInstanceOf[js.Any]).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def toQueryObjects(name: java.lang.String, value: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def toQueryObjects(name: java.lang.String, value: js.Any, recursive: Boolean): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def toQueryObjects(name: java.lang.String, value: Unit, recursive: Boolean): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def toQueryObjects(name: Unit, value: js.Any): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def toQueryObjects(name: Unit, value: js.Any, recursive: Boolean): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  inline def toQueryObjects(name: Unit, value: Unit, recursive: Boolean): typings.senchaTouch.Ext.Array = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryObjects")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[typings.senchaTouch.Ext.Array]
  
  /** [Method] Takes an object and converts it to an encoded query string
    * @param object Object The object to encode.
    * @param recursive Boolean Whether or not to interpret the object in recursive format. (PHP / Ruby on Rails servers and similar).
    * @returns String queryString
    */
  inline def toQueryString(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toQueryString")().asInstanceOf[java.lang.String]
  inline def toQueryString(`object`: js.Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("toQueryString")(`object`.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  inline def toQueryString(`object`: js.Any, recursive: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryString")(`object`.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
  inline def toQueryString(`object`: Unit, recursive: Boolean): java.lang.String = (^.asInstanceOf[js.Dynamic].applyDynamic("toQueryString")(`object`.asInstanceOf[js.Any], recursive.asInstanceOf[js.Any])).asInstanceOf[java.lang.String]
}
