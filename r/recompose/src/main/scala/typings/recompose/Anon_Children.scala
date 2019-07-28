package typings.recompose

import typings.react.reactMod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children[TInner] extends js.Object {
  def children(props: TInner): ReactElement
}

object Anon_Children {
  @scala.inline
  def apply[TInner](children: TInner => ReactElement): Anon_Children[TInner] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
  
    __obj.asInstanceOf[Anon_Children[TInner]]
  }
}

