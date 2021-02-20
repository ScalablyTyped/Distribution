package typings.seleniumWebdriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandMod {
  
  @JSImport("selenium-webdriver/lib/command", "Command")
  @js.native
  class Command protected () extends StObject {
    // region Constructors
    /**
      * @param {!CommandName} name The name of this command.
      * @constructor
      */
    def this(name: String) = this()
    
    // endregion
    // region Methods
    /**
      * @return {!CommandName} This command's name.
      */
    def getName(): String = js.native
    
    /**
      * Returns a named command parameter.
      * @param {string} key The parameter key to look up.
      * @return {*} The parameter value, or undefined if it has not been set.
      */
    def getParameter(key: String): js.Any = js.native
    
    /**
      * @return {!Object.<*>} The parameters to send with this command.
      */
    def getParameters(): js.Any = js.native
    
    /**
      * Sets a parameter to send with this command.
      * @param {string} name The parameter name.
      * @param {*} value The parameter value.
      * @return {!Command} A self reference.
      */
    def setParameter(name: String, value: js.Any): Command = js.native
    
    /**
      * Sets the parameters for this command.
      * @param {!Object.<*>} parameters The command parameters.
      * @return {!Command} A self reference.
      */
    def setParameters(parameters: js.Any): Command = js.native
  }
  
  @JSImport("selenium-webdriver/lib/command", "Executor")
  @js.native
  class Executor () extends StObject {
    
    /**
      * Defines a new command for use with this executor. When a command is sent,
      * the {@code path} will be preprocessed using the command's parameters; any
      * path segments prefixed with ':' will be replaced by the parameter of the
      * same name. For example, given '/person/:name' and the parameters
      * '{name: 'Bob'}', the final command path will be '/person/Bob'.
      *
      * @param {string} name The command name.
      * @param {string} method The HTTP method to use when sending this command.
      * @param {string} path The path to send the command to, relative to
      *     the WebDriver server's command root and of the form
      *     '/path/:variable/segment'.
      */
    def defineCommand(name: String, method: String, path: String): Unit = js.native
    
    /**
      * Executes the given {@code command}. If there is an error executing the
      * command, the provided callback will be invoked with the offending error.
      * Otherwise, the callback will be invoked with a null Error and non-null
      * response object.
      *
      * @param {!Command} command The command to execute.
      * @return {!Promise<?>} A promise that will be fulfilled with
      *     the command result.
      */
    def execute(command: Command): js.Promise[_] = js.native
  }
  
  @JSImport("selenium-webdriver/lib/command", "Name")
  @js.native
  val Name: ICommandName = js.native
  
  @js.native
  trait ICommandName extends StObject {
    
    var ACCEPT_ALERT: String = js.native
    
    var ACTIONS: String = js.native
    
    var ADD_COOKIE: String = js.native
    
    var CLEAR_ACTIONS: String = js.native
    
    var CLEAR_APP_CACHE: String = js.native
    
    var CLEAR_ELEMENT: String = js.native
    
    var CLEAR_LOCAL_STORAGE: String = js.native
    
    var CLEAR_SESSION_STORAGE: String = js.native
    
    // These belong to the Advanced user interactions - an element is
    // optional for these commands.
    var CLICK: String = js.native
    
    var CLICK_ELEMENT: String = js.native
    
    var CLOSE: String = js.native
    
    var DELETE_ALL_COOKIES: String = js.native
    
    var DELETE_COOKIE: String = js.native
    
    var DESCRIBE_SESSION: String = js.native
    
    var DISMISS_ALERT: String = js.native
    
    var DOUBLE_CLICK: String = js.native
    
    var ELEMENT_EQUALS: String = js.native
    
    var EXECUTE_ASYNC_SCRIPT: String = js.native
    
    var EXECUTE_SCRIPT: String = js.native
    
    var EXECUTE_SQL: String = js.native
    
    var FIND_CHILD_ELEMENT: String = js.native
    
    var FIND_CHILD_ELEMENTS: String = js.native
    
    var FIND_ELEMENT: String = js.native
    
    var FIND_ELEMENTS: String = js.native
    
    var GET: String = js.native
    
    var GET_ACTIVE_ELEMENT: String = js.native
    
    var GET_ALERT_TEXT: String = js.native
    
    var GET_ALL_COOKIES: String = js.native
    
    var GET_APP_CACHE: String = js.native
    
    var GET_APP_CACHE_STATUS: String = js.native
    
    var GET_AVAILABLE_LOG_TYPES: String = js.native
    
    var GET_COOKIE: String = js.native
    
    var GET_CURRENT_URL: String = js.native
    
    var GET_CURRENT_WINDOW_HANDLE: String = js.native
    
    var GET_ELEMENT_ATTRIBUTE: String = js.native
    
    var GET_ELEMENT_LOCATION: String = js.native
    
    var GET_ELEMENT_LOCATION_IN_VIEW: String = js.native
    
    var GET_ELEMENT_SIZE: String = js.native
    
    var GET_ELEMENT_TAG_NAME: String = js.native
    
    var GET_ELEMENT_TEXT: String = js.native
    
    var GET_ELEMENT_VALUE_OF_CSS_PROPERTY: String = js.native
    
    var GET_LOCAL_STORAGE_ITEM: String = js.native
    
    var GET_LOCAL_STORAGE_KEYS: String = js.native
    
    var GET_LOCAL_STORAGE_SIZE: String = js.native
    
    var GET_LOCATION: String = js.native
    
    var GET_LOG: String = js.native
    
    var GET_PAGE_SOURCE: String = js.native
    
    var GET_SCREEN_ORIENTATION: String = js.native
    
    var GET_SERVER_STATUS: String = js.native
    
    var GET_SESSIONS: String = js.native
    
    var GET_SESSION_LOGS: String = js.native
    
    var GET_SESSION_STORAGE_ITEM: String = js.native
    
    var GET_SESSION_STORAGE_KEYS: String = js.native
    
    var GET_SESSION_STORAGE_SIZE: String = js.native
    
    var GET_TITLE: String = js.native
    
    var GET_WINDOW_HANDLES: String = js.native
    
    var GET_WINDOW_POSITION: String = js.native
    
    var GET_WINDOW_SIZE: String = js.native
    
    var GO_BACK: String = js.native
    
    var GO_FORWARD: String = js.native
    
    var IMPLICITLY_WAIT: String = js.native
    
    var IS_BROWSER_ONLINE: String = js.native
    
    var IS_ELEMENT_DISPLAYED: String = js.native
    
    var IS_ELEMENT_ENABLED: String = js.native
    
    var IS_ELEMENT_SELECTED: String = js.native
    
    var LEGACY_ACTION_CLICK: String = js.native
    
    var LEGACY_ACTION_DOUBLE_CLICK: String = js.native
    
    var LEGACY_ACTION_MOUSE_DOWN: String = js.native
    
    var LEGACY_ACTION_MOUSE_MOVE: String = js.native
    
    var LEGACY_ACTION_MOUSE_UP: String = js.native
    
    var LEGACY_ACTION_SEND_KEYS: String = js.native
    
    var LEGACY_ACTION_TOUCH_DOUBLE_TAP: String = js.native
    
    var LEGACY_ACTION_TOUCH_DOWN: String = js.native
    
    var LEGACY_ACTION_TOUCH_FLICK: String = js.native
    
    var LEGACY_ACTION_TOUCH_LONG_PRESS: String = js.native
    
    var LEGACY_ACTION_TOUCH_MOVE: String = js.native
    
    var LEGACY_ACTION_TOUCH_SCROLL: String = js.native
    
    var LEGACY_ACTION_TOUCH_SINGLE_TAP: String = js.native
    
    var LEGACY_ACTION_TOUCH_UP: String = js.native
    
    var MAXIMIZE_WINDOW: String = js.native
    
    var MOUSE_DOWN: String = js.native
    
    var MOUSE_UP: String = js.native
    
    var MOVE_TO: String = js.native
    
    var NEW_SESSION: String = js.native
    
    var QUIT: String = js.native
    
    var REFRESH: String = js.native
    
    var REMOVE_LOCAL_STORAGE_ITEM: String = js.native
    
    var REMOVE_SESSION_STORAGE_ITEM: String = js.native
    
    var SCREENSHOT: String = js.native
    
    var SEND_KEYS_TO_ACTIVE_ELEMENT: String = js.native
    
    var SEND_KEYS_TO_ELEMENT: String = js.native
    
    var SET_ALERT_TEXT: String = js.native
    
    var SET_BROWSER_ONLINE: String = js.native
    
    var SET_LOCAL_STORAGE_ITEM: String = js.native
    
    var SET_LOCATION: String = js.native
    
    var SET_SCREEN_ORIENTATION: String = js.native
    
    var SET_SCRIPT_TIMEOUT: String = js.native
    
    var SET_SESSION_STORAGE_ITEM: String = js.native
    
    var SET_TIMEOUT: String = js.native
    
    var SET_WINDOW_POSITION: String = js.native
    
    var SET_WINDOW_SIZE: String = js.native
    
    var SUBMIT_ELEMENT: String = js.native
    
    var SWITCH_TO_FRAME: String = js.native
    
    var SWITCH_TO_WINDOW: String = js.native
    
    var TOUCH_DOUBLE_TAP: String = js.native
    
    var TOUCH_DOWN: String = js.native
    
    var TOUCH_FLICK: String = js.native
    
    var TOUCH_LONG_PRESS: String = js.native
    
    var TOUCH_MOVE: String = js.native
    
    var TOUCH_SCROLL: String = js.native
    
    // These belong to the Advanced Touch API
    var TOUCH_SINGLE_TAP: String = js.native
    
    var TOUCH_UP: String = js.native
    
    var UPLOAD_FILE: String = js.native
  }
  object ICommandName {
    
    @scala.inline
    def apply(
      ACCEPT_ALERT: String,
      ACTIONS: String,
      ADD_COOKIE: String,
      CLEAR_ACTIONS: String,
      CLEAR_APP_CACHE: String,
      CLEAR_ELEMENT: String,
      CLEAR_LOCAL_STORAGE: String,
      CLEAR_SESSION_STORAGE: String,
      CLICK: String,
      CLICK_ELEMENT: String,
      CLOSE: String,
      DELETE_ALL_COOKIES: String,
      DELETE_COOKIE: String,
      DESCRIBE_SESSION: String,
      DISMISS_ALERT: String,
      DOUBLE_CLICK: String,
      ELEMENT_EQUALS: String,
      EXECUTE_ASYNC_SCRIPT: String,
      EXECUTE_SCRIPT: String,
      EXECUTE_SQL: String,
      FIND_CHILD_ELEMENT: String,
      FIND_CHILD_ELEMENTS: String,
      FIND_ELEMENT: String,
      FIND_ELEMENTS: String,
      GET: String,
      GET_ACTIVE_ELEMENT: String,
      GET_ALERT_TEXT: String,
      GET_ALL_COOKIES: String,
      GET_APP_CACHE: String,
      GET_APP_CACHE_STATUS: String,
      GET_AVAILABLE_LOG_TYPES: String,
      GET_COOKIE: String,
      GET_CURRENT_URL: String,
      GET_CURRENT_WINDOW_HANDLE: String,
      GET_ELEMENT_ATTRIBUTE: String,
      GET_ELEMENT_LOCATION: String,
      GET_ELEMENT_LOCATION_IN_VIEW: String,
      GET_ELEMENT_SIZE: String,
      GET_ELEMENT_TAG_NAME: String,
      GET_ELEMENT_TEXT: String,
      GET_ELEMENT_VALUE_OF_CSS_PROPERTY: String,
      GET_LOCAL_STORAGE_ITEM: String,
      GET_LOCAL_STORAGE_KEYS: String,
      GET_LOCAL_STORAGE_SIZE: String,
      GET_LOCATION: String,
      GET_LOG: String,
      GET_PAGE_SOURCE: String,
      GET_SCREEN_ORIENTATION: String,
      GET_SERVER_STATUS: String,
      GET_SESSIONS: String,
      GET_SESSION_LOGS: String,
      GET_SESSION_STORAGE_ITEM: String,
      GET_SESSION_STORAGE_KEYS: String,
      GET_SESSION_STORAGE_SIZE: String,
      GET_TITLE: String,
      GET_WINDOW_HANDLES: String,
      GET_WINDOW_POSITION: String,
      GET_WINDOW_SIZE: String,
      GO_BACK: String,
      GO_FORWARD: String,
      IMPLICITLY_WAIT: String,
      IS_BROWSER_ONLINE: String,
      IS_ELEMENT_DISPLAYED: String,
      IS_ELEMENT_ENABLED: String,
      IS_ELEMENT_SELECTED: String,
      LEGACY_ACTION_CLICK: String,
      LEGACY_ACTION_DOUBLE_CLICK: String,
      LEGACY_ACTION_MOUSE_DOWN: String,
      LEGACY_ACTION_MOUSE_MOVE: String,
      LEGACY_ACTION_MOUSE_UP: String,
      LEGACY_ACTION_SEND_KEYS: String,
      LEGACY_ACTION_TOUCH_DOUBLE_TAP: String,
      LEGACY_ACTION_TOUCH_DOWN: String,
      LEGACY_ACTION_TOUCH_FLICK: String,
      LEGACY_ACTION_TOUCH_LONG_PRESS: String,
      LEGACY_ACTION_TOUCH_MOVE: String,
      LEGACY_ACTION_TOUCH_SCROLL: String,
      LEGACY_ACTION_TOUCH_SINGLE_TAP: String,
      LEGACY_ACTION_TOUCH_UP: String,
      MAXIMIZE_WINDOW: String,
      MOUSE_DOWN: String,
      MOUSE_UP: String,
      MOVE_TO: String,
      NEW_SESSION: String,
      QUIT: String,
      REFRESH: String,
      REMOVE_LOCAL_STORAGE_ITEM: String,
      REMOVE_SESSION_STORAGE_ITEM: String,
      SCREENSHOT: String,
      SEND_KEYS_TO_ACTIVE_ELEMENT: String,
      SEND_KEYS_TO_ELEMENT: String,
      SET_ALERT_TEXT: String,
      SET_BROWSER_ONLINE: String,
      SET_LOCAL_STORAGE_ITEM: String,
      SET_LOCATION: String,
      SET_SCREEN_ORIENTATION: String,
      SET_SCRIPT_TIMEOUT: String,
      SET_SESSION_STORAGE_ITEM: String,
      SET_TIMEOUT: String,
      SET_WINDOW_POSITION: String,
      SET_WINDOW_SIZE: String,
      SUBMIT_ELEMENT: String,
      SWITCH_TO_FRAME: String,
      SWITCH_TO_WINDOW: String,
      TOUCH_DOUBLE_TAP: String,
      TOUCH_DOWN: String,
      TOUCH_FLICK: String,
      TOUCH_LONG_PRESS: String,
      TOUCH_MOVE: String,
      TOUCH_SCROLL: String,
      TOUCH_SINGLE_TAP: String,
      TOUCH_UP: String,
      UPLOAD_FILE: String
    ): ICommandName = {
      val __obj = js.Dynamic.literal(ACCEPT_ALERT = ACCEPT_ALERT.asInstanceOf[js.Any], ACTIONS = ACTIONS.asInstanceOf[js.Any], ADD_COOKIE = ADD_COOKIE.asInstanceOf[js.Any], CLEAR_ACTIONS = CLEAR_ACTIONS.asInstanceOf[js.Any], CLEAR_APP_CACHE = CLEAR_APP_CACHE.asInstanceOf[js.Any], CLEAR_ELEMENT = CLEAR_ELEMENT.asInstanceOf[js.Any], CLEAR_LOCAL_STORAGE = CLEAR_LOCAL_STORAGE.asInstanceOf[js.Any], CLEAR_SESSION_STORAGE = CLEAR_SESSION_STORAGE.asInstanceOf[js.Any], CLICK = CLICK.asInstanceOf[js.Any], CLICK_ELEMENT = CLICK_ELEMENT.asInstanceOf[js.Any], CLOSE = CLOSE.asInstanceOf[js.Any], DELETE_ALL_COOKIES = DELETE_ALL_COOKIES.asInstanceOf[js.Any], DELETE_COOKIE = DELETE_COOKIE.asInstanceOf[js.Any], DESCRIBE_SESSION = DESCRIBE_SESSION.asInstanceOf[js.Any], DISMISS_ALERT = DISMISS_ALERT.asInstanceOf[js.Any], DOUBLE_CLICK = DOUBLE_CLICK.asInstanceOf[js.Any], ELEMENT_EQUALS = ELEMENT_EQUALS.asInstanceOf[js.Any], EXECUTE_ASYNC_SCRIPT = EXECUTE_ASYNC_SCRIPT.asInstanceOf[js.Any], EXECUTE_SCRIPT = EXECUTE_SCRIPT.asInstanceOf[js.Any], EXECUTE_SQL = EXECUTE_SQL.asInstanceOf[js.Any], FIND_CHILD_ELEMENT = FIND_CHILD_ELEMENT.asInstanceOf[js.Any], FIND_CHILD_ELEMENTS = FIND_CHILD_ELEMENTS.asInstanceOf[js.Any], FIND_ELEMENT = FIND_ELEMENT.asInstanceOf[js.Any], FIND_ELEMENTS = FIND_ELEMENTS.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], GET_ACTIVE_ELEMENT = GET_ACTIVE_ELEMENT.asInstanceOf[js.Any], GET_ALERT_TEXT = GET_ALERT_TEXT.asInstanceOf[js.Any], GET_ALL_COOKIES = GET_ALL_COOKIES.asInstanceOf[js.Any], GET_APP_CACHE = GET_APP_CACHE.asInstanceOf[js.Any], GET_APP_CACHE_STATUS = GET_APP_CACHE_STATUS.asInstanceOf[js.Any], GET_AVAILABLE_LOG_TYPES = GET_AVAILABLE_LOG_TYPES.asInstanceOf[js.Any], GET_COOKIE = GET_COOKIE.asInstanceOf[js.Any], GET_CURRENT_URL = GET_CURRENT_URL.asInstanceOf[js.Any], GET_CURRENT_WINDOW_HANDLE = GET_CURRENT_WINDOW_HANDLE.asInstanceOf[js.Any], GET_ELEMENT_ATTRIBUTE = GET_ELEMENT_ATTRIBUTE.asInstanceOf[js.Any], GET_ELEMENT_LOCATION = GET_ELEMENT_LOCATION.asInstanceOf[js.Any], GET_ELEMENT_LOCATION_IN_VIEW = GET_ELEMENT_LOCATION_IN_VIEW.asInstanceOf[js.Any], GET_ELEMENT_SIZE = GET_ELEMENT_SIZE.asInstanceOf[js.Any], GET_ELEMENT_TAG_NAME = GET_ELEMENT_TAG_NAME.asInstanceOf[js.Any], GET_ELEMENT_TEXT = GET_ELEMENT_TEXT.asInstanceOf[js.Any], GET_ELEMENT_VALUE_OF_CSS_PROPERTY = GET_ELEMENT_VALUE_OF_CSS_PROPERTY.asInstanceOf[js.Any], GET_LOCAL_STORAGE_ITEM = GET_LOCAL_STORAGE_ITEM.asInstanceOf[js.Any], GET_LOCAL_STORAGE_KEYS = GET_LOCAL_STORAGE_KEYS.asInstanceOf[js.Any], GET_LOCAL_STORAGE_SIZE = GET_LOCAL_STORAGE_SIZE.asInstanceOf[js.Any], GET_LOCATION = GET_LOCATION.asInstanceOf[js.Any], GET_LOG = GET_LOG.asInstanceOf[js.Any], GET_PAGE_SOURCE = GET_PAGE_SOURCE.asInstanceOf[js.Any], GET_SCREEN_ORIENTATION = GET_SCREEN_ORIENTATION.asInstanceOf[js.Any], GET_SERVER_STATUS = GET_SERVER_STATUS.asInstanceOf[js.Any], GET_SESSIONS = GET_SESSIONS.asInstanceOf[js.Any], GET_SESSION_LOGS = GET_SESSION_LOGS.asInstanceOf[js.Any], GET_SESSION_STORAGE_ITEM = GET_SESSION_STORAGE_ITEM.asInstanceOf[js.Any], GET_SESSION_STORAGE_KEYS = GET_SESSION_STORAGE_KEYS.asInstanceOf[js.Any], GET_SESSION_STORAGE_SIZE = GET_SESSION_STORAGE_SIZE.asInstanceOf[js.Any], GET_TITLE = GET_TITLE.asInstanceOf[js.Any], GET_WINDOW_HANDLES = GET_WINDOW_HANDLES.asInstanceOf[js.Any], GET_WINDOW_POSITION = GET_WINDOW_POSITION.asInstanceOf[js.Any], GET_WINDOW_SIZE = GET_WINDOW_SIZE.asInstanceOf[js.Any], GO_BACK = GO_BACK.asInstanceOf[js.Any], GO_FORWARD = GO_FORWARD.asInstanceOf[js.Any], IMPLICITLY_WAIT = IMPLICITLY_WAIT.asInstanceOf[js.Any], IS_BROWSER_ONLINE = IS_BROWSER_ONLINE.asInstanceOf[js.Any], IS_ELEMENT_DISPLAYED = IS_ELEMENT_DISPLAYED.asInstanceOf[js.Any], IS_ELEMENT_ENABLED = IS_ELEMENT_ENABLED.asInstanceOf[js.Any], IS_ELEMENT_SELECTED = IS_ELEMENT_SELECTED.asInstanceOf[js.Any], LEGACY_ACTION_CLICK = LEGACY_ACTION_CLICK.asInstanceOf[js.Any], LEGACY_ACTION_DOUBLE_CLICK = LEGACY_ACTION_DOUBLE_CLICK.asInstanceOf[js.Any], LEGACY_ACTION_MOUSE_DOWN = LEGACY_ACTION_MOUSE_DOWN.asInstanceOf[js.Any], LEGACY_ACTION_MOUSE_MOVE = LEGACY_ACTION_MOUSE_MOVE.asInstanceOf[js.Any], LEGACY_ACTION_MOUSE_UP = LEGACY_ACTION_MOUSE_UP.asInstanceOf[js.Any], LEGACY_ACTION_SEND_KEYS = LEGACY_ACTION_SEND_KEYS.asInstanceOf[js.Any], LEGACY_ACTION_TOUCH_DOUBLE_TAP = LEGACY_ACTION_TOUCH_DOUBLE_TAP.asInstanceOf[js.Any], LEGACY_ACTION_TOUCH_DOWN = LEGACY_ACTION_TOUCH_DOWN.asInstanceOf[js.Any], LEGACY_ACTION_TOUCH_FLICK = LEGACY_ACTION_TOUCH_FLICK.asInstanceOf[js.Any], LEGACY_ACTION_TOUCH_LONG_PRESS = LEGACY_ACTION_TOUCH_LONG_PRESS.asInstanceOf[js.Any], LEGACY_ACTION_TOUCH_MOVE = LEGACY_ACTION_TOUCH_MOVE.asInstanceOf[js.Any], LEGACY_ACTION_TOUCH_SCROLL = LEGACY_ACTION_TOUCH_SCROLL.asInstanceOf[js.Any], LEGACY_ACTION_TOUCH_SINGLE_TAP = LEGACY_ACTION_TOUCH_SINGLE_TAP.asInstanceOf[js.Any], LEGACY_ACTION_TOUCH_UP = LEGACY_ACTION_TOUCH_UP.asInstanceOf[js.Any], MAXIMIZE_WINDOW = MAXIMIZE_WINDOW.asInstanceOf[js.Any], MOUSE_DOWN = MOUSE_DOWN.asInstanceOf[js.Any], MOUSE_UP = MOUSE_UP.asInstanceOf[js.Any], MOVE_TO = MOVE_TO.asInstanceOf[js.Any], NEW_SESSION = NEW_SESSION.asInstanceOf[js.Any], QUIT = QUIT.asInstanceOf[js.Any], REFRESH = REFRESH.asInstanceOf[js.Any], REMOVE_LOCAL_STORAGE_ITEM = REMOVE_LOCAL_STORAGE_ITEM.asInstanceOf[js.Any], REMOVE_SESSION_STORAGE_ITEM = REMOVE_SESSION_STORAGE_ITEM.asInstanceOf[js.Any], SCREENSHOT = SCREENSHOT.asInstanceOf[js.Any], SEND_KEYS_TO_ACTIVE_ELEMENT = SEND_KEYS_TO_ACTIVE_ELEMENT.asInstanceOf[js.Any], SEND_KEYS_TO_ELEMENT = SEND_KEYS_TO_ELEMENT.asInstanceOf[js.Any], SET_ALERT_TEXT = SET_ALERT_TEXT.asInstanceOf[js.Any], SET_BROWSER_ONLINE = SET_BROWSER_ONLINE.asInstanceOf[js.Any], SET_LOCAL_STORAGE_ITEM = SET_LOCAL_STORAGE_ITEM.asInstanceOf[js.Any], SET_LOCATION = SET_LOCATION.asInstanceOf[js.Any], SET_SCREEN_ORIENTATION = SET_SCREEN_ORIENTATION.asInstanceOf[js.Any], SET_SCRIPT_TIMEOUT = SET_SCRIPT_TIMEOUT.asInstanceOf[js.Any], SET_SESSION_STORAGE_ITEM = SET_SESSION_STORAGE_ITEM.asInstanceOf[js.Any], SET_TIMEOUT = SET_TIMEOUT.asInstanceOf[js.Any], SET_WINDOW_POSITION = SET_WINDOW_POSITION.asInstanceOf[js.Any], SET_WINDOW_SIZE = SET_WINDOW_SIZE.asInstanceOf[js.Any], SUBMIT_ELEMENT = SUBMIT_ELEMENT.asInstanceOf[js.Any], SWITCH_TO_FRAME = SWITCH_TO_FRAME.asInstanceOf[js.Any], SWITCH_TO_WINDOW = SWITCH_TO_WINDOW.asInstanceOf[js.Any], TOUCH_DOUBLE_TAP = TOUCH_DOUBLE_TAP.asInstanceOf[js.Any], TOUCH_DOWN = TOUCH_DOWN.asInstanceOf[js.Any], TOUCH_FLICK = TOUCH_FLICK.asInstanceOf[js.Any], TOUCH_LONG_PRESS = TOUCH_LONG_PRESS.asInstanceOf[js.Any], TOUCH_MOVE = TOUCH_MOVE.asInstanceOf[js.Any], TOUCH_SCROLL = TOUCH_SCROLL.asInstanceOf[js.Any], TOUCH_SINGLE_TAP = TOUCH_SINGLE_TAP.asInstanceOf[js.Any], TOUCH_UP = TOUCH_UP.asInstanceOf[js.Any], UPLOAD_FILE = UPLOAD_FILE.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICommandName]
    }
    
    @scala.inline
    implicit class ICommandNameMutableBuilder[Self <: ICommandName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setACCEPT_ALERT(value: String): Self = StObject.set(x, "ACCEPT_ALERT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setACTIONS(value: String): Self = StObject.set(x, "ACTIONS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setADD_COOKIE(value: String): Self = StObject.set(x, "ADD_COOKIE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLEAR_ACTIONS(value: String): Self = StObject.set(x, "CLEAR_ACTIONS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLEAR_APP_CACHE(value: String): Self = StObject.set(x, "CLEAR_APP_CACHE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLEAR_ELEMENT(value: String): Self = StObject.set(x, "CLEAR_ELEMENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLEAR_LOCAL_STORAGE(value: String): Self = StObject.set(x, "CLEAR_LOCAL_STORAGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLEAR_SESSION_STORAGE(value: String): Self = StObject.set(x, "CLEAR_SESSION_STORAGE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLICK(value: String): Self = StObject.set(x, "CLICK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLICK_ELEMENT(value: String): Self = StObject.set(x, "CLICK_ELEMENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCLOSE(value: String): Self = StObject.set(x, "CLOSE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDELETE_ALL_COOKIES(value: String): Self = StObject.set(x, "DELETE_ALL_COOKIES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDELETE_COOKIE(value: String): Self = StObject.set(x, "DELETE_COOKIE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDESCRIBE_SESSION(value: String): Self = StObject.set(x, "DESCRIBE_SESSION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDISMISS_ALERT(value: String): Self = StObject.set(x, "DISMISS_ALERT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDOUBLE_CLICK(value: String): Self = StObject.set(x, "DOUBLE_CLICK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setELEMENT_EQUALS(value: String): Self = StObject.set(x, "ELEMENT_EQUALS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEXECUTE_ASYNC_SCRIPT(value: String): Self = StObject.set(x, "EXECUTE_ASYNC_SCRIPT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEXECUTE_SCRIPT(value: String): Self = StObject.set(x, "EXECUTE_SCRIPT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEXECUTE_SQL(value: String): Self = StObject.set(x, "EXECUTE_SQL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFIND_CHILD_ELEMENT(value: String): Self = StObject.set(x, "FIND_CHILD_ELEMENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFIND_CHILD_ELEMENTS(value: String): Self = StObject.set(x, "FIND_CHILD_ELEMENTS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFIND_ELEMENT(value: String): Self = StObject.set(x, "FIND_ELEMENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFIND_ELEMENTS(value: String): Self = StObject.set(x, "FIND_ELEMENTS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET(value: String): Self = StObject.set(x, "GET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_ACTIVE_ELEMENT(value: String): Self = StObject.set(x, "GET_ACTIVE_ELEMENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_ALERT_TEXT(value: String): Self = StObject.set(x, "GET_ALERT_TEXT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_ALL_COOKIES(value: String): Self = StObject.set(x, "GET_ALL_COOKIES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_APP_CACHE(value: String): Self = StObject.set(x, "GET_APP_CACHE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_APP_CACHE_STATUS(value: String): Self = StObject.set(x, "GET_APP_CACHE_STATUS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_AVAILABLE_LOG_TYPES(value: String): Self = StObject.set(x, "GET_AVAILABLE_LOG_TYPES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_COOKIE(value: String): Self = StObject.set(x, "GET_COOKIE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_CURRENT_URL(value: String): Self = StObject.set(x, "GET_CURRENT_URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_CURRENT_WINDOW_HANDLE(value: String): Self = StObject.set(x, "GET_CURRENT_WINDOW_HANDLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_ELEMENT_ATTRIBUTE(value: String): Self = StObject.set(x, "GET_ELEMENT_ATTRIBUTE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_ELEMENT_LOCATION(value: String): Self = StObject.set(x, "GET_ELEMENT_LOCATION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_ELEMENT_LOCATION_IN_VIEW(value: String): Self = StObject.set(x, "GET_ELEMENT_LOCATION_IN_VIEW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_ELEMENT_SIZE(value: String): Self = StObject.set(x, "GET_ELEMENT_SIZE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_ELEMENT_TAG_NAME(value: String): Self = StObject.set(x, "GET_ELEMENT_TAG_NAME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_ELEMENT_TEXT(value: String): Self = StObject.set(x, "GET_ELEMENT_TEXT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_ELEMENT_VALUE_OF_CSS_PROPERTY(value: String): Self = StObject.set(x, "GET_ELEMENT_VALUE_OF_CSS_PROPERTY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_LOCAL_STORAGE_ITEM(value: String): Self = StObject.set(x, "GET_LOCAL_STORAGE_ITEM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_LOCAL_STORAGE_KEYS(value: String): Self = StObject.set(x, "GET_LOCAL_STORAGE_KEYS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_LOCAL_STORAGE_SIZE(value: String): Self = StObject.set(x, "GET_LOCAL_STORAGE_SIZE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_LOCATION(value: String): Self = StObject.set(x, "GET_LOCATION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_LOG(value: String): Self = StObject.set(x, "GET_LOG", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_PAGE_SOURCE(value: String): Self = StObject.set(x, "GET_PAGE_SOURCE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_SCREEN_ORIENTATION(value: String): Self = StObject.set(x, "GET_SCREEN_ORIENTATION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_SERVER_STATUS(value: String): Self = StObject.set(x, "GET_SERVER_STATUS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_SESSIONS(value: String): Self = StObject.set(x, "GET_SESSIONS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_SESSION_LOGS(value: String): Self = StObject.set(x, "GET_SESSION_LOGS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_SESSION_STORAGE_ITEM(value: String): Self = StObject.set(x, "GET_SESSION_STORAGE_ITEM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_SESSION_STORAGE_KEYS(value: String): Self = StObject.set(x, "GET_SESSION_STORAGE_KEYS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_SESSION_STORAGE_SIZE(value: String): Self = StObject.set(x, "GET_SESSION_STORAGE_SIZE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_TITLE(value: String): Self = StObject.set(x, "GET_TITLE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_WINDOW_HANDLES(value: String): Self = StObject.set(x, "GET_WINDOW_HANDLES", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_WINDOW_POSITION(value: String): Self = StObject.set(x, "GET_WINDOW_POSITION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGET_WINDOW_SIZE(value: String): Self = StObject.set(x, "GET_WINDOW_SIZE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGO_BACK(value: String): Self = StObject.set(x, "GO_BACK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGO_FORWARD(value: String): Self = StObject.set(x, "GO_FORWARD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIMPLICITLY_WAIT(value: String): Self = StObject.set(x, "IMPLICITLY_WAIT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIS_BROWSER_ONLINE(value: String): Self = StObject.set(x, "IS_BROWSER_ONLINE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIS_ELEMENT_DISPLAYED(value: String): Self = StObject.set(x, "IS_ELEMENT_DISPLAYED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIS_ELEMENT_ENABLED(value: String): Self = StObject.set(x, "IS_ELEMENT_ENABLED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIS_ELEMENT_SELECTED(value: String): Self = StObject.set(x, "IS_ELEMENT_SELECTED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEGACY_ACTION_CLICK(value: String): Self = StObject.set(x, "LEGACY_ACTION_CLICK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEGACY_ACTION_DOUBLE_CLICK(value: String): Self = StObject.set(x, "LEGACY_ACTION_DOUBLE_CLICK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEGACY_ACTION_MOUSE_DOWN(value: String): Self = StObject.set(x, "LEGACY_ACTION_MOUSE_DOWN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEGACY_ACTION_MOUSE_MOVE(value: String): Self = StObject.set(x, "LEGACY_ACTION_MOUSE_MOVE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEGACY_ACTION_MOUSE_UP(value: String): Self = StObject.set(x, "LEGACY_ACTION_MOUSE_UP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEGACY_ACTION_SEND_KEYS(value: String): Self = StObject.set(x, "LEGACY_ACTION_SEND_KEYS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEGACY_ACTION_TOUCH_DOUBLE_TAP(value: String): Self = StObject.set(x, "LEGACY_ACTION_TOUCH_DOUBLE_TAP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEGACY_ACTION_TOUCH_DOWN(value: String): Self = StObject.set(x, "LEGACY_ACTION_TOUCH_DOWN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEGACY_ACTION_TOUCH_FLICK(value: String): Self = StObject.set(x, "LEGACY_ACTION_TOUCH_FLICK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEGACY_ACTION_TOUCH_LONG_PRESS(value: String): Self = StObject.set(x, "LEGACY_ACTION_TOUCH_LONG_PRESS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEGACY_ACTION_TOUCH_MOVE(value: String): Self = StObject.set(x, "LEGACY_ACTION_TOUCH_MOVE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEGACY_ACTION_TOUCH_SCROLL(value: String): Self = StObject.set(x, "LEGACY_ACTION_TOUCH_SCROLL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEGACY_ACTION_TOUCH_SINGLE_TAP(value: String): Self = StObject.set(x, "LEGACY_ACTION_TOUCH_SINGLE_TAP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLEGACY_ACTION_TOUCH_UP(value: String): Self = StObject.set(x, "LEGACY_ACTION_TOUCH_UP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMAXIMIZE_WINDOW(value: String): Self = StObject.set(x, "MAXIMIZE_WINDOW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOUSE_DOWN(value: String): Self = StObject.set(x, "MOUSE_DOWN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOUSE_UP(value: String): Self = StObject.set(x, "MOUSE_UP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMOVE_TO(value: String): Self = StObject.set(x, "MOVE_TO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNEW_SESSION(value: String): Self = StObject.set(x, "NEW_SESSION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQUIT(value: String): Self = StObject.set(x, "QUIT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREFRESH(value: String): Self = StObject.set(x, "REFRESH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREMOVE_LOCAL_STORAGE_ITEM(value: String): Self = StObject.set(x, "REMOVE_LOCAL_STORAGE_ITEM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setREMOVE_SESSION_STORAGE_ITEM(value: String): Self = StObject.set(x, "REMOVE_SESSION_STORAGE_ITEM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSCREENSHOT(value: String): Self = StObject.set(x, "SCREENSHOT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSEND_KEYS_TO_ACTIVE_ELEMENT(value: String): Self = StObject.set(x, "SEND_KEYS_TO_ACTIVE_ELEMENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSEND_KEYS_TO_ELEMENT(value: String): Self = StObject.set(x, "SEND_KEYS_TO_ELEMENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSET_ALERT_TEXT(value: String): Self = StObject.set(x, "SET_ALERT_TEXT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSET_BROWSER_ONLINE(value: String): Self = StObject.set(x, "SET_BROWSER_ONLINE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSET_LOCAL_STORAGE_ITEM(value: String): Self = StObject.set(x, "SET_LOCAL_STORAGE_ITEM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSET_LOCATION(value: String): Self = StObject.set(x, "SET_LOCATION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSET_SCREEN_ORIENTATION(value: String): Self = StObject.set(x, "SET_SCREEN_ORIENTATION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSET_SCRIPT_TIMEOUT(value: String): Self = StObject.set(x, "SET_SCRIPT_TIMEOUT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSET_SESSION_STORAGE_ITEM(value: String): Self = StObject.set(x, "SET_SESSION_STORAGE_ITEM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSET_TIMEOUT(value: String): Self = StObject.set(x, "SET_TIMEOUT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSET_WINDOW_POSITION(value: String): Self = StObject.set(x, "SET_WINDOW_POSITION", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSET_WINDOW_SIZE(value: String): Self = StObject.set(x, "SET_WINDOW_SIZE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUBMIT_ELEMENT(value: String): Self = StObject.set(x, "SUBMIT_ELEMENT", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSWITCH_TO_FRAME(value: String): Self = StObject.set(x, "SWITCH_TO_FRAME", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSWITCH_TO_WINDOW(value: String): Self = StObject.set(x, "SWITCH_TO_WINDOW", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOUCH_DOUBLE_TAP(value: String): Self = StObject.set(x, "TOUCH_DOUBLE_TAP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOUCH_DOWN(value: String): Self = StObject.set(x, "TOUCH_DOWN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOUCH_FLICK(value: String): Self = StObject.set(x, "TOUCH_FLICK", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOUCH_LONG_PRESS(value: String): Self = StObject.set(x, "TOUCH_LONG_PRESS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOUCH_MOVE(value: String): Self = StObject.set(x, "TOUCH_MOVE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOUCH_SCROLL(value: String): Self = StObject.set(x, "TOUCH_SCROLL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOUCH_SINGLE_TAP(value: String): Self = StObject.set(x, "TOUCH_SINGLE_TAP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTOUCH_UP(value: String): Self = StObject.set(x, "TOUCH_UP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUPLOAD_FILE(value: String): Self = StObject.set(x, "UPLOAD_FILE", value.asInstanceOf[js.Any])
    }
  }
}
