package typings
package protobufjsLib.protobufjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protobufjs", "Root")
@js.native
/**
  * Constructs a new root namespace instance.
  * @param [options] Top level options
  */
class Root () extends NamespaceBase {
  def this(options: org.scalablytyped.runtime.StringDictionary[js.Any]) = this()
  /** Deferred extension fields. */
  var deferred: js.Array[Field] = js.native
  /** Resolved file names of loaded files. */
  var files: js.Array[java.lang.String] = js.native
  /**
    * Loads one or multiple .proto or preprocessed .json files into this root namespace and returns a promise.
    * @param filename Names of one or multiple files to load
    * @param [options] Parse options. Defaults to {@link parse.defaults} when omitted.
    * @returns Promise
    */
  def load(filename: java.lang.String): js.Promise[Root] = js.native
  /**
    * Loads one or multiple .proto or preprocessed .json files into this root namespace and calls the callback.
    * @param filename Names of one or multiple files to load
    * @param callback Callback function
    */
  def load(filename: java.lang.String, callback: protobufjsLib.LoadCallback): scala.Unit = js.native
  def load(filename: java.lang.String, options: IParseOptions): js.Promise[Root] = js.native
  /**
    * Loads one or multiple .proto or preprocessed .json files into this root namespace and calls the callback.
    * @param filename Names of one or multiple files to load
    * @param options Parse options
    * @param callback Callback function
    */
  def load(filename: java.lang.String, options: IParseOptions, callback: protobufjsLib.LoadCallback): scala.Unit = js.native
  def load(filename: js.Array[java.lang.String]): js.Promise[Root] = js.native
  def load(filename: js.Array[java.lang.String], callback: protobufjsLib.LoadCallback): scala.Unit = js.native
  def load(filename: js.Array[java.lang.String], options: IParseOptions): js.Promise[Root] = js.native
  def load(filename: js.Array[java.lang.String], options: IParseOptions, callback: protobufjsLib.LoadCallback): scala.Unit = js.native
  /**
    * Synchronously loads one or multiple .proto or preprocessed .json files into this root namespace (node only).
    * @param filename Names of one or multiple files to load
    * @param [options] Parse options. Defaults to {@link parse.defaults} when omitted.
    * @returns Root namespace
    * @throws {Error} If synchronous fetching is not supported (i.e. in browsers) or if a file's syntax is invalid
    */
  def loadSync(filename: java.lang.String): Root = js.native
  def loadSync(filename: java.lang.String, options: IParseOptions): Root = js.native
  def loadSync(filename: js.Array[java.lang.String]): Root = js.native
  def loadSync(filename: js.Array[java.lang.String], options: IParseOptions): Root = js.native
  /**
    * Resolves the path of an imported file, relative to the importing origin.
    * This method exists so you can override it with your own logic in case your imports are scattered over multiple directories.
    * @param origin The file name of the importing file
    * @param target The file name being imported
    * @returns Resolved path to `target` or `null` to skip the file
    */
  def resolvePath(origin: java.lang.String, target: java.lang.String): java.lang.String | scala.Null = js.native
}

/* static members */
@JSImport("protobufjs", "Root")
@js.native
object Root extends js.Object {
  /**
    * Loads a namespace descriptor into a root namespace.
    * @param json Nameespace descriptor
    * @param [root] Root namespace, defaults to create a new one if omitted
    * @returns Root namespace
    */
  def fromJSON(json: protobufjsLib.protobufjsMod.INamespace): protobufjsLib.protobufjsMod.Root = js.native
  def fromJSON(json: protobufjsLib.protobufjsMod.INamespace, root: protobufjsLib.protobufjsMod.Root): protobufjsLib.protobufjsMod.Root = js.native
}

