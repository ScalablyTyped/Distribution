package typings.routeNode

import typings.routeNode.distRouteNodeMod.QueryParamsMode
import typings.routeNode.distRouteNodeMod.TrailingSlashMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routeNodeStrings {
  
  @js.native
  sealed trait default
    extends StObject
       with QueryParamsMode
       with TrailingSlashMode
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait always
    extends StObject
       with TrailingSlashMode
  inline def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait loose
    extends StObject
       with QueryParamsMode
  inline def loose: loose = "loose".asInstanceOf[loose]
  
  @js.native
  sealed trait never
    extends StObject
       with TrailingSlashMode
  inline def never: never = "never".asInstanceOf[never]
  
  @js.native
  sealed trait query extends StObject
  inline def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait strict
    extends StObject
       with QueryParamsMode
  inline def strict: strict = "strict".asInstanceOf[strict]
  
  @js.native
  sealed trait url extends StObject
  inline def url: url = "url".asInstanceOf[url]
}
