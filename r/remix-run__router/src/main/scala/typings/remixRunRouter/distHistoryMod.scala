package typings.remixRunRouter

import typings.remixRunRouter.anon.PartialLocation
import typings.remixRunRouter.anon.PartialPath
import typings.remixRunRouter.anon.ReadonlyLocation
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHistoryMod {
  
  @JSImport("@remix-run/router/dist/history", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Action extends StObject
  @JSImport("@remix-run/router/dist/history", "Action")
  @js.native
  object Action extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Action & String] = js.native
    
    /**
      * A POP indicates a change to an arbitrary index in the history stack, such
      * as a back or forward navigation. It does not describe the direction of the
      * navigation, only that the current index changed.
      *
      * Note: This is the default action for newly created history objects.
      */
    @js.native
    sealed trait Pop
      extends StObject
         with Action
    /* "POP" */ val Pop: typings.remixRunRouter.distHistoryMod.Action.Pop & String = js.native
    
    /**
      * A PUSH indicates a new entry being added to the history stack, such as when
      * a link is clicked and a new page loads. When this happens, all subsequent
      * entries in the stack are lost.
      */
    @js.native
    sealed trait Push
      extends StObject
         with Action
    /* "PUSH" */ val Push: typings.remixRunRouter.distHistoryMod.Action.Push & String = js.native
    
    /**
      * A REPLACE indicates the entry at the current index in the history stack
      * being replaced by a new one.
      */
    @js.native
    sealed trait Replace
      extends StObject
         with Action
    /* "REPLACE" */ val Replace: typings.remixRunRouter.distHistoryMod.Action.Replace & String = js.native
  }
  
  inline def createBrowserHistory(): BrowserHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserHistory")().asInstanceOf[BrowserHistory]
  inline def createBrowserHistory(options: BrowserHistoryOptions): BrowserHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createBrowserHistory")(options.asInstanceOf[js.Any]).asInstanceOf[BrowserHistory]
  
  inline def createHashHistory(): HashHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashHistory")().asInstanceOf[HashHistory]
  inline def createHashHistory(options: HashHistoryOptions): HashHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createHashHistory")(options.asInstanceOf[js.Any]).asInstanceOf[HashHistory]
  
  inline def createLocation(current: String, to: To): ReadonlyLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(current.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[ReadonlyLocation]
  inline def createLocation(current: String, to: To, state: Any): ReadonlyLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(current.asInstanceOf[js.Any], to.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ReadonlyLocation]
  inline def createLocation(current: String, to: To, state: Any, key: String): ReadonlyLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(current.asInstanceOf[js.Any], to.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReadonlyLocation]
  inline def createLocation(current: String, to: To, state: Unit, key: String): ReadonlyLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(current.asInstanceOf[js.Any], to.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReadonlyLocation]
  inline def createLocation(current: Location, to: To): ReadonlyLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(current.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[ReadonlyLocation]
  inline def createLocation(current: Location, to: To, state: Any): ReadonlyLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(current.asInstanceOf[js.Any], to.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ReadonlyLocation]
  inline def createLocation(current: Location, to: To, state: Any, key: String): ReadonlyLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(current.asInstanceOf[js.Any], to.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReadonlyLocation]
  inline def createLocation(current: Location, to: To, state: Unit, key: String): ReadonlyLocation = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocation")(current.asInstanceOf[js.Any], to.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[ReadonlyLocation]
  
  inline def createMemoryHistory(): MemoryHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryHistory")().asInstanceOf[MemoryHistory]
  inline def createMemoryHistory(options: MemoryHistoryOptions): MemoryHistory = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryHistory")(options.asInstanceOf[js.Any]).asInstanceOf[MemoryHistory]
  
  inline def createPath(hasPathnameSearchHash: PartialPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createPath")(hasPathnameSearchHash.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePath(path: String): PartialPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[PartialPath]
  
  type BrowserHistory = UrlHistory
  
  type BrowserHistoryOptions = UrlHistoryOptions
  
  type HashHistory = UrlHistory
  
  type HashHistoryOptions = UrlHistoryOptions
  
  @js.native
  trait History extends StObject {
    
    /**
      * The last action that modified the current location. This will always be
      * Action.Pop when a history instance is first created. This value is mutable.
      */
    val action: Action = js.native
    
    /**
      * Returns a valid href for the given `to` value that may be used as
      * the value of an <a href> attribute.
      *
      * @param to - The destination URL
      */
    def createHref(to: To): String = js.native
    
    /**
      * Navigates `n` entries backward/forward in the history stack relative to the
      * current index. For example, a "back" navigation would use go(-1).
      *
      * @param delta - The delta in the stack index
      */
    def go(delta: Double): Unit = js.native
    
    /**
      * Sets up a listener that will be called whenever the current location
      * changes.
      *
      * @param listener - A function that will be called when the location changes
      * @returns unlisten - A function that may be used to stop listening
      */
    def listen(listener: Listener): js.Function0[Unit] = js.native
    
    /**
      * The current location. This value is mutable.
      */
    val location: Location = js.native
    
    /**
      * Pushes a new location onto the history stack, increasing its length by one.
      * If there were any entries in the stack after the current one, they are
      * lost.
      *
      * @param to - The new URL
      * @param state - Data to associate with the new location
      */
    def push(to: To): Unit = js.native
    def push(to: To, state: Any): Unit = js.native
    
    /**
      * Replaces the current location in the history stack with a new one.  The
      * location that was replaced will no longer be available.
      *
      * @param to - The new URL
      * @param state - Data to associate with the new location
      */
    def replace(to: To): Unit = js.native
    def replace(to: To, state: Any): Unit = js.native
  }
  
  type InitialEntry = String | PartialLocation
  
  type Listener = js.Function1[/* update */ Update, Unit]
  
  trait Location
    extends StObject
       with Path {
    
    /**
      * A unique string associated with this location. May be used to safely store
      * and retrieve data in some other storage API, like `localStorage`.
      *
      * Note: This value is always "default" on the initial location.
      */
    var key: String
    
    /**
      * A value of arbitrary data associated with this location.
      */
    var state: Any
  }
  object Location {
    
    inline def apply(hash: String, key: String, pathname: String, search: String, state: Any): Location = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    extension [Self <: Location](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MemoryHistory
    extends StObject
       with History {
    
    /**
      * The current index in the history stack.
      */
    val index: Double = js.native
  }
  
  trait MemoryHistoryOptions extends StObject {
    
    var initialEntries: js.UndefOr[js.Array[InitialEntry]] = js.undefined
    
    var initialIndex: js.UndefOr[Double] = js.undefined
    
    var v5Compat: js.UndefOr[Boolean] = js.undefined
  }
  object MemoryHistoryOptions {
    
    inline def apply(): MemoryHistoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MemoryHistoryOptions]
    }
    
    extension [Self <: MemoryHistoryOptions](x: Self) {
      
      inline def setInitialEntries(value: js.Array[InitialEntry]): Self = StObject.set(x, "initialEntries", value.asInstanceOf[js.Any])
      
      inline def setInitialEntriesUndefined: Self = StObject.set(x, "initialEntries", js.undefined)
      
      inline def setInitialEntriesVarargs(value: InitialEntry*): Self = StObject.set(x, "initialEntries", js.Array(value*))
      
      inline def setInitialIndex(value: Double): Self = StObject.set(x, "initialIndex", value.asInstanceOf[js.Any])
      
      inline def setInitialIndexUndefined: Self = StObject.set(x, "initialIndex", js.undefined)
      
      inline def setV5Compat(value: Boolean): Self = StObject.set(x, "v5Compat", value.asInstanceOf[js.Any])
      
      inline def setV5CompatUndefined: Self = StObject.set(x, "v5Compat", js.undefined)
    }
  }
  
  trait Path extends StObject {
    
    /**
      * A URL fragment identifier, beginning with a #.
      */
    var hash: String
    
    /**
      * A URL pathname, beginning with a /.
      */
    var pathname: String
    
    /**
      * A URL search string, beginning with a ?.
      */
    var search: String
  }
  object Path {
    
    inline def apply(hash: String, pathname: String, search: String): Path = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], pathname = pathname.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any])
      __obj.asInstanceOf[Path]
    }
    
    extension [Self <: Path](x: Self) {
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    }
  }
  
  type To = String | PartialPath
  
  trait Update extends StObject {
    
    /**
      * The action that triggered the change.
      */
    var action: Action
    
    /**
      * The new location.
      */
    var location: Location
  }
  object Update {
    
    inline def apply(action: Action, location: Location): Update = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[Update]
    }
    
    extension [Self <: Update](x: Self) {
      
      inline def setAction(value: Action): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  type UrlHistory = History
  
  trait UrlHistoryOptions extends StObject {
    
    var v5Compat: js.UndefOr[Boolean] = js.undefined
    
    var window: js.UndefOr[Window] = js.undefined
  }
  object UrlHistoryOptions {
    
    inline def apply(): UrlHistoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlHistoryOptions]
    }
    
    extension [Self <: UrlHistoryOptions](x: Self) {
      
      inline def setV5Compat(value: Boolean): Self = StObject.set(x, "v5Compat", value.asInstanceOf[js.Any])
      
      inline def setV5CompatUndefined: Self = StObject.set(x, "v5Compat", js.undefined)
      
      inline def setWindow(value: Window): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
}
