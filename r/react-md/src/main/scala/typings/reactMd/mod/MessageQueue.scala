package typings.reactMd.mod

import typings.react.mod.ReactElement
import typings.reactMdAlert.messageQueueContextMod.ToastMessage
import typings.reactMdAlert.messageQueueMod.MessageQueueProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MessageQueue {
  
  inline def apply[M /* <: ToastMessage */](hasTimeoutDuplicatesDefaultQueueChildrenProps: MessageQueueProps[M]): ReactElement = ^.asInstanceOf[js.Dynamic].apply(hasTimeoutDuplicatesDefaultQueueChildrenProps.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("react-md", "MessageQueue")
  @js.native
  val ^ : js.Any = js.native
  
  object propTypes {
    
    @JSImport("react-md", "MessageQueue.propTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-md", "MessageQueue.propTypes.children")
    @js.native
    def children: js.Any = js.native
    inline def children_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "MessageQueue.propTypes.defaultQueue")
    @js.native
    def defaultQueue: js.Any = js.native
    inline def defaultQueue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultQueue")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "MessageQueue.propTypes.duplicates")
    @js.native
    def duplicates: js.Any = js.native
    inline def duplicates_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("duplicates")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "MessageQueue.propTypes.onActionClick")
    @js.native
    def onActionClick: js.Any = js.native
    inline def onActionClick_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onActionClick")(x.asInstanceOf[js.Any])
    
    @JSImport("react-md", "MessageQueue.propTypes.timeout")
    @js.native
    def timeout: js.Any = js.native
    inline def timeout_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("timeout")(x.asInstanceOf[js.Any])
  }
}
