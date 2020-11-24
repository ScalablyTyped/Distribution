package typings.routeParser.mod

import org.scalablytyped.runtime.TopLevel
import typings.routeParser.routeParserBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  def `match`(pathname: String): (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof TParams ]: string}
    */ typings.routeParser.routeParserStrings.Route with TopLevel[js.Any]) | `false` = js.native
  
  /**
    * Reverse a route specification to a path, returning false if it can't be
    * fulfilled
    * @example
    * var route = new Route('/:one/:two')
    * route.reverse({one: 'foo', two: 'bar'}) -> '/foo/bar'
    */
  def reverse(params: TParams): String | `false` = js.native
}
object Route {
  
  @scala.inline
  def apply[TParams /* <: js.Object */](
    `match`: String => (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in keyof TParams ]: string}
    */ typings.routeParser.routeParserStrings.Route with TopLevel[js.Any]) | `false`,
    reverse: TParams => String | `false`
  ): Route[TParams] = {
    val __obj = js.Dynamic.literal(reverse = js.Any.fromFunction1(reverse))
    __obj.updateDynamic("match")(js.Any.fromFunction1(`match`))
    __obj.asInstanceOf[Route[TParams]]
  }
  
  @scala.inline
  implicit class RouteOps[Self <: Route[_], TParams /* <: js.Object */] (val x: Self with Route[TParams]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMatch(
      value: String => (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ k in keyof TParams ]: string}
      */ typings.routeParser.routeParserStrings.Route with TopLevel[js.Any]) | `false`
    ): Self = this.set("match", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReverse(value: TParams => String | `false`): Self = this.set("reverse", js.Any.fromFunction1(value))
  }
}
