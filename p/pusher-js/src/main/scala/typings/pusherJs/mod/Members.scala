package typings.pusherJs.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Members[T] extends js.Object {
  
  var count: Double = js.native
  
  /**
    * Calls back for each member in unspecified order.
    */
  def each(callback: js.Function1[/* member */ Member[T], Unit]): Unit = js.native
  
  /**
    * Returns member's info for given id.
    *
    * Resulting object containts two fields - id and info.
    */
  def get(id: String): Null | T = js.native
  
  var me: Member[T] = js.native
  
  var members: StringDictionary[Member[T]] = js.native
  
  var myID: String = js.native
}
object Members {
  
  @scala.inline
  def apply[T](
    count: Double,
    each: js.Function1[/* member */ Member[T], Unit] => Unit,
    get: String => Null | T,
    me: Member[T],
    members: StringDictionary[Member[T]],
    myID: String
  ): Members[T] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], each = js.Any.fromFunction1(each), get = js.Any.fromFunction1(get), me = me.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], myID = myID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Members[T]]
  }
  
  @scala.inline
  implicit class MembersOps[Self <: Members[_], T] (val x: Self with Members[T]) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEach(value: js.Function1[/* member */ Member[T], Unit] => Unit): Self = this.set("each", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet(value: String => Null | T): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMe(value: Member[T]): Self = this.set("me", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMembers(value: StringDictionary[Member[T]]): Self = this.set("members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMyID(value: String): Self = this.set("myID", value.asInstanceOf[js.Any])
  }
}
