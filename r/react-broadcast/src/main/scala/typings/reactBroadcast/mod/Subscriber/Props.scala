package typings.reactBroadcast.mod.Subscriber

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Partial<react-broadcast.react-broadcast.Subscriber.DefaultProps> */
@js.native
trait Props[T] extends js.Object {
  
  var channel: String = js.native
  
  var children: js.UndefOr[js.Function1[/* state */ T, ReactNode]] = js.native
  
  var quiet: js.UndefOr[Boolean] = js.native
}
object Props {
  
  @scala.inline
  def apply[T](channel: String): Props[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props[T]]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props[_], T] (val x: Self with Props[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: /* state */ T => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
  }
}
