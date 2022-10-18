package typings.storybookRouter

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.ReturnType
import typings.storybookRouter.anon.PartialLocationAncestorOrigins
import typings.storybookRouter.anon.Path
import typings.storybookRouter.anon.Plain
import typings.storybookRouter.distTs3Dot9ModulesReactRouterDomIndexMod.BrowserRouterProps
import typings.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod.NavigateFunction
import typings.storybookRouter.distTs3Dot9ModulesReactRouterIndexMod.RouterProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@storybook/router", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/router", "BaseLocationProvider")
  @js.native
  val BaseLocationProvider: js.Function1[
    /* hasBasenamePropChildrenLocationPropNavigationTypeNavigatorStaticProp */ RouterProps, 
    ReactElement | Null
  ] = js.native
  
  @JSImport("@storybook/router", "DEEPLY_EQUAL")
  @js.native
  val DEEPLY_EQUAL: js.Symbol = js.native
  
  object Link {
    
    inline def apply(hasToChildrenRest: LinkProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasToChildrenRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@storybook/router", "Link")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Link.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  object Location {
    
    inline def apply(hasChildren: LocationProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@storybook/router", "Location")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Location.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@storybook/router", "LocationProvider")
  @js.native
  val LocationProvider: js.Function1[/* hasBasenameChildrenWindow */ BrowserRouterProps, Element] = js.native
  
  trait Match extends StObject {
    
    var path: String
  }
  object Match {
    
    inline def apply(hasChildrenTargetPathStartsWith: MatchProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenTargetPathStartsWith.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@storybook/router", "Match")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Match.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    extension [Self <: Match](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  object Route {
    
    inline def apply(hasPathChildrenStartsWithHideOnly: RouteProps): Element = ^.asInstanceOf[js.Dynamic].apply(hasPathChildrenStartsWithHideOnly.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@storybook/router", "Route")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@storybook/router", "Route.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def buildArgsParam(initialArgs: Args, args: Args): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildArgsParam")(initialArgs.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def deepDiff(value: Any, update: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepDiff")(value.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getMatch(current: String, target: String): Match | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatch")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Match | Null]
  inline def getMatch(current: String, target: String, startsWith: Any): Match | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatch")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any], startsWith.asInstanceOf[js.Any])).asInstanceOf[Match | Null]
  
  inline def parsePath(): StoryData = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")().asInstanceOf[StoryData]
  inline def parsePath(path: String): StoryData = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[StoryData]
  
  inline def queryFromLocation(location: PartialLocationAncestorOrigins): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("queryFromLocation")(location.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  inline def queryFromString(s: String): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("queryFromString")(s.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  inline def stringifyQuery(query: Query): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyQuery")(query.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def useNavigate(): js.Function2[/* to */ String | Double, /* hasPlainOptions */ js.UndefOr[Any], Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useNavigate")().asInstanceOf[js.Function2[/* to */ String | Double, /* hasPlainOptions */ js.UndefOr[Any], Unit]]
  
  type Args = StringDictionary[Any]
  
  trait LinkProps extends StObject {
    
    var children: ReactNode
    
    var to: String
  }
  object LinkProps {
    
    inline def apply(to: String): LinkProps = {
      val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkProps]
    }
    
    extension [Self <: LinkProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocationProps extends StObject {
    
    def children(renderData: RenderData): ReactNode
  }
  object LocationProps {
    
    inline def apply(children: RenderData => ReactNode): LocationProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
      __obj.asInstanceOf[LocationProps]
    }
    
    extension [Self <: LocationProps](x: Self) {
      
      inline def setChildren(value: RenderData => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    }
  }
  
  trait MatchProps extends StObject {
    
    def children(matchingData: MatchingData): ReactNode
    
    var path: String
    
    var startsWith: Boolean
  }
  object MatchProps {
    
    inline def apply(children: MatchingData => ReactNode, path: String, startsWith: Boolean): MatchProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchProps]
    }
    
    extension [Self <: MatchProps](x: Self) {
      
      inline def setChildren(value: MatchingData => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStartsWith(value: Boolean): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
    }
  }
  
  trait MatchingData extends StObject {
    
    var `match`: Null | Path
  }
  object MatchingData {
    
    inline def apply(): MatchingData = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("match")(null)
      __obj.asInstanceOf[MatchingData]
    }
    
    extension [Self <: MatchingData](x: Self) {
      
      inline def setMatch(value: Path): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchNull: Self = StObject.set(x, "match", null)
    }
  }
  
  type NavigateOptions = ReturnType[js.Function0[NavigateFunction]] & Plain
  
  trait Other
    extends StObject
       with StoryData {
    
    var path: String
    
    var singleStory: js.UndefOr[Boolean] = js.undefined
  }
  object Other {
    
    inline def apply(path: String): Other = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Other]
    }
    
    extension [Self <: Other](x: Self) {
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSingleStory(value: Boolean): Self = StObject.set(x, "singleStory", value.asInstanceOf[js.Any])
      
      inline def setSingleStoryUndefined: Self = StObject.set(x, "singleStory", js.undefined)
    }
  }
  
  type Query = StringDictionary[Any]
  
  /* Inlined std.Pick<@storybook/router.@storybook/router.RouterData, 'location'> & @storybook/router.@storybook/router.Other */
  trait RenderData extends StObject {
    
    var location: PartialLocationAncestorOrigins
    
    var path: String
    
    var refId: js.UndefOr[String] = js.undefined
    
    var singleStory: js.UndefOr[Boolean] = js.undefined
    
    var storyId: js.UndefOr[String] = js.undefined
    
    var viewMode: js.UndefOr[String] = js.undefined
  }
  object RenderData {
    
    inline def apply(location: PartialLocationAncestorOrigins, path: String): RenderData = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderData]
    }
    
    extension [Self <: RenderData](x: Self) {
      
      inline def setLocation(value: PartialLocationAncestorOrigins): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      inline def setSingleStory(value: Boolean): Self = StObject.set(x, "singleStory", value.asInstanceOf[js.Any])
      
      inline def setSingleStoryUndefined: Self = StObject.set(x, "singleStory", js.undefined)
      
      inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      inline def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
      
      inline def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
  
  trait RouteProps extends StObject {
    
    var children: ReactNode
    
    var hideOnly: js.UndefOr[Boolean] = js.undefined
    
    var path: String
    
    var startsWith: js.UndefOr[Boolean] = js.undefined
  }
  object RouteProps {
    
    inline def apply(path: String): RouteProps = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteProps]
    }
    
    extension [Self <: RouteProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHideOnly(value: Boolean): Self = StObject.set(x, "hideOnly", value.asInstanceOf[js.Any])
      
      inline def setHideOnlyUndefined: Self = StObject.set(x, "hideOnly", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStartsWith(value: Boolean): Self = StObject.set(x, "startsWith", value.asInstanceOf[js.Any])
      
      inline def setStartsWithUndefined: Self = StObject.set(x, "startsWith", js.undefined)
    }
  }
  
  trait RouterData
    extends StObject
       with Other {
    
    var location: PartialLocationAncestorOrigins
    
    var navigate: ReturnType[
        js.Function0[
          js.Function2[/* to */ String | Double, /* hasPlainOptions */ js.UndefOr[Any], Unit]
        ]
      ]
  }
  object RouterData {
    
    inline def apply(
      location: PartialLocationAncestorOrigins,
      navigate: ReturnType[
          js.Function0[
            js.Function2[/* to */ String | Double, /* hasPlainOptions */ js.UndefOr[Any], Unit]
          ]
        ],
      path: String
    ): RouterData = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouterData]
    }
    
    extension [Self <: RouterData](x: Self) {
      
      inline def setLocation(value: PartialLocationAncestorOrigins): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setNavigate(
        value: ReturnType[
              js.Function0[
                js.Function2[/* to */ String | Double, /* hasPlainOptions */ js.UndefOr[Any], Unit]
              ]
            ]
      ): Self = StObject.set(x, "navigate", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoryData extends StObject {
    
    var refId: js.UndefOr[String] = js.undefined
    
    var storyId: js.UndefOr[String] = js.undefined
    
    var viewMode: js.UndefOr[String] = js.undefined
  }
  object StoryData {
    
    inline def apply(): StoryData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StoryData]
    }
    
    extension [Self <: StoryData](x: Self) {
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      inline def setStoryId(value: String): Self = StObject.set(x, "storyId", value.asInstanceOf[js.Any])
      
      inline def setStoryIdUndefined: Self = StObject.set(x, "storyId", js.undefined)
      
      inline def setViewMode(value: String): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
      
      inline def setViewModeUndefined: Self = StObject.set(x, "viewMode", js.undefined)
    }
  }
}
