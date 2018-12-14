package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_ChildrenArgsMutation extends js.Object {
  var awaitRefetchQueries: propDashTypesLib.propDashTypesMod.Requireable[scala.Boolean]
  var children: propDashTypesLib.propDashTypesMod.Validator[js.Function1[/* repeated */_, _]]
  var fetchPolicy: propDashTypesLib.propDashTypesMod.Requireable[java.lang.String]
  var mutation: propDashTypesLib.propDashTypesMod.Validator[js.Object]
  var onCompleted: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */_, _]]
  var onError: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */_, _]]
  var optimisticResponse: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
  var refetchQueries: propDashTypesLib.propDashTypesMod.Requireable[
    (js.Function1[/* repeated */_, _]) | (js.Array[java.lang.String | js.Object | scala.Null])
  ]
  var update: propDashTypesLib.propDashTypesMod.Requireable[js.Function1[/* repeated */_, _]]
  var variables: propDashTypesLib.propDashTypesMod.Requireable[js.Object]
}

