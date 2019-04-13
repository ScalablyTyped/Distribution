package typings
package atStorybookRouterLib.distRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryMatchProps extends js.Object {
  var path: java.lang.String
  var startsWith: scala.Boolean
  def children(matchingData: MatchingData): reactLib.reactMod.ReactNode
}

object QueryMatchProps {
  @scala.inline
  def apply(
    children: MatchingData => reactLib.reactMod.ReactNode,
    path: java.lang.String,
    startsWith: scala.Boolean
  ): QueryMatchProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), path = path, startsWith = startsWith)
  
    __obj.asInstanceOf[QueryMatchProps]
  }
}

