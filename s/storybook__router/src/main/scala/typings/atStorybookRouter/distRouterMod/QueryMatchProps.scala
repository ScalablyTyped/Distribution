package typings.atStorybookRouter.distRouterMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryMatchProps extends js.Object {
  var path: String
  var startsWith: Boolean
  def children(matchingData: MatchingData): ReactNode
}

object QueryMatchProps {
  @scala.inline
  def apply(children: MatchingData => ReactNode, path: String, startsWith: Boolean): QueryMatchProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path.asInstanceOf[js.Any], startsWith = startsWith.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryMatchProps]
  }
}

