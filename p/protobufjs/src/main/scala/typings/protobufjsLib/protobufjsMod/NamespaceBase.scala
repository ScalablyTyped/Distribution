package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "NamespaceBase")
@js.native
abstract class NamespaceBase () extends ReflectionObject {
  /** Nested objects by name. */
  var nested: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ReflectionObject]] = js.native
  /** Nested objects of this namespace as an array for iteration. */
  val nestedArray: js.Array[ReflectionObject] = js.native
  /**
    * Adds a nested object to this namespace.
    * @param object Nested object to add
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If there is already a nested object with this name
    */
  def add(`object`: ReflectionObject): Namespace = js.native
  /**
    * Adds nested objects to this namespace from nested object descriptors.
    * @param nestedJson Any nested object descriptors
    * @returns `this`
    */
  def addJSON(nestedJson: org.scalablytyped.runtime.StringDictionary[AnyNestedObject]): Namespace = js.native
  /**
    * Defines additial namespaces within this one if not yet existing.
    * @param path Path to create
    * @param [json] Nested types to create from JSON
    * @returns Pointer to the last namespace created or `this` if path is empty
    */
  def define(path: java.lang.String): Namespace = js.native
  def define(path: java.lang.String, json: js.Any): Namespace = js.native
  def define(path: js.Array[java.lang.String]): Namespace = js.native
  def define(path: js.Array[java.lang.String], json: js.Any): Namespace = js.native
  /**
    * Gets the nested object of the specified name.
    * @param name Nested object name
    * @returns The reflection object or `null` if it doesn't exist
    */
  def get(name: java.lang.String): ReflectionObject | scala.Null = js.native
  /**
    * Gets the values of the nested {@link Enum|enum} of the specified name.
    * This methods differs from {@link Namespace#get|get} in that it returns an enum's values directly and throws instead of returning `null`.
    * @param name Nested enum name
    * @returns Enum values
    * @throws {Error} If there is no such enum
    */
  def getEnum(name: java.lang.String): org.scalablytyped.runtime.StringDictionary[scala.Double] = js.native
  /**
    * Looks up the reflection object at the specified path, relative to this namespace.
    * @param path Path to look up
    * @param [parentAlreadyChecked=false] Whether the parent has already been checked
    * @returns Looked up object or `null` if none could be found
    */
  def lookup(path: java.lang.String): ReflectionObject | scala.Null = js.native
  /**
    * Recursively looks up the reflection object matching the specified path in the scope of this namespace.
    * @param path Path to look up
    * @param filterTypes Filter types, any combination of the constructors of `protobuf.Type`, `protobuf.Enum`, `protobuf.Service` etc.
    * @param [parentAlreadyChecked=false] If known, whether the parent has already been checked
    * @returns Looked up object or `null` if none could be found
    */
  def lookup(path: java.lang.String, filterTypes: js.Any): ReflectionObject | scala.Null = js.native
  def lookup(path: java.lang.String, filterTypes: js.Any, parentAlreadyChecked: scala.Boolean): ReflectionObject | scala.Null = js.native
  def lookup(path: java.lang.String, filterTypes: js.Array[_]): ReflectionObject | scala.Null = js.native
  def lookup(path: java.lang.String, filterTypes: js.Array[_], parentAlreadyChecked: scala.Boolean): ReflectionObject | scala.Null = js.native
  def lookup(path: java.lang.String, parentAlreadyChecked: scala.Boolean): ReflectionObject | scala.Null = js.native
  def lookup(path: js.Array[java.lang.String]): ReflectionObject | scala.Null = js.native
  def lookup(path: js.Array[java.lang.String], filterTypes: js.Any): ReflectionObject | scala.Null = js.native
  def lookup(path: js.Array[java.lang.String], filterTypes: js.Any, parentAlreadyChecked: scala.Boolean): ReflectionObject | scala.Null = js.native
  def lookup(path: js.Array[java.lang.String], filterTypes: js.Array[_]): ReflectionObject | scala.Null = js.native
  def lookup(path: js.Array[java.lang.String], filterTypes: js.Array[_], parentAlreadyChecked: scala.Boolean): ReflectionObject | scala.Null = js.native
  def lookup(path: js.Array[java.lang.String], parentAlreadyChecked: scala.Boolean): ReflectionObject | scala.Null = js.native
  /**
    * Looks up the values of the {@link Enum|enum} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up enum
    * @throws {Error} If `path` does not point to an enum
    */
  def lookupEnum(path: java.lang.String): Enum = js.native
  def lookupEnum(path: js.Array[java.lang.String]): Enum = js.native
  /**
    * Looks up the {@link Service|service} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up service
    * @throws {Error} If `path` does not point to a service
    */
  def lookupService(path: java.lang.String): Service = js.native
  def lookupService(path: js.Array[java.lang.String]): Service = js.native
  /**
    * Looks up the {@link Type|type} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up type
    * @throws {Error} If `path` does not point to a type
    */
  def lookupType(path: java.lang.String): Type = js.native
  def lookupType(path: js.Array[java.lang.String]): Type = js.native
  /**
    * Looks up the {@link Type|type} or {@link Enum|enum} at the specified path, relative to this namespace.
    * Besides its signature, this methods differs from {@link Namespace#lookup|lookup} in that it throws instead of returning `null`.
    * @param path Path to look up
    * @returns Looked up type or enum
    * @throws {Error} If `path` does not point to a type or enum
    */
  def lookupTypeOrEnum(path: java.lang.String): Type = js.native
  def lookupTypeOrEnum(path: js.Array[java.lang.String]): Type = js.native
  /**
    * Removes a nested object from this namespace.
    * @param object Nested object to remove
    * @returns `this`
    * @throws {TypeError} If arguments are invalid
    * @throws {Error} If `object` is not a member of this namespace
    */
  def remove(`object`: ReflectionObject): Namespace = js.native
  /**
    * Resolves this namespace's and all its nested objects' type references. Useful to validate a reflection tree, but comes at a cost.
    * @returns `this`
    */
  def resolveAll(): Namespace = js.native
  def toJSON(toJSONOptions: IToJSONOptions): INamespace = js.native
}

