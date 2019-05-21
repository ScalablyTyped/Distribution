package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: propDashTypesLib.propDashTypesMod.Validator[
    java.lang.String | scala.Double | scala.Boolean | js.Object | propDashTypesLib.propDashTypesMod.ReactElementLike | propDashTypesLib.propDashTypesMod.ReactNodeArray
  ]
  var client: propDashTypesLib.propDashTypesMod.Validator[js.Object]
}

object Anon_Children {
  @scala.inline
  def apply(
    children: propDashTypesLib.propDashTypesMod.Validator[
      java.lang.String | scala.Double | scala.Boolean | js.Object | propDashTypesLib.propDashTypesMod.ReactElementLike | propDashTypesLib.propDashTypesMod.ReactNodeArray
    ],
    client: propDashTypesLib.propDashTypesMod.Validator[js.Object]
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children, client = client)
  
    __obj.asInstanceOf[Anon_Children]
  }
}

