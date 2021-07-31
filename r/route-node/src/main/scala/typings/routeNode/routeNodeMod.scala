package typings.routeNode

import org.scalablytyped.runtime.StringDictionary
import typings.pathParser.encodingMod.URLParamsEncodingType
import typings.pathParser.mod.Path
import typings.routeNode.routeNodeStrings.query
import typings.routeNode.routeNodeStrings.url
import typings.searchParams.encodeMod.IOptions
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeNodeMod {
  
  @JSImport("route-node/dist/RouteNode", "RouteNode")
  @js.native
  class RouteNode ()
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
    
    var addRouteNode: js.Any = js.native
    
    def buildPath(routeName: String): String = js.native
    def buildPath(routeName: String, params: Unit, options: BuildOptions): String = js.native
    def buildPath(routeName: String, params: Record[String, js.Any]): String = js.native
    def buildPath(routeName: String, params: Record[String, js.Any], options: BuildOptions): String = js.native
    
    def buildState(name: String): RouteNodeState | Null = js.native
    def buildState(name: String, params: Record[String, js.Any]): RouteNodeState | Null = js.native
    
    var checkParents: js.Any = js.native
    
    var children: js.Array[RouteNode] = js.native
    
    var findAbsoluteChildren: js.Any = js.native
    
    var findSlashChild: js.Any = js.native
    
    def getNonAbsoluteChildren(): js.Array[RouteNode] = js.native
    
    def getParentSegments(): js.Array[RouteNode] = js.native
    def getParentSegments(segments: js.Array[RouteNode]): js.Array[RouteNode] = js.native
    
    def getPath(routeName: String): String | Null = js.native
    
    var getSegmentsByName: js.Any = js.native
    
    var getSegmentsMatchingPath: js.Any = js.native
    
    var hasParentsParams: js.Any = js.native
    
    def matchPath(path: String): RouteNodeState | Null = js.native
    def matchPath(path: String, options: MatchOptions): RouteNodeState | Null = js.native
    
    var name: String = js.native
    
    var parent: js.UndefOr[RouteNode] = js.native
    
    var parser: (Path[Record[String, js.Any]]) | Null = js.native
    
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
    
    @scala.inline
    def apply(): BuildOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BuildOptions]
    }
    
    @scala.inline
    implicit class BuildOptionsMutableBuilder[Self <: BuildOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQueryParams(value: IOptions): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsMode(value: QueryParamsMode): Self = StObject.set(x, "queryParamsMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsModeUndefined: Self = StObject.set(x, "queryParamsMode", js.undefined)
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setTrailingSlashMode(value: TrailingSlashMode): Self = StObject.set(x, "trailingSlashMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingSlashModeUndefined: Self = StObject.set(x, "trailingSlashMode", js.undefined)
      
      @scala.inline
      def setUrlParamsEncoding(value: URLParamsEncodingType): Self = StObject.set(x, "urlParamsEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlParamsEncodingUndefined: Self = StObject.set(x, "urlParamsEncoding", js.undefined)
    }
  }
  
  @js.native
  trait Callback extends StObject {
    
    def apply(args: js.Any*): Unit = js.native
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
    
    @scala.inline
    def apply(): MatchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MatchOptions]
    }
    
    @scala.inline
    implicit class MatchOptionsMutableBuilder[Self <: MatchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setQueryParams(value: IOptions): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsMode(value: QueryParamsMode): Self = StObject.set(x, "queryParamsMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsModeUndefined: Self = StObject.set(x, "queryParamsMode", js.undefined)
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setStrictTrailingSlash(value: Boolean): Self = StObject.set(x, "strictTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictTrailingSlashUndefined: Self = StObject.set(x, "strictTrailingSlash", js.undefined)
      
      @scala.inline
      def setStrongMatching(value: Boolean): Self = StObject.set(x, "strongMatching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrongMatchingUndefined: Self = StObject.set(x, "strongMatching", js.undefined)
      
      @scala.inline
      def setTrailingSlashMode(value: TrailingSlashMode): Self = StObject.set(x, "trailingSlashMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrailingSlashModeUndefined: Self = StObject.set(x, "trailingSlashMode", js.undefined)
      
      @scala.inline
      def setUrlParamsEncoding(value: URLParamsEncodingType): Self = StObject.set(x, "urlParamsEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlParamsEncodingUndefined: Self = StObject.set(x, "urlParamsEncoding", js.undefined)
    }
  }
  
  trait MatchResponse extends StObject {
    
    var params: Record[String, js.Any]
    
    var segments: js.Array[RouteNode]
  }
  object MatchResponse {
    
    @scala.inline
    def apply(params: Record[String, js.Any], segments: js.Array[RouteNode]): MatchResponse = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchResponse]
    }
    
    @scala.inline
    implicit class MatchResponseMutableBuilder[Self <: MatchResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: Record[String, js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegments(value: js.Array[RouteNode]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsVarargs(value: RouteNode*): Self = StObject.set(x, "segments", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.routeNode.routeNodeStrings.default
    - typings.routeNode.routeNodeStrings.strict
    - typings.routeNode.routeNodeStrings.loose
  */
  trait QueryParamsMode extends StObject
  object QueryParamsMode {
    
    @scala.inline
    def default: typings.routeNode.routeNodeStrings.default = "default".asInstanceOf[typings.routeNode.routeNodeStrings.default]
    
    @scala.inline
    def loose: typings.routeNode.routeNodeStrings.loose = "loose".asInstanceOf[typings.routeNode.routeNodeStrings.loose]
    
    @scala.inline
    def strict: typings.routeNode.routeNodeStrings.strict = "strict".asInstanceOf[typings.routeNode.routeNodeStrings.strict]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.routeNode.routeNodeMod.RouteNode
    - typings.routeNode.routeNodeMod.RouteDefinition
  */
  trait Route extends StObject
  
  trait RouteDefinition
    extends StObject
       with /* key */ StringDictionary[js.Any]
       with Route {
    
    var name: String
    
    var path: String
  }
  object RouteDefinition {
    
    @scala.inline
    def apply(name: String, path: String): RouteDefinition = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteDefinition]
    }
    
    @scala.inline
    implicit class RouteDefinitionMutableBuilder[Self <: RouteDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteNodeOptions extends StObject {
    
    var finalSort: js.UndefOr[Boolean] = js.undefined
    
    var onAdd: js.UndefOr[Callback] = js.undefined
    
    var parent: js.UndefOr[RouteNode] = js.undefined
    
    var sort: js.UndefOr[Boolean] = js.undefined
  }
  object RouteNodeOptions {
    
    @scala.inline
    def apply(): RouteNodeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RouteNodeOptions]
    }
    
    @scala.inline
    implicit class RouteNodeOptionsMutableBuilder[Self <: RouteNodeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFinalSort(value: Boolean): Self = StObject.set(x, "finalSort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalSortUndefined: Self = StObject.set(x, "finalSort", js.undefined)
      
      @scala.inline
      def setOnAdd(value: Callback): Self = StObject.set(x, "onAdd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      @scala.inline
      def setParent(value: RouteNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  trait RouteNodeState extends StObject {
    
    var meta: RouteNodeStateMeta
    
    var name: String
    
    var params: Record[String, js.Any]
  }
  object RouteNodeState {
    
    @scala.inline
    def apply(meta: RouteNodeStateMeta, name: String, params: Record[String, js.Any]): RouteNodeState = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteNodeState]
    }
    
    @scala.inline
    implicit class RouteNodeStateMutableBuilder[Self <: RouteNodeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMeta(value: RouteNodeStateMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: Record[String, js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def default: typings.routeNode.routeNodeStrings.default = "default".asInstanceOf[typings.routeNode.routeNodeStrings.default]
    
    @scala.inline
    def always: typings.routeNode.routeNodeStrings.always = "always".asInstanceOf[typings.routeNode.routeNodeStrings.always]
    
    @scala.inline
    def never: typings.routeNode.routeNodeStrings.never = "never".asInstanceOf[typings.routeNode.routeNodeStrings.never]
  }
}
