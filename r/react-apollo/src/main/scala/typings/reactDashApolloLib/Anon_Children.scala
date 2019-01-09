package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Children extends js.Object {
  @JSName("children")
  var children_Original: propDashTypesLib.propDashTypesMod.Validator[
    java.lang.String | scala.Double | scala.Boolean | js.Object | propDashTypesLib.propDashTypesMod.ReactElementLike | propDashTypesLib.propDashTypesMod.ReactNodeArray
  ] = js.native
  @JSName("client")
  var client_Original: propDashTypesLib.propDashTypesMod.Validator[js.Object] = js.native
  def children(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def client(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

