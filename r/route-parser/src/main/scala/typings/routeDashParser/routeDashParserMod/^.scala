package typings.routeDashParser.routeDashParserMod

import typings.routeDashParser.routeDashParserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("route-parser", JSImport.Namespace)
@js.native
class ^[TParams /* <: js.Object */] protected () extends Route[TParams] {
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
    */ typings.routeDashParser.routeDashParserStrings.Route with js.Any) | `false` = js.native
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

