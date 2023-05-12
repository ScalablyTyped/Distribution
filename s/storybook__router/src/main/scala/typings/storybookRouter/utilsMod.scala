package typings.storybookRouter

import typings.storybookRouter.anon.PartialLocation
import typings.storybookRouter.distUtilsMod.Args
import typings.storybookRouter.distUtilsMod.Match
import typings.storybookRouter.distUtilsMod.Query
import typings.storybookRouter.distUtilsMod.StoryData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object utilsMod {
  
  @JSImport("@storybook/router/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@storybook/router/utils", "DEEPLY_EQUAL")
  @js.native
  val DEEPLY_EQUAL: js.Symbol = js.native
  
  inline def buildArgsParam(initialArgs: Unit, args: Args): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildArgsParam")(initialArgs.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def buildArgsParam(initialArgs: Args, args: Args): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildArgsParam")(initialArgs.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def deepDiff(value: Any, update: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("deepDiff")(value.asInstanceOf[js.Any], update.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getMatch(current: String, target: String): Match | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatch")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Match | Null]
  inline def getMatch(current: String, target: String, startsWith: Any): Match | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getMatch")(current.asInstanceOf[js.Any], target.asInstanceOf[js.Any], startsWith.asInstanceOf[js.Any])).asInstanceOf[Match | Null]
  
  inline def parsePath(): StoryData = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")().asInstanceOf[StoryData]
  inline def parsePath(path: String): StoryData = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[StoryData]
  
  inline def queryFromLocation(location: PartialLocation): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("queryFromLocation")(location.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  inline def queryFromString(): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("queryFromString")().asInstanceOf[Query]
  inline def queryFromString(s: String): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("queryFromString")(s.asInstanceOf[js.Any]).asInstanceOf[Query]
  
  inline def stringifyQuery(query: Query): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringifyQuery")(query.asInstanceOf[js.Any]).asInstanceOf[String]
}
