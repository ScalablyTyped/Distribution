package typings
package senchaUnderscoreTouchLib.ExtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Ext.Loader")
@js.native
class Loader () extends js.Object

@JSGlobal("Ext.Loader")
@js.native
object Loader extends js.Object {
  /** [Config Option] (Boolean) */
  var disableCaching: scala.Boolean = js.native
  /** [Config Option] (String) */
  var disableCachingParam: java.lang.String = js.native
  /** [Config Option] (Boolean) */
  var enabled: scala.Boolean = js.native
  /** [Property] (Array) */
  var history: senchaUnderscoreTouchLib.ExtNs.Array = js.native
  /** [Config Option] (Object) */
  var paths: js.Any = js.native
  /** [Method] Sets a batch of path entries
  		* @param paths Object a set of className: path mappings
  		* @returns Ext.Loader this
  		*/
  def addClassPathMappings(): senchaUnderscoreTouchLib.ExtNs.ILoader = js.native
  def addClassPathMappings(paths: senchaUnderscoreTouchLib.ExtNs.Object): senchaUnderscoreTouchLib.ExtNs.ILoader = js.native
  /** [Method] Explicitly exclude files from being loaded
  		* @param excludes Array
  		* @returns Object object contains require method for chaining.
  		*/
  def exclude(): js.Any = js.native
  def exclude(excludes: senchaUnderscoreTouchLib.ExtNs.Array): js.Any = js.native
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
  def onReady(): scala.Unit = js.native
  def onReady(fn: js.Any): scala.Unit = js.native
  def onReady(fn: js.Any, scope: js.Any): scala.Unit = js.native
  def onReady(fn: js.Any, scope: js.Any, withDomReady: scala.Boolean): scala.Unit = js.native
  /** [Method] Loads all classes by the given names and all their direct dependencies optionally executes the given callback functi
  		* @param expressions String/Array Can either be a string or an array of string.
  		* @param fn Function The callback function.
  		* @param scope Object The execution scope (this) of the callback function.
  		* @param excludes String/Array Classes to be excluded, useful when being used with expressions.
  		*/
  def require(): scala.Unit = js.native
  def require(expressions: js.Any): scala.Unit = js.native
  def require(expressions: js.Any, fn: js.Any): scala.Unit = js.native
  def require(expressions: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def require(expressions: js.Any, fn: js.Any, scope: js.Any, excludes: js.Any): scala.Unit = js.native
  /** [Method] Set the configuration for the loader
  		* @param name Object/String The config object to override the default values or name of a single config setting when also passing the second parameter.
  		* @param value Mixed The value for the config setting.
  		* @returns Ext.Loader this
  		*/
  def setConfig(): senchaUnderscoreTouchLib.ExtNs.ILoader = js.native
  def setConfig(name: js.Any): senchaUnderscoreTouchLib.ExtNs.ILoader = js.native
  def setConfig(name: js.Any, value: js.Any): senchaUnderscoreTouchLib.ExtNs.ILoader = js.native
  /** [Method] Sets the path of a namespace
  		* @param name String/Object See flexSetter
  		* @param path String See flexSetter
  		* @returns Ext.Loader this
  		*/
  def setPath(): senchaUnderscoreTouchLib.ExtNs.ILoader = js.native
  def setPath(name: js.Any): senchaUnderscoreTouchLib.ExtNs.ILoader = js.native
  def setPath(name: js.Any, path: java.lang.String): senchaUnderscoreTouchLib.ExtNs.ILoader = js.native
  /** [Method] Synchronously loads all classes by the given names and all their direct dependencies optionally executes the given c
  		* @param expressions String/Array Can either be a string or an array of string
  		* @param fn Function The callback function
  		* @param scope Object The execution scope (this) of the callback function
  		* @param excludes String/Array Classes to be excluded, useful when being used with expressions
  		*/
  def syncRequire(): scala.Unit = js.native
  def syncRequire(expressions: js.Any): scala.Unit = js.native
  def syncRequire(expressions: js.Any, fn: js.Any): scala.Unit = js.native
  def syncRequire(expressions: js.Any, fn: js.Any, scope: js.Any): scala.Unit = js.native
  def syncRequire(expressions: js.Any, fn: js.Any, scope: js.Any, excludes: js.Any): scala.Unit = js.native
}

