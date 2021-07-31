package typings.primereact

import typings.primereact.primereactStrings.error
import typings.primereact.primereactStrings.info
import typings.primereact.primereactStrings.success
import typings.primereact.primereactStrings.warn
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messagesMod {
  
  @JSImport("primereact/components/messages/Messages", "Messages")
  @js.native
  class Messages protected ()
    extends Component[MessagesProps, js.Any, js.Any] {
    def this(props: MessagesProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: MessagesProps, context: js.Any) = this()
    
    def clear(): Unit = js.native
    
    def replace(message: js.Array[Message]): Unit = js.native
    def replace(message: Message): Unit = js.native
    
    def show(message: js.Array[Message]): Unit = js.native
    def show(message: Message): Unit = js.native
  }
  
  trait Message extends StObject {
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var detail: js.UndefOr[ReactNode] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var life: js.UndefOr[Double] = js.undefined
    
    var severity: js.UndefOr[success | info | warn | error] = js.undefined
    
    var sticky: js.UndefOr[Boolean] = js.undefined
    
    var summary: js.UndefOr[ReactNode] = js.undefined
  }
  object Message {
    
    @scala.inline
    def apply(): Message = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      @scala.inline
      def setDetail(value: ReactNode): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setLife(value: Double): Self = StObject.set(x, "life", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLifeUndefined: Self = StObject.set(x, "life", js.undefined)
      
      @scala.inline
      def setSeverity(value: success | info | warn | error): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
      
      @scala.inline
      def setSticky(value: Boolean): Self = StObject.set(x, "sticky", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyUndefined: Self = StObject.set(x, "sticky", js.undefined)
      
      @scala.inline
      def setSummary(value: ReactNode): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    }
  }
  
  trait MessagesProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var onClick: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.undefined
    
    var onRemove: js.UndefOr[js.Function1[/* message */ Message, Unit]] = js.undefined
    
    var style: js.UndefOr[js.Object] = js.undefined
  }
  object MessagesProps {
    
    @scala.inline
    def apply(): MessagesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessagesProps]
    }
    
    @scala.inline
    implicit class MessagesPropsMutableBuilder[Self <: MessagesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* message */ Message => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnRemove(value: /* message */ Message => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
