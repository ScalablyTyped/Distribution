package typings.primereact

import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nextPageLinkMod {
  
  @JSImport("primereact/components/paginator/NextPageLink", "NextPageLink")
  @js.native
  class NextPageLink protected ()
    extends Component[NextPageLinkProps, js.Any, js.Any] {
    def this(props: NextPageLinkProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: NextPageLinkProps, context: js.Any) = this()
  }
  
  trait NextPageLinkProps extends StObject {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object NextPageLinkProps {
    
    @scala.inline
    def apply(): NextPageLinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NextPageLinkProps]
    }
    
    @scala.inline
    implicit class NextPageLinkPropsMutableBuilder[Self <: NextPageLinkProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
