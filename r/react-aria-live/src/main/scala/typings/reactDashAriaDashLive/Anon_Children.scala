package typings.reactDashAriaDashLive

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children extends js.Object {
  def children(contextProps: Anon_AnnounceAssertive): ReactNode
}

object Anon_Children {
  @scala.inline
  def apply(children: Anon_AnnounceAssertive => ReactNode): Anon_Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[Anon_Children]
  }
}

