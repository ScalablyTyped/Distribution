package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Args extends js.Object {
  var awaitRefetchQueries: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean] = js.native
  @JSName("children")
  var children_Original: propDashTypesLib.propDashTypesMod.Validator[js.Function1[/* repeated */ _, _]] = js.native
  var fetchPolicy: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String] = js.native
  @JSName("mutation")
  var mutation_Original: propDashTypesLib.propDashTypesMod.Validator[js.Object] = js.native
  var onCompleted: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var onError: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var optimisticResponse: propDashTypesLib.propDashTypesMod.Requireable[js.Object] = js.native
  var refetchQueries: propDashTypesLib.propDashTypesMod.Requireable[
    (js.Function1[/* repeated */ _, _]) | (js.Array[java.lang.String | js.Object | scala.Null])
  ] = js.native
  var update: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */ _, _]] = js.native
  var variables: propDashTypesLib.propDashTypesMod.Requireable[js.Object] = js.native
  def children(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
  def mutation(
    props: js.Object,
    propName: java.lang.String,
    componentName: java.lang.String,
    location: java.lang.String,
    propFullName: java.lang.String
  ): stdLib.Error | scala.Null = js.native
}

