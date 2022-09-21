package typings.protobufjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protobufjs", "ReflectionObject")
@js.native
abstract class ReflectionObject () extends StObject {
  
  /** Comment text, if any. */
  var comment: String | Null = js.native
  
  /** Defining file name. */
  var filename: String | Null = js.native
  
  /** Full name including leading dot. */
  val fullName: String = js.native
  
  /**
    * Gets an option value.
    * @param name Option name
    * @returns Option value or `undefined` if not set
    */
  def getOption(name: String): Any = js.native
  
  /** Unique name within its namespace. */
  var name: String = js.native
  
  /**
    * Called when this object is added to a parent.
    * @param parent Parent added to
    */
  def onAdd(parent: ReflectionObject): Unit = js.native
  
  /**
    * Called when this object is removed from a parent.
    * @param parent Parent removed from
    */
  def onRemove(parent: ReflectionObject): Unit = js.native
  
  /** Options. */
  var options: js.UndefOr[StringDictionary[Any]] = js.native
  
  /** Parent namespace. */
  var parent: Namespace | Null = js.native
  
  /** Parsed Options. */
  var parsedOptions: js.UndefOr[StringDictionary[js.Array[Any]]] = js.native
  
  /**
    * Resolves this objects type references.
    * @returns `this`
    */
  def resolve(): ReflectionObject = js.native
  
  /** Whether already resolved or not. */
  var resolved: Boolean = js.native
  
  /** Reference to the root namespace. */
  val root: Root = js.native
  
  /**
    * Sets an option.
    * @param name Option name
    * @param value Option value
    * @param [ifNotSet] Sets the option only if it isn't currently set
    * @returns `this`
    */
  def setOption(name: String, value: Any): ReflectionObject = js.native
  def setOption(name: String, value: Any, ifNotSet: Boolean): ReflectionObject = js.native
  
  /**
    * Sets multiple options.
    * @param options Options to set
    * @param [ifNotSet] Sets an option only if it isn't currently set
    * @returns `this`
    */
  def setOptions(options: StringDictionary[Any]): ReflectionObject = js.native
  def setOptions(options: StringDictionary[Any], ifNotSet: Boolean): ReflectionObject = js.native
  
  /**
    * Sets a parsed option.
    * @param name parsed Option name
    * @param value Option value
    * @param propName dot '.' delimited full path of property within the option to set. if undefined\empty, will add a new option with that value
    * @returns `this`
    */
  def setParsedOption(name: String, value: Any, propName: String): ReflectionObject = js.native
  
  /**
    * Converts this reflection object to its descriptor representation.
    * @returns Descriptor
    */
  def toJSON(): StringDictionary[Any] = js.native
}
