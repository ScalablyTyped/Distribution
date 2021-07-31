package typings.reactMd.mod

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options[E /* <: HTMLElement */]
  extends StObject
     with typings.reactMdMenu.useContextMenuMod.Options
     with typings.reactMdUtils.useScrollListenerMod.Options[E]
object Options {
  
  @scala.inline
  def apply[E /* <: HTMLElement */](onScroll: /* evt */ Event => Unit): Options[E] = {
    val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1(onScroll))
    __obj.asInstanceOf[Options[E]]
  }
}
