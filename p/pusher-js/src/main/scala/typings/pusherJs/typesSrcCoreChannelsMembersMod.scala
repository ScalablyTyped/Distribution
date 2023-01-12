package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreChannelsMembersMod {
  
  @JSImport("pusher-js/types/src/core/channels/members", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Members {
    
    /* CompleteClass */
    override def addMember(memberData: Any): Any = js.native
    
    /* CompleteClass */
    var count: Double = js.native
    
    /* CompleteClass */
    override def each(callback: js.Function): Unit = js.native
    
    /* CompleteClass */
    override def get(id: String): Any = js.native
    
    /* CompleteClass */
    var me: Any = js.native
    
    /* CompleteClass */
    var members: Any = js.native
    
    /* CompleteClass */
    var myID: Any = js.native
    
    /* CompleteClass */
    override def onSubscription(subscriptionData: Any): Unit = js.native
    
    /* CompleteClass */
    override def removeMember(memberData: Any): Any = js.native
    
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /* CompleteClass */
    override def setMyID(id: String): Unit = js.native
  }
  
  trait Members extends StObject {
    
    def addMember(memberData: Any): Any
    
    var count: Double
    
    def each(callback: js.Function): Unit
    
    def get(id: String): Any
    
    var me: Any
    
    var members: Any
    
    var myID: Any
    
    def onSubscription(subscriptionData: Any): Unit
    
    def removeMember(memberData: Any): Any
    
    def reset(): Unit
    
    def setMyID(id: String): Unit
  }
  object Members {
    
    inline def apply(
      addMember: Any => Any,
      count: Double,
      each: js.Function => Unit,
      get: String => Any,
      me: Any,
      members: Any,
      myID: Any,
      onSubscription: Any => Unit,
      removeMember: Any => Any,
      reset: () => Unit,
      setMyID: String => Unit
    ): Members = {
      val __obj = js.Dynamic.literal(addMember = js.Any.fromFunction1(addMember), count = count.asInstanceOf[js.Any], each = js.Any.fromFunction1(each), get = js.Any.fromFunction1(get), me = me.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], myID = myID.asInstanceOf[js.Any], onSubscription = js.Any.fromFunction1(onSubscription), removeMember = js.Any.fromFunction1(removeMember), reset = js.Any.fromFunction0(reset), setMyID = js.Any.fromFunction1(setMyID))
      __obj.asInstanceOf[Members]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Members] (val x: Self) extends AnyVal {
      
      inline def setAddMember(value: Any => Any): Self = StObject.set(x, "addMember", js.Any.fromFunction1(value))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setEach(value: js.Function => Unit): Self = StObject.set(x, "each", js.Any.fromFunction1(value))
      
      inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setMe(value: Any): Self = StObject.set(x, "me", value.asInstanceOf[js.Any])
      
      inline def setMembers(value: Any): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMyID(value: Any): Self = StObject.set(x, "myID", value.asInstanceOf[js.Any])
      
      inline def setOnSubscription(value: Any => Unit): Self = StObject.set(x, "onSubscription", js.Any.fromFunction1(value))
      
      inline def setRemoveMember(value: Any => Any): Self = StObject.set(x, "removeMember", js.Any.fromFunction1(value))
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setSetMyID(value: String => Unit): Self = StObject.set(x, "setMyID", js.Any.fromFunction1(value))
    }
  }
}
