package typings.senchaUnderscoreTouch.Ext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Loader")
@js.native
class Loader () extends js.Object

/* static members */
@JSGlobal("Ext.Loader")
@js.native
object Loader extends js.Object {
  /** [Config Option] (Boolean) */
  var disableCaching: Boolean = js.native
  /** [Config Option] (String) */
  var disableCachingParam: java.lang.String = js.native
  /** [Config Option] (Boolean) */
  var enabled: Boolean = js.native
  /** [Property] (Array) */
  var history: Array = js.native
  /** [Config Option] (Object) */
  var paths: js.Any = js.native
  /** [Method] Sets a batch of path entries
  		* @param paths Object a set of className: path mappings
  		* @returns Ext.Loader this
  		*/
  def addClassPathMappings(): ILoader = js.native
  def addClassPathMappings(paths: Object): ILoader = js.native
  /** [Method] Explicitly exclude files from being loaded
  		* @param excludes Array
  		* @returns Object object contains require method for chaining.
  		*/
  def exclude(): js.Any = js.native
  def exclude(excludes: Array): js.Any = js.native
  /** [Method] Get the config value corresponding to the specified name
  		* @param name String The config property name.
  		* @returns Object/Mixed
  		*/
  def getConfig(): js.Any = js.native
  def getConfig(name: java.lang.String): js.Any = js.native
  /** [Method] Translates a className to a file path by adding the the proper prefix and converting the  s to  s
  		* @param className String
  		* @returns String path
  		*/
  def getPath(): java.lang.String = js.native
  def getPath(className: java.lang.String): java.lang.String = js.native
  /** [Method] Add a new listener to be executed when all required scripts are fully loaded
  		* @param fn Function The function callback to be executed.
  		* @param scope Object The execution scope (this) of the callback function.
  		* @param withDomReady Boolean Whether or not to wait for document DOM ready as well.
  		*/
  def onReady(): Unit = js.native
  def onReady(fn: js.Any): Unit = js.native
  def onReady(fn: js.Any, scope: js.Any): Unit = js.native
  def onReady(fn: js.Any, scope: js.Any, withDomReady: Boolean): Unit = js.native
  /** [Method] Loads all classes by the given names and all their direct dependencies optionally executes the given callback functi
  		* @param expressions String/Array Can either be a string or an array of string.
  		* @param fn Function The callback function.
  		* @param scope Object The execution scope (this) of the callback function.
  		* @param excludes String/Array Classes to be excluded, useful when being used with expressions.
  		*/
  def require(): Unit = js.native
  def require(expressions: js.Any): Unit = js.native
  def require(expressions: js.Any, fn: js.Any): Unit = js.native
  def require(expressions: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def require(expressions: js.Any, fn: js.Any, scope: js.Any, excludes: js.Any): Unit = js.native
  /** [Method] Set the configuration for the loader
  		* @param name Object/String The config object to override the default values or name of a single config setting when also passing the second parameter.
  		* @param value Mixed The value for the config setting.
  		* @returns Ext.Loader this
  		*/
  def setConfig(): ILoader = js.native
  def setConfig(name: js.Any): ILoader = js.native
  def setConfig(name: js.Any, value: js.Any): ILoader = js.native
  /** [Method] Sets the path of a namespace
  		* @param name String/Object See flexSetter
  		* @param path String See flexSetter
  		* @returns Ext.Loader this
  		*/
  def setPath(): ILoader = js.native
  def setPath(name: js.Any): ILoader = js.native
  def setPath(name: js.Any, path: java.lang.String): ILoader = js.native
  /** [Method] Synchronously loads all classes by the given names and all their direct dependencies optionally executes the given c
  		* @param expressions String/Array Can either be a string or an array of string
  		* @param fn Function The callback function
  		* @param scope Object The execution scope (this) of the callback function
  		* @param excludes String/Array Classes to be excluded, useful when being used with expressions
  		*/
  def syncRequire(): Unit = js.native
  def syncRequire(expressions: js.Any): Unit = js.native
  def syncRequire(expressions: js.Any, fn: js.Any): Unit = js.native
  def syncRequire(expressions: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  def syncRequire(expressions: js.Any, fn: js.Any, scope: js.Any, excludes: js.Any): Unit = js.native
}

