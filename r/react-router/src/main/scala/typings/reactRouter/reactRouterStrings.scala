package typings.reactRouter

import typings.reactRouter.contextMod.RelativeRoutingType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactRouterStrings {
  
  @js.native
  sealed trait generatePath extends StObject
  inline def generatePath: generatePath = "generatePath".asInstanceOf[generatePath]
  
  @js.native
  sealed trait path
    extends StObject
       with RelativeRoutingType
  inline def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait route
    extends StObject
       with RelativeRoutingType
  inline def route: route = "route".asInstanceOf[route]
}
