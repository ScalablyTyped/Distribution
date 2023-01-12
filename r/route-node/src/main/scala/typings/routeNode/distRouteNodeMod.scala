package typings.routeNode

import org.scalablytyped.runtime.StringDictionary
import typings.pathParser.distEncodingMod.URLParamsEncodingType
import typings.pathParser.mod.Path
import typings.routeNode.routeNodeStrings.query
import typings.routeNode.routeNodeStrings.url
import typings.searchParams.distEncodeMod.IOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRouteNodeMod {
  
  @JSImport("route-node/dist/RouteNode", "RouteNode")
  @js.native
  open class RouteNode ()
    extends StObject
       with Route {
    def this(name: String) = this()
    def this(name: String, path: String) = this()
    def this(name: Unit, path: String) = this()
    def this(name: String, path: String, childRoutes: js.Array[Route]) = this()
    def this(name: String, path: Unit, childRoutes: js.Array[Route]) = this()
    def this(name: Unit, path: String, childRoutes: js.Array[Route]) = this()
    def this(name: Unit, path: Unit, childRoutes: js.Array[Route]) = this()
    def this(name: String, path: String, childRoutes: js.Array[Route], options: RouteNodeOptions) = this()
    def this(name: String, path: String, childRoutes: Unit, options: RouteNodeOptions) = this()
    def this(name: String, path: Unit, childRoutes: js.Array[Route], options: RouteNodeOptions) = this()
    def this(name: String, path: Unit, childRoutes: Unit, options: RouteNodeOptions) = this()
    def this(name: Unit, path: String, childRoutes: js.Array[Route], options: RouteNodeOptions) = this()
    def this(name: Unit, path: String, childRoutes: Unit, options: RouteNodeOptions) = this()
    def this(name: Unit, path: Unit, childRoutes: js.Array[Route], options: RouteNodeOptions) = this()
    def this(name: Unit, path: Unit, childRoutes: Unit, options: RouteNodeOptions) = this()
    
    var absolute: Boolean = js.native
    
    def add(route: js.Array[Route]): this.type = js.native
    def add(route: js.Array[Route], cb: Unit, sort: Boolean): this.type = js.native
    def add(route: js.Array[Route], cb: Callback): this.type = js.native
    def add(route: js.Array[Route], cb: Callback, sort: Boolean): this.type = js.native
    def add(route: Route): this.type = js.native
    def add(route: Route, cb: Unit, sort: Boolean): this.type = js.native
    def add(route: Route, cb: Callback): this.type = js.native
    def add(route: Route, cb: Callback, sort: Boolean): this.type = js.native
    
    def addNode(name: String, path: String): this.type = js.native
    
    /* private */ var addRouteNode: Any = js.native
    
    def buildPath(routeName: String): String = js.native
    def buildPath(routeName: String, params: Unit, options: BuildOptions): String = js.native
    def buildPath(routeName: String, params: Record[String, Any]): String = js.native
    def buildPath(routeName: String, params: Record[String, Any], options: BuildOptions): String = js.native
    
    def buildState(name: String): RouteNodeState | Null = js.native
    def buildState(name: String, params: Record[String, Any]): RouteNodeState | Null = js.native
    
    /* private */ var checkParents: Any = js.native
    
    var children: js.Array[RouteNode] = js.native
    
    /* private */ var findAbsoluteChildren: Any = js.native
    
    /* private */ var findSlashChild: Any = js.native
    
    def getNonAbsoluteChildren(): js.Array[RouteNode] = js.native
    
    def getParentSegments(): js.Array[RouteNode] = js.native
    def getParentSegments(segments: js.Array[RouteNode]): js.Array[RouteNode] = js.native
    
    def getPath(routeName: String): String | Null = js.native
    
    /* private */ var getSegmentsByName: Any = js.native
    
    /* private */ var getSegmentsMatchingPath: Any = js.native
    
    /* private */ var hasParentsParams: Any = js.native
    
    def matchPath(path: String): RouteNodeState | Null = js.native
    def matchPath(path: String, options: MatchOptions): RouteNodeState | Null = js.native
    
    var name: String = js.native
    
    var parent: js.UndefOr[RouteNode] = js.native
    
    var parser: (Path[Record[String, Any]]) | Null = js.native
    
    var path: String = js.native
    
    def setParent(parent: RouteNode): Unit = js.native
    
    def setPath(): Unit = js.native
    def setPath(path: String): Unit = js.native
    
    def sortChildren(): Unit = js.native
    
    def sortDescendants(): Unit = js.native
  }
  
  trait BuildOptions extends StObject {
    
    var queryParams: js.UndefOr[IOptions] = js.undefined
    
    var queryParamsMode: js.UndefOr[QueryParamsMode] = js.undefined
    
    var trailingSlashMode: js.UndefOr[TrailingSlashMode] = js.undefined
    
    var urlParamsEncoding: js.UndefOr[URLParamsEncodingType] = js.undefined
  }
  object BuildOptions {
    
    inline def apply(): BuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildOptions] (val x: Self) extends AnyVal {
      
      inline def setQueryParams(value: IOptions): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsMode(value: QueryParamsMode): Self = StObject.set(x, "queryParamsMode", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsModeUndefined: Self = StObject.set(x, "queryParamsMode", js.undefined)
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setTrailingSlashMode(value: TrailingSlashMode): Self = StObject.set(x, "trailingSlashMode", value.asInstanceOf[js.Any])
      
      inline def setTrailingSlashModeUndefined: Self = StObject.set(x, "trailingSlashMode", js.undefined)
      
      inline def setUrlParamsEncoding(value: URLParamsEncodingType): Self = StObject.set(x, "urlParamsEncoding", value.asInstanceOf[js.Any])
      
      inline def setUrlParamsEncodingUndefined: Self = StObject.set(x, "urlParamsEncoding", js.undefined)
    }
  }
  
  @js.native
  trait Callback extends StObject {
    
    def apply(args: Any*): Unit = js.native
  }
  
  trait MatchOptions extends StObject {
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var queryParams: js.UndefOr[IOptions] = js.undefined
    
    var queryParamsMode: js.UndefOr[QueryParamsMode] = js.undefined
    
    var strictTrailingSlash: js.UndefOr[Boolean] = js.undefined
    
    var strongMatching: js.UndefOr[Boolean] = js.undefined
    
    var trailingSlashMode: js.UndefOr[TrailingSlashMode] = js.undefined
    
    var urlParamsEncoding: js.UndefOr[URLParamsEncodingType] = js.undefined
  }
  object MatchOptions {
    
    inline def apply(): MatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatchOptions] (val x: Self) extends AnyVal {
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setQueryParams(value: IOptions): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsMode(value: QueryParamsMode): Self = StObject.set(x, "queryParamsMode", value.asInstanceOf[js.Any])
      
      inline def setQueryParamsModeUndefined: Self = StObject.set(x, "queryParamsMode", js.undefined)
      
      inline def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      inline def setStrictTrailingSlash(value: Boolean): Self = StObject.set(x, "strictTrailingSlash", value.asInstanceOf[js.Any])
      
      inline def setStrictTrailingSlashUndefined: Self = StObject.set(x, "strictTrailingSlash", js.undefined)
      
      inline def setStrongMatching(value: Boolean): Self = StObject.set(x, "strongMatching", value.asInstanceOf[js.Any])
      
      inline def setStrongMatchingUndefined: Self = StObject.set(x, "strongMatching", js.undefined)
      
      inline def setTrailingSlashMode(value: TrailingSlashMode): Self = StObject.set(x, "trailingSlashMode", value.asInstanceOf[js.Any])
      
      inline def setTrailingSlashModeUndefined: Self = StObject.set(x, "trailingSlashMode", js.undefined)
      
      inline def setUrlParamsEncoding(value: URLParamsEncodingType): Self = StObject.set(x, "urlParamsEncoding", value.asInstanceOf[js.Any])
      
      inline def setUrlParamsEncodingUndefined: Self = StObject.set(x, "urlParamsEncoding", js.undefined)
    }
  }
  
  trait MatchResponse extends StObject {
    
    var params: Record[String, Any]
    
    var segments: js.Array[RouteNode]
  }
  object MatchResponse {
    
    inline def apply(params: Record[String, Any], segments: js.Array[RouteNode]): MatchResponse = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MatchResponse] (val x: Self) extends AnyVal {
      
      inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setSegments(value: js.Array[RouteNode]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsVarargs(value: RouteNode*): Self = StObject.set(x, "segments", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.routeNode.routeNodeStrings.default
    - typings.routeNode.routeNodeStrings.strict
    - typings.routeNode.routeNodeStrings.loose
  */
  trait QueryParamsMode extends StObject
  object QueryParamsMode {
    
    inline def default: typings.routeNode.routeNodeStrings.default = "default".asInstanceOf[typings.routeNode.routeNodeStrings.default]
    
    inline def loose: typings.routeNode.routeNodeStrings.loose = "loose".asInstanceOf[typings.routeNode.routeNodeStrings.loose]
    
    inline def strict: typings.routeNode.routeNodeStrings.strict = "strict".asInstanceOf[typings.routeNode.routeNodeStrings.strict]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.routeNode.distRouteNodeMod.RouteNode
    - typings.routeNode.distRouteNodeMod.RouteDefinition
  */
  trait Route extends StObject
  
  trait RouteDefinition
    extends StObject
       with /* key */ StringDictionary[Any]
       with Route {
    
    var name: String
    
    var path: String
  }
  object RouteDefinition {
    
    inline def apply(name: String, path: String): RouteDefinition = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteDefinition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteDefinition] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteNodeOptions extends StObject {
    
    var finalSort: js.UndefOr[Boolean] = js.undefined
    
    var onAdd: js.UndefOr[Callback] = js.undefined
    
    var parent: js.UndefOr[RouteNode] = js.undefined
    
    var sort: js.UndefOr[Boolean] = js.undefined
  }
  object RouteNodeOptions {
    
    inline def apply(): RouteNodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteNodeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteNodeOptions] (val x: Self) extends AnyVal {
      
      inline def setFinalSort(value: Boolean): Self = StObject.set(x, "finalSort", value.asInstanceOf[js.Any])
      
      inline def setFinalSortUndefined: Self = StObject.set(x, "finalSort", js.undefined)
      
      inline def setOnAdd(value: Callback): Self = StObject.set(x, "onAdd", value.asInstanceOf[js.Any])
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setParent(value: RouteNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  trait RouteNodeState extends StObject {
    
    var meta: RouteNodeStateMeta
    
    var name: String
    
    var params: Record[String, Any]
  }
  object RouteNodeState {
    
    inline def apply(meta: RouteNodeStateMeta, name: String, params: Record[String, Any]): RouteNodeState = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteNodeState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RouteNodeState] (val x: Self) extends AnyVal {
      
      inline def setMeta(value: RouteNodeStateMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  type RouteNodeStateMeta = StringDictionary[StringDictionary[query | url]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.routeNode.routeNodeStrings.default
    - typings.routeNode.routeNodeStrings.never
    - typings.routeNode.routeNodeStrings.always
  */
  trait TrailingSlashMode extends StObject
  object TrailingSlashMode {
    
    inline def default: typings.routeNode.routeNodeStrings.default = "default".asInstanceOf[typings.routeNode.routeNodeStrings.default]
    
    inline def always: typings.routeNode.routeNodeStrings.always = "always".asInstanceOf[typings.routeNode.routeNodeStrings.always]
    
    inline def never: typings.routeNode.routeNodeStrings.never = "never".asInstanceOf[typings.routeNode.routeNodeStrings.never]
  }
}
