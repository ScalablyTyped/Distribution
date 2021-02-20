package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.ILoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Loader")
@js.native
class Loader ()
  extends typings.senchaTouch.Ext.Loader
/* static members */
object Loader {
  
  @JSGlobal("Ext.Loader")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Sets a batch of path entries
    * @param paths Object a set of className: path mappings
    * @returns Ext.Loader this
    */
  @JSGlobal("Ext.Loader.addClassPathMappings")
  @js.native
  def addClassPathMappings(): ILoader = js.native
  @JSGlobal("Ext.Loader.addClassPathMappings")
  @js.native
  def addClassPathMappings(paths: typings.senchaTouch.Ext.Object): ILoader = js.native
  
  /** [Config Option] (Boolean) */
  @JSGlobal("Ext.Loader.disableCaching")
  @js.native
  def disableCaching: Boolean = js.native
  
  /** [Config Option] (String) */
  @JSGlobal("Ext.Loader.disableCachingParam")
  @js.native
  def disableCachingParam: java.lang.String = js.native
  @scala.inline
  def disableCachingParam_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCachingParam")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def disableCaching_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableCaching")(x.asInstanceOf[js.Any])
  
  /** [Config Option] (Boolean) */
  @JSGlobal("Ext.Loader.enabled")
  @js.native
  def enabled: Boolean = js.native
  @scala.inline
  def enabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enabled")(x.asInstanceOf[js.Any])
  
  /** [Method] Explicitly exclude files from being loaded
    * @param excludes Array
    * @returns Object object contains require method for chaining.
    */
  @JSGlobal("Ext.Loader.exclude")
  @js.native
  def exclude(): js.Any = js.native
  @JSGlobal("Ext.Loader.exclude")
  @js.native
  def exclude(excludes: typings.senchaTouch.Ext.Array): js.Any = js.native
  
  /** [Method] Get the config value corresponding to the specified name
    * @param name String The config property name.
    * @returns Object/Mixed
    */
  @JSGlobal("Ext.Loader.getConfig")
  @js.native
  def getConfig(): js.Any = js.native
  @JSGlobal("Ext.Loader.getConfig")
  @js.native
  def getConfig(name: java.lang.String): js.Any = js.native
  
  /** [Method] Translates a className to a file path by adding the the proper prefix and converting the  s to  s
    * @param className String
    * @returns String path
    */
  @JSGlobal("Ext.Loader.getPath")
  @js.native
  def getPath(): java.lang.String = js.native
  @JSGlobal("Ext.Loader.getPath")
  @js.native
  def getPath(className: java.lang.String): java.lang.String = js.native
  
  /** [Property] (Array) */
  @JSGlobal("Ext.Loader.history")
  @js.native
  def history: typings.senchaTouch.Ext.Array = js.native
  @scala.inline
  def history_=(x: typings.senchaTouch.Ext.Array): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("history")(x.asInstanceOf[js.Any])
  
  /** [Method] Add a new listener to be executed when all required scripts are fully loaded
    * @param fn Function The function callback to be executed.
    * @param scope Object The execution scope (this) of the callback function.
    * @param withDomReady Boolean Whether or not to wait for document DOM ready as well.
    */
  @JSGlobal("Ext.Loader.onReady")
  @js.native
  def onReady(): Unit = js.native
  @JSGlobal("Ext.Loader.onReady")
  @js.native
  def onReady(fn: js.UndefOr[scala.Nothing], scope: js.UndefOr[scala.Nothing], withDomReady: Boolean): Unit = js.native
  @JSGlobal("Ext.Loader.onReady")
  @js.native
  def onReady(fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.onReady")
  @js.native
  def onReady(fn: js.UndefOr[scala.Nothing], scope: js.Any, withDomReady: Boolean): Unit = js.native
  @JSGlobal("Ext.Loader.onReady")
  @js.native
  def onReady(fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.onReady")
  @js.native
  def onReady(fn: js.Any, scope: js.UndefOr[scala.Nothing], withDomReady: Boolean): Unit = js.native
  @JSGlobal("Ext.Loader.onReady")
  @js.native
  def onReady(fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.onReady")
  @js.native
  def onReady(fn: js.Any, scope: js.Any, withDomReady: Boolean): Unit = js.native
  
  /** [Config Option] (Object) */
  @JSGlobal("Ext.Loader.paths")
  @js.native
  def paths: js.Any = js.native
  @scala.inline
  def paths_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("paths")(x.asInstanceOf[js.Any])
  
  /** [Method] Loads all classes by the given names and all their direct dependencies optionally executes the given callback functi
    * @param expressions String/Array Can either be a string or an array of string.
    * @param fn Function The callback function.
    * @param scope Object The execution scope (this) of the callback function.
    * @param excludes String/Array Classes to be excluded, useful when being used with expressions.
    */
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(): Unit = js.native
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(
    expressions: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    excludes: js.Any
  ): Unit = js.native
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(expressions: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(
    expressions: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    excludes: js.Any
  ): Unit = js.native
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(expressions: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(
    expressions: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    excludes: js.Any
  ): Unit = js.native
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(expressions: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(expressions: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, excludes: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(expressions: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(
    expressions: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    excludes: js.Any
  ): Unit = js.native
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(expressions: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(expressions: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, excludes: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(expressions: js.Any, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(expressions: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], excludes: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(expressions: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.require")
  @js.native
  def require(expressions: js.Any, fn: js.Any, scope: js.Any, excludes: js.Any): Unit = js.native
  
  /** [Method] Set the configuration for the loader
    * @param name Object/String The config object to override the default values or name of a single config setting when also passing the second parameter.
    * @param value Mixed The value for the config setting.
    * @returns Ext.Loader this
    */
  @JSGlobal("Ext.Loader.setConfig")
  @js.native
  def setConfig(): ILoader = js.native
  @JSGlobal("Ext.Loader.setConfig")
  @js.native
  def setConfig(name: js.UndefOr[scala.Nothing], value: js.Any): ILoader = js.native
  @JSGlobal("Ext.Loader.setConfig")
  @js.native
  def setConfig(name: js.Any): ILoader = js.native
  @JSGlobal("Ext.Loader.setConfig")
  @js.native
  def setConfig(name: js.Any, value: js.Any): ILoader = js.native
  
  /** [Method] Sets the path of a namespace
    * @param name String/Object See flexSetter
    * @param path String See flexSetter
    * @returns Ext.Loader this
    */
  @JSGlobal("Ext.Loader.setPath")
  @js.native
  def setPath(): ILoader = js.native
  @JSGlobal("Ext.Loader.setPath")
  @js.native
  def setPath(name: js.UndefOr[scala.Nothing], path: java.lang.String): ILoader = js.native
  @JSGlobal("Ext.Loader.setPath")
  @js.native
  def setPath(name: js.Any): ILoader = js.native
  @JSGlobal("Ext.Loader.setPath")
  @js.native
  def setPath(name: js.Any, path: java.lang.String): ILoader = js.native
  
  /** [Method] Synchronously loads all classes by the given names and all their direct dependencies optionally executes the given c
    * @param expressions String/Array Can either be a string or an array of string
    * @param fn Function The callback function
    * @param scope Object The execution scope (this) of the callback function
    * @param excludes String/Array Classes to be excluded, useful when being used with expressions
    */
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(): Unit = js.native
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(
    expressions: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    excludes: js.Any
  ): Unit = js.native
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(expressions: js.UndefOr[scala.Nothing], fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(
    expressions: js.UndefOr[scala.Nothing],
    fn: js.UndefOr[scala.Nothing],
    scope: js.Any,
    excludes: js.Any
  ): Unit = js.native
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(expressions: js.UndefOr[scala.Nothing], fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(
    expressions: js.UndefOr[scala.Nothing],
    fn: js.Any,
    scope: js.UndefOr[scala.Nothing],
    excludes: js.Any
  ): Unit = js.native
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(expressions: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(expressions: js.UndefOr[scala.Nothing], fn: js.Any, scope: js.Any, excludes: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(expressions: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(
    expressions: js.Any,
    fn: js.UndefOr[scala.Nothing],
    scope: js.UndefOr[scala.Nothing],
    excludes: js.Any
  ): Unit = js.native
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(expressions: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(expressions: js.Any, fn: js.UndefOr[scala.Nothing], scope: js.Any, excludes: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(expressions: js.Any, fn: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(expressions: js.Any, fn: js.Any, scope: js.UndefOr[scala.Nothing], excludes: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(expressions: js.Any, fn: js.Any, scope: js.Any): Unit = js.native
  @JSGlobal("Ext.Loader.syncRequire")
  @js.native
  def syncRequire(expressions: js.Any, fn: js.Any, scope: js.Any, excludes: js.Any): Unit = js.native
}
