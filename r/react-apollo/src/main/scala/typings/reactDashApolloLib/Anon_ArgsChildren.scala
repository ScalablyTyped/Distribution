package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgsChildren extends js.Object {
  @JSName("children")
  var children_Original: propDashTypesLib.propDashTypesMod.Validator[js.Function1[/* repeated */ _, _]] = js.native
  var client: propDashTypesLib.propDashTypesMod.Requireable[js.Object] = js.native
  var fetchPolicy: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String] = js.native
  var notifyOnNetworkStatusChange: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean] = js.native
  var onCompleted: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onError: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var partialRefetch: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean] = js.native
  var pollInterval: propDashTypesLib.propDashTypesMod.Requireable[scala.Double] = js.native
  @JSName("query")
  var query_Original: propDashTypesLib.propDashTypesMod.Validator[js.Object] = js.native
  var ssr: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean] = js.native
  var variables: propDashTypesLib.propDashTypesMod.Requireable[js.Object] = js.native
  def children(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def query(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

