package typings.reactDashApollo

import typings.propDashTypes.propDashTypesMod.ReactElementLike
import typings.propDashTypes.propDashTypesMod.ReactNodeArray
import typings.propDashTypes.propDashTypesMod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  var children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray]
  var client: Validator[js.Object]
}

object Anon_Children {
  @scala.inline
  def apply(
    children: Validator[String | Double | Boolean | js.Object | ReactElementLike | ReactNodeArray],
    client: Validator[js.Object]
  ): Anon_Children = {
    val __obj = js.Dynamic.literal(children = children, client = client)
  
    __obj.asInstanceOf[Anon_Children]
  }
}

