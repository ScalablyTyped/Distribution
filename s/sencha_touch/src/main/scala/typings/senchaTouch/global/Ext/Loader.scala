package typings.senchaTouch.global.Ext

import typings.senchaTouch.Ext.ILoader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Ext.Loader")
@js.native
class Loader ()
  extends StObject
     with typings.senchaTouch.Ext.Loader
/* static members */
object Loader {
  
  @JSGlobal("Ext.Loader")
  @js.native
  val ^ : js.Any = js.native
  
  /** [Method] Sets a batch of path entries
    * @param paths Object a set of className: path mappings
    * @returns Ext.Loader this
    */
  @scala.inline
  def addClassPathMappings(): ILoader = ^.asInstanceOf[js.Dynamic].applyDynamic("addClassPathMappings")().asInstanceOf[ILoader]
  @scala.inline
  def addClassPathMappings(paths: typings.senchaTouch.Ext.Object): ILoader = ^.asInstanceOf[js.Dynamic].applyDynamic("addClassPathMappings")(paths.asInstanceOf[js.Any]).asInstanceOf[ILoader]
  
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
  @scala.inline
  def exclude(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("exclude")().asInstanceOf[js.Any]
  @scala.inline
  def exclude(excludes: typings.senchaTouch.Ext.Array): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("exclude")(excludes.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Get the config value corresponding to the specified name
    * @param name String The config property name.
    * @returns Object/Mixed
    */
  @scala.inline
  def getConfig(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")().asInstanceOf[js.Any]
  @scala.inline
  def getConfig(name: java.lang.String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getConfig")(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /** [Method] Translates a className to a file path by adding the the proper prefix and converting the  s to  s
    * @param className String
    * @returns String path
    */
  @scala.inline
  def getPath(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")().asInstanceOf[java.lang.String]
  @scala.inline
  def getPath(className: java.lang.String): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPath")(className.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  
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
  @scala.inline
  def onReady(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onReady")().asInstanceOf[Unit]
  @scala.inline
  def onReady(fn: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def onReady(fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onReady(fn: js.Any, scope: js.Any, withDomReady: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], withDomReady.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onReady(fn: js.Any, scope: Unit, withDomReady: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], withDomReady.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onReady(fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onReady(fn: Unit, scope: js.Any, withDomReady: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], withDomReady.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def onReady(fn: Unit, scope: Unit, withDomReady: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("onReady")(fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], withDomReady.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
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
  @scala.inline
  def require(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("require")().asInstanceOf[Unit]
  @scala.inline
  def require(expressions: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def require(expressions: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def require(expressions: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def require(expressions: js.Any, fn: js.Any, scope: js.Any, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def require(expressions: js.Any, fn: js.Any, scope: Unit, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def require(expressions: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def require(expressions: js.Any, fn: Unit, scope: js.Any, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def require(expressions: js.Any, fn: Unit, scope: Unit, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def require(expressions: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def require(expressions: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def require(expressions: Unit, fn: js.Any, scope: js.Any, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def require(expressions: Unit, fn: js.Any, scope: Unit, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def require(expressions: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def require(expressions: Unit, fn: Unit, scope: js.Any, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def require(expressions: Unit, fn: Unit, scope: Unit, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("require")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /** [Method] Set the configuration for the loader
    * @param name Object/String The config object to override the default values or name of a single config setting when also passing the second parameter.
    * @param value Mixed The value for the config setting.
    * @returns Ext.Loader this
    */
  @scala.inline
  def setConfig(): ILoader = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")().asInstanceOf[ILoader]
  @scala.inline
  def setConfig(name: js.Any): ILoader = ^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(name.asInstanceOf[js.Any]).asInstanceOf[ILoader]
  @scala.inline
  def setConfig(name: js.Any, value: js.Any): ILoader = (^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ILoader]
  @scala.inline
  def setConfig(name: Unit, value: js.Any): ILoader = (^.asInstanceOf[js.Dynamic].applyDynamic("setConfig")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ILoader]
  
  /** [Method] Sets the path of a namespace
    * @param name String/Object See flexSetter
    * @param path String See flexSetter
    * @returns Ext.Loader this
    */
  @scala.inline
  def setPath(): ILoader = ^.asInstanceOf[js.Dynamic].applyDynamic("setPath")().asInstanceOf[ILoader]
  @scala.inline
  def setPath(name: js.Any): ILoader = ^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(name.asInstanceOf[js.Any]).asInstanceOf[ILoader]
  @scala.inline
  def setPath(name: js.Any, path: java.lang.String): ILoader = (^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[ILoader]
  @scala.inline
  def setPath(name: Unit, path: java.lang.String): ILoader = (^.asInstanceOf[js.Dynamic].applyDynamic("setPath")(name.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[ILoader]
  
  /** [Method] Synchronously loads all classes by the given names and all their direct dependencies optionally executes the given c
    * @param expressions String/Array Can either be a string or an array of string
    * @param fn Function The callback function
    * @param scope Object The execution scope (this) of the callback function
    * @param excludes String/Array Classes to be excluded, useful when being used with expressions
    */
  @scala.inline
  def syncRequire(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")().asInstanceOf[Unit]
  @scala.inline
  def syncRequire(expressions: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def syncRequire(expressions: js.Any, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def syncRequire(expressions: js.Any, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def syncRequire(expressions: js.Any, fn: js.Any, scope: js.Any, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def syncRequire(expressions: js.Any, fn: js.Any, scope: Unit, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def syncRequire(expressions: js.Any, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def syncRequire(expressions: js.Any, fn: Unit, scope: js.Any, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def syncRequire(expressions: js.Any, fn: Unit, scope: Unit, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def syncRequire(expressions: Unit, fn: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def syncRequire(expressions: Unit, fn: js.Any, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def syncRequire(expressions: Unit, fn: js.Any, scope: js.Any, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def syncRequire(expressions: Unit, fn: js.Any, scope: Unit, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def syncRequire(expressions: Unit, fn: Unit, scope: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def syncRequire(expressions: Unit, fn: Unit, scope: js.Any, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def syncRequire(expressions: Unit, fn: Unit, scope: Unit, excludes: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syncRequire")(expressions.asInstanceOf[js.Any], fn.asInstanceOf[js.Any], scope.asInstanceOf[js.Any], excludes.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
