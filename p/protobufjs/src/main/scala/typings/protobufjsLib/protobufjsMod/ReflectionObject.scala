package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "ReflectionObject")
@js.native
abstract class ReflectionObject () extends js.Object {
  /** Comment text, if any. */
  var comment: java.lang.String | scala.Null = js.native
  /** Defining file name. */
  var filename: java.lang.String | scala.Null = js.native
  /** Full name including leading dot. */
  val fullName: java.lang.String = js.native
  /** Unique name within its namespace. */
  var name: java.lang.String = js.native
  /** Options. */
  var options: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.native
  /** Parent namespace. */
  var parent: Namespace | scala.Null = js.native
  /** Whether already resolved or not. */
  var resolved: scala.Boolean = js.native
  /** Reference to the root namespace. */
  val root: Root = js.native
  /**
       * Gets an option value.
       * @param name Option name
       * @returns Option value or `undefined` if not set
       */
  def getOption(name: java.lang.String): js.Any = js.native
  /**
       * Called when this object is added to a parent.
       * @param parent Parent added to
       */
  def onAdd(parent: ReflectionObject): scala.Unit = js.native
  /**
       * Called when this object is removed from a parent.
       * @param parent Parent removed from
       */
  def onRemove(parent: ReflectionObject): scala.Unit = js.native
  /**
       * Resolves this objects type references.
       * @returns `this`
       */
  def resolve(): ReflectionObject = js.native
  /**
       * Sets an option.
       * @param name Option name
       * @param value Option value
       * @param [ifNotSet] Sets the option only if it isn't currently set
       * @returns `this`
       */
  def setOption(name: java.lang.String, value: js.Any): ReflectionObject = js.native
  /**
       * Sets an option.
       * @param name Option name
       * @param value Option value
       * @param [ifNotSet] Sets the option only if it isn't currently set
       * @returns `this`
       */
  def setOption(name: java.lang.String, value: js.Any, ifNotSet: scala.Boolean): ReflectionObject = js.native
  /**
       * Sets multiple options.
       * @param options Options to set
       * @param [ifNotSet] Sets an option only if it isn't currently set
       * @returns `this`
       */
  def setOptions(options: org.scalablytyped.runtime.StringDictionary[js.Any]): ReflectionObject = js.native
  /**
       * Sets multiple options.
       * @param options Options to set
       * @param [ifNotSet] Sets an option only if it isn't currently set
       * @returns `this`
       */
  def setOptions(options: org.scalablytyped.runtime.StringDictionary[js.Any], ifNotSet: scala.Boolean): ReflectionObject = js.native
  /**
       * Converts this reflection object to its descriptor representation.
       * @returns Descriptor
       */
  def toJSON(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

