package typings
package ravenDashJsLib.ravenDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RavenStatic extends js.Object {
  var Plugins: org.scalablytyped.runtime.StringDictionary[RavenPlugin] = js.native
  /** Raven.js version. */
  var VERSION: java.lang.String = js.native
  /**
    * Adds a plugin to Raven
    *
    * @return {Raven}
    */
  def addPlugin(plugin: RavenPlugin, pluginArgs: js.Any*): RavenStatic = js.native
  /**
    * Allow Raven to be configured as soon as it is loaded
    * It uses a global RavenConfig = {dsn: '...', config: {}}
    *
    * @return undefined
    */
  def afterLoad(): scala.Unit = js.native
  /** Log a breadcrumb */
  def captureBreadcrumb(crumb: Breadcrumb): RavenStatic = js.native
  /**
    * Manually capture an exception and send it over to Sentry
    *
    * @param {error|ErrorEvent|string} ex An exception to be logged
    * @param {object} options A specific set of options for this error [optional]
    * @return {Raven}
    */
  def captureException(ex: js.Any): RavenStatic = js.native
  def captureException(ex: js.Any, options: RavenOptions): RavenStatic = js.native
  /**
    * Manually send a message to Sentry
    *
    * @param {string} msg A plain message to be captured in Sentry
    * @param {object} options A specific set of options for this message [optional]
    * @return {Raven}
    */
  def captureMessage(msg: java.lang.String): RavenStatic = js.native
  def captureMessage(msg: java.lang.String, options: RavenOptions): RavenStatic = js.native
  /** Clear all of the context. */
  def clearContext(): RavenStatic = js.native
  /**
    * Configure Raven with a DSN and extra options
    *
    * @param {string} dsn The public Sentry DSN
    * @param {object} options Optional set of global options [optional]
    * @return {Raven}
    */
  def config(dsn: java.lang.String): RavenStatic = js.native
  def config(dsn: java.lang.String, options: RavenOptions): RavenStatic = js.native
  /**
    * Wrap code within a context so Raven can capture errors
    * reliably across domains that is executed immediately.
    *
    * @param {object} options A specific set of options for this context [optional]
    * @param {function} func The callback to be immediately executed within the context
    * @param {array} args An array of arguments to be called with the callback [optional]
    */
  def context(func: js.Function, args: js.Any*): scala.Unit = js.native
  def context(options: RavenOptions, func: js.Function, args: js.Any*): scala.Unit = js.native
  /** Get a copy of the current context. This cannot be mutated.*/
  def getContext(): js.Object = js.native
  /**
    * Installs a global window.onerror error handler
    * to capture and report uncaught exceptions.
    * At this point, install() is required to be called due
    * to the way TraceKit is set up.
    *
    * @return {Raven}
    */
  def install(): RavenStatic = js.native
  /** If you need to conditionally check if raven needs to be initialized or not, you can use the isSetup function. It will return true if Raven is already initialized. */
  def isSetup(): scala.Boolean = js.native
  /** An event id is a globally unique id for the event that was just sent. This event id can be used to find the exact event from within Sentry. */
  def lastEventId(): java.lang.String = js.native
  /** Get the latest raw exception that was captured by Raven.*/
  def lastException(): stdLib.Error = js.native
  /**
    * Allow multiple versions of Raven to be installed.
    * Strip Raven from the global context and returns the instance.
    *
    * @return {Raven}
    */
  def noConflict(): RavenStatic = js.native
  /** Specify a callback function that allows you to mutate or filter breadcrumbs when they are captured. */
  def setBreadcrumbCallback(): RavenStatic = js.native
  def setBreadcrumbCallback(callback: RavenCallback): RavenStatic = js.native
  /**
    * Configure Raven DSN
    *
    * @param {string} dsn The public Sentry DSN
    */
  def setDSN(dsn: java.lang.String): scala.Unit = js.native
  /** Specify a function that allows mutation of the data payload right before being sent to Sentry. */
  def setDataCallback(): RavenStatic = js.native
  def setDataCallback(callback: RavenCallback): RavenStatic = js.native
  /** Set environment of application */
  def setEnvironment(environment: java.lang.String): RavenStatic = js.native
  /**
    * Merge extra attributes to be sent along with the payload.
    *
    * @param {object} context A set of data to be merged with the current extra context data [optional]
    *                 If context is undefined, the current extra context data will be removed.
    * @return {Raven}
    */
  def setExtraContext(): RavenStatic = js.native
  def setExtraContext(context: js.Object): RavenStatic = js.native
  /** Set release version of application */
  def setRelease(release: java.lang.String): RavenStatic = js.native
  /** Specify a callback function that allows you to apply your own filters to determine if the message should be sent to Sentry. */
  def setShouldSendCallback(): RavenStatic = js.native
  def setShouldSendCallback(callback: RavenCallback): RavenStatic = js.native
  /**
    * Merge tags to be sent along with the payload.
    *
    * @param {object} tags A set of data to be merged with the current tag context data [optional]
    *                 If tags is undefined, the current tag context data will be removed.
    * @return {Raven}
    */
  def setTagsContext(): RavenStatic = js.native
  def setTagsContext(tags: js.Object): RavenStatic = js.native
  /** Override the default HTTP data transport handler. */
  def setTransport(transportFunction: js.Function1[/* options */ RavenTransportOptions, scala.Unit]): RavenStatic = js.native
  /**
    * Set/Clear a user to be sent along with the payload.
    *
    * @param {object} user An object representing user data [optional]
    *                 If user is undefined, the current user context will be removed.
    * @return {Raven}
    */
  def setUserContext(): RavenStatic = js.native
  def setUserContext(user: org.scalablytyped.runtime.StringDictionary[js.Any]): RavenStatic = js.native
  /** Show Sentry user feedback dialog */
  def showReportDialog(): scala.Unit = js.native
  def showReportDialog(options: js.Object): scala.Unit = js.native
  /**
    * Uninstalls the global error handler.
    *
    * @return {Raven}
    */
  def uninstall(): RavenStatic = js.native
  /**
    * Wrap code within a context and returns back a new function to be executed
    *
    * @param {object} options A specific set of options for this context [optional]
    * @param {function} func The function to be wrapped in a new context
    * @return {function} The newly wrapped functions with a context
    */
  def wrap(func: js.Function): js.Function = js.native
  def wrap(options: RavenOptions, func: js.Function): js.Function = js.native
  def wrap[T /* <: js.Function */](func: T): T = js.native
  def wrap[T /* <: js.Function */](options: RavenOptions, func: T): T = js.native
}

