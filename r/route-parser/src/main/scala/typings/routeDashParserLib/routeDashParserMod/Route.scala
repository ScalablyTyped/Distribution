package typings
package routeDashParserLib.routeDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route[TParams /* <: js.Object */] extends js.Object {
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
  def `match`(pathname: java.lang.String): (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in keyof TParams ]: string}
    */ routeDashParserLib.routeDashParserLibStrings.Route with js.Any) | routeDashParserLib.routeDashParserLibNumbers.`false`
  /**
    * Reverse a route specification to a path, returning false if it can't be
    * fulfilled
    * @example
    * var route = new Route('/:one/:two')
    * route.reverse({one: 'foo', two: 'bar'}) -> '/foo/bar'
    */
  def reverse(params: TParams): java.lang.String | routeDashParserLib.routeDashParserLibNumbers.`false`
}

object Route {
  @scala.inline
  def apply[TParams /* <: js.Object */](
    `match`: java.lang.String => (/* import warning: ImportType.apply c Unsupported type mapping: 
  {[ k in keyof TParams ]: string}
    */ routeDashParserLib.routeDashParserLibStrings.Route with js.Any) | routeDashParserLib.routeDashParserLibNumbers.`false`,
    reverse: TParams => java.lang.String | routeDashParserLib.routeDashParserLibNumbers.`false`
  ): Route[TParams] = {
    val __obj = js.Dynamic.literal(reverse = js.Any.fromFunction1(reverse))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Route[TParams]]
  }
}

