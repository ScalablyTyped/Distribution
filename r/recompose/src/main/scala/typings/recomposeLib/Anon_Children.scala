package typings
package recomposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Children[TInner] extends js.Object {
  def children(props: TInner): reactLib.reactMod.ReactNs.ReactElement[_]
}

object Anon_Children {
  @scala.inline
  def apply[TInner](children: js.Function1[TInner, reactLib.reactMod.ReactNs.ReactElement[_]]): Anon_Children[TInner] = {
    val __obj = js.Dynamic.literal(children = children)
  
    __obj.asInstanceOf[Anon_Children[TInner]]
  }
}

