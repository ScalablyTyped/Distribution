package typings.routeParser

import org.scalablytyped.runtime.TopLevel
import typings.routeParser.routeParserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("route-parser", JSImport.Namespace)
  @js.native
  open class ^[TParams /* <: js.Object */] protected ()
    extends StObject
       with Route[TParams] {
    /**
      * Represents a route
      * @example
      * var route = new Route('/:foo/:bar');
      * @example
      * var route = new Route('/:foo/:bar');
      */
    def this(spec: String) = this()
    
    /**
      * Match a path against this route, returning the matched parameters if
      * it matches, false if not.
      * @example
      * var route = new Route('/this/is/my/route')
      * route.match('/this/is/my/route') // -> {}
      * @example
      * var route = new Route('/:one/:two')
      * route.match('/foo/bar/') // -> {one: 'foo', two: 'bar'}
      */
    /* CompleteClass */
    override def `match`(pathname: String): (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof TParams ]: string}
      */ typings.routeParser.routeParserStrings.Route & TopLevel[Any]) | `false` = js.native
    
    /**
      * Reverse a route specification to a path, returning false if it can't be
      * fulfilled
      * @example
      * var route = new Route('/:one/:two')
      * route.reverse({one: 'foo', two: 'bar'}) -> '/foo/bar'
      */
    /* CompleteClass */
    override def reverse(params: TParams): String | `false` = js.native
  }
  
  trait Route[TParams /* <: js.Object */] extends StObject {
    
    /**
      * Match a path against this route, returning the matched parameters if
      * it matches, false if not.
      * @example
      * var route = new Route('/this/is/my/route')
      * route.match('/this/is/my/route') // -> {}
      * @example
      * var route = new Route('/:one/:two')
      * route.match('/foo/bar/') // -> {one: 'foo', two: 'bar'}
      */
    def `match`(pathname: String): (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof TParams ]: string}
      */ typings.routeParser.routeParserStrings.Route & TopLevel[Any]) | `false`
    
    /**
      * Reverse a route specification to a path, returning false if it can't be
      * fulfilled
      * @example
      * var route = new Route('/:one/:two')
      * route.reverse({one: 'foo', two: 'bar'}) -> '/foo/bar'
      */
    def reverse(params: TParams): String | `false`
  }
  object Route {
    
    inline def apply[TParams /* <: js.Object */](
      `match`: String => (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof TParams ]: string}
      */ typings.routeParser.routeParserStrings.Route & TopLevel[Any]) | `false`,
      reverse: TParams => String | `false`
    ): Route[TParams] = {
      val __obj = js.Dynamic.literal(reverse = js.Any.fromFunction1(reverse))
      __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
      __obj.asInstanceOf[Route[TParams]]
    }
    
    extension [Self <: Route[?], TParams /* <: js.Object */](x: Self & Route[TParams]) {
      
      inline def setMatch(
        value: String => (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ k in keyof TParams ]: string}
        */ typings.routeParser.routeParserStrings.Route & TopLevel[Any]) | `false`
      ): Self = StObject.set(x, "match", js.Any.fromFunction1(value))
      
      inline def setReverse(value: TParams => String | `false`): Self = StObject.set(x, "reverse", js.Any.fromFunction1(value))
    }
  }
}
